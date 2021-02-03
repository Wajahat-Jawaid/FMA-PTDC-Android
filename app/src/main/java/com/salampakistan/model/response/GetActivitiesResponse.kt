package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Activity
import com.salampakistan.model.Location

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetActivitiesResponse {

    @SerializedName("data")
    val data: List<Activity>? = null
}