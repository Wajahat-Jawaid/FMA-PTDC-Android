// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import com.salampakistan.ui.fragments.profile.ContactUsFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentContactBinding extends ViewDataBinding {
  @NonNull
  public final ImageView contactUsIcon;

  @NonNull
  public final TextView contactUsText;

  @NonNull
  public final ImageView copyEmailIcon;

  @NonNull
  public final ImageView copyPhoneIcon;

  @NonNull
  public final ImageView emailIcon;

  @NonNull
  public final TextView emailText;

  @NonNull
  public final TextView phoneNumberText;

  @NonNull
  public final View separator;

  @Bindable
  protected ContactUsFragment mFragment;

  protected FragmentContactBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView contactUsIcon, TextView contactUsText, ImageView copyEmailIcon,
      ImageView copyPhoneIcon, ImageView emailIcon, TextView emailText, TextView phoneNumberText,
      View separator) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contactUsIcon = contactUsIcon;
    this.contactUsText = contactUsText;
    this.copyEmailIcon = copyEmailIcon;
    this.copyPhoneIcon = copyPhoneIcon;
    this.emailIcon = emailIcon;
    this.emailText = emailText;
    this.phoneNumberText = phoneNumberText;
    this.separator = separator;
  }

  public abstract void setFragment(@Nullable ContactUsFragment fragment);

  @Nullable
  public ContactUsFragment getFragment() {
    return mFragment;
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_contact, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentContactBinding>inflateInternal(inflater, R.layout.fragment_contact, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_contact, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentContactBinding>inflateInternal(inflater, R.layout.fragment_contact, null, false, component);
  }

  public static FragmentContactBinding bind(@NonNull View view) {
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
  public static FragmentContactBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentContactBinding)bind(component, view, R.layout.fragment_contact);
  }
}