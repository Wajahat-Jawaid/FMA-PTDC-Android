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
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.booking.hotel.HotelListFilter
import com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsFragment
import com.salampakistan.utils.CalendarUtils.getDates


class HotelListFragment : BaseFragment<FragmentHotelListBinding>(), Injectable {
    private lateinit var viewModel: HotelListViewModel
    private lateinit var binding: FragmentHotelListBinding
    private lateinit var adapter: SimpleListAdapter<RowHotelListBinding, Hotel>
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

        getData(city,startDate,endDate,adult,child,noOfRooms = room)
        setView()
    }

    private fun launchSort() {
        val fragment = HotelListFilter.getInstance()

        fragment.show(childFragmentManager, "ll")
        // Listen for filter events
        fragment.filtersAppliedSubjecthotel
            .subscribe {
                run {
                    // Dismiss fragment
                    fragment.dismiss()

                    // sort hotels
                    adapter.updateContent(viewModel.sortData(it))

                }
            }
        fragment.filtersClearedSubject
            .subscribe {
                run {
                    // Reset filters model
                    viewModel.appliedFiltersData.value?.reset()

                    // Dismiss fragment
                    fragment.dismiss()
                    adapter.updateContent(viewModel.data)
                }
            }

    }

    fun setView() {

        RxView.clicks(binding.sortText).subscribe {
            launchSort()
        }

        binding.titleText.text = "${city.capitalize()} ${getDates(startDate, endDate)}"
        adapter = SimpleListAdapter(R.layout.row_hotel_list)
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
                bundle.putString(HotelDetailsFragment.HOTELNAME, it.hotelInfo.Name)
                bundle.putString(HotelDetailsFragment.STARTDATE, startDate)
                bundle.putString(HotelDetailsFragment.ENDDATE, endDate)
                bundle.putInt(HotelDetailsFragment.ADULT, adult)
                bundle.putInt(HotelDetailsFragment.CHILD, child)
                bundle.putInt(HotelDetailsFragment.ROOMS, room)
                bundle.putStringArrayList(
                    HotelDetailsFragment.HOTELPHOTOS,
                    it.hotelInfo.multi_images
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

                }
                Result.Status.SUCCESS -> {
                    binding.sortText.isEnabled = true
                    if (!it.data?.data.isNullOrEmpty()) {
                        viewModel.data = it.data?.data!!
                        adapter.updateContent(it.data?.data)
                    }
                }
                Result.Status.ERROR -> {
                }
            }
        })
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