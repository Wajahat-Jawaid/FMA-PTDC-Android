// Generated by Dagger (https://dagger.dev).
package com.salampakistan.network.repos.openweather;

import com.salampakistan.network.openweather.OpenWeatherService;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OpenWeatherRepo_Factory implements Factory<OpenWeatherRepo> {
  private final Provider<OpenWeatherService> serviceProvider;

  public OpenWeatherRepo_Factory(Provider<OpenWeatherService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public OpenWeatherRepo get() {
    return new OpenWeatherRepo(serviceProvider.get());
  }

  public static OpenWeatherRepo_Factory create(Provider<OpenWeatherService> serviceProvider) {
    return new OpenWeatherRepo_Factory(serviceProvider);
  }

  public static OpenWeatherRepo newInstance(OpenWeatherService service) {
    return new OpenWeatherRepo(service);
  }
}