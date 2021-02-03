package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.visastatus.CheckVisaStatusFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeCheckVisaStatusFragment.CheckVisaStatusFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeCheckVisaStatusFragment {
  private FragmentBuildersModule_ContributeCheckVisaStatusFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CheckVisaStatusFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CheckVisaStatusFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CheckVisaStatusFragmentSubcomponent
      extends AndroidInjector<CheckVisaStatusFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CheckVisaStatusFragment> {}
  }
}
