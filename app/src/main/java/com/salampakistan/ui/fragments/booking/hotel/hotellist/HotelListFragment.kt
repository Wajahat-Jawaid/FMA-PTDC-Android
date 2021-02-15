package com.salampakistan.ui.fragments.booking.hotel.hotellist

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentHotelListBinding
import com.salampakistan.databinding.RowHotelListBinding
import com.salampakistan.model.hotelsearchresponse.Hotel
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.BookingListAdapter
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.booking.hotel.HotelListFilter
import com.salampakistan.ui.fragments.booking.hotel.HotelListSort
import com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsFragment
import com.salampakistan.utils.CalendarUtils
import com.salampakistan.utils.CalendarUtils.getDates


class HotelListFragment : BaseFragment<FragmentHotelListBinding>(), Injectable {
    private lateinit var viewModel: HotelListViewModel
    private lateinit var binding: FragmentHotelListBinding
    private lateinit var adapter: BookingListAdapter<RowHotelListBinding, Hotel>
    private lateinit var city: String
    private lateinit var startDate: String
    private lateinit var endDate: String
    private var adult: Int = 0
    private var child: Int = 0
    private var room: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)
        binding.fragment = this
        setView()
        if (viewModel.data.isNullOrEmpty())
            getData(city, startDate, endDate, adult, child, noOfRooms = room)
        else {
            binding.sortText.isEnabled = true
            binding.filterText.isEnabled = true
            adapter.updateContent(viewModel.data)
        }
    }

    fun launchSort() {
        val fragment = HotelListSort.getInstance()

        fragment.show(childFragmentManager, "ll")
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
                    adapter.updateContent(data)
                    adapter.notifyDataSetChanged()
                    binding.recyclerView.smoothScrollToPosition(0)
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
                    viewModel.filteredData.value = ArrayList()
                    adapter.updateContent(viewModel.data)
                    adapter.notifyDataSetChanged()
                }
            }

    }


    fun launchFilter() {
        val fragment = HotelListFilter.getInstance()

        fragment.show(childFragmentManager, "filter")
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
                    adapter.updateContent(data)
                    adapter.notifyDataSetChanged()
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
                    adapter.updateContent(viewModel.data)
                    adapter.notifyDataSetChanged()
                }
            }
    }

    fun setView() {

        binding.titleText.text = "${city.capitalize()} ${getDates(startDate, endDate)}"
        adapter = BookingListAdapter(R.layout.row_hotel_list)
        binding.recyclerView.adapter = adapter


        val itemDecorator =
            DividerItemDecoration(context!!, DividerItemDecoration.VERTICAL)
        itemDecorator.setDrawable(
            ContextCompat.getDrawable(
                context!!,
                R.drawable.divider_rec_view
            )!!
        )

        binding.recyclerView.addItemDecoration(itemDecorator)
        RxView.clicks(binding.backBtn).subscribe {
            navController.navigateUp()
        }
        adapter.itemClickSubject.subscribe {
            try {
                val bundle = Bundle()
                bundle.putString(HotelDetailsFragment.CITY, city)
                bundle.putString(HotelDetailsFragment.HOTELNAME, it.hotelName)
                bundle.putString(HotelDetailsFragment.STARTDATE, startDate)
                bundle.putString(HotelDetailsFragment.ENDDATE, endDate)
                bundle.putInt(HotelDetailsFragment.ADULT, adult)
                bundle.putInt(HotelDetailsFragment.CHILD, child)
                bundle.putInt(HotelDetailsFragment.ROOMS, room)
                bundle.putInt(HotelDetailsFragment.DAY, it.daysDifference)
                bundle.putInt(HotelDetailsFragment.PERDAYRATE, it.minimumRate)
                bundle.putStringArrayList(HotelDetailsFragment.HOTELAMENITIES, it.hotelAmenities)
                bundle.putStringArrayList(
                    HotelDetailsFragment.HOTELPHOTOS,
                    it.images
                )
                navController.navigate(
                    R.id.action_hotelListFragment_to_hotelDetailsFragment,
                    bundle
                )
            } catch (e: Exception) {
            }

        }
    }


    private fun getData(
        city: String,
        departDate: String,
        returnDate: String,
        noOfAdults: Int = 1,
        noOfChilderns: Int = 0,
        noOfInfants: Int = 0,
        noOfRooms: Int? = 1
    ) {
        viewModel.searchHotels(
            city,
            departDate,
            returnDate,
            noOfAdults,
            noOfChilderns,
            noOfInfants,
            noOfRooms
        ).observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                    showProgressBar(true)
                }
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    binding.sortText.isEnabled = true
                    binding.filterText.isEnabled = true
                    if (!it.data?.data?.Hotels.isNullOrEmpty()) {
                        viewModel.data = it.data?.data?.Hotels!!
                        viewModel.data.map {
                            it.daysDifference = CalendarUtils.getDaysDifference(
                                returnDate,
                                departDate
                            )
                        }
                        adapter.updateContent(viewModel.data)
                    } else binding.nothingFoundText.visibility = View.VISIBLE
                }
                Result.Status.ERROR -> {
                    if(!it.message.isNullOrEmpty())showSnack(it.message.toString())
                    binding.nothingFoundText.visibility = View.VISIBLE
                    hideProgressBar()
                }
            }
        })
    }

    override fun onPause() {
        super.onPause()
        try {
            hideProgressBar()
        } catch (e: Exception) {
        }
    }

    override fun handleArguments(arguments: Bundle) {
        city = arguments?.getString(CITY)!!
        startDate = arguments?.getString(STARTDATE)!!
        endDate = arguments?.getString(ENDDATE)!!
        adult = arguments?.getInt(ADULT)!!
        child = arguments?.getInt(CHILD)!!
        room = arguments?.getInt(ROOMS)!!
    }

    companion object {
        private val TAG = HotelListFragment::class.java.simpleName
        val CITY = "$TAG.city"
        val STARTDATE = "$TAG.startDate"
        val ENDDATE = "$TAG.endDate"
        val ADULT = "$TAG.adult"
        val CHILD = "$TAG.child"
        val ROOMS = "$TAG.rooms"
        fun newInstance() = HotelListFragment()
    }

    override fun getViewId(): Int = R.layout.fragment_hotel_list

    override fun injectBinding(view: View): FragmentHotelListBinding = DataBindingUtil.bind(view)!!


}