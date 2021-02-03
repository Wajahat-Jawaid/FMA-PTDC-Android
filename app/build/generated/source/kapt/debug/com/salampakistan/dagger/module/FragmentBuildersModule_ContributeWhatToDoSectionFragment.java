package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.home.whattodo.WhatToDoSectionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWhatToDoSectionFragment.WhatToDoSectionFragmentSubcomponent
          .class
)
public abstract class FragmentBuildersModule_ContributeWhatToDoSectionFragment {
  private FragmentBuildersModule_ContributeWhatToDoSectionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WhatToDoSectionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WhatToDoSectionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WhatToDoSectionFragmentSubcomponent
      extends AndroidInjector<WhatToDoSectionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WhatToDoSectionFragment> {}
  }
}
