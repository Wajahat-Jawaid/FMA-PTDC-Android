package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Location

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetLocationsResponse {

    @SerializedName("data")
    val data: List<Location>? = null
}