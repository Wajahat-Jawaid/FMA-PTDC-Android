package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.itinerary.ItineraryListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeItineraryListFragment.ItineraryListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeItineraryListFragment {
  private FragmentBuildersModule_ContributeItineraryListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ItineraryListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ItineraryListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ItineraryListFragmentSubcomponent
      extends AndroidInjector<ItineraryListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ItineraryListFragment> {}
  }
}
