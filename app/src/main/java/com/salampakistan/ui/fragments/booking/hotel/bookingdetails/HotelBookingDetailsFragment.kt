package com.salampakistan.ui.fragments.booking.hotel.bookingdetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentHotelBookingDetailsBinding
import com.salampakistan.databinding.RowAmenitiesBinding
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsFragment
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment

class HotelBookingDetailsFragment : BaseFragment<FragmentHotelBookingDetailsBinding>(), Injectable {

    private lateinit var viewModel: HotelBookingDetailsViewModel
    private lateinit var binding: FragmentHotelBookingDetailsBinding
    private lateinit var city: String
    private lateinit var startDate: String
    private lateinit var endDate: String
    private var hotelName: String = ""
    private var adult: Int = 0
    private var child: Int = 0
    private var room: Int = 0
    private lateinit var amenitiesAdapter: SimpleListAdapter<RowAmenitiesBinding, String>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)
        setView()
    }

    private fun setView() {
        val strArr = ArrayList<String>()
        strArr.add("")
        strArr.add("")
        strArr.add("")
        strArr.add("")
        binding.hotelNameText.text = hotelName
        amenitiesAdapter = SimpleListAdapter(R.layout.row_amenities)
        binding.incAmenities.recAmenities.adapter = amenitiesAdapter
        amenitiesAdapter.updateContent(strArr)

        binding.incAmenities.recAmenities.layoutManager = GridLayoutManager(context!!, 2)
        RxView.clicks(binding.backBtn).subscribe {
            navController.navigateUp()
        }
    }

    override fun handleArguments(arguments: Bundle) {
        city = arguments?.getString(HotelBookingDetailsFragment.CITY)!!
        hotelName = arguments?.getString(HOTELNAME)!!
        startDate = arguments?.getString(HotelBookingDetailsFragment.STARTDATE)!!
        endDate = arguments?.getString(HotelBookingDetailsFragment.ENDDATE)!!
        adult = arguments?.getInt(HotelBookingDetailsFragment.ADULT)!!
        child = arguments?.getInt(HotelBookingDetailsFragment.CHILD)!!
        room = arguments?.getInt(HotelBookingDetailsFragment.ROOMS)!!
    }

    override fun getViewId(): Int = R.layout.fragment_hotel_booking_details
    override fun injectBinding(view: View): FragmentHotelBookingDetailsBinding =
        DataBindingUtil.bind(view)!!

    companion object {
        private val TAG = HotelBookingDetailsFragment::class.java.simpleName
        val CITY = "$TAG.city"
        val HOTELNAME = "$TAG.hotelName"
        val STARTDATE = "$TAG.startDate"
        val ENDDATE = "$TAG.endDate"
        val ADULT = "$TAG.adult"
        val CHILD = "$TAG.child"
        val ROOMS = "$TAG.rooms"
        fun newInstance() = HotelBookingDetailsFragment()
    }

}
