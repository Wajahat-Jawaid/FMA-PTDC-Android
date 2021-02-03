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
import com.salampakistan.model.mapLocationResponse.Surrounding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowMapPoiBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView iconPoi;

  @NonNull
  public final TextView poiText;

  @Bindable
  protected Surrounding mModel;

  protected RowMapPoiBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, ImageView iconPoi, TextView poiText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.iconPoi = iconPoi;
    this.poiText = poiText;
  }

  public abstract void setModel(@Nullable Surrounding model);

  @Nullable
  public Surrounding getModel() {
    return mModel;
  }

  @NonNull
  public static RowMapPoiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_map_poi, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowMapPoiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowMapPoiBinding>inflateInternal(inflater, R.layout.row_map_poi, root, attachToRoot, component);
  }

  @NonNull
  public static RowMapPoiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_map_poi, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowMapPoiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowMapPoiBinding>inflateInternal(inflater, R.layout.row_map_poi, null, false, component);
  }

  public static RowMapPoiBinding bind(@NonNull View view) {
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
  public static RowMapPoiBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowMapPoiBinding)bind(component, view, R.layout.row_map_poi);
  }
}
