// Generated by Dagger (https://dagger.dev).
package com.salampakistan.dagger.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoreDataModule_ProvideGsonConverterFactoryFactory implements Factory<GsonConverterFactory> {
  private final CoreDataModule module;

  private final Provider<Gson> gsonProvider;

  public CoreDataModule_ProvideGsonConverterFactoryFactory(CoreDataModule module,
      Provider<Gson> gsonProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public GsonConverterFactory get() {
    return provideGsonConverterFactory(module, gsonProvider.get());
  }

  public static CoreDataModule_ProvideGsonConverterFactoryFactory create(CoreDataModule module,
      Provider<Gson> gsonProvider) {
    return new CoreDataModule_ProvideGsonConverterFactoryFactory(module, gsonProvider);
  }

  public static GsonConverterFactory provideGsonConverterFactory(CoreDataModule instance,
      Gson gson) {
    return Preconditions.checkNotNull(instance.provideGsonConverterFactory(gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
