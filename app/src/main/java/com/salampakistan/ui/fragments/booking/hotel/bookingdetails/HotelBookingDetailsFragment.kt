package com.salampakistan.ui.fragments.booking.hotel.bookingdetails

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentHotelBookingDetailsBinding
import com.salampakistan.databinding.RowAmenitiesHotelBinding
import com.salampakistan.model.hotelsearchresponse.HotelAmenities
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.utils.CalendarUtils.convertDate
import com.salampakistan.utils.extension.getCommaSeparatedPrice

class HotelBookingDetailsFragment : BaseFragment<FragmentHotelBookingDetailsBinding>(), Injectable {

    private val services: Int = 0
    private lateinit var viewModel: HotelBookingDetailsViewModel
    private lateinit var binding: FragmentHotelBookingDetailsBinding
    private lateinit var city: String
    private lateinit var startDate: String
    private lateinit var endDate: String
    private var hotelName: String = ""
    private var adult: Int = 0
    private var child: Int = 0
    private var room: Int = 0
    private var days: Int = 0
    private var perDayRate: Int = 0
    private var hotelAmenities: ArrayList<HotelAmenities> = ArrayList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)

        setView()
    }

    @SuppressLint("SetTextI18n")
    private fun setView() {
        binding.hotelNameText.text = hotelName
        binding.cityText.text = city
        binding.locationText.text = city
        binding.arrivalDateText.text = convertDate(startDate)
        binding.departDateText.text = convertDate(endDate)
        binding.totalText.text = "${perDayRate.getCommaSeparatedPrice()} pkr"
        binding.roomIntoNightRatesText.text = "${perDayRate.getCommaSeparatedPrice()} pkr"
        binding.roomIntoNightText.text = "$room ${context!!.resources.getQuantityString(
            R.plurals.rooms,
            room
        )}, $days ${context!!.resources.getQuantityString(R.plurals.days, days)}"

        RxView.clicks(binding.backBtn).subscribe {
            navController.navigateUp()
        }


        val amenitiesBuilder = StringBuilder()
        hotelAmenities.map {
            amenitiesBuilder.append("- ")
            amenitiesBuilder.append(it.name+"\n")
        }
        binding.amenityText.text = amenitiesBuilder.toString()
    }

    override fun handleArguments(arguments: Bundle) {
        city = arguments?.getString(HotelBookingDetailsFragment.CITY)!!
        hotelName = arguments?.getString(HOTELNAME)!!
        startDate = arguments?.getString(HotelBookingDetailsFragment.STARTDATE)!!
        endDate = arguments?.getString(HotelBookingDetailsFragment.ENDDATE)!!
        adult = arguments?.getInt(HotelBookingDetailsFragment.ADULT)!!
        child = arguments?.getInt(HotelBookingDetailsFragment.CHILD)!!
        room = arguments?.getInt(HotelBookingDetailsFragment.ROOMS)!!
        perDayRate = arguments?.getInt(HotelBookingDetailsFragment.PERDAYRATE)!!
        hotelAmenities = arguments.getParcelableArrayList(HOTELAMENITIES)!!
        days = arguments.getInt(DAY)!!
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
        val HOTELAMENITIES = "${TAG}.hotelAmenities"
        val DAY = "${TAG}.hotelDays"
        val PERDAYRATE = "${TAG}.perdayrate"
        fun newInstance() = HotelBookingDetailsFragment()
    }

}
