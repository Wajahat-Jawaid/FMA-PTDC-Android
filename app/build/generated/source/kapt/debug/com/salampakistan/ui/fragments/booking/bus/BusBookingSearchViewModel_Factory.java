// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.booking.bus;

import android.app.Application;
import com.salampakistan.network.repos.BookingRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BusBookingSearchViewModel_Factory implements Factory<BusBookingSearchViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<BookingRepo> repoProvider;

  public BusBookingSearchViewModel_Factory(Provider<Application> appProvider,
      Provider<BookingRepo> repoProvider) {
    this.appProvider = appProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public BusBookingSearchViewModel get() {
    return new BusBookingSearchViewModel(appProvider.get(), repoProvider.get());
  }

  public static BusBookingSearchViewModel_Factory create(Provider<Application> appProvider,
      Provider<BookingRepo> repoProvider) {
    return new BusBookingSearchViewModel_Factory(appProvider, repoProvider);
  }

  public static BusBookingSearchViewModel newInstance(Application app, BookingRepo repo) {
    return new BusBookingSearchViewModel(app, repo);
  }
}