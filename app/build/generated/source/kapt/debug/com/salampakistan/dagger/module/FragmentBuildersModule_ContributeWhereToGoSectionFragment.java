package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.home.WhereToGoSectionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWhereToGoSectionFragment.WhereToGoSectionFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeWhereToGoSectionFragment {
  private FragmentBuildersModule_ContributeWhereToGoSectionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WhereToGoSectionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WhereToGoSectionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WhereToGoSectionFragmentSubcomponent
      extends AndroidInjector<WhereToGoSectionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WhereToGoSectionFragment> {}
  }
}
