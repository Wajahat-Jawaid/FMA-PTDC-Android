// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import com.salampakistan.model.event.Event;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowFeaturedEventBinding extends ViewDataBinding {
  @NonNull
  public final CardView imageContainer;

  @NonNull
  public final LinearLayout linearLayout7;

  @Bindable
  protected Event mModel;

  protected RowFeaturedEventBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView imageContainer, LinearLayout linearLayout7) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageContainer = imageContainer;
    this.linearLayout7 = linearLayout7;
  }

  public abstract void setModel(@Nullable Event model);

  @Nullable
  public Event getModel() {
    return mModel;
  }

  @NonNull
  public static RowFeaturedEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_featured_event, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowFeaturedEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowFeaturedEventBinding>inflateInternal(inflater, R.layout.row_featured_event, root, attachToRoot, component);
  }

  @NonNull
  public static RowFeaturedEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_featured_event, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowFeaturedEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowFeaturedEventBinding>inflateInternal(inflater, R.layout.row_featured_event, null, false, component);
  }

  public static RowFeaturedEventBinding bind(@NonNull View view) {
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
  public static RowFeaturedEventBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowFeaturedEventBinding)bind(component, view, R.layout.row_featured_event);
  }
}
