// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.currency;

import android.app.Application;
import com.salampakistan.network.repos.OthersRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyViewModel_Factory implements Factory<CurrencyViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<OthersRepo> repoProvider;

  public CurrencyViewModel_Factory(Provider<Application> appProvider,
      Provider<OthersRepo> repoProvider) {
    this.appProvider = appProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public CurrencyViewModel get() {
    return new CurrencyViewModel(appProvider.get(), repoProvider.get());
  }

  public static CurrencyViewModel_Factory create(Provider<Application> appProvider,
      Provider<OthersRepo> repoProvider) {
    return new CurrencyViewModel_Factory(appProvider, repoProvider);
  }

  public static CurrencyViewModel newInstance(Application app, OthersRepo repo) {
    return new CurrencyViewModel(app, repo);
  }
}
