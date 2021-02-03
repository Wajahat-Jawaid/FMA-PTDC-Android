// Generated by Dagger (https://dagger.dev).
package com.salampakistan.ui.fragments.login;

import android.app.Application;
import com.salampakistan.network.repos.UsersRepo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginRegisterViewModel_Factory implements Factory<LoginRegisterViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<UsersRepo> repoProvider;

  public LoginRegisterViewModel_Factory(Provider<Application> applicationProvider,
      Provider<UsersRepo> repoProvider) {
    this.applicationProvider = applicationProvider;
    this.repoProvider = repoProvider;
  }

  @Override
  public LoginRegisterViewModel get() {
    return new LoginRegisterViewModel(applicationProvider.get(), repoProvider.get());
  }

  public static LoginRegisterViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<UsersRepo> repoProvider) {
    return new LoginRegisterViewModel_Factory(applicationProvider, repoProvider);
  }

  public static LoginRegisterViewModel newInstance(Application application, UsersRepo repo) {
    return new LoginRegisterViewModel(application, repo);
  }
}
