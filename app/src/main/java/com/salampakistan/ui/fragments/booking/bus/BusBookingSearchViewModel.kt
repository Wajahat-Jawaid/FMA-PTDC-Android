package com.salampakistan.ui.fragments.booking.bus

import android.app.Application
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.salampakistan.R
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.getBusDestinationCities.DestinationCity
import com.salampakistan.model.getbusdeparturecities.DepartureCity
import com.salampakistan.model.transportservicesresponse.Service
import com.salampakistan.network.repos.BookingRepo
import com.salampakistan.utils.validators.Validators
import javax.inject.Inject

class BusBookingSearchViewModel @Inject constructor(
    app: Application,
    private val repo: BookingRepo
) : BaseViewModel(app) {
    val departLocation = MutableLiveData<String>(getString(R.string.location))
    val arrivalLocation = MutableLiveData<String>(getString(R.string.location))
    val services = MutableLiveData<String>(getString(R.string.all_services))
    val date = MutableLiveData<String>(getString(R.string.bus_date_format))


    val servicesList = MutableLiveData<List<Service>>()
    val departureCitiesList = MutableLiveData<List<DepartureCity>>()
    val destinationCitiesList = MutableLiveData<List<DestinationCity>>()

    val valid = MediatorLiveData<Boolean>().apply {
        addSource(departLocation) { value = validate() }
        addSource(arrivalLocation) { value = validate() }
        addSource(date) { value = validate() }
    }

    private fun validate(): Boolean {
        return Validators.isLocationValid(departLocation.value, getString(R.string.location))
                && Validators.isDateValid(arrivalLocation.value, getString(R.string.location))
                && Validators.isDateValid(date.value, getString(R.string.bus_date_format))
    }

    fun getTransportServices() = repo.getTransportServices()
    fun getOriginCities(serviceId: Int) = repo.getOriginCities(serviceId)
    fun getDestinationCities(originCity: Int, serviceId: Int) =
        repo.getDestinationCities(originCity, serviceId)



}