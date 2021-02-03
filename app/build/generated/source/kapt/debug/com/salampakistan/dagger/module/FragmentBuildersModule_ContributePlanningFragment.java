package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.planning.PlanningFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributePlanningFragment.PlanningFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributePlanningFragment {
  private FragmentBuildersModule_ContributePlanningFragment() {}

  @Binds
  @IntoMap
  @ClassKey(PlanningFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PlanningFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface PlanningFragmentSubcomponent extends AndroidInjector<PlanningFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PlanningFragment> {}
  }
}
