// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import com.salampakistan.ui.fragments.forgotpassword.ForgotPasswordFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentForgotBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout bannerLayout;

  @NonNull
  public final TextView descText;

  @NonNull
  public final EditText emailText;

  @NonNull
  public final ImageView logoIcon;

  @NonNull
  public final TextView titleText;

  @Bindable
  protected ForgotPasswordFragment mFragment;

  protected FragmentForgotBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout bannerLayout, TextView descText, EditText emailText, ImageView logoIcon,
      TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bannerLayout = bannerLayout;
    this.descText = descText;
    this.emailText = emailText;
    this.logoIcon = logoIcon;
    this.titleText = titleText;
  }

  public abstract void setFragment(@Nullable ForgotPasswordFragment fragment);

  @Nullable
  public ForgotPasswordFragment getFragment() {
    return mFragment;
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forgot, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentForgotBinding>inflateInternal(inflater, R.layout.fragment_forgot, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forgot, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentForgotBinding>inflateInternal(inflater, R.layout.fragment_forgot, null, false, component);
  }

  public static FragmentForgotBinding bind(@NonNull View view) {
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
  public static FragmentForgotBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentForgotBinding)bind(component, view, R.layout.fragment_forgot);
  }
}
