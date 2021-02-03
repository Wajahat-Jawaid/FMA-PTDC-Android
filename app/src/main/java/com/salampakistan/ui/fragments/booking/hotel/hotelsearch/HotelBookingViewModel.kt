package com.salampakistan.ui.fragments.booking.hotel.hotelsearch

import android.app.Application
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.salampakistan.R
import com.salampakistan.base.BaseViewModel
import com.salampakistan.utils.validators.Validators
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class HotelBookingViewModel @Inject constructor(app: Application) : BaseViewModel(app) {

    val location = MutableLiveData<String>(getString(R.string.location))
    val checkInDate = MutableLiveData<String>(getString(R.string.date_format))
    val serverFormattedCheckInDate = MutableLiveData<String>(getString(R.string.date_format))
    val checkOutDate = MutableLiveData<String>(getString(R.string.date_format))
    val serverFormattedCheckOutDate = MutableLiveData<String>(getString(R.string.date_format))

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
}