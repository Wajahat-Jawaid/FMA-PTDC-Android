package com.salampakistan.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.salampakistan.R
import com.salampakistan.dagger.Injectable
import com.salampakistan.model.Blog
import com.salampakistan.network.Result
import com.salampakistan.network.WebService
import com.salampakistan.ui.custom.BottomSheetWebView
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ExpertTipsSectionFragment : BaseHomeSectionFragment<Blog>(), Injectable {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configAdapter(Blog)
        attachSkeletonViews(R.layout.row_home_trip_skeleton)
        setIntro(R.string.intimate_insights)
        setTitle(R.string.expert_tips)
        setSeeAllFlag(false)
        getData()
    }

    private fun getData() {
        viewModel.expertTips.observe(viewLifecycleOwner, Observer {
            Timber.d("Status: %s", it.status)
            when (it.status) {
                Result.Status.SUCCESS -> setData(it.data?.blogs)
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    override fun viewAllTextClicked() {
    }

    override fun onListItemClicked(model: Blog) {
        val bottomSheetWebView = BottomSheetWebView(context!!)
        val url = "${WebService.FMA_DOMAIN_URL}blog/${model.slug}"
        bottomSheetWebView.showWithUrl(url)
    }

    companion object {
        fun getInstance() = ExpertTipsSectionFragment()
    }
}