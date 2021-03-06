// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.R;
import com.salampakistan.model.hotelsearchresponse.Photo;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowRoomPhotoBinding extends ViewDataBinding {
  @NonNull
  public final ImageView roundedImageView;

  @Bindable
  protected Photo mModel;

  protected RowRoomPhotoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView roundedImageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.roundedImageView = roundedImageView;
  }

  public abstract void setModel(@Nullable Photo model);

  @Nullable
  public Photo getModel() {
    return mModel;
  }

  @NonNull
  public static RowRoomPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_room_photo, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowRoomPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowRoomPhotoBinding>inflateInternal(inflater, R.layout.row_room_photo, root, attachToRoot, component);
  }

  @NonNull
  public static RowRoomPhotoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_room_photo, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowRoomPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowRoomPhotoBinding>inflateInternal(inflater, R.layout.row_room_photo, null, false, component);
  }

  public static RowRoomPhotoBinding bind(@NonNull View view) {
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
  public static RowRoomPhotoBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowRoomPhotoBinding)bind(component, view, R.layout.row_room_photo);
  }
}
