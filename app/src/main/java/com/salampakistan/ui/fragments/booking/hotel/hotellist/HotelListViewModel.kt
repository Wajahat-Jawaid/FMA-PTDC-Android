package com.salampakistan.ui.fragments.booking.hotel.hotellist

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.AppliedFilterHotel
import com.salampakistan.model.getbusservicesreponse.BusService
import com.salampakistan.model.hotelsearchresponse.Hotel
import com.salampakistan.network.repos.BookingRepo
import javax.inject.Inject

class HotelListViewModel @Inject constructor(app: Application, private val repo: BookingRepo) :
    BaseViewModel(app) {

    var filters = ArrayList<String>()
    var data: List<Hotel> = ArrayList()

    fun searchHotels(
        city:String,
        departDate:String,
        returnDate:String,
        noOfAdults:Int = 1,
        noOfChilderns:Int = 0,
        noOfInfants:Int = 0,
        noOfRooms:Int? = 1
    ) = repo.searchHotels(city,departDate,returnDate,noOfAdults,noOfChilderns,noOfInfants,noOfRooms)


    var appliedFiltersData =
        MutableLiveData<AppliedFilterHotel>().apply { postValue(AppliedFilterHotel()) }

    var filteredData = MutableLiveData<List<Hotel>>()

    fun sortData(filter: AppliedFilterHotel): List<Hotel> {
        var localData: ArrayList<Hotel> = ArrayList<Hotel>()
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
                        localData.addAll(data.filter { it.minimumRate.toString().toInt() in 500..1000 })
                    }
                    "Rs. 1,000 - Rs. 1,500" -> {
                        localData.addAll(data.filter { it.minimumRate.toString().toInt() in 1000..1500 })
                    }
                    "Rs. 1,500 - Rs. 2,000" -> {
                        localData.addAll(data.filter { it.minimumRate.toString().toInt() in 1500..2000 })
                    }
                    "Above Rs. 2,000" -> {
                        localData.addAll(data.filter { it.minimumRate.toString().toInt() > 2000 })
                    }
                    "rating: low to high" -> {
                        localData.addAll(data.sortedBy { it.rating.toString() })
                    }
                    "rating: high to low" -> {
                        localData.addAll(data.sortedByDescending { it.rating.toString() })
                    }
                    "price: low to high" -> {
                        localData.addAll(data.sortedBy { it.minimumRate })
                    }
                    "price: high to low" -> {
                        localData.addAll(data.sortedByDescending { it.minimumRate })
                    }
                }
            }
        }
        return localData

    }
}