//package com.salampakistan.ui.fragments.itinerary
//
//import android.os.Bundle
//import android.view.View
//import androidx.databinding.DataBindingUtil
//import com.salampakistan.R
//import com.salampakistan.base.BaseListFragment
//import com.salampakistan.dagger.Injectable
//import com.salampakistan.dagger.injectViewModel
//import com.salampakistan.databinding.FragmentListBinding
//import com.salampakistan.databinding.RowItineraryBinding
//import com.salampakistan.databinding.RowWishlistBinding
//import com.salampakistan.model.Review
//import com.salampakistan.ui.adapters.SimpleListAdapter
//import com.salampakistan.ui.fragments.reviews.ReviewsListViewModel
//import com.salampakistan.utils.FragmentTransitionHelper
//
///**
// * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
// */
//class ItineraryListFragment1 : BaseListFragment<FragmentListBinding>(), Injectable {
//
//    private lateinit var viewModel: ReviewsListViewModel
//    private lateinit var binding: FragmentListBinding
//    private val adapter: SimpleListAdapter<RowItineraryBinding, Review>
//            by lazy { SimpleListAdapter<RowItineraryBinding, Review>(R.layout.row_itinerary) }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        viewModel = injectViewModel(viewModelFactory)
//        binding = injectBinding(view)
//        super.onViewCreated(view, savedInstanceState)
//        val recyclerView = binding.recyclerView
//        binding.recyclerView.adapter = adapter
//        binding.toolbarTitle.text = "Travel Itineraries"
//        attachSkeletonViews(recyclerView, adapter, R.layout.row_home_activity)
//        fetchReviews()
//    }
//
//    private fun fetchReviews() {
//        val reviews = mutableListOf(
//            Review(""),
//            Review(""), Review(""), Review(""), Review(""), Review(""),
//            Review(""), Review(""), Review(""), Review(""), Review("")
//        )
//        adapter.items = reviews
//        skeleton.hide()
//    }
//
//    override fun getTitle() = getString(R.string.reviews)
//    override fun getViewId() = R.layout.fragment_list
//    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentListBinding>(view)!!
//
//    companion object {
//        fun getInstance(): ItineraryListFragment1 {
//            val fg = ItineraryListFragment1()
//            FragmentTransitionHelper.setupTransitionFromBottom(fg)
//            return fg
//        }
//    }
//}