// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMapBinding extends ViewDataBinding {
  @NonNull
  public final AutoCompleteTextView cityText;

  @NonNull
  public final RelativeLayout lol1;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final TextView titleText;

  protected FragmentMapBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AutoCompleteTextView cityText, RelativeLayout lol1, RecyclerView recyclerView,
      ScrollView scrollView, TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cityText = cityText;
    this.lol1 = lol1;
    this.recyclerView = recyclerView;
    this.scrollView = scrollView;
    this.titleText = titleText;
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_map, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMapBinding>inflateInternal(inflater, R.layout.fragment_map, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_map, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMapBinding>inflateInternal(inflater, R.layout.fragment_map, null, false, component);
  }

  public static FragmentMapBinding bind(@NonNull View view) {
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
  public static FragmentMapBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMapBinding)bind(component, view, R.layout.fragment_map);
  }
}
