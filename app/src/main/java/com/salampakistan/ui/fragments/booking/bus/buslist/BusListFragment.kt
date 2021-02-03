package com.salampakistan.ui.fragments.booking.bus.buslist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentBusListBinding
import com.salampakistan.databinding.RowBusBinding
import com.salampakistan.databinding.RowFlightBinding
import com.salampakistan.model.getbusservicesreponse.Data
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.BusListAdapter
import com.salampakistan.ui.adapters.FlightListAdapter
import com.salampakistan.ui.adapters.SimpleListAdapter

class BusListFragment : BaseFragment<FragmentBusListBinding>(), Injectable {

    private lateinit var viewModel: BusListViewModel
    private lateinit var binding: FragmentBusListBinding
    private lateinit var busListAdapter: BusListAdapter<RowBusBinding, Data>
    private lateinit var serviceName:String
    private lateinit var destinationLongText:String
    private lateinit var destinationShotText:String
    private lateinit var originLongText:String
    private lateinit var originShotText:String
    private lateinit var date:String
    override fun handleArguments(arguments: Bundle) {
        serviceName = arguments.getString(SERVICENAME)!!
        destinationLongText = arguments.getString(DESTINATIONLOGN)!!
        destinationShotText = arguments.getString(DESTINATIONSHORT)!!
        originLongText = arguments.getString(ORIGINLONG)!!
        originShotText = arguments.getString(ORIGINSHORT)!!
        date = arguments.getString(DATE)!!

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)

        setView()
        getData()
    }

    private fun getData() {
        viewModel.getBusServices(destinationLongText,originLongText,serviceName).observe(viewLifecycleOwner,
            Observer {
                when (it.status) {
                    Result.Status.LOADING -> {
                        showProgressBar(true)
                    }
                    Result.Status.SUCCESS -> {
                        hideProgressBar()
                        if(it.data?.data!=null){
                            busListAdapter.updateContent(it.data.data)
                        }
                    }
                    Result.Status.ERROR -> {
                        hideProgressBar()
                    }
                }
            })
    }

    private fun setView() {
        busListAdapter= BusListAdapter(context!!,R.layout.row_bus)
        binding.busRecyclerView.adapter = busListAdapter

        RxView.clicks(binding.backBtn).subscribe{navController.navigateUp()}

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
        fun newInstance() = BusListFragment()
    }

}