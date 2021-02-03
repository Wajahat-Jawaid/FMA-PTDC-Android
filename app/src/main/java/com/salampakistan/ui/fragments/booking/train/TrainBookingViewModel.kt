package com.salampakistan.ui.fragments.booking.train

import android.app.Application
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.salampakistan.R
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.enums.TripType
import com.salampakistan.utils.validators.Validators
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class TrainBookingViewModel @Inject constructor(app: Application) : BaseViewModel(app) {

    private val tripType = MutableLiveData<TripType>(TripType.ONE_WAY)
    val fromLocation = MutableLiveData<String>(getString(R.string.location))
    val toLocation = MutableLiveData<String>(getString(R.string.location))

    val valid = MediatorLiveData<Boolean>().apply {
        addSource(fromLocation) { value = validate() }
        addSource(toLocation) { value = validate() }
        addSource(tripType) { value = validate() }
    }

    fun switchTripType(type: TripType) {
        if (tripType.value == type)
            return
        tripType.value = type
    }

    private fun validate(): Boolean {
        return Validators.isLocationValid(fromLocation.value, getString(R.string.location))
                && Validators.isLocationValid(toLocation.value, getString(R.string.location))
    }
}