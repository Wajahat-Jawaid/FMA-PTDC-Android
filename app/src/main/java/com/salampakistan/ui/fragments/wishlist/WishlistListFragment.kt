package com.salampakistan.ui.fragments.wishlist

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.salampakistan.R
import com.salampakistan.base.BaseListFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentListBinding
import com.salampakistan.model.WishList
import com.salampakistan.network.Result
import com.salampakistan.utils.FragmentTransitionHelper
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WishlistListFragment : BaseListFragment<FragmentListBinding>(), Injectable {

    private lateinit var viewModel: WishlistViewModel
    private lateinit var binding: FragmentListBinding
    private val adapter = WishlistAdapter()
    private lateinit var wishlist: MutableList<WishList>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.recyclerView
        binding.recyclerView.adapter = adapter
        attachSkeletonViews(recyclerView, adapter, R.layout.row_wishlist_skeleton)
        getData()
    }

    private fun getData() {
        if (preferences.getUser() == null) {
            showSnack("Login to continue")
            return
        }
        viewModel.getWishlist(preferences.getUser()?.id!!, preferences.getUser()?.token!!)
            .observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Response: %s", Gson().toJson(it.data))
                        if (it.data?.data == null) {
                            binding.noWishlistLayout.visibility = View.VISIBLE
                            return@Observer
                        }
                        if (binding.noWishlistLayout.isVisible)
                            binding.noWishlistLayout.visibility = View.GONE
                        if (it.data.data.locations.isNullOrEmpty() && it.data.data.activities.isNullOrEmpty()) {
                            binding.noWishlistLayout.visibility = View.VISIBLE
                            skeleton.hide()
                            return@Observer
                        }
                        // Set RecyclerView
                        wishlist = viewModel.parseWishlist(it.data.data)
                        adapter.updateContent(wishlist)
                        binding.recyclerView.adapter = adapter
                        skeleton.hide()
                        adapter.addToPlanSubject
                            .subscribe { w ->
                                Timber.d("Clicked remove")
                                addToPlan()
                            }
                        adapter.removeSubject
                            .subscribe { w ->
                                Timber.d("Clicked remove")
                                removeFromWishList(w.first, w.second)
                            }
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

    private fun removeFromWishList(index: Int, id: String) {
        viewModel.removeFromWishList(preferences.getUser()?.token!!, id)
            .observe(viewLifecycleOwner, Observer {
                Timber.d("Remove response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        Timber.d("Success")
                        if (it.data?.data != null) {
                            showSnack("Location deleted from Wishlist")
                            wishlist.removeAt(index)
                            adapter.notifyDataSetChanged()
                            if (wishlist.isEmpty()) {
                                binding.noWishlistLayout.visibility = View.VISIBLE
                            }
                        }
                    }
                    Result.Status.LOADING -> {
                        Timber.e("Loading")
                    }
                    Result.Status.ERROR -> {
                        Timber.e("Error")
                    }
                }
            })
    }

    private fun addToPlan() {

    }

    override fun getTitle() = getString(R.string.reviews)
    override fun getViewId() = R.layout.fragment_list
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentListBinding>(view)!!

    companion object {
        fun getInstance(): WishlistListFragment {
            val fg = WishlistListFragment()
            FragmentTransitionHelper.setupTransitionFromBottom(fg)
            return fg
        }
    }
}