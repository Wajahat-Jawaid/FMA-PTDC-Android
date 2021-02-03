// Generated by Dagger (https://dagger.dev).
package com.salampakistan.network.repos.fma;

import com.salampakistan.network.fma.FMAWebService;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FMARepo_Factory implements Factory<FMARepo> {
  private final Provider<FMAWebService> serviceProvider;

  public FMARepo_Factory(Provider<FMAWebService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public FMARepo get() {
    return new FMARepo(serviceProvider.get());
  }

  public static FMARepo_Factory create(Provider<FMAWebService> serviceProvider) {
    return new FMARepo_Factory(serviceProvider);
  }

  public static FMARepo newInstance(FMAWebService service) {
    return new FMARepo(service);
  }
}
