package com.salampakistan.network.repos

import com.salampakistan.network.JSONKeys
import com.salampakistan.network.WebService
import com.salampakistan.network.resultLiveData
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Singleton
class BookingRepo @Inject constructor(private val service: WebService) : BaseRepo() {

    fun searchHotels(
        city:String,
        departDate:String,
        returnDate:String,
        noOfAdults:Int = 1,
        noOfChilderns:Int = 0,
        noOfInfants:Int = 0,
        noOfRooms:Int? = 1
    ) = resultLiveData {
        getResult {
            service.searchHotels(
                city,departDate,returnDate,noOfAdults,noOfChilderns,noOfInfants,noOfRooms
            )
        }
    }

    fun getTransportServices() = resultLiveData { getResult { service.getTransportServices() } }

    fun getHotelCities() = resultLiveData { getResult { service.getHotelCities() } }

    fun getOriginCities(serviceId: Int? = null) =
        resultLiveData { getResult { service.getDepartureCities(serviceId) } }

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
        skip: Int = 0) =
        resultLiveData { getResult { service.getFlights(
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
            skip) } }

    fun getAirports() =
        resultLiveData { getResult { service.getAirports() } }

    fun getDestinationCities(originCity: Int, serviceId: Int?) =
        resultLiveData { getResult { service.getDestinationCities(originCity, serviceId) } }

    fun getBusServices(originCity: String, destinationCity: String, serviceName: String?=null,date:String,skip:Int = 0, pageSize:Int = 0) =
        resultLiveData {
            getResult {
                service.getAllBusServices(
                    originCity,
                    destinationCity,
                    date,
                    serviceName
                )
            }
        }


}