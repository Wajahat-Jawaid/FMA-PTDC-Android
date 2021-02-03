package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Location
import com.salampakistan.model.LocationDetails

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetLocationDetailsResponse {

    @SerializedName("data")
    val location: LocationDetails? = null
}