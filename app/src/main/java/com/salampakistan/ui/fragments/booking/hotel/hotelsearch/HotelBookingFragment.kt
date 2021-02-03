package com.salampakistan.ui.fragments.booking.hotel.hotelsearch

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentHotelBookingBinding
import com.salampakistan.model.enums.HotelCheck
import com.salampakistan.network.JSONKeys
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment.Companion.ADULT
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment.Companion.CHILD
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment.Companion.CITY
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment.Companion.ENDDATE
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment.Companion.ROOMS
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment.Companion.STARTDATE
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.CalendarUtils
import java.lang.Exception

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class HotelBookingFragment : BaseFragment<FragmentHotelBookingBinding>(), Injectable {

    private lateinit var binding: FragmentHotelBookingBinding
    private lateinit var viewModel: HotelBookingViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        binding.fragment = this
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        setListeners()
        RxView.clicks(binding.backBtn).subscribe {
            navController.navigateUp()
        }
        setView()
    }

    private fun setView() {
        binding.adultsCounterLayout.counterValueText.text = getString(R.string.one)
        binding.roomsCounterLayout.counterValueText.text = getString(R.string.one)
    }

    private fun getAdultsCount(): Int {
        return try {
            Integer.parseInt(
                binding.adultsCounterLayout.counterValueText.text.toString().trim { it <= ' ' })
        } catch (e: NumberFormatException) {
            0
        }
    }

    private fun getChildrenCount(): Int {
        return try {
            Integer.parseInt(
                binding.childrenCounterLayout.counterValueText.text.toString().trim { it <= ' ' })
        } catch (e: NumberFormatException) {
            0
        }
    }

    private fun getRoomsCount(): Int {
        return try {
            Integer.parseInt(
                binding.roomsCounterLayout.counterValueText.text.toString().trim { it <= ' ' })
        } catch (e: NumberFormatException) {
            0
        }
    }

    private fun setListeners() {
        // Adults
        throttleListener(binding.adultsCounterLayout.increaseCounterBtn).subscribe {
            var count = getAdultsCount()
            binding.adultsCounterLayout.counterValueText.text = (++count).toString()
        }
        throttleListener(binding.adultsCounterLayout.decreaseCounterBtn).subscribe {
            var count = getAdultsCount()
            if (count > 1)
                binding.adultsCounterLayout.counterValueText.text = (--count).toString()
        }
        // Children
        throttleListener(binding.childrenCounterLayout.increaseCounterBtn).subscribe {
            var count = getChildrenCount()
            binding.childrenCounterLayout.counterValueText.text = (++count).toString()
        }
        throttleListener(binding.childrenCounterLayout.decreaseCounterBtn).subscribe {
            var count = getChildrenCount()
            if (count > 0)
                binding.childrenCounterLayout.counterValueText.text = (--count).toString()
        }
        // Rooms
        throttleListener(binding.roomsCounterLayout.increaseCounterBtn).subscribe {
            var count = getRoomsCount()
            binding.roomsCounterLayout.counterValueText.text = (++count).toString()
        }
        throttleListener(binding.roomsCounterLayout.decreaseCounterBtn).subscribe {
            var count = getRoomsCount()
            if (count > 0)
                binding.roomsCounterLayout.counterValueText.text = (--count).toString()
        }
    }

    fun onDoneBtnClicked() {

        try {
            val bundle = Bundle()
            bundle.putString(CITY,binding.locationText.text.toString())
            bundle.putString(STARTDATE,viewModel.serverFormattedCheckInDate.value)
            bundle.putString(ENDDATE,viewModel.serverFormattedCheckOutDate.value)
            bundle.putInt(ADULT,binding.adultsCounterLayout.counterValueText.text.toString().toInt()?:0)
            bundle.putInt(CHILD,binding.childrenCounterLayout.counterValueText.text.toString().toInt()?:0)
            bundle.putInt(ROOMS,binding.roomsCounterLayout.counterValueText.text.toString().toInt()?:0)
            navController.navigate(R.id.action_bookingHotelFragment_to_hotelListFragment,bundle)
        } catch (e: Exception) {
        }




//        launchWebView("https://ptdc.findmyadventure.pk/accomodation/location/karachi")
    }

    override fun onPause() {
        try{hideProgressBar()}
        catch (e:Exception){}
        super.onPause()

    }
    fun onLocationFieldClicked() {
        val locations= resources.getStringArray(R.array.locations).toList()
        val dialogFg = ListDialogFragment.getInstance(locations as ArrayList<String>)
        dialogFg.show(childFragmentManager, JSONKeys.locations)
        dialogFg.itemClickPositionSubject
            .subscribe { position ->
                run {
                    dialogFg.dismissAllowingStateLoss()
                    viewModel.location.value = locations[position]
                }
            }
    }

    fun onDateFieldClicked(check: HotelCheck) {
        val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val formattedDate = CalendarUtils.getHotelSearchFormattedDate(year, month, dayOfMonth)
            val serverFormattedDate = CalendarUtils.getFormattedServerDate(year, month, dayOfMonth)
            if (check == HotelCheck.CHECK_IN) {
                viewModel.serverFormattedCheckInDate.value = serverFormattedDate
                viewModel.checkInDate.value = formattedDate
            } else {
                viewModel.serverFormattedCheckOutDate.value = serverFormattedDate
                viewModel.checkOutDate.value = formattedDate
            }
        }
        CalendarUtils.showDatePicker(context!!, listener, minDate = System.currentTimeMillis() - 1)
    }

    override fun getViewId() = R.layout.fragment_hotel_booking
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentHotelBookingBinding>(view)!!

    companion object {
        fun getInstance() =
            HotelBookingFragment()
    }
}