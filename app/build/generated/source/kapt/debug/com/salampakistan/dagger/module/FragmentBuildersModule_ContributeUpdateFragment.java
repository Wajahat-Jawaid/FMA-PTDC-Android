package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeUpdateFragment.UpdatePasswordFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeUpdateFragment {
  private FragmentBuildersModule_ContributeUpdateFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UpdatePasswordFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UpdatePasswordFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UpdatePasswordFragmentSubcomponent
      extends AndroidInjector<UpdatePasswordFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UpdatePasswordFragment> {}
  }
}
