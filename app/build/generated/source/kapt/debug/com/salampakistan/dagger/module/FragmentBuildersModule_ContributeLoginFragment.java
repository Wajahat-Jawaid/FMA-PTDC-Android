package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.login.LoginFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeLoginFragment.LoginFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeLoginFragment {
  private FragmentBuildersModule_ContributeLoginFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LoginFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LoginFragmentSubcomponent extends AndroidInjector<LoginFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginFragment> {}
  }
}
