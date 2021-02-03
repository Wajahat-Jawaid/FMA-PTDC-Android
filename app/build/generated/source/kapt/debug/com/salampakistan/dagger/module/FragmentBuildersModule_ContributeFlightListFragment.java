package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeFlightListFragment.FlightListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeFlightListFragment {
  private FragmentBuildersModule_ContributeFlightListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FlightListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FlightListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FlightListFragmentSubcomponent extends AndroidInjector<FlightListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FlightListFragment> {}
  }
}
