package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.home.TripsCannotMissSectionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeTripsUCannotMissSectionFragment
          .TripsCannotMissSectionFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeTripsUCannotMissSectionFragment {
  private FragmentBuildersModule_ContributeTripsUCannotMissSectionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TripsCannotMissSectionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TripsCannotMissSectionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TripsCannotMissSectionFragmentSubcomponent
      extends AndroidInjector<TripsCannotMissSectionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TripsCannotMissSectionFragment> {}
  }
}
