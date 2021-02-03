package com.salampakistan.ui.fragments.whattodo

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseListFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentListWhatToDoCategoryBinding
import com.salampakistan.databinding.RowWhatToDoBinding
import com.salampakistan.databinding.RowWhereToGoBinding
import com.salampakistan.model.Activity
import com.salampakistan.model.Location
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment
import com.salampakistan.utils.Constants
import com.salampakistan.utils.Constants.CATEGORYACTIVITY
import com.salampakistan.utils.FragmentTransitionHelper
import timber.log.Timber
import java.lang.Exception

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhatToDoCategoryListFragment : BaseListFragment<FragmentListWhatToDoCategoryBinding>(),
    Injectable {

    private lateinit var categoryActivity: Activity
    private lateinit var viewModel: WhatToDoCategoryListViewModel
    private lateinit var binding: FragmentListWhatToDoCategoryBinding
    private val eventsAdapter =
        SimpleListAdapter<RowWhereToGoBinding, Location>(R.layout.row_where_to_go)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
        binding.categoryActivity = categoryActivity
        val recyclerView = binding.recyclerView
        setRecyclerView()
        attachSkeletonViews(recyclerView, eventsAdapter, R.layout.row_list_skeleton)
        getData()
        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe { navController.navigateUp() }
    }

    override fun handleArguments(arguments: Bundle) {
        categoryActivity = arguments.getParcelable(CATEGORYACTIVITY)!!
        Timber.d("categoryActivity: %s", categoryActivity.id)
    }

    private fun setRecyclerView() {
        binding.recyclerView.adapter = eventsAdapter
        eventsAdapter.itemClickSubject
            .subscribe {
                run {
                    try{
                        val bundle = Bundle()
                        bundle.putParcelable(Constants.LOCATION, it)

                        bundle.putString(Constants.LOCATIONID,it.id)
                        bundle.putString(Constants.LOCATIONNAME,it.name)
                        bundle.putString(Constants.LOCATIONSLUG,it.slug)
                        navController.navigate(
                            R.id.action_whatToDoCategoryListFragment_to_locationDetailsFragment,
                            bundle
                        )
                    }catch (e:Exception){}
                }
            }
    }

    private fun getData() {
        viewModel.getLocationsForActivity(categoryActivity.id)
            .observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Response: %s", Gson().toJson(it.data?.data))
                        if (it.data?.data == null || it.data.data.isEmpty()) {
                            binding.viewNoTrips.visibility = View.VISIBLE
                            return@Observer
                        }
                        if (binding.viewNoTrips.isVisible)
                            binding.viewNoTrips.visibility = View.GONE
                        // Set RecyclerView
                        eventsAdapter.items = it.data.data
                        skeleton.hide()
                    }
                    Result.Status.LOADING -> {
                        Timber.d("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
                        skeleton.hide()
                    }
                }
            })
    }

    override fun getViewId() = R.layout.fragment_list_what_to_do_category
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentListWhatToDoCategoryBinding>(view)!!

    companion object {

        private val TAG = WhatToDoCategoryListFragment::class.java.simpleName
        private val CATEGORY_ACTIVITY = "$TAG.categoryActivity"

        fun getInstance(categoryActivity: Activity): WhatToDoCategoryListFragment {
            val fg = WhatToDoCategoryListFragment()
            FragmentTransitionHelper.setupTransitionFromEnd(fg)
            val bundle = Bundle()
            bundle.putParcelable(CATEGORY_ACTIVITY, categoryActivity)
            fg.arguments = bundle
            return fg
        }
    }
}