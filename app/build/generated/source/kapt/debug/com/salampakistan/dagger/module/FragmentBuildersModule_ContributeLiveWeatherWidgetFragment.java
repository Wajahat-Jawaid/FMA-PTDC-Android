package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.weather.WeatherFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeLiveWeatherWidgetFragment.WeatherFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeLiveWeatherWidgetFragment {
  private FragmentBuildersModule_ContributeLiveWeatherWidgetFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WeatherFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WeatherFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WeatherFragmentSubcomponent extends AndroidInjector<WeatherFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WeatherFragment> {}
  }
}
