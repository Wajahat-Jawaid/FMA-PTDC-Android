// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.locationdetails;

import android.app.Application;
import com.salampakistan.network.repos.TripsRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationDetailsViewModel_Factory implements Factory<LocationDetailsViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<TripsRepo> repoProvider;

  public LocationDetailsViewModel_Factory(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    this.appProvider = appProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public LocationDetailsViewModel get() {
    return new LocationDetailsViewModel(appProvider.get(), repoProvider.get());
  }

  public static LocationDetailsViewModel_Factory create(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    return new LocationDetailsViewModel_Factory(appProvider, repoProvider);
  }

  public static LocationDetailsViewModel newInstance(Application app, TripsRepo repo) {
    return new LocationDetailsViewModel(app, repo);
  }
}
