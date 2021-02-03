package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Activity
import com.salampakistan.model.Location

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetPlansResponse {

    @SerializedName("data")
    val data: Data? = null

    class Data {
        val locations: List<Location>? = null
        val activities: List<Activity>? = null
    }
}