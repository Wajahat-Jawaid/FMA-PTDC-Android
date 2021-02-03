package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.whattodo.WhatToDoListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWhatToDoListFragment.WhatToDoListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeWhatToDoListFragment {
  private FragmentBuildersModule_ContributeWhatToDoListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WhatToDoListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WhatToDoListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WhatToDoListFragmentSubcomponent extends AndroidInjector<WhatToDoListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WhatToDoListFragment> {}
  }
}
