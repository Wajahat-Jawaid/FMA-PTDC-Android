package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.wheretogo.WhereToGoListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWhereToGoListFragment.WhereToGoListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeWhereToGoListFragment {
  private FragmentBuildersModule_ContributeWhereToGoListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WhereToGoListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WhereToGoListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WhereToGoListFragmentSubcomponent
      extends AndroidInjector<WhereToGoListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WhereToGoListFragment> {}
  }
}
