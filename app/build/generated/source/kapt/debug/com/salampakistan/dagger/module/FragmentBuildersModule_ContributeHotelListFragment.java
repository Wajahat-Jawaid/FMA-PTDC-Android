package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeHotelListFragment.HotelListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeHotelListFragment {
  private FragmentBuildersModule_ContributeHotelListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HotelListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HotelListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HotelListFragmentSubcomponent extends AndroidInjector<HotelListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HotelListFragment> {}
  }
}
