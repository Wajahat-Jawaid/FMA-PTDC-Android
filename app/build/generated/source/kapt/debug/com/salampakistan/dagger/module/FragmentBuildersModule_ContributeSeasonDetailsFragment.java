package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.season.SeasonDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeSeasonDetailsFragment.SeasonDetailsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeSeasonDetailsFragment {
  private FragmentBuildersModule_ContributeSeasonDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SeasonDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SeasonDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SeasonDetailsFragmentSubcomponent
      extends AndroidInjector<SeasonDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SeasonDetailsFragment> {}
  }
}
