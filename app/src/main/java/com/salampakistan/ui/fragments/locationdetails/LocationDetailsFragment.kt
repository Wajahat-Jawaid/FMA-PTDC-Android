package com.salampakistan.ui.fragments.locationdetails

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentLocationDetailsBinding
import com.salampakistan.databinding.RowRelatedLocationBinding
import com.salampakistan.model.Location
import com.salampakistan.model.LocationDetails
import com.salampakistan.model.PostReview
import com.salampakistan.model.mapLocationResponse.Data
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.BaseListAdapter
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.ImageCarouselFragment
import com.salampakistan.ui.fragments.ImageViewFragment
import com.salampakistan.ui.fragments.locationdetails.poi.POIFragment
import com.salampakistan.utils.Constants.LOCATIONID
import com.salampakistan.utils.Constants.LOCATIONNAME
import com.salampakistan.utils.Constants.LOCATIONSLUG
import com.salampakistan.utils.FragmentTransitionHelper
import timber.log.Timber
import java.lang.Exception

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class LocationDetailsFragment : BaseFragment<FragmentLocationDetailsBinding>(), Injectable {

    lateinit var binding: FragmentLocationDetailsBinding
    private lateinit var viewModel: LocationDetailsViewModel
    private lateinit var fragment: ImageCarouselFragment
    private lateinit var relatedLocationAdapter: SimpleListAdapter<RowRelatedLocationBinding, Data>
    var rating = 0F
    private val location = MutableLiveData<LocationDetails>()
    private lateinit var locationId: String
    private lateinit var locationName: String
    private lateinit var locationSlug: String


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
        if (location.value?.id.isNullOrEmpty())
            getData(locationSlug)
        else binding.location = location.value

        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe {
            navController.navigateUp()
        }

        if (preferences.getUser() != null) {
            binding.feedbackView.root.visibility = View.VISIBLE
        }

        binding.feedbackView.ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            rating = fl
        }
        RxView.clicks(binding.feedbackView.confirmBtn).subscribe { submitFeedback() }
        setScrollView(false)

        getRelatedLocationsData()
        fetchPlans()
        fetchWishList()

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
                        val tempLoc = it.data?.data?.locations?.filter { it.id == locationId }
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

    fun removeFromPlan() {
        Timber.d("clicked plan button")
        if (preferences.getUser() == null) {
            showSnack("Please login to continue")
            return
        }
        showProgressBar()
        viewModel.removeLocationFromPlan(preferences.getUser()?.token!!, location.value?.id!!)
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
                                    it.data?.data?.locations?.filter { it -> it.id == locationId }
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


    override fun handleArguments(arguments: Bundle) {
        locationId = arguments?.getString(LOCATIONID)!!
        locationName = arguments?.getString(LOCATIONNAME)!!
        locationSlug = arguments?.getString(LOCATIONSLUG)!!
    }

    fun setScrollView(set: Boolean) {
        binding.scrollView.isEnabled = false

    }

    private fun submitFeedback() {
        if (binding.feedbackView.ratingBar.rating == null) {
            showSnack("Please provide rating.")
            return
        }
        if (binding.feedbackView.titleText.text.isNullOrEmpty()) {
            showSnack("Please provide title.")
            return
        }
        if (binding.feedbackView.descriptionText.text.isNullOrEmpty()) {
            showSnack("Please provide feedback.")
            return
        }

        val postReview = PostReview(

            binding.feedbackView.titleText.text.toString(),
            preferences.getUser()?.firstName.toString(),
            preferences.getUser()?.lastName.toString(),
            preferences.getUser()?.email!!,
            rating,
            binding.feedbackView.descriptionText.text.toString(),
            location.value?.id!!
        )
        viewModel.postReview(
            preferences.getUser()?.token!!, postReview
        ).observe(viewLifecycleOwner,
            Observer {
                showProgressBar()
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Success")
                        binding.feedbackView.descriptionText.setText("")
                        binding.feedbackView.ratingBar.rating = 0F
                        showSnack("Review has been submitted.")
                        hideProgressBar()
                    }
                    Result.Status.LOADING -> {
                        Timber.e("Loading")
                    }
                    Result.Status.ERROR -> {
                        showSnack(it.message!!)
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
        viewModel.addToWishList(preferences.getUser()?.token!!, location.value?.id!!)
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
        viewModel.removeFromWishList(preferences.getUser()?.token!!, location.value?.id!!)
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
        viewModel.addToPlan(preferences.getUser()?.token!!, location.value?.id!!)
            .observe(viewLifecycleOwner, Observer {
                Timber.d("Details response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Success")
                        if (it.data?.data != null) {
                            showSnack("Location added to plan")
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

    private fun getData(slug: String) {
        viewModel.getLocationDetails(slug).observe(viewLifecycleOwner, Observer {
            Timber.d("Details response: %s", Gson().toJson(it))
            when (it.status) {
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if (it.data?.location != null) {
                        location.value = it.data.location
                        binding.location = location.value
                        binding.feedbackView.titleText.setText(location.value?.name?.capitalize())

                        addImagesFragment()
                        addPOIsFragment()


                    }
//                    viewSkeleton.hide()
                }
                Result.Status.LOADING -> {
                    showProgressBar()
//                    attachSkeletonViews(binding, R.layout.location_details_fragment_skeleton)
                }
                Result.Status.ERROR -> {
                    hideProgressBar()
                }
            }
        })
    }

    private fun getRelatedLocationsData() {
        viewModel.getRelatedLocations().observe(viewLifecycleOwner, Observer {
            Timber.d("Details response: %s", Gson().toJson(it))
            when (it.status) {
                Result.Status.SUCCESS -> {
                    if (!it.data?.data.isNullOrEmpty()) {
                        relatedLocationAdapter = SimpleListAdapter(R.layout.row_related_location)
                        binding.relLocRecyclerView.adapter = relatedLocationAdapter
                        relatedLocationAdapter.updateContent(it.data?.data)
                        relatedLocationAdapter.itemClickSubject.subscribe {
                            binding.scrollView.smoothScrollTo(0, 0)
                            getData(it.slug)
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

    private fun addImagesFragment() {
        if (!location.value?.photos.isNullOrEmpty()) {
            fragment = ImageCarouselFragment.getInstance(location.value?.photos!!)
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
                            R.id.action_locationDetailsFragment_to_imageViewFragment,
                            bundle
                        )
                    } catch (e: Exception) {
                    }
                }
            }
        }
    }

    private fun addPOIsFragment() {
        location.value?.surroundings?.let {
            val fragment = POIFragment.getInstance(
                location.value?.name!!,
                it,
                location.value?.location?.coordinates
            )
            val fragBackStack = childFragmentManager.findFragmentById(R.id.poi_frame_layout)
            if (fragBackStack != null) childFragmentManager.beginTransaction().remove(fragment)
                .commit()
            childFragmentManager.beginTransaction()
                .replace(R.id.poi_frame_layout, fragment)
                .commit()
        }
    }

    override fun getViewId() = R.layout.fragment_location_details
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentLocationDetailsBinding>(view)!!

    companion object {

        private val TAG = LocationDetailsFragment::class.java.simpleName

        fun getInstance(location: Location): LocationDetailsFragment {
            val fg = LocationDetailsFragment()
            FragmentTransitionHelper.setupTransitionFromEnd(fg)
//            val bundle = Bundle()
//            bundle.putParcelable(LOCATION, location)
//            fg.arguments = bundle
            return fg
        }

//        fun getInstance1(location: Location) {
//            val fg = LocationDetailsFragment()
//            FragmentTransitionHelper.setupTransitionFromEnd(fg)
//            val bundle = Bundle()
//            bundle.putParcelable(LOCATION, location)
//            fg.arguments = bundle
//            return fg
//        }
    }
}