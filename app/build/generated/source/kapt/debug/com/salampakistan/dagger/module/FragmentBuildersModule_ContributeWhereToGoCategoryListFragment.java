package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWhereToGoCategoryListFragment
          .WhereToGoCategoryListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeWhereToGoCategoryListFragment {
  private FragmentBuildersModule_ContributeWhereToGoCategoryListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WhereToGoCategoryListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WhereToGoCategoryListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WhereToGoCategoryListFragmentSubcomponent
      extends AndroidInjector<WhereToGoCategoryListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WhereToGoCategoryListFragment> {}
  }
}
