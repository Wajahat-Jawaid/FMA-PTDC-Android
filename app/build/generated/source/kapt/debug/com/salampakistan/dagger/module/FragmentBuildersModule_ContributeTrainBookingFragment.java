package com.salampakistan.dagger.module;

import com.salampakistan.ui.fragments.booking.train.TrainBookingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeTrainBookingFragment.TrainBookingFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeTrainBookingFragment {
  private FragmentBuildersModule_ContributeTrainBookingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TrainBookingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TrainBookingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TrainBookingFragmentSubcomponent extends AndroidInjector<TrainBookingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TrainBookingFragment> {}
  }
}
