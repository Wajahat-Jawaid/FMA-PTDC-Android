// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BookingLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView titleText;

  protected BookingLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.titleText = titleText;
  }

  @NonNull
  public static BookingLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.booking_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BookingLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BookingLayoutBinding>inflateInternal(inflater, R.layout.booking_layout, root, attachToRoot, component);
  }

  @NonNull
  public static BookingLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.booking_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BookingLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BookingLayoutBinding>inflateInternal(inflater, R.layout.booking_layout, null, false, component);
  }

  public static BookingLayoutBinding bind(@NonNull View view) {
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
  public static BookingLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (BookingLayoutBinding)bind(component, view, R.layout.booking_layout);
  }
}
