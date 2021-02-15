package com.salampakistan.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.ethanhua.skeleton.Skeleton
import com.ethanhua.skeleton.SkeletonScreen
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.*
import com.salampakistan.model.*
import com.salampakistan.model.seasons.Data
import com.salampakistan.model.tripslist.Trip
import com.salampakistan.ui.adapters.BaseListAdapter
import com.salampakistan.ui.adapters.SimpleListAdapter
import java.util.concurrent.TimeUnit

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
abstract class BaseHomeSectionFragment<M> : BaseFragment<ViewHomeFragmentContainerBinding>() {

    lateinit var binding: ViewHomeFragmentContainerBinding
    lateinit var viewModel: HomeViewModel
    lateinit var skeleton: SkeletonScreen

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        setViewAllTextAction(::viewAllTextClicked)
    }

    private fun setViewAllTextAction(clickSetter: () -> Unit) {
        RxView.clicks(binding.seeAllText)
            .throttleFirst(300, TimeUnit.MILLISECONDS)
            .subscribe {
                clickSetter()
            }
    }

    fun setIntro(@StringRes intro: Int) {
        binding.intro = getString(intro)
    }

    fun setTitle(@StringRes title: Int) {
        binding.title = getString(title)
    }

    fun setSeeAllFlag(seeAll: Boolean) {
        binding.showSeeAllText = seeAll
    }

    fun attachSkeletonViews(@LayoutRes resId: Int): SkeletonScreen {
        skeleton = Skeleton.bind(binding.recyclerView)
            .adapter(adapter)
            .angle(0)
            .duration(1500)
            .load(resId)
            .show()
        return skeleton
    }

    fun getLayoutManager() = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

    private lateinit var adapter: BaseListAdapter<*, *>

    fun <M> configAdapter(type: M) {
        adapter = when (type) {
            Location -> SimpleListAdapter<RowHomeLocationBinding, Location>(R.layout.row_home_location)
            Season -> SimpleListAdapter<RowHomeSeasonBinding, Season>(R.layout.row_home_season)
            Blog -> SimpleListAdapter<RowHomeBlogBinding, Blog>(R.layout.row_home_blog)
            Trip -> SimpleListAdapter<RowHomeTripBinding, Activity>(R.layout.row_home_trip)
            else -> SimpleListAdapter<RowHomeActivityBinding, Activity>(R.layout.row_home_activity)
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun setData(items: List<M>?) {
        if (items.isNullOrEmpty())
            return
        // Getting first item to identify the data type
        when (items[0]) {
            is Location -> (adapter as SimpleListAdapter<RowHomeLocationBinding, Location>).updateContent(
                items as List<Location>
            )
            is Data -> (adapter as SimpleListAdapter<RowHomeSeasonBinding, Data>).updateContent(
                items as List<Data>
            )
            is Blog -> (adapter as SimpleListAdapter<RowHomeBlogBinding, Blog>).updateContent(items as List<Blog>)
            is Trip -> (adapter as SimpleListAdapter<RowHomeTripBinding, Trip>).updateContent(
                items as List<com.salampakistan.model.tripslist.Trip>
            )
            else -> (adapter as SimpleListAdapter<RowHomeActivityBinding, Activity>).updateContent(
                items as List<Activity>
            )
        }
        binding.recyclerView.adapter = adapter
        adapter.itemClickSubject.subscribe { onListItemClicked(it as M) }
    }

    override fun getViewId() = R.layout.view_home_fragment_container
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<ViewHomeFragmentContainerBinding>(view)!!

    abstract fun viewAllTextClicked()
    abstract fun onListItemClicked(model: M)
}