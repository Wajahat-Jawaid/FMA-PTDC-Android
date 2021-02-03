// Generated by Dagger (https://dagger.dev).
package com.salampakistan.dagger.module;

import com.salampakistan.network.fma.FMAWebService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFMAWebServiceFactory implements Factory<FMAWebService> {
  private final AppModule module;

  private final Provider<OkHttpClient> okhttpClientProvider;

  private final Provider<GsonConverterFactory> converterFactoryProvider;

  public AppModule_ProvideFMAWebServiceFactory(AppModule module,
      Provider<OkHttpClient> okhttpClientProvider,
      Provider<GsonConverterFactory> converterFactoryProvider) {
    this.module = module;
    this.okhttpClientProvider = okhttpClientProvider;
    this.converterFactoryProvider = converterFactoryProvider;
  }

  @Override
  public FMAWebService get() {
    return provideFMAWebService(module, okhttpClientProvider.get(), converterFactoryProvider.get());
  }

  public static AppModule_ProvideFMAWebServiceFactory create(AppModule module,
      Provider<OkHttpClient> okhttpClientProvider,
      Provider<GsonConverterFactory> converterFactoryProvider) {
    return new AppModule_ProvideFMAWebServiceFactory(module, okhttpClientProvider, converterFactoryProvider);
  }

  public static FMAWebService provideFMAWebService(AppModule instance, OkHttpClient okhttpClient,
      GsonConverterFactory converterFactory) {
    return Preconditions.checkNotNull(instance.provideFMAWebService(okhttpClient, converterFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
}
