// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LocationDetailsFragmentSkeletonBinding extends ViewDataBinding {
  protected LocationDetailsFragmentSkeletonBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  @NonNull
  public static LocationDetailsFragmentSkeletonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.location_details_fragment_skeleton, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LocationDetailsFragmentSkeletonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LocationDetailsFragmentSkeletonBinding>inflateInternal(inflater, R.layout.location_details_fragment_skeleton, root, attachToRoot, component);
  }

  @NonNull
  public static LocationDetailsFragmentSkeletonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.location_details_fragment_skeleton, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LocationDetailsFragmentSkeletonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LocationDetailsFragmentSkeletonBinding>inflateInternal(inflater, R.layout.location_details_fragment_skeleton, null, false, component);
  }

  public static LocationDetailsFragmentSkeletonBinding bind(@NonNull View view) {
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
  public static LocationDetailsFragmentSkeletonBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (LocationDetailsFragmentSkeletonBinding)bind(component, view, R.layout.location_details_fragment_skeleton);
  }
}
