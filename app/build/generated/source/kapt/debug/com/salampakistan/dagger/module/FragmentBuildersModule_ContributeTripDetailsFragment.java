package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeTripDetailsFragment.TripDetailsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeTripDetailsFragment {
  private FragmentBuildersModule_ContributeTripDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TripDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TripDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TripDetailsFragmentSubcomponent extends AndroidInjector<TripDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TripDetailsFragment> {}
  }
}
