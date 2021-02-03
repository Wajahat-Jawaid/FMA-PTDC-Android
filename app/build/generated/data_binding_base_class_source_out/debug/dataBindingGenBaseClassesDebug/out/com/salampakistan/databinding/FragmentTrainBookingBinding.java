// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import com.salampakistan.ui.fragments.booking.train.TrainBookingFragment;
import com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTrainBookingBinding extends ViewDataBinding {
  @NonNull
  public final TextView fromLabel;

  @NonNull
  public final View fromSeparator;

  @NonNull
  public final TextView fromText;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final RadioButton oneWayRb;

  @NonNull
  public final TextView toLabel;

  @NonNull
  public final TextView toText;

  @NonNull
  public final RadioGroup tripTypeRg;

  @Bindable
  protected TrainBookingFragment mFragment;

  @Bindable
  protected TrainBookingViewModel mViewModel;

  protected FragmentTrainBookingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView fromLabel, View fromSeparator, TextView fromText, Guideline guideline,
      RadioButton oneWayRb, TextView toLabel, TextView toText, RadioGroup tripTypeRg) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fromLabel = fromLabel;
    this.fromSeparator = fromSeparator;
    this.fromText = fromText;
    this.guideline = guideline;
    this.oneWayRb = oneWayRb;
    this.toLabel = toLabel;
    this.toText = toText;
    this.tripTypeRg = tripTypeRg;
  }

  public abstract void setFragment(@Nullable TrainBookingFragment fragment);

  @Nullable
  public TrainBookingFragment getFragment() {
    return mFragment;
  }

  public abstract void setViewModel(@Nullable TrainBookingViewModel viewModel);

  @Nullable
  public TrainBookingViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentTrainBookingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_train_booking, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTrainBookingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTrainBookingBinding>inflateInternal(inflater, R.layout.fragment_train_booking, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTrainBookingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_train_booking, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTrainBookingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTrainBookingBinding>inflateInternal(inflater, R.layout.fragment_train_booking, null, false, component);
  }

  public static FragmentTrainBookingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentTrainBookingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTrainBookingBinding)bind(component, view, R.layout.fragment_train_booking);
  }
}