// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import com.salampakistan.model.WishList;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowWishlistBinding extends ViewDataBinding {
  @NonNull
  public final Button addToPlanBtn;

  @NonNull
  public final TextView descriptionText;

  @NonNull
  public final TextView destinationTitle;

  @NonNull
  public final Button removeBtn;

  @NonNull
  public final TextView reviewsCountText;

  @Bindable
  protected WishList mModel;

  protected RowWishlistBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button addToPlanBtn, TextView descriptionText, TextView destinationTitle, Button removeBtn,
      TextView reviewsCountText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToPlanBtn = addToPlanBtn;
    this.descriptionText = descriptionText;
    this.destinationTitle = destinationTitle;
    this.removeBtn = removeBtn;
    this.reviewsCountText = reviewsCountText;
  }

  public abstract void setModel(@Nullable WishList model);

  @Nullable
  public WishList getModel() {
    return mModel;
  }

  @NonNull
  public static RowWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_wishlist, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowWishlistBinding>inflateInternal(inflater, R.layout.row_wishlist, root, attachToRoot, component);
  }

  @NonNull
  public static RowWishlistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_wishlist, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowWishlistBinding>inflateInternal(inflater, R.layout.row_wishlist, null, false, component);
  }

  public static RowWishlistBinding bind(@NonNull View view) {
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
  public static RowWishlistBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowWishlistBinding)bind(component, view, R.layout.row_wishlist);
  }
}
