// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.wheretogo;

import android.app.Application;
import com.salampakistan.network.repos.TripsRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WhereToGoCategoryListViewModel_Factory implements Factory<WhereToGoCategoryListViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<TripsRepo> repoProvider;

  public WhereToGoCategoryListViewModel_Factory(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    this.appProvider = appProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public WhereToGoCategoryListViewModel get() {
    return new WhereToGoCategoryListViewModel(appProvider.get(), repoProvider.get());
  }

  public static WhereToGoCategoryListViewModel_Factory create(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    return new WhereToGoCategoryListViewModel_Factory(appProvider, repoProvider);
  }

  public static WhereToGoCategoryListViewModel newInstance(Application app, TripsRepo repo) {
    return new WhereToGoCategoryListViewModel(app, repo);
  }
}
