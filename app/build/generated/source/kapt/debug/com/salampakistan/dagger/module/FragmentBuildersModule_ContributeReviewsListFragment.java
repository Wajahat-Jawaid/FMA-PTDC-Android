package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.reviews.ReviewsListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeReviewsListFragment.ReviewsListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeReviewsListFragment {
  private FragmentBuildersModule_ContributeReviewsListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ReviewsListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ReviewsListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ReviewsListFragmentSubcomponent extends AndroidInjector<ReviewsListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ReviewsListFragment> {}
  }
}
