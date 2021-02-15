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
import java.lang.Exception

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class TripsCannotMissSectionFragment : BaseHomeSectionFragment<com.salampakistan.model.tripslist.Trip>(), Injectable {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configAdapter(com.salampakistan.model.tripslist.Trip)
        attachSkeletonViews(R.layout.row_home_trip_skeleton)
        setIntro(R.string.made_by_experts)
        setTitle(R.string.trips_u_cant_miss)
        setSeeAllFlag(false)
        getData()
    }

    private fun getData() {
        viewModel.trips().observe(viewLifecycleOwner, Observer {
            Timber.d("Status: %s", it.status)
            when (it.status) {
                Result.Status.SUCCESS -> {
                    setData(it.data?.data)
                }
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    override fun viewAllTextClicked() {
    }

    override fun onListItemClicked(model: com.salampakistan.model.tripslist.Trip) {
        try {
            val bundle = Bundle()
            bundle.putParcelable(EVENTDETAILS, model)
            navController.navigate(R.id.action_homeFragment_to_tripDetailsFragment, bundle)
        }catch (e:Exception){}
    }

    companion object {
        fun getInstance() = TripsCannotMissSectionFragment()
    }
}