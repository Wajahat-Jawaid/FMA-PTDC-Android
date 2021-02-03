package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Trip

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetTripsResponse {

    @SerializedName("data")
    val TripsList: List<Trip>? = null
}