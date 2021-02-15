package com.salampakistan.ui.fragments.booking.bus.buslist

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentBusListBinding
import com.salampakistan.databinding.RowBusBinding
import com.salampakistan.model.getbusservicesreponse.BusService
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.BookingListAdapter
import com.salampakistan.ui.adapters.BusListAdapter
import com.salampakistan.ui.fragments.booking.hotel.BusListFilter
import com.salampakistan.ui.fragments.booking.hotel.BusListSort
import com.salampakistan.ui.fragments.booking.hotel.HotelListFilter
import com.salampakistan.ui.fragments.booking.hotel.HotelListSort

class BusListFragment : BaseFragment<FragmentBusListBinding>(), Injectable {

    private lateinit var viewModel: BusListViewModel
    private lateinit var binding: FragmentBusListBinding
    private lateinit var busListAdapter: BusListAdapter<RowBusBinding, BusService>
    private lateinit var serviceName: String
    private lateinit var destinationLongText: String
    private lateinit var destinationShotText: String
    private lateinit var originLongText: String
    private lateinit var originShotText: String
    private lateinit var date: String
    private lateinit var serverDate: String
    override fun handleArguments(arguments: Bundle) {
        serviceName = arguments.getString(SERVICENAME)!!
        destinationLongText = arguments.getString(DESTINATIONLOGN)!!
        destinationShotText = arguments.getString(DESTINATIONSHORT)!!
        originLongText = arguments.getString(ORIGINLONG)!!
        originShotText = arguments.getString(ORIGINSHORT)!!
        date = arguments.getString(DATE)!!
        serverDate = arguments.getString(SERVERDATE)!!

    }

    override fun onPause() {
        super.onPause()
        try {
            hideProgressBar()
        } catch (e: Exception) {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)

        setView()
        getData()
        RxView.clicks(binding.sortText).subscribe {
            launchSort()
        }
        RxView.clicks(binding.filterText).subscribe {
            launchFilter()
        }
    }


    fun launchSort() {
        val fragment = BusListSort.getInstance()
        fragment.filters = viewModel.filters

        fragment.show(childFragmentManager, "ll")
        // Listen for filter events
        fragment.filtersAppliedSubjecthotel
            .subscribe {
                run {
                    // Dismiss fragment
                    fragment.dismiss()

                    // filter buses
                    it.values.forEach {
                        if(!viewModel.filters.contains(it)){
                            viewModel.filters.add(it)
                        }
                    }
                    val data = viewModel.sortData(it)
                    if (data.isEmpty()) {
                        binding.nothingFoundText.visibility = View.VISIBLE
                    } else binding.nothingFoundText.visibility = View.GONE
                    busListAdapter.updateContent(data)
                    busListAdapter.notifyDataSetChanged()
                }
            }
        fragment.filtersClearedSubject
            .subscribe {
                run {
                    // Reset filters model
                    viewModel.appliedFiltersData.value?.reset()

                    // Dismiss fragment
                    fragment.dismiss()
                    binding.nothingFoundText.visibility = View.GONE
                    busListAdapter.updateContent(viewModel.data)
                    busListAdapter.notifyDataSetChanged()
                }
            }

    }


    fun launchFilter() {
        val fragment = BusListFilter.getInstance()
        fragment.filters = viewModel.filters

        fragment.show(childFragmentManager, "filter")
        // Listen for filter events
        fragment.filtersAppliedSubjecthotel
            .subscribe {
                run {
                    // Dismiss fragment
                    fragment.dismiss()

                    // sort properties
                    viewModel.filters.forEach {filter->
                        if(!it.values.contains(filter)){
                            viewModel.filters.add(filter)
                        }else viewModel.filters.remove(filter)
                    }
                    val data = viewModel.sortData(it)
                    if (data.isEmpty()) {
                        binding.nothingFoundText.visibility = View.VISIBLE
                    } else binding.nothingFoundText.visibility = View.GONE
                    busListAdapter.updateContent(data)
                    busListAdapter.notifyDataSetChanged()
                }
            }
        fragment.filtersClearedSubject
            .subscribe {
                run {
                    // Reset filters model
                    viewModel.appliedFiltersData.value?.reset()

                    // Dismiss fragment
                    viewModel.filters.removeAll(viewModel.filters)
                    fragment.dismiss()
                    binding.nothingFoundText.visibility = View.GONE
                    busListAdapter.updateContent(viewModel.data)
                    busListAdapter.notifyDataSetChanged()
                }
            }
    }

    private fun getData() {
        viewModel.getBusServices(
            originLongText,
            destinationLongText,
            if (serviceName == "all services") null else serviceName,
            serverDate
        )
            .observe(viewLifecycleOwner,
                Observer {
                    when (it.status) {
                        Result.Status.LOADING -> {
                            showProgressBar(true)
                        }
                        Result.Status.SUCCESS -> {
                            hideProgressBar()
                            if (it.data?.data != null && !it.data?.data.isNullOrEmpty()) {
                                it.data.data.map { service ->
                                    service.id = it.data.data.indexOf(service)
                                }
                                viewModel.data = it.data.data
                                busListAdapter.updateContent(viewModel.data)
                                return@Observer
                            }
                            binding.nothingFoundText.visibility = View.VISIBLE

                        }
                        Result.Status.ERROR -> {
                            if (it.message != null) showSnack(it.message)
                            hideProgressBar()
                            binding.nothingFoundText.visibility = View.VISIBLE
                        }
                    }
                })
    }

    private fun setView() {
        busListAdapter = BusListAdapter(context!!, R.layout.row_bus)
        binding.busRecyclerView.adapter = busListAdapter

        RxView.clicks(binding.backBtn).subscribe { navController.navigateUp() }

        binding.destinationLongText.text = destinationLongText
        binding.destinationShotText.text = destinationShotText
        binding.originLongText.text = originLongText
        binding.originShotText.text = originShotText
        binding.dateText.text = date
    }

    override fun getViewId(): Int = R.layout.fragment_bus_list

    override fun injectBinding(view: View): FragmentBusListBinding = DataBindingUtil.bind(view)!!

    companion object {
        private val TAG = BusListFragment::class.java.name
        val SERVICENAME = "$TAG.servicename"
        val DESTINATIONLOGN = "$TAG.destinationLongText"
        val DESTINATIONSHORT = "$TAG.destinationShotText"
        val ORIGINLONG = "$TAG.originLongText"
        val ORIGINSHORT = "$TAG.originShotText"
        val DATE = "$TAG.date"
        val SERVERDATE = "$TAG.serverDate"
        fun newInstance() = BusListFragment()
    }

}