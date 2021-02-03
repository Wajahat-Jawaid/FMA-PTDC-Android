package com.salampakistan.model

import com.google.gson.annotations.SerializedName
import com.salampakistan.network.JSONKeys

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class WishList(
    @SerializedName(JSONKeys._id) val id: String, val alias: String,
    val desc: String,val location:LocationCoordinates
)