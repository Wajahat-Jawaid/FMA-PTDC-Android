package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.CountryVisaStatus

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetVisaStatusResponse {

    @SerializedName("data")
    val statuses: List<CountryVisaStatus>? = null
}