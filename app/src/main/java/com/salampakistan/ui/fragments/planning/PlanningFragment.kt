package com.salampakistan.ui.fragments.planning

import android.app.DatePickerDialog
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentPlanningBinding
import com.salampakistan.model.WishList
import com.salampakistan.model.enums.PlanningDate
import com.salampakistan.model.enums.TripBound
import com.salampakistan.model.enums.TripDirection
import com.salampakistan.network.JSONKeys
import com.salampakistan.network.Result
import com.salampakistan.ui.custom.CustomSupportMapFragment
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.CalendarUtils
import com.salampakistan.utils.CalendarUtils.convertDate
import com.salampakistan.utils.CalendarUtils.convertDatetoServerFormat
import com.salampakistan.utils.CalendarUtils.getLongToServerFormattedDate
import com.salampakistan.utils.CalendarUtils.getMinimumDateUser
import kotlinx.android.synthetic.main.fragment_planning.*
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class PlanningFragment() : BaseFragment<FragmentPlanningBinding>(), Injectable, OnMapReadyCallback {

    private lateinit var viewModel: PlanningViewModel
    private lateinit var binding: FragmentPlanningBinding
    private val adapter = PlanningListAdapter()
    private lateinit var mapFragment: CustomSupportMapFragment
    private lateinit var mMap: GoogleMap
    private lateinit var firstLocation: WishList

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = adapter
        adapter.itemClickSubject.subscribe {
            updateLocationUI(it)
        }

        RxView.clicks(binding.form.dateFromText).subscribe {
            onDateFieldClicked(PlanningDate.FROM)
        }
        RxView.clicks(binding.form.dateToText).subscribe {
            onDateFieldClicked(PlanningDate.TO)
        }

        RxView.clicks(binding.form.proceedBtn).subscribe {
            getData()
        }

        setView()
    }

    private fun setView() {
        binding.form.dateFromText.text = convertDate(getLongToServerFormattedDate(System.currentTimeMillis()-1)!!)
        binding.form.dateToText.text = convertDate(getLongToServerFormattedDate(getMinimumDateUser(binding.form.dateFromText.text.toString()))!!)
    }


    fun onLocationFieldClicked(direction: TripDirection) {
        val locations =
            resources.getStringArray(com.salampakistan.R.array.locations) as ArrayList<String>
        val dialogFg = ListDialogFragment.getInstance(locations)
        dialogFg.show(childFragmentManager, JSONKeys.locations)
        dialogFg.itemClickPositionSubject
            .subscribe { position ->
                run {
                    dialogFg.dismissAllowingStateLoss()
                    val location = locations[position]
                    if (direction == TripDirection.FROM) {
//                        viewModel.fromLocation.value = location
                    } else {
//                        viewModel.toLocation.value = location
                    }
                }
            }
    }

    private fun setUpMap() {
        mapFragment =
            childFragmentManager.findFragmentById(R.id.map_frag) as CustomSupportMapFragment
        mapFragment!!.getMapAsync(this)
        map_layout.visibility = View.VISIBLE
        scrollToPlansTop()

    }

    fun onDateFieldClicked(check: PlanningDate) {
        val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val formattedDate = CalendarUtils.getFormattedServerDate(year, month+1, dayOfMonth)
            if (check == PlanningDate.FROM) {
                binding.form.dateFromText.text = convertDate(formattedDate)
                binding.form.dateToText.text =
                    convertDate(getLongToServerFormattedDate(getMinimumDateUser(binding.form.dateFromText.text.toString()))!!)
            } else {
                binding.form.dateToText.text = convertDate(formattedDate)
            }
        }
        if (check == PlanningDate.FROM)
            CalendarUtils.showDatePicker(
                context!!,
                listener,
                minDate = System.currentTimeMillis() - 1
            )
        else CalendarUtils.showDatePicker(
            context!!,
            listener,
            minDate = getMinimumDateUser(binding.form.dateFromText.text.toString())
        )
    }


    private fun updateLocationUI(data: WishList) {
        mMap.clear()
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.uiSettings.isZoomControlsEnabled = true;
        val loc =
            LatLng(data.location.coordinates[1].toDouble(), data.location.coordinates[0].toDouble())
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 10.0f))
        try {
            mMap.addMarker(
                MarkerOptions()
                    .position(loc)
//                .title(
//                    Geocoder(
//                        context,
//                        Locale.getDefault()
//                    ).getFromLocation(loc.latitude, loc.longitude, 1)[0].getAddressLine(0)
//                )
            )
        } catch (e: Exception) {
        }
    }

    private fun getData() {
        if (preferences.getUser() == null) {
            showLoginSnackBar("Login to continue", R.id.action_planningFragment_to_loginFragment)
            return
        }
        viewModel.getPlans(preferences.getUser()?.id!!, preferences.getUser()?.token!!)
            .observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Response: %s", Gson().toJson(it.data))

                        // Set RecyclerView
                        val plans = viewModel.parseWishlist(it.data?.data!!)
                        if (plans.isNullOrEmpty()) {
                            showSnack("Nothing added to the plan.")
                            return@Observer
                        }
                        adapter.updateContent(plans)
                        setUpMap()
                        firstLocation = plans[0]

                        setTouchHelper(plans)
                    }
                    Result.Status.LOADING -> {
                        Timber.d("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
//                        skeleton.hide()
                    }
                }
            })
    }

    private fun scrollToPlansTop() {
        val location = IntArray(2)
        binding.recyclerView.getLocationOnScreen(location)
        val x = location[0]
        val y = location[1]
        binding.scrollView.smoothScrollTo(x, y)
    }

    private fun setTouchHelper(plans: MutableList<WishList>) {

        val itemTouchCallBack = object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.DOWN or ItemTouchHelper.UP or ItemTouchHelper.START or ItemTouchHelper.END,
            0
        ) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {

                val fromPosition = viewHolder.adapterPosition
                val targetPosition = target.adapterPosition

                Collections.swap(plans, fromPosition, targetPosition)
                Handler().postDelayed({
                    adapter.updateContent(plans)
                    adapter.notifyDataSetChanged()
                }, 1500)
                recyclerView.adapter?.notifyItemMoved(fromPosition, targetPosition)
                return false

            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            }

        }

        val itemTouchHelper = ItemTouchHelper(itemTouchCallBack)
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)
    }

    fun swapItems(plans: MutableList<WishList>, itemAIndex: Int, itemBIndex: Int) {
        //make sure to check if dataset is null and if itemA and itemB are valid indexes.
//        val itemA= plans.get(itemAIndex)
//        val itemB = plans.get(itemBIndex)
//        plans.set(itemAIndex, itemB)
//        plans.set(itemBIndex, ItemA)
//        adapter.notifyDataSetChanged() //This will trigger onBindViewHolder method from the adapter.
    }

    override fun onMapReady(p0: GoogleMap?) {
        mMap = p0!!
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.uiSettings.isZoomControlsEnabled = true;

        val loc = LatLng(
            firstLocation.location.coordinates[1].toDouble(),
            firstLocation.location.coordinates[0].toDouble()
        )
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 10.0f))
        try {
            mMap.addMarker(
                MarkerOptions()
                    .position(loc)
//                .title(
//                    Geocoder(
//                        context,
//                        Locale.getDefault()
//                    ).getFromLocation(loc.latitude, loc.longitude, 1)[0].getAddressLine(0)
//                )
            )
        } catch (e: Exception) {
        }

    }


    override fun getViewId() = R.layout.fragment_planning
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentPlanningBinding>(view)!!

    companion object {
        fun getInstance() = PlanningFragment()
    }
}