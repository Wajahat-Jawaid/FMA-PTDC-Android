package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWhatToDoCategoryListFragment
          .WhatToDoCategoryListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeWhatToDoCategoryListFragment {
  private FragmentBuildersModule_ContributeWhatToDoCategoryListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WhatToDoCategoryListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WhatToDoCategoryListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WhatToDoCategoryListFragmentSubcomponent
      extends AndroidInjector<WhatToDoCategoryListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WhatToDoCategoryListFragment> {}
  }
}
