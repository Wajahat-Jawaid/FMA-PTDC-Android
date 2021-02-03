// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.home;

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
public final class BaseHomeSectionFragment_MembersInjector<M> implements MembersInjector<BaseHomeSectionFragment<M>> {
  private final Provider<Preferences> preferencesProvider;

  private final Provider<DialogUtils> dialogUtilsProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BaseHomeSectionFragment_MembersInjector(Provider<Preferences> preferencesProvider,
      Provider<DialogUtils> dialogUtilsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.preferencesProvider = preferencesProvider;
    this.dialogUtilsProvider = dialogUtilsProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static <M> MembersInjector<BaseHomeSectionFragment<M>> create(
      Provider<Preferences> preferencesProvider, Provider<DialogUtils> dialogUtilsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BaseHomeSectionFragment_MembersInjector<M>(preferencesProvider, dialogUtilsProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(BaseHomeSectionFragment<M> instance) {
    BaseFragment_MembersInjector.injectPreferences(instance, preferencesProvider.get());
    BaseFragment_MembersInjector.injectDialogUtils(instance, dialogUtilsProvider.get());
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }
}
