// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEventListBinding extends ViewDataBinding {
  @NonNull
  public final TextView browseTitle;

  @NonNull
  public final AutoCompleteTextView cityText;

  @NonNull
  public final LinearLayout linearLayout15;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout linearLayout7;

  @NonNull
  public final RecyclerView recViewEvent;

  @NonNull
  public final RecyclerView recViewFeatureEvent;

  @NonNull
  public final ViewSearchToolbarBinding toolbar;

  protected FragmentEventListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView browseTitle, AutoCompleteTextView cityText, LinearLayout linearLayout15,
      LinearLayout linearLayout3, LinearLayout linearLayout7, RecyclerView recViewEvent,
      RecyclerView recViewFeatureEvent, ViewSearchToolbarBinding toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.browseTitle = browseTitle;
    this.cityText = cityText;
    this.linearLayout15 = linearLayout15;
    this.linearLayout3 = linearLayout3;
    this.linearLayout7 = linearLayout7;
    this.recViewEvent = recViewEvent;
    this.recViewFeatureEvent = recViewFeatureEvent;
    this.toolbar = toolbar;
    setContainedBinding(this.toolbar);
  }

  @NonNull
  public static FragmentEventListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_event_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEventListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEventListBinding>inflateInternal(inflater, R.layout.fragment_event_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEventListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_event_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEventListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEventListBinding>inflateInternal(inflater, R.layout.fragment_event_list, null, false, component);
  }

  public static FragmentEventListBinding bind(@NonNull View view) {
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
  public static FragmentEventListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEventListBinding)bind(component, view, R.layout.fragment_event_list);
  }
}