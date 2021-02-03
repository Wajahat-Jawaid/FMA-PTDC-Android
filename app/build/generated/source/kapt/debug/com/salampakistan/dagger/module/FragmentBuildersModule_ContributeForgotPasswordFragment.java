package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.forgotpassword.ForgotPasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeForgotPasswordFragment.ForgotPasswordFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeForgotPasswordFragment {
  private FragmentBuildersModule_ContributeForgotPasswordFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ForgotPasswordFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ForgotPasswordFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ForgotPasswordFragmentSubcomponent
      extends AndroidInjector<ForgotPasswordFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ForgotPasswordFragment> {}
  }
}
