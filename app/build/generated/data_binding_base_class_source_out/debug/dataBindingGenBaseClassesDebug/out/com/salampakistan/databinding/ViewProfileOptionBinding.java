// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewProfileOptionBinding extends ViewDataBinding {
  @NonNull
  public final TextView optionText;

  @Bindable
  protected Drawable mIcon;

  @Bindable
  protected String mTitle;

  protected ViewProfileOptionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView optionText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.optionText = optionText;
  }

  public abstract void setIcon(@Nullable Drawable icon);

  @Nullable
  public Drawable getIcon() {
    return mIcon;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  @NonNull
  public static ViewProfileOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_profile_option, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewProfileOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewProfileOptionBinding>inflateInternal(inflater, R.layout.view_profile_option, root, attachToRoot, component);
  }

  @NonNull
  public static ViewProfileOptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_profile_option, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewProfileOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewProfileOptionBinding>inflateInternal(inflater, R.layout.view_profile_option, null, false, component);
  }

  public static ViewProfileOptionBinding bind(@NonNull View view) {
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
  public static ViewProfileOptionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewProfileOptionBinding)bind(component, view, R.layout.view_profile_option);
  }
}
