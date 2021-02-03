package com.salampakistan.ui.fragments.home.whattodo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentHomeWhatToDoBinding
import com.salampakistan.databinding.RowHomeActivityBinding
import com.salampakistan.model.Activity
import com.salampakistan.network.Result
import com.salampakistan.utils.Constants
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhatToDoSectionFragment : BaseFragment<FragmentHomeWhatToDoBinding>(), Injectable {

    private lateinit var viewModel: WhatToDoSectionViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        val binding = injectBinding(view)
        binding.fragment = this
        navController = Navigation.findNavController(view)
        super.onViewCreated(view, savedInstanceState)
        getData(binding)
    }

    fun onSeeAllTextClicked() {
        navController.navigate(R.id.action_homeFragment_to_whatToDoListFragment)
    }

    private fun getData(binding: FragmentHomeWhatToDoBinding) {
        viewModel.activities.observe(viewLifecycleOwner, Observer {
            Timber.d("Status: %s", it.status)
            when (it.status) {
                Result.Status.SUCCESS -> {
                    if (it.data?.data != null) {
                        populateViews(binding, it.data.data)
                    }
                }
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    private fun populateViews(binding: FragmentHomeWhatToDoBinding, activities: List<Activity>?) {
        Timber.d("activities size: %d", activities?.size)
        if (activities == null) return
        val size = activities.size
        // First item
        addSingleView(binding.row1, true, activities[0], size)
        // Second item
        if (size > 1) {
            addSingleView(binding.row1, false, activities[1], size)
        }
        // Third item
        if (size > 2) {
            binding.row2.visibility = View.VISIBLE
            addSingleView(binding.row2, true, activities[2], size)
        }
        // Fourth item
        if (size > 3) {
            addSingleView(binding.row2, false, activities[3], size, true)
        }
    }

    private fun getItemWidth(parentContainerWidth: Int): Int {
        return (parentContainerWidth - getLeftItemRightMargin()) / 2
    }

    private fun getLeftItemRightMargin() = resources.getDimensionPixelSize(R.dimen.padding_medium)

    private fun addSingleView(
        parent: ViewGroup,
        leftItem: Boolean,
        activity: Activity,
        size: Int,
        lastItem: Boolean = false
    ) {
        val child = DataBindingUtil.inflate<RowHomeActivityBinding>(
            LayoutInflater.from(context),
            R.layout.row_home_activity,
            null,
            false
        )
        parent.addView(child.root)
        val params = child.root.layoutParams as LinearLayout.LayoutParams
        params.width = getItemWidth(getActivity()?.windowManager?.defaultDisplay!!.width) - getLeftItemRightMargin()
        params.height = (getItemWidth(getActivity()?.windowManager?.defaultDisplay!!.width) - getLeftItemRightMargin())
        if (leftItem)
            params.marginEnd = getLeftItemRightMargin()
        child.root.layoutParams = params
        child.model = activity
        if (lastItem) {
            child.isLastItem = lastItem
            child.moreCount = size - 3

            RxView.clicks(child.root)
                .throttleFirst(300, TimeUnit.MILLISECONDS)
                .subscribe { navController.navigate(R.id.action_homeFragment_to_whatToDoListFragment) }
        } else {
            RxView.clicks(child.root)
                .throttleFirst(300, TimeUnit.MILLISECONDS)
                .subscribe {
                    val bundle = Bundle()
                    bundle.putParcelable(Constants.CATEGORYACTIVITY,activity)
                    navController.navigate(R.id.action_homeFragment_to_whatToDoCategoryListFragment,bundle) }
        }
    }

    override fun getViewId() = R.layout.fragment_home_what_to_do
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentHomeWhatToDoBinding>(view)!!

    companion object {
        fun getInstance() = WhatToDoSectionFragment()
    }
}