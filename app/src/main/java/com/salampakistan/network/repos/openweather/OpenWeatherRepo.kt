package com.salampakistan.network.repos.openweather

import com.salampakistan.network.openweather.OpenWeatherService
import com.salampakistan.network.repos.BaseRepo
import com.salampakistan.network.resultLiveData
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Singleton
class OpenWeatherRepo @Inject constructor(private val service: OpenWeatherService) : BaseRepo() {

    fun getCityWeather(city: String) = resultLiveData {
        getResult {
            service.getCityWeather(
                city, "metric", "f1fbd5c5dfb2ea550ad1a7e39f7716ac"
            )
        }
    }
}