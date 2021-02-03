package com.salampakistan.network.openweather

import com.salampakistan.model.response.CityWeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherService {

    companion object {
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
    }

    @GET("weather")
    suspend fun getCityWeather(
        @Query("q") city: String,
        @Query("units") units: String,
        @Query("appid") appid: String
    ): Response<CityWeatherResponse>
}