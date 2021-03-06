// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.salampakistan.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowFlightBinding extends ViewDataBinding {
  @NonNull
  public final Button bookNowBtn;

  @NonNull
  public final LinearLayout bottomLogoText;

  @NonNull
  public final ConstraintLayout constraintLayout7;

  @NonNull
  public final ConstraintLayout containerVew;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final LinearLayout linearLayout10;

  @NonNull
  public final LinearLayout linearLayout14;

  @NonNull
  public final LinearLayout linearLayout9;

  @NonNull
  public final RecyclerView recServices;

  @NonNull
  public final RelativeLayout relativeLayout4;

  @NonNull
  public final View view;

  @NonNull
  public final View view7;

  @Bindable
  protected String mModel;

  protected RowFlightBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button bookNowBtn, LinearLayout bottomLogoText, ConstraintLayout constraintLayout7,
      ConstraintLayout containerVew, ImageView imageView5, LinearLayout linearLayout10,
      LinearLayout linearLayout14, LinearLayout linearLayout9, RecyclerView recServices,
      RelativeLayout relativeLayout4, View view, View view7) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bookNowBtn = bookNowBtn;
    this.bottomLogoText = bottomLogoText;
    this.constraintLayout7 = constraintLayout7;
    this.containerVew = containerVew;
    this.imageView5 = imageView5;
    this.linearLayout10 = linearLayout10;
    this.linearLayout14 = linearLayout14;
    this.linearLayout9 = linearLayout9;
    this.recServices = recServices;
    this.relativeLayout4 = relativeLayout4;
    this.view = view;
    this.view7 = view7;
  }

  public abstract void setModel(@Nullable String model);

  @Nullable
  public String getModel() {
    return mModel;
  }

  @NonNull
  public static RowFlightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_flight, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowFlightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowFlightBinding>inflateInternal(inflater, R.layout.row_flight, root, attachToRoot, component);
  }

  @NonNull
  public static RowFlightBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_flight, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowFlightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowFlightBinding>inflateInternal(inflater, R.layout.row_flight, null, false, component);
  }

  public static RowFlightBinding bind(@NonNull View view) {
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
  public static RowFlightBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowFlightBinding)bind(component, view, R.layout.row_flight);
  }
}
