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
    fun getOriginCities(serviceId: Int) =
        resultLiveData { getResult { service.getDepartureCities(serviceId) } }

    fun getDestinationCities(originCity: Int, serviceId: Int) =
        resultLiveData { getResult { service.getDestinationCities(originCity, serviceId) } }

    fun getBusServices(originCity: String, destinationCity: String, serviceName: String) =
        resultLiveData {
            getResult {
                service.getAllBusServices(
                    originCity,
                    destinationCity,
                    serviceName
                )
            }
        }


}