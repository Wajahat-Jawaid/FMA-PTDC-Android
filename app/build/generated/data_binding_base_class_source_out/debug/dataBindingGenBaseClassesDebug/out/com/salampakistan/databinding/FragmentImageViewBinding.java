// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentImageViewBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton closeImg;

  @NonNull
  public final TextView statusText;

  @NonNull
  public final ViewPager viewPager;

  protected FragmentImageViewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton closeImg, TextView statusText, ViewPager viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.closeImg = closeImg;
    this.statusText = statusText;
    this.viewPager = viewPager;
  }

  @NonNull
  public static FragmentImageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_image_view, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentImageViewBinding>inflateInternal(inflater, R.layout.fragment_image_view, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentImageViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_image_view, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentImageViewBinding>inflateInternal(inflater, R.layout.fragment_image_view, null, false, component);
  }

  public static FragmentImageViewBinding bind(@NonNull View view) {
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
  public static FragmentImageViewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentImageViewBinding)bind(component, view, R.layout.fragment_image_view);
  }
}
