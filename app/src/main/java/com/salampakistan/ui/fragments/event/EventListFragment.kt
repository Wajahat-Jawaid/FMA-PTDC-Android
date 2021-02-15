package com.salampakistan.ui.fragments.event

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentEventListBinding
import com.salampakistan.databinding.RowEventBinding
import com.salampakistan.databinding.RowFeaturedEventBinding
import com.salampakistan.model.event.Event
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.event.detail.EventDetailsFragment.Companion.EVENTID
import java.lang.Exception

class EventListFragment : BaseFragment<FragmentEventListBinding>(), Injectable {

    private lateinit var viewModel: EventListViewModel
    private lateinit var binding: FragmentEventListBinding
    private lateinit var featuredEventAdapter: SimpleListAdapter<RowFeaturedEventBinding, Event>
    private lateinit var eventListAdapter: SimpleListAdapter<RowEventBinding, Event>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)

        setview()
        getData()
    }

    fun getData() {
        viewModel.getEvents().observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                }
                Result.Status.SUCCESS -> {
                    if (!it.data?.data.isNullOrEmpty()) {
                        eventListAdapter.updateContent(it.data?.data)
                        featuredEventAdapter.updateContent(it.data?.data)
                    }
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    private fun setview() {

        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe {
            navController.navigateUp()
        }
        eventListAdapter = SimpleListAdapter(R.layout.row_event)
        featuredEventAdapter = SimpleListAdapter(R.layout.row_featured_event)
        binding.recViewEvent.adapter = eventListAdapter
        binding.recViewFeatureEvent.adapter = featuredEventAdapter

        eventListAdapter.itemClickSubject.subscribe {
            try {
                val bundle = Bundle()
                bundle.putString(EVENTID, it._id)
                navController.navigate(
                    R.id.action_eventListFragment_to_eventDetailsFragment,
                    bundle
                )
            } catch (e: Exception) {
            }
        }
        featuredEventAdapter.itemClickSubject.subscribe {
            try {
                val bundle = Bundle()
                bundle.putString(EVENTID,it._id)
                navController.navigate(
                    R.id.action_eventListFragment_to_eventDetailsFragment,
                    bundle
                )
            } catch (e: Exception) {
            }
        }
    }


    override fun getViewId(): Int = R.layout.fragment_event_list

    override fun injectBinding(view: View): FragmentEventListBinding = DataBindingUtil.bind(view)!!

    companion object {
        fun newInstance() = EventListFragment()
    }

}