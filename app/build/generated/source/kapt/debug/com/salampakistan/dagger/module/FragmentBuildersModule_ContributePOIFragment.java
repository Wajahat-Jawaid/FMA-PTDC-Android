package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.locationdetails.poi.POIFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBuildersModule_ContributePOIFragment.POIFragmentSubcomponent.class)
public abstract class FragmentBuildersModule_ContributePOIFragment {
  private FragmentBuildersModule_ContributePOIFragment() {}

  @Binds
  @IntoMap
  @ClassKey(POIFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      POIFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface POIFragmentSubcomponent extends AndroidInjector<POIFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<POIFragment> {}
  }
}
