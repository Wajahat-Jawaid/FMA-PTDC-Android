package com.salampakistan.ui.fragments.event.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentEventDetailsBinding
import com.salampakistan.databinding.RowRelatedEventBinding
import com.salampakistan.model.LocationDetails
import com.salampakistan.model.event.Event
import com.salampakistan.model.event.EventDetails
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.ImageCarouselFragment
import com.salampakistan.ui.fragments.ImageViewFragment
import com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment
import java.lang.Exception

class EventDetailsFragment : BaseFragment<FragmentEventDetailsBinding>(), Injectable {

    private lateinit var viewModel: EventDetailsViewModel
    private lateinit var binding: FragmentEventDetailsBinding
    private lateinit var eventAdapter: SimpleListAdapter<RowRelatedEventBinding, Event>
    private lateinit var fragment: ImageCarouselFragment
    private lateinit var arrList: ArrayList<Any>
    private lateinit var eventId: String


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)

        setView()

        if(viewModel.event.value == null)
            getData(eventId)
        else binding.model = viewModel.event.value

        getRelatedEvents()
    }

    private fun getRelatedEvents() {
        viewModel.getEvents().observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                }
                Result.Status.SUCCESS -> {
                    if (!it.data?.data.isNullOrEmpty()) {
                        eventAdapter.updateContent(it.data?.data)
                        eventAdapter.itemClickSubject.subscribe {
                            getData(it._id)
                            binding.scrollView.smoothScrollTo(0, 0)
                        }
                    }
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    private fun getData(id:String) {
        viewModel.getEventDetails(id).observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                }
                Result.Status.SUCCESS -> {
                    if (it.data?.data != null) {
                        binding.model = null
                        binding.model = it.data.data
                        viewModel.event.value = it.data.data
                        addImagesFragment()
                    }
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    private fun addImagesFragment() {
        if (!viewModel.event.value?.photos.isNullOrEmpty()) {
            fragment = ImageCarouselFragment.getInstance(viewModel.event.value?.photos!! as ArrayList<String>)
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

    private fun setView() {
        eventAdapter = SimpleListAdapter(R.layout.row_related_event)
        binding.recViewRelatedEvent.adapter = eventAdapter

        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe {
            navController.navigateUp()
        }

    }

    override fun handleArguments(arguments: Bundle) {
        eventId = arguments.getString(EVENTID)!!
    }

    override fun getViewId(): Int = R.layout.fragment_event_details
    override fun injectBinding(view: View): FragmentEventDetailsBinding =
        DataBindingUtil.bind(view)!!

    companion object {

        private val TAG = EventDetailsFragment::class.java.simpleName
        public val EVENTID = "$TAG.eventid"
        fun newInstance() = EventDetailsFragment()

    }


}