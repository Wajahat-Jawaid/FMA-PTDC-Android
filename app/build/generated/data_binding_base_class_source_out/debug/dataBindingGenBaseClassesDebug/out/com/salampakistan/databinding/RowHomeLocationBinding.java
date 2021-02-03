// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import com.salampakistan.model.Location;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowHomeLocationBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView title;

  @Bindable
  protected Location mModel;

  protected RowHomeLocationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView image, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
    this.title = title;
  }

  public abstract void setModel(@Nullable Location model);

  @Nullable
  public Location getModel() {
    return mModel;
  }

  @NonNull
  public static RowHomeLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_home_location, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowHomeLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowHomeLocationBinding>inflateInternal(inflater, R.layout.row_home_location, root, attachToRoot, component);
  }

  @NonNull
  public static RowHomeLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_home_location, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowHomeLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowHomeLocationBinding>inflateInternal(inflater, R.layout.row_home_location, null, false, component);
  }

  public static RowHomeLocationBinding bind(@NonNull View view) {
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
  public static RowHomeLocationBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowHomeLocationBinding)bind(component, view, R.layout.row_home_location);
  }
}
