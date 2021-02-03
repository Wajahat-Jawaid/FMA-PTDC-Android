package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeFlightBookingFragment.FlightBookingFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeFlightBookingFragment {
  private FragmentBuildersModule_ContributeFlightBookingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FlightBookingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FlightBookingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FlightBookingFragmentSubcomponent
      extends AndroidInjector<FlightBookingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FlightBookingFragment> {}
  }
}
