package com.salampakistan.ui.fragments.reviews

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.salampakistan.R
import com.salampakistan.base.BaseListFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentListBinding
import com.salampakistan.databinding.RowReviewBinding
import com.salampakistan.model.Review
import com.salampakistan.model.response.getreviewsresponse.Data
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.profile.ProfileFragment
import com.salampakistan.ui.fragments.wishlist.WishlistListFragment
import com.salampakistan.utils.FragmentTransitionHelper

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ReviewsListFragment : BaseListFragment<FragmentListBinding>(), Injectable {

    private lateinit var viewModel: ReviewsListViewModel
    private lateinit var binding: FragmentListBinding
    private val adapter: SimpleListAdapter<RowReviewBinding, Data>
            by lazy { SimpleListAdapter<RowReviewBinding, Data>(R.layout.row_review) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.type = getString(R.string.no_review)
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.recyclerView
        binding.recyclerView.adapter = adapter
        attachSkeletonViews(recyclerView, adapter, R.layout.row_review)
        if(preferences.getUser()!=null)
            fetchReviews()
    }

    override fun onResume() {
        super.onResume()
    }

    private fun fetchReviews() {
        viewModel.reviews(preferences.getUser()?.id!!,preferences.getUser()?.token!!).observe(viewLifecycleOwner,
            Observer {
                when(it.status){
                    Result.Status.SUCCESS -> {
                        if (!it.data?.data.isNullOrEmpty()) {
                            adapter.updateContent(it.data?.data)
                        }
                        else {
                            binding.titleText.text = getString(R.string.no_review_present)
                            binding.msgText.text = getString(R.string.please_provide_review)

                        }

                    }
                    Result.Status.LOADING -> {
                    }
                    Result.Status.ERROR -> {
                        binding.titleText.text = getString(R.string.no_review)
                        binding.noWishlistLayout.visibility = View.VISIBLE
                    }
                }
            })

        skeleton.hide()
    }

    override fun getTitle() = getString(R.string.reviews)
    override fun getViewId() = R.layout.fragment_list
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentListBinding>(view)!!

    companion object {
        fun getInstance() : ReviewsListFragment {
            val fg = ReviewsListFragment()
            FragmentTransitionHelper.setupTransitionFromBottom(fg)
            return fg
        }
    }
}