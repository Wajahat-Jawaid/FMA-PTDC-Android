package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeBusListFragment.BusListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeBusListFragment {
  private FragmentBuildersModule_ContributeBusListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BusListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BusListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface BusListFragmentSubcomponent extends AndroidInjector<BusListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BusListFragment> {}
  }
}
