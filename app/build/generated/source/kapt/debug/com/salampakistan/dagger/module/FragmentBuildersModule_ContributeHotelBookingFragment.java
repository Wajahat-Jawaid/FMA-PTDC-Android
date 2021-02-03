package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeHotelBookingFragment.HotelBookingFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeHotelBookingFragment {
  private FragmentBuildersModule_ContributeHotelBookingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HotelBookingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HotelBookingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HotelBookingFragmentSubcomponent extends AndroidInjector<HotelBookingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HotelBookingFragment> {}
  }
}
