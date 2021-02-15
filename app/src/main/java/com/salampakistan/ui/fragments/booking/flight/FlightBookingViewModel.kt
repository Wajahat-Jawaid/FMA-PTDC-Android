package com.salampakistan.ui.fragments.booking.flight

import android.app.Application
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.salampakistan.R
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.enums.TripType
import com.salampakistan.model.getairportresponse.AirPort
import com.salampakistan.network.repos.BookingRepo
import com.salampakistan.utils.validators.Validators
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class FlightBookingViewModel @Inject constructor(app: Application, private val repo: BookingRepo) : BaseViewModel(app) {

    var airPorts = ArrayList<AirPort>()

    val tripType = MutableLiveData<TripType>(TripType.ONE_WAY)
    val fromLocation = MutableLiveData<String>(getString(R.string.karachi))
    val toLocation = MutableLiveData<String>(getString(R.string.lahore))
    val cabin = MutableLiveData<String>(getString(R.string.all_cabin))
    val departingDate = MutableLiveData<String>(getString(R.string.date_format))
    val returningDate = MutableLiveData<String>(getString(R.string.date_format))
    val serverFormattedDepartureDate = MutableLiveData<String>(getString(R.string.server_date_format))
    val serverFormattedArrivalDate = MutableLiveData<String>(getString(R.string.server_date_format))

    val valid = MediatorLiveData<Boolean>().apply {
        addSource(tripType) { value = validate() }
        addSource(fromLocation) { value = validate() }
        addSource(toLocation) { value = validate() }
        addSource(departingDate) { value = validate() }
        addSource(returningDate) { value = validate() }
    }

    fun switchTripType(type: TripType) {
        if (tripType.value == type)
            return
        tripType.value = type
    }

    private fun validate(): Boolean {
        return Validators.isLocationValid(fromLocation.value, getString(R.string.location))
                && Validators.isLocationValid(toLocation.value, getString(R.string.location))
                && Validators.isDateValid(departingDate.value, getString(R.string.date_format))
                // If round trip, validate returning date too
                && if (tripType.value == TripType.ROUND_TRIP) {
            Validators.isDateValid(returningDate.value, getString(R.string.date_format))
        } else true
    }

    fun getAirports() = repo.getAirports()
}