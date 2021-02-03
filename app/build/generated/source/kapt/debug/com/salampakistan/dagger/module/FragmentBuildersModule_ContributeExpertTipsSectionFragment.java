package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.home.ExpertTipsSectionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeExpertTipsSectionFragment
          .ExpertTipsSectionFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeExpertTipsSectionFragment {
  private FragmentBuildersModule_ContributeExpertTipsSectionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ExpertTipsSectionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ExpertTipsSectionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ExpertTipsSectionFragmentSubcomponent
      extends AndroidInjector<ExpertTipsSectionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ExpertTipsSectionFragment> {}
  }
}
