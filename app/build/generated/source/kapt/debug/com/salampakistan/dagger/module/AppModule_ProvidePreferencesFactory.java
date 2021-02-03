// Generated by Dagger (https://dagger.dev).
package com.salampakistan.dagger.module;

import android.app.Application;
import com.salampakistan.utils.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidePreferencesFactory implements Factory<Preferences> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvidePreferencesFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Preferences get() {
    return providePreferences(module, applicationProvider.get());
  }

  public static AppModule_ProvidePreferencesFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvidePreferencesFactory(module, applicationProvider);
  }

  public static Preferences providePreferences(AppModule instance, Application application) {
    return Preconditions.checkNotNull(instance.providePreferences(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
