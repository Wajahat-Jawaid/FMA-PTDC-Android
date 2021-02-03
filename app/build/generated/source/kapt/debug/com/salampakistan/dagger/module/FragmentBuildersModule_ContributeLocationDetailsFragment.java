package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeLocationDetailsFragment.LocationDetailsFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeLocationDetailsFragment {
  private FragmentBuildersModule_ContributeLocationDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LocationDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LocationDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LocationDetailsFragmentSubcomponent
      extends AndroidInjector<LocationDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LocationDetailsFragment> {}
  }
}
