package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.ImageCarouselFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeImageCarouselFragment.ImageCarouselFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeImageCarouselFragment {
  private FragmentBuildersModule_ContributeImageCarouselFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ImageCarouselFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ImageCarouselFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ImageCarouselFragmentSubcomponent
      extends AndroidInjector<ImageCarouselFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ImageCarouselFragment> {}
  }
}
