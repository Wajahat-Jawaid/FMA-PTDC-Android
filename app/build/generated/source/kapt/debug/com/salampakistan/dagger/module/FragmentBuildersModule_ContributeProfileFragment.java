package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.profile.ProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeProfileFragment {
  private FragmentBuildersModule_ContributeProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileFragment> {}
  }
}
