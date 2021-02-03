package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.BookingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeBookingFragment.BookingFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeBookingFragment {
  private FragmentBuildersModule_ContributeBookingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BookingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BookingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface BookingFragmentSubcomponent extends AndroidInjector<BookingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BookingFragment> {}
  }
}
