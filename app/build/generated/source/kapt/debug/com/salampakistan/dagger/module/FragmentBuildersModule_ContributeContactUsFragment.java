package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.profile.ContactUsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeContactUsFragment.ContactUsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeContactUsFragment {
  private FragmentBuildersModule_ContributeContactUsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ContactUsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ContactUsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ContactUsFragmentSubcomponent extends AndroidInjector<ContactUsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ContactUsFragment> {}
  }
}
