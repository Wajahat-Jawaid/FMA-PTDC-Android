package com.salampakistan.ui.fragments.booking.flight.flightlist

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.salampakistan.base.BaseViewModel
import com.salampakistan.databinding.BookingLayoutBindingImpl
import com.salampakistan.model.AppliedFilterBus
import com.salampakistan.model.AppliedFilterHotel
import com.salampakistan.model.getbusservicesreponse.BusService
import com.salampakistan.model.getflightsresponse.Airline
import com.salampakistan.network.repos.BookingRepo
import com.salampakistan.network.repos.EventRepo
import javax.inject.Inject

class FlightListViewModel @Inject constructor(app: Application, val repo: BookingRepo) :
    BaseViewModel(app) {
    fun getFlights(
        departureCity: String,
        destinationName: String,
        departDate: String,
        returnDate: String = "",
        noOfAdults: Int = 1,
        noOfInfants: Int = 0,
        cabin: String = "",
        noOfChildren: Int = 0,
        sort: Int = 0,
        pageSize: Int = 0,
        skip: Int = 0
    ) = repo.getFlights(
        departureCity,
        destinationName,
        departDate,
        returnDate,
        noOfAdults,
        noOfInfants,
        cabin,
        noOfChildren,
        sort,
        pageSize,
        skip
    )

    var filters = ArrayList<String>()
    var data: List<Airline> = ArrayList()

    var appliedFiltersData =
        MutableLiveData<AppliedFilterHotel>().apply { postValue(AppliedFilterHotel()) }

    fun sortData(filter: AppliedFilterHotel): List<Airline> {
        var localData: ArrayList<Airline> = ArrayList<Airline>()
        if (!filter.values.isNullOrEmpty()) {
            for (item in filter.values) {
                when (item) {
                    "Rs. 5,000 - Rs. 10,000" -> {
                        localData.addAll(data.filter {
                            it.approxTotalPrice.toString().toInt() in 5000..10000
                        })
                    }
                    "Rs. 10,000 - Rs. 20,000" -> {
                        localData.addAll(data.filter {
                            it.approxTotalPrice.toString().toInt() in 10000..20000
                        })
                    }
                    "Rs. 20,000 - Rs. 40,000" -> {
                        localData.addAll(data.filter {
                            it.approxTotalPrice.toString().toInt() in 20000..40000
                        })
                    }
                    "Above Rs. 40,000" -> {
                        localData.addAll(data.filter {
                            it.approxTotalPrice.toString().toInt() > 40000
                        })
                    }
                    "price: low to high" -> {
                        localData.addAll(data.sortedBy { it.approxTotalPrice })
                    }
                    "price: high to low" -> {
                        localData.addAll(data.sortedByDescending { it.approxTotalPrice })
                    }
                }
            }
        }
        return localData
    }

}