package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeHotelBookingDetailsFragment
          .HotelBookingDetailsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeHotelBookingDetailsFragment {
  private FragmentBuildersModule_ContributeHotelBookingDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HotelBookingDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HotelBookingDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HotelBookingDetailsFragmentSubcomponent
      extends AndroidInjector<HotelBookingDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HotelBookingDetailsFragment> {}
  }
}
