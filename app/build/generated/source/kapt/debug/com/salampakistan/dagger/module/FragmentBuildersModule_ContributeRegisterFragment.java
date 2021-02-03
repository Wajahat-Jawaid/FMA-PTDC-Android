package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.login.RegisterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeRegisterFragment.RegisterFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeRegisterFragment {
  private FragmentBuildersModule_ContributeRegisterFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RegisterFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RegisterFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RegisterFragmentSubcomponent extends AndroidInjector<RegisterFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RegisterFragment> {}
  }
}
