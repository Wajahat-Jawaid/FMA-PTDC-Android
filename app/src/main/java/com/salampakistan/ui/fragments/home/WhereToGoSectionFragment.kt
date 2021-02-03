package com.salampakistan.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.NavOptions
import com.salampakistan.R
import com.salampakistan.dagger.Injectable
import com.salampakistan.model.Location
import com.salampakistan.network.Result
import com.salampakistan.utils.Constants
import com.salampakistan.utils.FragmentTransitionHelper
import timber.log.Timber


/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhereToGoSectionFragment : BaseHomeSectionFragment<Location>(), Injectable {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configAdapter(Location)
        attachSkeletonViews(R.layout.row_home_location_skeleton)
        setIntro(R.string.find_out)
        setTitle(R.string.where_to_go)
        setSeeAllFlag(true)
        getData()
    }

    private fun getData() {
        viewModel.locations.observe(viewLifecycleOwner, Observer {
            Timber.d("Status: %s", it.status)
            when (it.status) {
                Result.Status.SUCCESS -> setData(it.data?.data)
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                    Timber.d("Error loading WhereToGo")
                }
            }
        })
    }

    override fun viewAllTextClicked() {
        navController.navigate(R.id.action_homeFragment_to_whereToGoListFragment)
    }

    override fun onListItemClicked(model: Location) {
        val bundle = Bundle()
        bundle.putParcelable(Constants.CATEGORYLOCATION, model)
        val navOptions = NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in_fragment_from_right)
            .setExitAnim(R.anim.slide_out_fragment_to_left)
            .setPopEnterAnim(R.anim.slide_out_fragment_to_right)
            .setPopExitAnim(R.anim.slide_in_fragment_from_left)
            .build()
        navController.navigate(
            R.id.action_homeFragment_to_whereToGoCategoryListFragment,
            bundle
        )
//        addFragment(WhereToGoCategoryListFragment.getInstance(model))
    }

    companion object {
        fun getInstance(): WhereToGoSectionFragment {
            val fg = WhereToGoSectionFragment()
            FragmentTransitionHelper.setupTransitionFromEnd(fg)
            return fg
        }
    }
}