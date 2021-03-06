// Generated by Dagger (https://dagger.dev).
package com.salampakistan.dagger.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoreDataModule_ProvideLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  private final CoreDataModule module;

  public CoreDataModule_ProvideLoggingInterceptorFactory(CoreDataModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideLoggingInterceptor(module);
  }

  public static CoreDataModule_ProvideLoggingInterceptorFactory create(CoreDataModule module) {
    return new CoreDataModule_ProvideLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor provideLoggingInterceptor(CoreDataModule instance) {
    return Preconditions.checkNotNull(instance.provideLoggingInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
