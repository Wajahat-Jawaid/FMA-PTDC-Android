// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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

public abstract class RowRelatedEventBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView5;

  @NonNull
  public final ImageView roundedImageView;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView25;

  @Bindable
  protected Event mModel;

  protected RowRelatedEventBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView5, ImageView roundedImageView, TextView textView19, TextView textView20,
      TextView textView25) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView5 = cardView5;
    this.roundedImageView = roundedImageView;
    this.textView19 = textView19;
    this.textView20 = textView20;
    this.textView25 = textView25;
  }

  public abstract void setModel(@Nullable Event model);

  @Nullable
  public Event getModel() {
    return mModel;
  }

  @NonNull
  public static RowRelatedEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_related_event, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowRelatedEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowRelatedEventBinding>inflateInternal(inflater, R.layout.row_related_event, root, attachToRoot, component);
  }

  @NonNull
  public static RowRelatedEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_related_event, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowRelatedEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowRelatedEventBinding>inflateInternal(inflater, R.layout.row_related_event, null, false, component);
  }

  public static RowRelatedEventBinding bind(@NonNull View view) {
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
  public static RowRelatedEventBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowRelatedEventBinding)bind(component, view, R.layout.row_related_event);
  }
}
