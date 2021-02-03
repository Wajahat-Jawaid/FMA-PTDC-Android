// Generated by Dagger (https://dagger.dev).
package com.salampakistan.dagger.module;

import com.salampakistan.network.openweather.OpenWeatherService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideOpenWeatherServiceFactory implements Factory<OpenWeatherService> {
  private final AppModule module;

  private final Provider<OkHttpClient> okhttpClientProvider;

  private final Provider<GsonConverterFactory> converterFactoryProvider;

  public AppModule_ProvideOpenWeatherServiceFactory(AppModule module,
      Provider<OkHttpClient> okhttpClientProvider,
      Provider<GsonConverterFactory> converterFactoryProvider) {
    this.module = module;
    this.okhttpClientProvider = okhttpClientProvider;
    this.converterFactoryProvider = converterFactoryProvider;
  }

  @Override
  public OpenWeatherService get() {
    return provideOpenWeatherService(module, okhttpClientProvider.get(), converterFactoryProvider.get());
  }

  public static AppModule_ProvideOpenWeatherServiceFactory create(AppModule module,
      Provider<OkHttpClient> okhttpClientProvider,
      Provider<GsonConverterFactory> converterFactoryProvider) {
    return new AppModule_ProvideOpenWeatherServiceFactory(module, okhttpClientProvider, converterFactoryProvider);
  }

  public static OpenWeatherService provideOpenWeatherService(AppModule instance,
      OkHttpClient okhttpClient, GsonConverterFactory converterFactory) {
    return Preconditions.checkNotNull(instance.provideOpenWeatherService(okhttpClient, converterFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
}
