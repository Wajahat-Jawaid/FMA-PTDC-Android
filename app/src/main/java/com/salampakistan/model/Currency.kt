package com.salampakistan.model

import com.google.gson.annotations.SerializedName
import com.salampakistan.network.JSONKeys

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class Currency(@SerializedName(JSONKeys._id) val id: String, val name: Name, val rate: Float) {

    data class Name(@SerializedName(JSONKeys.currencyName) val name: String, val id: String)
}