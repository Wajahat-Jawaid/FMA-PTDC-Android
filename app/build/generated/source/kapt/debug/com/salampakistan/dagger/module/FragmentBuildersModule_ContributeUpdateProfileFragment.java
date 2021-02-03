package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeUpdateProfileFragment.UpdateProfileFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeUpdateProfileFragment {
  private FragmentBuildersModule_ContributeUpdateProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UpdateProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UpdateProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UpdateProfileFragmentSubcomponent
      extends AndroidInjector<UpdateProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UpdateProfileFragment> {}
  }
}
