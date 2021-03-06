// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.whattodo;

import android.app.Application;
import com.salampakistan.network.repos.TripsRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WhatToDoCategoryListViewModel_Factory implements Factory<WhatToDoCategoryListViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<TripsRepo> repoProvider;

  public WhatToDoCategoryListViewModel_Factory(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    this.appProvider = appProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public WhatToDoCategoryListViewModel get() {
    return new WhatToDoCategoryListViewModel(appProvider.get(), repoProvider.get());
  }

  public static WhatToDoCategoryListViewModel_Factory create(Provider<Application> appProvider,
      Provider<TripsRepo> repoProvider) {
    return new WhatToDoCategoryListViewModel_Factory(appProvider, repoProvider);
  }

  public static WhatToDoCategoryListViewModel newInstance(Application app, TripsRepo repo) {
    return new WhatToDoCategoryListViewModel(app, repo);
  }
}
