package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.profile.ProfileOptionsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeProfileOptionsFragment.ProfileOptionsFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeProfileOptionsFragment {
  private FragmentBuildersModule_ContributeProfileOptionsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileOptionsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileOptionsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProfileOptionsFragmentSubcomponent
      extends AndroidInjector<ProfileOptionsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileOptionsFragment> {}
  }
}
