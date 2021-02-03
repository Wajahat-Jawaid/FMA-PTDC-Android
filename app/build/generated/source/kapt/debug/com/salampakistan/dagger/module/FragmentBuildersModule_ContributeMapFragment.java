package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.map.MapFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBuildersModule_ContributeMapFragment.MapFragmentSubcomponent.class)
public abstract class FragmentBuildersModule_ContributeMapFragment {
  private FragmentBuildersModule_ContributeMapFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MapFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MapFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MapFragmentSubcomponent extends AndroidInjector<MapFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MapFragment> {}
  }
}
