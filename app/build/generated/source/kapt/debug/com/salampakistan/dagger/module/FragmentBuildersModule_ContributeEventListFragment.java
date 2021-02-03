package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.event.EventListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeEventListFragment.EventListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeEventListFragment {
  private FragmentBuildersModule_ContributeEventListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(EventListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EventListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface EventListFragmentSubcomponent extends AndroidInjector<EventListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EventListFragment> {}
  }
}
