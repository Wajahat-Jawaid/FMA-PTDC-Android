// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.booking.flight.flightlist;

import androidx.lifecycle.ViewModelProvider;
import com.salampakistan.base.BaseFragment_MembersInjector;
import com.salampakistan.utils.DialogUtils;
import com.salampakistan.utils.Preferences;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FlightListFragment_MembersInjector implements MembersInjector<FlightListFragment> {
  private final Provider<Preferences> preferencesProvider;

  private final Provider<DialogUtils> dialogUtilsProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public FlightListFragment_MembersInjector(Provider<Preferences> preferencesProvider,
      Provider<DialogUtils> dialogUtilsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.preferencesProvider = preferencesProvider;
    this.dialogUtilsProvider = dialogUtilsProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<FlightListFragment> create(
      Provider<Preferences> preferencesProvider, Provider<DialogUtils> dialogUtilsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new FlightListFragment_MembersInjector(preferencesProvider, dialogUtilsProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(FlightListFragment instance) {
    BaseFragment_MembersInjector.injectPreferences(instance, preferencesProvider.get());
    BaseFragment_MembersInjector.injectDialogUtils(instance, dialogUtilsProvider.get());
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }
}
