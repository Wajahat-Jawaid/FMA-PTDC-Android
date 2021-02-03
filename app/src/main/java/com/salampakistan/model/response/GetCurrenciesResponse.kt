package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Currency

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetCurrenciesResponse {

    @SerializedName("data")
    val currencies: List<Currency>? = null
}