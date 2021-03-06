// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewCounterWidgetBinding extends ViewDataBinding {
  @NonNull
  public final TextView counterValueText;

  @NonNull
  public final ImageView decreaseCounterBtn;

  @NonNull
  public final ImageView increaseCounterBtn;

  @NonNull
  public final LinearLayout llCounter;

  @Bindable
  protected String mTitle;

  @Bindable
  protected Float mMarginTop;

  @Bindable
  protected Float mMarginStart;

  @Bindable
  protected Float mMarginEnd;

  @Bindable
  protected Float mMarginBottom;

  protected ViewCounterWidgetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView counterValueText, ImageView decreaseCounterBtn, ImageView increaseCounterBtn,
      LinearLayout llCounter) {
    super(_bindingComponent, _root, _localFieldCount);
    this.counterValueText = counterValueText;
    this.decreaseCounterBtn = decreaseCounterBtn;
    this.increaseCounterBtn = increaseCounterBtn;
    this.llCounter = llCounter;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  public abstract void setMarginTop(@Nullable Float marginTop);

  @Nullable
  public Float getMarginTop() {
    return mMarginTop;
  }

  public abstract void setMarginStart(@Nullable Float marginStart);

  @Nullable
  public Float getMarginStart() {
    return mMarginStart;
  }

  public abstract void setMarginEnd(@Nullable Float marginEnd);

  @Nullable
  public Float getMarginEnd() {
    return mMarginEnd;
  }

  public abstract void setMarginBottom(@Nullable Float marginBottom);

  @Nullable
  public Float getMarginBottom() {
    return mMarginBottom;
  }

  @NonNull
  public static ViewCounterWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_counter_widget, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewCounterWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewCounterWidgetBinding>inflateInternal(inflater, R.layout.view_counter_widget, root, attachToRoot, component);
  }

  @NonNull
  public static ViewCounterWidgetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_counter_widget, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewCounterWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewCounterWidgetBinding>inflateInternal(inflater, R.layout.view_counter_widget, null, false, component);
  }

  public static ViewCounterWidgetBinding bind(@NonNull View view) {
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
  public static ViewCounterWidgetBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewCounterWidgetBinding)bind(component, view, R.layout.view_counter_widget);
  }
}
