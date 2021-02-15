package com.salampakistan.ui.fragments.booking.hotel.hotelsearch

import android.app.Application
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.salampakistan.R
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.hotelcities.HotelCity
import com.salampakistan.network.repos.BookingRepo
import com.salampakistan.utils.validators.Validators
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class HotelBookingViewModel @Inject constructor(app: Application, private val repo: BookingRepo) : BaseViewModel(app) {

    val location = MutableLiveData<String>(getString(R.string.location))
    val checkInDate = MutableLiveData<String>(getString(R.string.date_format))
    val serverFormattedCheckInDate = MutableLiveData<String>(getString(R.string.server_date_format))
    val checkOutDate = MutableLiveData<String>(getString(R.string.date_format))
    val serverFormattedCheckOutDate = MutableLiveData<String>(getString(R.string.server_date_format))

    val citiesList = MutableLiveData<List<HotelCity>>()

    val valid = MediatorLiveData<Boolean>().apply {
        addSource(location) { value = validate() }
        addSource(checkInDate) { value = validate() }
        addSource(checkOutDate) { value = validate() }
    }

    private fun validate(): Boolean {
        return Validators.isLocationValid(location.value, getString(R.string.location))
                && Validators.isDateValid(checkInDate.value, getString(R.string.date_format))
                && Validators.isDateValid(checkOutDate.value, getString(R.string.date_format))
    }

    fun getHotelCities() = repo.getHotelCities()


}