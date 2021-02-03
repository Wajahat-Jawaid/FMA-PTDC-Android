package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.POI

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetPOIsResponse {

    @SerializedName("data")
    val data: List<POI>? = null
}