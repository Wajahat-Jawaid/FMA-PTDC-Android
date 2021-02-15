package com.salampakistan.ui.fragments.booking.flight.flightlist

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentFlightListBinding
import com.salampakistan.databinding.RowFlightBinding
import com.salampakistan.model.enums.TripType
import com.salampakistan.model.getflightsresponse.Airline
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.FlightListAdapter
import com.salampakistan.ui.fragments.booking.hotel.FlightListFilter
import com.salampakistan.ui.fragments.booking.hotel.FlightListSort
import com.salampakistan.ui.fragments.booking.hotel.HotelListFilter
import com.salampakistan.ui.fragments.booking.hotel.HotelListSort
import com.salampakistan.utils.CalendarUtils.convertDate

class FlightListFragment : BaseFragment<FragmentFlightListBinding>(), Injectable {

    private lateinit var viewModel: FlightListViewModel
    private lateinit var binding: FragmentFlightListBinding
    private lateinit var flightListAdapter: FlightListAdapter<RowFlightBinding, Airline>

    private lateinit var cabin: String
    private lateinit var departureDate: String
    private lateinit var returnDate: String
    private lateinit var tripType: String
    private lateinit var departureCity: String
    private lateinit var arrivalCity: String
    private var noOfAdults: Int = 0
    private var noOfChild: Int = 0
    private var noOfInfants: Int = 0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)

        setView()
        getflights()
    }

    private fun getflights() {
        viewModel.getFlights(
            departureCity,
            arrivalCity,
            departureDate,
            if (tripType == TripType.ONE_WAY.name) "" else returnDate,
            noOfAdults,
            noOfInfants,
            if (cabin!="all cabins")cabin else "",
            noOfChild
        ).observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                    showProgressBar(true)
                }
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if (it.data?.data?.airline.isNullOrEmpty()) {
                        binding.nothingFoundText.visibility = View.VISIBLE
                        return@Observer
                    }
                    binding.departCitySmallText.text =
                        it.data?.data!!.airline[0].outboundRoute[0].from
                    binding.destinationCityShortText.text =
                        it.data.data.airline[0].outboundRoute[it.data.data.airline[0].outboundRoute.size - 1].to
                    for (item in it.data.data.airline) {
                        item.fromCompleteCityName = departureCity
                        item.toCompleteCityName = arrivalCity
                    }
                    viewModel.data = it.data.data.airline
                    flightListAdapter.updateContent(it.data.data.airline)
                    binding.sortText.isEnabled = true
                    binding.filterText.isEnabled = true
                }
                Result.Status.ERROR -> {
                    binding.nothingFoundText.visibility = View.VISIBLE
                    hideProgressBar()
                }
            }
        })
    }

    fun launchSort() {
        val fragment = FlightListSort.getInstance()

        fragment.show(childFragmentManager, "sort")
        // Listen for filter events
        fragment.filtersAppliedSubjecthotel
            .subscribe {
                run {
                    // Dismiss fragment
                    fragment.dismiss()

                    // sort properties
                    viewModel.filters = it.values
                    val data = viewModel.sortData(it)
                    if (data.isEmpty()) {
                        binding.nothingFoundText.visibility = View.VISIBLE
                    } else binding.nothingFoundText.visibility = View.GONE
                    flightListAdapter.updateContent(data)
                    flightListAdapter.notifyDataSetChanged()
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
                    flightListAdapter.updateContent(viewModel.data)
                    flightListAdapter.notifyDataSetChanged()
                }
            }

    }


    fun launchFilter() {
        val fragment = FlightListFilter.getInstance()

        fragment.show(childFragmentManager, "filter")
        // Listen for filter events
        fragment.filtersAppliedSubjecthotel
            .subscribe {
                run {
                    // Dismiss fragment
                    fragment.dismiss()

                    // sort properties

                    val data = viewModel.sortData(it)
                    if (data.isEmpty()) {
                        binding.nothingFoundText.visibility = View.VISIBLE
                    } else binding.nothingFoundText.visibility = View.GONE
                    flightListAdapter.updateContent(data)
                    flightListAdapter.notifyDataSetChanged()
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
                    flightListAdapter.updateContent(viewModel.data)
                    flightListAdapter.notifyDataSetChanged()
                }
            }
    }

    private fun setView() {
        flightListAdapter = FlightListAdapter(context!!, R.layout.row_flight)
        binding.flightRecyclerView.adapter = flightListAdapter

        flightListAdapter.bookClickSubject.subscribe {
            
        }
        RxView.clicks(binding.sortText).subscribe { launchSort() }
        RxView.clicks(binding.filterText).subscribe { launchFilter() }

        flightListAdapter.clickSubject.subscribe {}
        RxView.clicks(binding.backBtn).subscribe { navController.navigateUp() }
        binding.startDesText.text = departureCity
        binding.startDesText.text = departureCity
        binding.cabinText.text = cabin
        binding.departureDateText.text = convertDate(departureDate)
        binding.destinationLongText.text = arrivalCity
        binding.adultText.text =
            "$noOfAdults ${resources.getQuantityString(R.plurals.adults, noOfAdults)}"
    }


    override fun onPause() {
        super.onPause()
        try {
            hideProgressBar()
        } catch (e: Exception) {
        }
    }

    override fun handleArguments(arguments: Bundle) {
        cabin = arguments.getString(FlightListFragment.CABIN)!!
        departureCity = arguments.getString(FlightListFragment.DEPARTCITY)!!
        arrivalCity = arguments.getString(FlightListFragment.ARRIVALCITY)!!
        departureDate = arguments.getString(FlightListFragment.DEPARTDATE)!!
        returnDate = arguments.getString(FlightListFragment.RETURNDATE)!!
        tripType = arguments.getString(FlightListFragment.TRIPTYPE)!!
        noOfAdults = arguments.getInt(FlightListFragment.NOOFADULTS)!!
        noOfChild = arguments.getInt(FlightListFragment.NOOFCHILD)!!
        noOfInfants = arguments.getInt(FlightListFragment.NOOFINFANTS)!!
    }

    override fun getViewId(): Int = R.layout.fragment_flight_list

    override fun injectBinding(view: View): FragmentFlightListBinding = DataBindingUtil.bind(view)!!


    companion object {
        fun newInstance() = FlightListFragment()
        private val TAG = FlightListFragment::class.java.name
        val CABIN = "$TAG.cabin"
        val DEPARTDATE = "$TAG.DEPARTDATE"
        val RETURNDATE = "$TAG.RETURNDATE"
        val TRIPTYPE = "$TAG.triptype"
        val DEPARTCITY = "$TAG.DEPARTCITY"
        val ARRIVALCITY = "$TAG.ARRIVAL"
        val NOOFADULTS = "$TAG.noofadults"
        val NOOFCHILD = "$TAG.noofchild"
        val NOOFINFANTS = "$TAG.noofinfants"
    }

}