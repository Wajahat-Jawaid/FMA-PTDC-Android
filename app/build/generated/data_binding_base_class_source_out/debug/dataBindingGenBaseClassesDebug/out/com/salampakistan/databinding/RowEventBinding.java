// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public abstract class RowEventBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView5;

  @NonNull
  public final Button readMoreBtn;

  @NonNull
  public final ImageView roundedImageView;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  @Bindable
  protected Event mModel;

  protected RowEventBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView5, Button readMoreBtn, ImageView roundedImageView, TextView textView19,
      TextView textView20) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView5 = cardView5;
    this.readMoreBtn = readMoreBtn;
    this.roundedImageView = roundedImageView;
    this.textView19 = textView19;
    this.textView20 = textView20;
  }

  public abstract void setModel(@Nullable Event model);

  @Nullable
  public Event getModel() {
    return mModel;
  }

  @NonNull
  public static RowEventBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_event, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowEventBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowEventBinding>inflateInternal(inflater, R.layout.row_event, root, attachToRoot, component);
  }

  @NonNull
  public static RowEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_event, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowEventBinding>inflateInternal(inflater, R.layout.row_event, null, false, component);
  }

  public static RowEventBinding bind(@NonNull View view) {
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
  public static RowEventBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowEventBinding)bind(component, view, R.layout.row_event);
  }
}
