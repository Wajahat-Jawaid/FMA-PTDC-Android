package com.salampakistan.ui.fragments.booking.bus.buslist

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.AppliedFilterBus
import com.salampakistan.model.AppliedFilterHotel
import com.salampakistan.model.getbusservicesreponse.BusService
import com.salampakistan.network.repos.BookingRepo
import javax.inject.Inject

class BusListViewModel @Inject constructor(
    app: Application, private val repo: BookingRepo
) : BaseViewModel(app) {
    fun getBusServices(originCity: String, destinationCity: String, serviceName: String?=null,date:String) =
        repo.getBusServices(
            originCity,
            destinationCity,
            serviceName,date
        )

    var filters = ArrayList<String>()
    var data: List<BusService> = ArrayList()

    var appliedFiltersData =
        MutableLiveData<AppliedFilterHotel>().apply { postValue(AppliedFilterHotel()) }


    fun sortData(filter: AppliedFilterBus): List<BusService> {
        var localData: ArrayList<BusService> = ArrayList<BusService>()
        if (!filter.values.isNullOrEmpty()) {
            for(item in filter.values) {
                when (item) {
                    "0-1 star" -> {
                        localData.addAll(data.filter { it.rating.toString().toDouble() in 0.0..1.0 })
                    }
                    "1-2 star" -> {
                        localData.addAll(data.filter { it.rating.toString().toDouble() in 1.0..2.1 })
                    }
                    "2-3 star" -> {
                        localData.addAll(data.filter { it.rating.toString().toDouble() in 2.0..3.0 })
                    }
                    "3-4 star" -> {
                        localData.addAll(data.filter { it.rating.toString().toDouble() in 3.0..4.0 })
                    }
                    "4-5 star" -> {
                        localData.addAll(data.filter { it.rating.toString().toDouble() in 4.0..5.0 })
                    }
                    "Rs. 500 - Rs. 1,000" -> {
                        localData.addAll(data.filter { it.originalFare.toString().toInt() in 500..1000 })
                    }
                    "Rs. 1,000 - Rs. 1,500" -> {
                        localData.addAll(data.filter { it.originalFare.toString().toInt() in 1000..1500 })
                    }
                    "Rs. 1,500 - Rs. 2,000" -> {
                        localData.addAll(data.filter { it.originalFare.toString().toInt() in 1500..2000 })
                    }
                    "Above Rs. 2,000" -> {
                        localData.addAll(data.filter { it.originalFare.toString().toInt() > 2000 })
                    }
                    "rating: low to high" -> {
                        localData.addAll(data.sortedBy { it.rating.toString() })
                    }
                    "rating: high to low" -> {
                        localData.addAll(data.sortedByDescending { it.rating.toString() })
                    }
                    "price: low to high" -> {
                        localData.addAll(data.sortedBy { it.originalFare })
                    }
                    "price: high to low" -> {
                        localData.addAll(data.sortedByDescending { it.originalFare })
                    }
                }
            }
        }
        return localData
    }
}