package com.salampakistan.ui.fragments.tripdetails

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentTripDetailsBinding
import com.salampakistan.databinding.RowFacilityTextBinding
import com.salampakistan.model.Trip
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.ImageCarouselFragment
import com.salampakistan.ui.fragments.ImageViewFragment
import com.salampakistan.ui.fragments.itinerary.ItineraryListFragment
import com.salampakistan.utils.Constants
import timber.log.Timber
import java.lang.Exception

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class TripDetailsFragment : BaseFragment<FragmentTripDetailsBinding>(), Injectable {

    private lateinit var binding: FragmentTripDetailsBinding
    private lateinit var viewModel: TripDetailsViewModel
    private val trip = MutableLiveData<Trip>()
    lateinit var tripArguments: Trip
    private lateinit var fragment: ImageCarouselFragment

    override fun handleArguments(arguments: Bundle) {
        tripArguments = arguments.getParcelable(Constants.EVENTDETAILS)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)

        binding.fragment = this
        getData()
        fetchPlans()
        fetchWishList()
        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe { navController.navigateUp() }
    }

    private fun getData() {
        viewModel.getTripDetails(tripArguments.autoId!!, tripArguments.trimmedSlug!!)
            .observe(viewLifecycleOwner, Observer {
                Timber.d("Details response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        if (it.data?.data != null) {
                            trip.value = it.data.data
                            binding.event = trip.value
                            addItinerariesFragment()
                            addImagesFragment()
                            setFacilities()
                            if (!trip.value?.photos.isNullOrEmpty()) {
                                Glide.with(context!!)
                                    .load(trip.value!!.photos[0])
                                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                                    .into(binding.image)
                            }
                        }
                    }
                    Result.Status.LOADING -> {
                    }
                    Result.Status.ERROR -> {
                    }
                }
            })
    }

    fun removeFromPlan() {
        Timber.d("clicked plan button")
        if (preferences.getUser() == null) {
            showSnack("Please login to continue")
            return
        }
        showProgressBar()
        viewModel.removeLocationFromPlan(preferences.getUser()?.token!!, trip.value?.id!!)
            .observe(viewLifecycleOwner, Observer {
                Timber.d("Details response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Success")
                        if (it.data?.data != null) {
                            showSnack(it.data.data.message)
                            binding.addToPlanBtn.visibility = View.VISIBLE
                            binding.removeFromPlanBtn.visibility = View.GONE
                        }
                        hideProgressBar()
                    }
                    Result.Status.LOADING -> {
                        Timber.e("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
                        hideProgressBar()
                    }
                }
            })
    }

    fun addToWishList() {
        Timber.d("clicked wishlist button")
        if (preferences.getUser() == null) {
            showSnack("Please login to continue")
            return
        }
        showProgressBar()
        viewModel.addToWishList(preferences.getUser()?.token!!, trip.value?.id!!)
            .observe(viewLifecycleOwner, Observer {
                Timber.d("Details response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Success")
                        if (it.data?.data != null) {
                            showSnack(it.data.data.message)

                            binding.removeFromWishList.visibility = View.VISIBLE
                            binding.addToWishList.visibility = View.GONE
                        }
                        hideProgressBar()
                    }
                    Result.Status.LOADING -> {
                        Timber.e("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
                        hideProgressBar()
                    }
                }
            })
    }

    fun removeFromWishList() {
        Timber.d("clicked wishlist button")
        if (preferences.getUser() == null) {
            showSnack("Please login to continue")
            return
        }
        showProgressBar()
        viewModel.removeFromWishList(preferences.getUser()?.token!!, trip.value?.id!!)
            .observe(viewLifecycleOwner, Observer {
                Timber.d("Details response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Success")
                        if (it.data?.data != null) {
                            showSnack(it.data.data.message)
                            binding.removeFromWishList.visibility = View.GONE
                            binding.addToWishList.visibility = View.VISIBLE
                        }
                        hideProgressBar()
                    }
                    Result.Status.LOADING -> {
                        Timber.e("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
                        hideProgressBar()
                    }
                }
            })
    }

    fun addToPlan() {
        Timber.d("clicked plan button")
        if (preferences.getUser() == null) {
            showSnack("Please login to continue")
            return
        }
        showProgressBar()
        viewModel.addToPlan(preferences.getUser()?.token!!, trip.value?.id!!)
            .observe(viewLifecycleOwner, Observer {
                Timber.d("Details response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Success")
                        if (it.data?.data != null) {
                            showSnack(it.data.data.message)
                            binding.addToPlanBtn.visibility = View.GONE
                            binding.removeFromPlanBtn.visibility = View.VISIBLE
                        }
                        hideProgressBar()
                    }
                    Result.Status.LOADING -> {
                        Timber.e("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
                        hideProgressBar()
                    }
                }
            })
    }
    private fun fetchPlans() {
        if (preferences.getUser() == null) {
            binding.addToPlanBtn.visibility = View.VISIBLE
            return
        }

        viewModel.getPlans(preferences.getUser()?.id!!, preferences.getUser()?.token!!)
            .observe(viewLifecycleOwner,
                Observer {
                    when (it.status) {
                        Result.Status.LOADING -> {
                        }
                        Result.Status.SUCCESS -> {
                            if (!it.data?.data?.locations.isNullOrEmpty()) {
                                val tempLoc =
                                    it.data?.data?.locations?.filter { it -> it.id == tripArguments.id }
                                        ?.toTypedArray()
                                if (!tempLoc.isNullOrEmpty()) {
                                    if (it.data?.data?.locations!!.contains(tempLoc[0])) {
                                        binding.addToPlanBtn.visibility = View.GONE
                                        binding.removeFromPlanBtn.visibility = View.VISIBLE
                                    }

                                } else {
                                    binding.addToPlanBtn.visibility = View.VISIBLE
                                }
                            } else {
                                binding.addToPlanBtn.visibility = View.VISIBLE
                            }
                        }
                        Result.Status.ERROR -> {
                        }
                    }
                })

    }
    private fun fetchWishList() {
        if (preferences.getUser() == null) {
            binding.addToWishList.visibility = View.VISIBLE
            return
        }
        viewModel.getWishlist(preferences.getUser()?.id!!, preferences.getUser()?.token!!).observe(
            viewLifecycleOwner, Observer {
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Response: %s", Gson().toJson(it.data))
                        if (it.data?.data == null) {
                            return@Observer
                        }
                        val tempLoc = it.data?.data?.locations?.filter { it.id == tripArguments.id }
                            ?.toTypedArray()


                        if (!tempLoc.isNullOrEmpty()) {
                            if (it.data?.data?.locations!!.contains(tempLoc[0])) {
                                binding.addToWishList.visibility = View.GONE
                                binding.removeFromWishList.visibility = View.VISIBLE
                            }else binding.addToWishList.visibility = View.VISIBLE
                        }else binding.addToWishList.visibility = View.VISIBLE

                    }
                    Result.Status.LOADING -> {
                        Timber.d("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
                    }
                }
            })
    }


    private fun addItinerariesFragment() {
        if (!trip.value?.itinerary.isNullOrEmpty()) {
            childFragmentManager.beginTransaction()
                .add(
                    R.id.itineraries_frame_layout,
                    ItineraryListFragment.getInstance(ArrayList(trip.value?.itinerary!!))
                )
                .commit()
        }
    }

    private fun addImagesFragment() {
        if (!trip.value?.photos.isNullOrEmpty()) {
            fragment = ImageCarouselFragment.getInstance(ArrayList(trip.value?.photos!!))
            val fragBackStack = childFragmentManager.findFragmentById(R.id.images_frame_layout)
            if (fragBackStack != null) childFragmentManager.beginTransaction().remove(fragment)
                .commit()
            childFragmentManager.beginTransaction()
                .replace(
                    R.id.images_frame_layout,
                    fragment
                )
                .commit()

            fragment.imageViewSubject.subscribe {

                run {
                    try {
                        val bundle = Bundle()
                        bundle.putStringArrayList(ImageViewFragment.IMAGES, it.first)
                        bundle.putInt(ImageViewFragment.INDEX, it.second)
                        navController.navigate(
                            R.id.action_eventDetailsFragment_to_imageViewFragment,
                            bundle
                        )
                    } catch (e: Exception) {
                    }
                }
            }
        }
    }

    private fun getFacilityView(parentView: ViewGroup, text: String): View {
        val rowView = DataBindingUtil.inflate<RowFacilityTextBinding>(
            LayoutInflater.from(context),
            R.layout.row_facility_text,
            parentView,
            false
        )
        rowView.text = text
        return rowView.root
    }

    private fun setFacilities() {
        if (trip.value == null)
            return
        // Activities
        if (trip.value?.activities != null && trip.value?.activities!!.isNotEmpty()) {
            for (text in trip.value?.activities!!) {
                Timber.d("activity: %s", text)
                binding.activitiesFlexBox.addView(getFacilityView(binding.activitiesFlexBox, text))
            }
        }
        // Locations
        if (trip.value?.locations != null && trip.value?.locations!!.isNotEmpty()) {
            for (text in trip.value?.locations!!) {
                Timber.d("location: %s", text)
                binding.locationsFlexBox.addView(getFacilityView(binding.locationsFlexBox, text))
            }
        }
        // Services
        if (!trip.value?.whatsIncluded.isNullOrEmpty()) {
            for (text in trip.value?.whatsIncluded!!.map { it!!.label.capitalize() }) {
                Timber.d("Service: %s", text)
                binding.servicesFlexBox.addView(getFacilityView(binding.servicesFlexBox, text))
            }
        }
        // Cancellation Policy
        if (!TextUtils.isEmpty(trip.value?.cancellationPolicy)) {
            binding.cancellationPolicy = trip.value?.cancellationPolicy!!
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        trip.value = null
    }

    override fun getViewId() = R.layout.fragment_trip_details
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentTripDetailsBinding>(view)!!

    companion object {

        private val TAG = TripDetailsFragment::class.java.simpleName
        private val EVENT = "$TAG.event"

        fun getInstance(trip: Trip): TripDetailsFragment {
            val fg = TripDetailsFragment()
//            FragmentTransitionHelper.setupTransitionFromEnd(fg)
//            val bundle = Bundle()
//            bundle.putParcelable(EVENT, event)
//            fg.arguments = bundle
            return fg
        }
    }
}