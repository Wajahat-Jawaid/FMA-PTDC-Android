package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeHotelDetailsFragment.HotelDetailsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeHotelDetailsFragment {
  private FragmentBuildersModule_ContributeHotelDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HotelDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HotelDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HotelDetailsFragmentSubcomponent extends AndroidInjector<HotelDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HotelDetailsFragment> {}
  }
}
