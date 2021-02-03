package com.salampakistan.ui.fragments.weather

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.openweather.OpenWeatherRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WeatherViewModel @Inject constructor(app: Application, val repo: OpenWeatherRepo) :
    BaseViewModel(app) {

    fun getWeather(city: String) = repo.getCityWeather(city)
}