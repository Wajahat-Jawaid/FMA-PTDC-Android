package com.salampakistan.ui.fragments.wheretogo

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
import com.salampakistan.databinding.FragmentListWhereToGoBinding
import com.salampakistan.databinding.RowWhereToGoBinding
import com.salampakistan.model.Location
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.utils.Constants.CATEGORYLOCATION
import com.salampakistan.utils.FragmentTransitionHelper
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhereToGoListFragment : BaseListFragment<FragmentListWhereToGoBinding>(), Injectable {

    private lateinit var viewModel: WhereToGoListViewModel
    private lateinit var binding: FragmentListWhereToGoBinding
    private val eventsAdapter =
        SimpleListAdapter<RowWhereToGoBinding, Location>(R.layout.row_where_to_go)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.recyclerView
        setRecyclerView()
        attachSkeletonViews(recyclerView, eventsAdapter, R.layout.row_list_skeleton)
        getData()
        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe {
            navController.navigateUp()
        }
    }

    private fun setRecyclerView() {
        binding.recyclerView.adapter = eventsAdapter
        eventsAdapter.itemClickSubject
            .subscribe {
                run {
                    try {
                        val bundle = Bundle()
                        bundle.putParcelable(CATEGORYLOCATION, it)
                        navController.navigate(
                            R.id.action_whereToGoListFragment_to_whereToGoCategoryListFragment,
                            bundle
                        )
                    } catch (e: Exception) {
                    }

                }
            }
    }

    private fun getData() {
        viewModel.locations.observe(viewLifecycleOwner, Observer {
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

    override fun getViewId() = R.layout.fragment_list_where_to_go
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentListWhereToGoBinding>(view)!!

    companion object {
        fun getInstance(): WhereToGoListFragment {
            val fg = WhereToGoListFragment()
            FragmentTransitionHelper.setupTransitionFromEnd(fg)
            return fg
        }
    }
}