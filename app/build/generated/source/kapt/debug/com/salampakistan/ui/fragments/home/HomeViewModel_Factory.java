// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.home;

import android.app.Application;
import com.salampakistan.network.repos.TripsRepo;
import com.salampakistan.network.repos.fma.FMARepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<TripsRepo> tripsRepoProvider;

  private final Provider<FMARepo> fmaRepoProvider;

  public HomeViewModel_Factory(Provider<Application> appProvider,
      Provider<TripsRepo> tripsRepoProvider, Provider<FMARepo> fmaRepoProvider) {
    this.appProvider = appProvider;
    this.tripsRepoProvider = tripsRepoProvider;
    this.fmaRepoProvider = fmaRepoProvider;
  }

  @Override
  public HomeViewModel get() {
    return new HomeViewModel(appProvider.get(), tripsRepoProvider.get(), fmaRepoProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<Application> appProvider,
      Provider<TripsRepo> tripsRepoProvider, Provider<FMARepo> fmaRepoProvider) {
    return new HomeViewModel_Factory(appProvider, tripsRepoProvider, fmaRepoProvider);
  }

  public static HomeViewModel newInstance(Application app, TripsRepo tripsRepo, FMARepo fmaRepo) {
    return new HomeViewModel(app, tripsRepo, fmaRepo);
  }
}
