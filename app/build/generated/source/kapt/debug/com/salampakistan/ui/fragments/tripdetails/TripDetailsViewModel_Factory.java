// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.tripdetails;

import android.app.Application;
import com.salampakistan.network.repos.TripsRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TripDetailsViewModel_Factory implements Factory<TripDetailsViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<TripsRepo> repoProvider;

  public TripDetailsViewModel_Factory(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    this.appProvider = appProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public TripDetailsViewModel get() {
    return new TripDetailsViewModel(appProvider.get(), repoProvider.get());
  }

  public static TripDetailsViewModel_Factory create(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    return new TripDetailsViewModel_Factory(appProvider, repoProvider);
  }

  public static TripDetailsViewModel newInstance(Application app, TripsRepo repo) {
    return new TripDetailsViewModel(app, repo);
  }
}
