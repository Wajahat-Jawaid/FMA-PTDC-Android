// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.planning;

import android.app.Application;
import com.salampakistan.network.repos.TripsRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlanningViewModel_Factory implements Factory<PlanningViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<TripsRepo> repoProvider;

  public PlanningViewModel_Factory(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    this.appProvider = appProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public PlanningViewModel get() {
    return new PlanningViewModel(appProvider.get(), repoProvider.get());
  }

  public static PlanningViewModel_Factory create(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    return new PlanningViewModel_Factory(appProvider, repoProvider);
  }

  public static PlanningViewModel newInstance(Application app, TripsRepo repo) {
    return new PlanningViewModel(app, repo);
  }
}
