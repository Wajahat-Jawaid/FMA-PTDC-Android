package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.currency.CurrencyFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeLiveCurrencyWidgetFragment.CurrencyFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeLiveCurrencyWidgetFragment {
  private FragmentBuildersModule_ContributeLiveCurrencyWidgetFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CurrencyFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CurrencyFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CurrencyFragmentSubcomponent extends AndroidInjector<CurrencyFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CurrencyFragment> {}
  }
}
