// Generated by Dagger (https://dagger.dev).
package com.salampakistan.base;

import androidx.lifecycle.ViewModelProvider;
import com.salampakistan.utils.DialogUtils;
import com.salampakistan.utils.Preferences;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseFragment_MembersInjector<VDB> implements MembersInjector<BaseFragment<VDB>> {
  private final Provider<Preferences> preferencesProvider;

  private final Provider<DialogUtils> dialogUtilsProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BaseFragment_MembersInjector(Provider<Preferences> preferencesProvider,
      Provider<DialogUtils> dialogUtilsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.preferencesProvider = preferencesProvider;
    this.dialogUtilsProvider = dialogUtilsProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static <VDB> MembersInjector<BaseFragment<VDB>> create(
      Provider<Preferences> preferencesProvider, Provider<DialogUtils> dialogUtilsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BaseFragment_MembersInjector<VDB>(preferencesProvider, dialogUtilsProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(BaseFragment<VDB> instance) {
    injectPreferences(instance, preferencesProvider.get());
    injectDialogUtils(instance, dialogUtilsProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static <VDB> void injectPreferences(BaseFragment<VDB> instance, Preferences preferences) {
    instance.preferences = preferences;
  }

  public static <VDB> void injectDialogUtils(BaseFragment<VDB> instance, DialogUtils dialogUtils) {
    instance.dialogUtils = dialogUtils;
  }

  public static <VDB> void injectViewModelFactory(BaseFragment<VDB> instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}