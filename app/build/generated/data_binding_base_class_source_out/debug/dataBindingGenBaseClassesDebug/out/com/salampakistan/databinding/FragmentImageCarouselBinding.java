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
import androidx.recyclerview.widget.RecyclerView;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentImageCarouselBinding extends ViewDataBinding {
  @NonNull
  public final TextView categoryTitleText;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView seeAllText;

  protected FragmentImageCarouselBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView categoryTitleText, RecyclerView recyclerView, TextView seeAllText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryTitleText = categoryTitleText;
    this.recyclerView = recyclerView;
    this.seeAllText = seeAllText;
  }

  @NonNull
  public static FragmentImageCarouselBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_image_carousel, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImageCarouselBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentImageCarouselBinding>inflateInternal(inflater, R.layout.fragment_image_carousel, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentImageCarouselBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_image_carousel, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImageCarouselBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentImageCarouselBinding>inflateInternal(inflater, R.layout.fragment_image_carousel, null, false, component);
  }

  public static FragmentImageCarouselBinding bind(@NonNull View view) {
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
  public static FragmentImageCarouselBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentImageCarouselBinding)bind(component, view, R.layout.fragment_image_carousel);
  }
}
