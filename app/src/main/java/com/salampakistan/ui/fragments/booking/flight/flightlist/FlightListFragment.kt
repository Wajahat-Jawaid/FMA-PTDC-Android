package com.salampakistan.ui.fragments.booking.flight.flightlist

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentFlightListBinding
import com.salampakistan.databinding.RowFlightBinding
import com.salampakistan.ui.adapters.FlightListAdapter

class FlightListFragment : BaseFragment<FragmentFlightListBinding>(), Injectable {

    companion object {
        fun newInstance() = FlightListFragment()
    }

    private lateinit var viewModel: FlightListViewModel
    private lateinit var binding: FragmentFlightListBinding
    private lateinit var flightListAdapter: FlightListAdapter<RowFlightBinding, String>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)

        setView()
    }

    private fun setView() {
        val arr = ArrayList<String>()
        arr.add("1")
        arr.add("2")
        arr.add("3")
        arr.add("4")
        arr.add("5")
        flightListAdapter = FlightListAdapter(context!!, R.layout.row_flight)
        binding.flightRecyclerView.adapter = flightListAdapter
        flightListAdapter.updateContent(arr)


        flightListAdapter.bookClickSubject.subscribe {  }
        flightListAdapter.clickSubject.subscribe {}
        RxView.clicks(binding.backBtn).subscribe{navController.navigateUp()}
    }

    override fun getViewId(): Int = R.layout.fragment_flight_list

    override fun injectBinding(view: View): FragmentFlightListBinding = DataBindingUtil.bind(view)!!

}