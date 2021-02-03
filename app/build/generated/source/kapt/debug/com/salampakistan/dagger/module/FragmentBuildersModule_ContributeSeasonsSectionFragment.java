package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.home.seasonexperiences.SeasonsSectionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeSeasonsSectionFragment.SeasonsSectionFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeSeasonsSectionFragment {
  private FragmentBuildersModule_ContributeSeasonsSectionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SeasonsSectionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SeasonsSectionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SeasonsSectionFragmentSubcomponent
      extends AndroidInjector<SeasonsSectionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SeasonsSectionFragment> {}
  }
}
