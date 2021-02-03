package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeBusBookingSearchFragment.BusBookingSearchFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeBusBookingSearchFragment {
  private FragmentBuildersModule_ContributeBusBookingSearchFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BusBookingSearchFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BusBookingSearchFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface BusBookingSearchFragmentSubcomponent
      extends AndroidInjector<BusBookingSearchFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BusBookingSearchFragment> {}
  }
}
