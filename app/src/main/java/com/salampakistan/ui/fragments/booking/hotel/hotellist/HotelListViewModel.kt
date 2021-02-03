package com.salampakistan.ui.fragments.booking.hotel.hotellist

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.AppliedFilterHotel
import com.salampakistan.model.hotelsearchresponse.Hotel
import com.salampakistan.network.repos.BookingRepo
import javax.inject.Inject

class HotelListViewModel @Inject constructor(app: Application, private val repo: BookingRepo) :
    BaseViewModel(app) {

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


    fun sortData(filter: AppliedFilterHotel): List<Hotel> {
        if (!filter.stars.isNullOrEmpty()) {

            when (filter.stars) {
                "0-1 star" -> {
                    return data.filter { it.hotelRating.rating.toDouble() in 0.0..1.0 }
                }
                "1-2 star" -> {
                    return data.filter { it.hotelRating.rating.toDouble() in 1.0..2.1 }
                }
                "2-3 star" -> {
                    return data.filter { it.hotelRating.rating.toDouble() in 2.0..3.0 }
                }
                "3-4 star" -> {
                    return data.filter { it.hotelRating.rating.toDouble() in 3.0..4.0 }
                }
                "4-5 star" -> {
                    return data.filter { it.hotelRating.rating.toDouble() in 4.0..5.0 }
                }
                "rating: low to high" -> {
                    return data.sortedBy { it.hotelRating.rating }
                }
                "rating: high to low" -> {
                    return data.sortedByDescending { it.hotelRating.rating }
                }
                "Price: low to high" -> {
                    return data.sortedBy { it.hotelRateInfo.priceStartingFrom }
                }
                "Price: high to low" -> {
                    return data.sortedByDescending { it.hotelRateInfo.MaximumAmount }
                }
            }
        }
        return data
    }
}