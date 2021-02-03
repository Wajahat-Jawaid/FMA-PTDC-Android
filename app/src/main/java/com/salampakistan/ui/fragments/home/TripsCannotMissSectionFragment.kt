package com.salampakistan.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.salampakistan.R
import com.salampakistan.dagger.Injectable
import com.salampakistan.model.Trip
import com.salampakistan.network.Result
import com.salampakistan.utils.Constants.EVENTDETAILS
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class TripsCannotMissSectionFragment : BaseHomeSectionFragment<Trip>(), Injectable {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configAdapter(Trip)
        attachSkeletonViews(R.layout.row_home_trip_skeleton)
        setIntro(R.string.made_by_experts)
        setTitle(R.string.trips_u_cant_miss)
        setSeeAllFlag(false)
        getData()
    }

    private fun getData() {
        viewModel.events.observe(viewLifecycleOwner, Observer {
            Timber.d("Status: %s", it.status)
            when (it.status) {
                Result.Status.SUCCESS -> setData(it.data?.TripsList)
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    override fun viewAllTextClicked() {
    }

    override fun onListItemClicked(model: Trip) {
        val bundle = Bundle()
        bundle.putParcelable(EVENTDETAILS,model)
        navController.navigate(R.id.action_homeFragment_to_tripDetailsFragment,bundle)
    }

    companion object {
        fun getInstance() = TripsCannotMissSectionFragment()
    }
}