package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.wishlist.WishlistListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeWishlistListFragment.WishlistListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeWishlistListFragment {
  private FragmentBuildersModule_ContributeWishlistListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WishlistListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WishlistListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WishlistListFragmentSubcomponent extends AndroidInjector<WishlistListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WishlistListFragment> {}
  }
}
