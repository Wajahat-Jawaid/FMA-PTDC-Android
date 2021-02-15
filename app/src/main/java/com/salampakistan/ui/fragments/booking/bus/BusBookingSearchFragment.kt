package com.salampakistan.ui.fragments.booking.bus

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentBusBookingSearchBinding
import com.salampakistan.model.transportservicesresponse.Service
import com.salampakistan.network.JSONKeys
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion.DATE
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion.SERVICENAME
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion.DESTINATIONLOGN
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion.DESTINATIONSHORT
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion.ORIGINLONG
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion.ORIGINSHORT
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion.SERVERDATE
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.CalendarUtils
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class BusBookingSearchFragment : BaseFragment<FragmentBusBookingSearchBinding>(), Injectable {

    private lateinit var viewModel: BusBookingSearchViewModel
    private lateinit var binding: FragmentBusBookingSearchBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)
        binding.fragment = this
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        getServices()
        getDepartureCities()
        setView()
    }

    fun setView() {
        RxView.clicks(binding.backBtn).subscribe { navController.navigateUp() }

        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val df = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())

        viewModel.serverDate.value = sdf.format(System.currentTimeMillis() - 1)

        viewModel.date.value = df.format(System.currentTimeMillis() - 1)
    }

    fun getServices() {
        viewModel.getTransportServices().observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                    showProgressBar(true)
                }
                Result.Status.SUCCESS -> {
                    if (it.data?.data != null) {
                        hideProgressBar()
                        viewModel.servicesList.value = it.data?.data
                    }
                }
                Result.Status.ERROR -> {
                    showSnack(it.message.toString())
                    hideProgressBar()
                }
            }
        })
    }


    fun onLocationArrivalFieldClicked() {
        if (!viewModel.destinationCitiesList.value.isNullOrEmpty()) {
            val locations: List<String> =
                viewModel.destinationCitiesList.value?.map { it.destination_city_name }!!
            val dialogFg = ListDialogFragment.getInstance(locations as ArrayList<String>)
            dialogFg.show(childFragmentManager, JSONKeys.locations)
            dialogFg.itemClickPositionSubject
                .subscribe { position ->
                    run {
                        dialogFg.dismissAllowingStateLoss()
                        viewModel.arrivalLocation.value = locations[position]
                    }
                }
        } else showSnack(getString(R.string.pleaseselectdeparturecityfirst))
    }

    fun onLocationDepartureFieldClicked() {
        if (!viewModel.departureCitiesList.value.isNullOrEmpty()) {
            val locations = viewModel.departureCitiesList.value!!.map { it.origin_city_name }
            val dialogFg = ListDialogFragment.getInstance(locations as ArrayList<String>)
            dialogFg.show(childFragmentManager, JSONKeys.locations)
            dialogFg.itemClickPositionSubject
                .subscribe { position ->
                    run {
                        dialogFg.dismissAllowingStateLoss()
                        viewModel.departLocation.value = locations[position]
                        viewModel.destinationCitiesList.value = ArrayList()
                        viewModel.arrivalLocation.value = getString(R.string.location)
                        getDestinationCities()
                    }
                }
        } else showSnack(getString(R.string.please_select_the_service_first))
    }

    private fun getDestinationCities() {
        var service: Int? = null
        if (viewModel.services.value!! != "all services") {
            service =
                viewModel.servicesList.value!!.filter { it.service_name == viewModel.services.value }
                    .toTypedArray()[0].service_id.toInt()
        }
        val departCity =
            viewModel.departureCitiesList.value!!.filter { it.origin_city_name == viewModel.departLocation.value }
                .toTypedArray()[0].origin_city_id

        viewModel.getDestinationCities(departCity, service).observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                    showProgressBar(true)
                }
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if (it.data?.data != null) {
                        viewModel.destinationCitiesList.value = it.data.data
                    }
                }
                Result.Status.ERROR -> {
                    hideProgressBar()
                }
            }
        })
    }

    fun onServicesFieldClicked() {
        val servicesName = viewModel.servicesList.value!!.map { it.service_name }
        val dialogFg = ListDialogFragment.getInstance(servicesName as ArrayList<String>)
        dialogFg.show(childFragmentManager, JSONKeys.locations)
        dialogFg.itemClickPositionSubject
            .subscribe { position ->
                run {
                    dialogFg.dismissAllowingStateLoss()
                    viewModel.services.value = servicesName[position]
                    viewModel.departLocation.value = getString(R.string.location)
                    viewModel.destinationCitiesList.value = ArrayList()
                    viewModel.departureCitiesList.value = ArrayList()
                    viewModel.arrivalLocation.value = getString(R.string.location)
                    getDepartureCities()
                }
            }
    }

    private fun getDepartureCities() {
        var service: Int? = null
        if (viewModel.services.value!! != "all services") {
            service =
                viewModel.servicesList.value!!.filter { it.service_name == viewModel.services.value }
                    .toTypedArray()[0].service_id.toInt()
        }
        viewModel.getOriginCities(service).observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                    showProgressBar(true)
                }
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if (it.data?.data != null) {
                        viewModel.departureCitiesList.value = it.data.data
                        viewModel.arrivalLocation.value = getString(R.string.location)
                    }
                }
                Result.Status.ERROR -> {
                    hideProgressBar()
                }
            }
        })
    }

    fun onDateFieldClicked() {
        val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val formattedDate = CalendarUtils.getBusSearchFormattedDate(year, month, dayOfMonth)
            val serverFormattedDate =
                CalendarUtils.getFormattedServerDate(year, month + 1, dayOfMonth)
            viewModel.date.value = formattedDate
            viewModel.serverDate.value = serverFormattedDate
        }
        CalendarUtils.showDatePicker(context!!, listener, minDate = System.currentTimeMillis() - 1)
    }

    fun onDoneBtnClicked() {

        try {
            val bundle = Bundle()
            bundle.putString(SERVICENAME, viewModel.services.value)
            bundle.putString(DESTINATIONLOGN, viewModel.arrivalLocation.value)
            bundle.putString(DATE, viewModel.date.value)
            bundle.putString(SERVERDATE, viewModel.serverDate.value)
            bundle.putString(
                DESTINATIONSHORT,
                viewModel.destinationCitiesList.value!!.filter { it.destination_city_name == viewModel.arrivalLocation.value }
                    .toTypedArray()[0].short_name
            )
            bundle.putString(ORIGINLONG, viewModel.departLocation.value)
            bundle.putString(
                ORIGINSHORT,
                viewModel.departureCitiesList.value!!.filter { it.origin_city_name == viewModel.departLocation.value }
                    .toTypedArray()[0].short_name
            )

            navController.navigate(
                R.id.action_busBookingSearchFragment_to_busBookingListFragment,
                bundle
            )
        } catch (e: Exception) {
        }


//        launchWebView("https://ptdc.findmyadventure.pk/accomodation/location/karachi")
    }

    override fun onPause() {
        try {
            hideProgressBar()
        } catch (e: Exception) {
        }
        super.onPause()
    }

    companion object {
        fun newInstance() = BusBookingSearchFragment()
    }

    override fun getViewId(): Int = R.layout.fragment_bus_booking_search

    override fun injectBinding(view: View): FragmentBusBookingSearchBinding =
        DataBindingUtil.bind(view)!!

}