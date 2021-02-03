package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class CityWeatherResponse(val main: Main) {

    data class Main(@SerializedName("feels_like") val feelsLike: Float)
}