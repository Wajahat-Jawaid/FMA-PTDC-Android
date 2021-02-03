package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.profile.AboutUsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeAboutUsFragment.AboutUsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeAboutUsFragment {
  private FragmentBuildersModule_ContributeAboutUsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AboutUsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AboutUsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AboutUsFragmentSubcomponent extends AndroidInjector<AboutUsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AboutUsFragment> {}
  }
}
