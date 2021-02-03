package com.salampakistan.network.repos.openweather;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/salampakistan/network/repos/openweather/OpenWeatherRepo;", "Lcom/salampakistan/network/repos/BaseRepo;", "service", "Lcom/salampakistan/network/openweather/OpenWeatherService;", "(Lcom/salampakistan/network/openweather/OpenWeatherService;)V", "getCityWeather", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/CityWeatherResponse;", "city", "", "app_debug"})
@javax.inject.Singleton()
public final class OpenWeatherRepo extends com.salampakistan.network.repos.BaseRepo {
    private final com.salampakistan.network.openweather.OpenWeatherService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.CityWeatherResponse>> getCityWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
    
    @javax.inject.Inject()
    public OpenWeatherRepo(@org.jetbrains.annotations.NotNull()
    com.salampakistan.network.openweather.OpenWeatherService service) {
        super();
    }
}