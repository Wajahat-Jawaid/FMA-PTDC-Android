package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.event.detail.EventDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeEventDetailsFragment.EventDetailsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeEventDetailsFragment {
  private FragmentBuildersModule_ContributeEventDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(EventDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EventDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface EventDetailsFragmentSubcomponent extends AndroidInjector<EventDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EventDetailsFragment> {}
  }
}
