package com.salampakistan.ui.fragments.wheretogo

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseListFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentListWhereToGoCategoryBinding
import com.salampakistan.databinding.RowWhereToGoBinding
import com.salampakistan.databinding.RowWhereToGoTypeAllBinding
import com.salampakistan.model.Location
import com.salampakistan.model.response.GetLocationsResponse
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.utils.Constants
import com.salampakistan.utils.Constants.LOCATIONID
import com.salampakistan.utils.Constants.LOCATIONNAME
import com.salampakistan.utils.Constants.LOCATIONSLUG
import com.salampakistan.utils.FragmentTransitionHelper
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhereToGoCategoryListFragment : BaseListFragment<FragmentListWhereToGoCategoryBinding>(),
    Injectable {

    private lateinit var categoryLocation: Location
    private lateinit var viewModel: WhereToGoCategoryListViewModel
    private lateinit var binding: FragmentListWhereToGoCategoryBinding
    private val featuredAdapter =
        SimpleListAdapter<RowWhereToGoBinding, Location>(R.layout.row_where_to_go)
    private val allAdapter =
        SimpleListAdapter<RowWhereToGoTypeAllBinding, Location>(R.layout.row_where_to_go_type_all)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
        val featuredRecyclerView = binding.featuredRecyclerView
        setRecyclerView()
        attachSkeletonViews(featuredRecyclerView, featuredAdapter, R.layout.row_list_skeleton)
        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe {
            navController.navigateUp()
        }
        binding.categoryLocation = categoryLocation
        if (viewModel.categoryLocations == null) {
            Timber.d("Getting from server")
            getData()

        } else {
            Timber.d("Getting from cache")
            handleResponse(viewModel.categoryLocations!!.value!!)
        }
    }

    override fun handleArguments(arguments: Bundle) {
        categoryLocation = arguments.getParcelable(Constants.CATEGORYLOCATION)!!
    }

    private var ss = false

    private fun setRecyclerView() {
        binding.featuredRecyclerView.adapter = featuredAdapter
//        binding.allRecyclerView.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//        binding.allRecyclerView.adapter = allAdapter
        if (ss)
            return
        ss = true
        featuredAdapter.itemClickSubject
            .subscribe {
                val bundle = Bundle()
                bundle.putString(LOCATIONID, it.id)
                bundle.putString(LOCATIONNAME, it.name)
                bundle.putString(LOCATIONSLUG, it.slug)
                navController.navigate(
                    R.id.action_whereToGoCategoryListFragment_to_locationDetailsFragment,
                    bundle
                )
            }
        allAdapter.itemClickSubject
            .subscribe {
            }
    }

    override fun onResume() {
        super.onResume()
    }

    private fun handleResponse(it: Result<GetLocationsResponse>) {
        when (it.status) {
            Result.Status.SUCCESS -> {
                Timber.d("Response: %s", Gson().toJson(it.data?.data))
                if (it.data?.data == null || it.data.data.isEmpty()) {
                    binding.viewNoTrips.visibility = View.VISIBLE
                    return
                }
                if (binding.viewNoTrips.isVisible)
                    binding.viewNoTrips.visibility = View.GONE
                // Set RecyclerView
                featuredAdapter.items = it.data.data
                allAdapter.items = it.data.data
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
    }

    private fun getData() {
        viewModel.getCategoryLocations(categoryLocation.id).observe(viewLifecycleOwner, Observer {
            handleResponse(it)
            viewModel.categoryLocations = MutableLiveData(it)
        })
    }

    override fun getViewId() = R.layout.fragment_list_where_to_go_category
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentListWhereToGoCategoryBinding>(view)!!

    companion object {

        private val TAG = WhereToGoCategoryListFragment::class.java.simpleName
//        private val CATEGORY_LOCATION = "$TAG.categoryLocation"

        fun getInstance(categoryLocation: Location): WhereToGoCategoryListFragment {
            val fg = WhereToGoCategoryListFragment()
//            FragmentTransitionHelper.setupTransitionFromEnd(fg)
//            val bundle = Bundle()
//            bundle.putParcelable(CATEGORY_LOCATION, categoryLocation)
//            fg.arguments = bundle
            return fg
        }
    }
}