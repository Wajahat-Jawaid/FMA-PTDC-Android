// Generated by data binding compiler. Do not edit!
package com.salampakistan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.salampakistan.R;
import com.salampakistan.model.Location;
import com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListWhereToGoCategoryBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout bannerLayout;

  @NonNull
  public final TextView featuredListTitle;

  @NonNull
  public final RecyclerView featuredRecyclerView;

  @NonNull
  public final ConstraintLayout mainContent;

  @NonNull
  public final TextView titleText;

  @NonNull
  public final ViewSearchToolbarBinding toolbar;

  @NonNull
  public final View viewNoTrips;

  @Bindable
  protected Location mCategoryLocation;

  @Bindable
  protected WhereToGoCategoryListFragment mFragment;

  protected FragmentListWhereToGoCategoryBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout bannerLayout, TextView featuredListTitle,
      RecyclerView featuredRecyclerView, ConstraintLayout mainContent, TextView titleText,
      ViewSearchToolbarBinding toolbar, View viewNoTrips) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bannerLayout = bannerLayout;
    this.featuredListTitle = featuredListTitle;
    this.featuredRecyclerView = featuredRecyclerView;
    this.mainContent = mainContent;
    this.titleText = titleText;
    this.toolbar = toolbar;
    setContainedBinding(this.toolbar);
    this.viewNoTrips = viewNoTrips;
  }

  public abstract void setCategoryLocation(@Nullable Location categoryLocation);

  @Nullable
  public Location getCategoryLocation() {
    return mCategoryLocation;
  }

  public abstract void setFragment(@Nullable WhereToGoCategoryListFragment fragment);

  @Nullable
  public WhereToGoCategoryListFragment getFragment() {
    return mFragment;
  }

  @NonNull
  public static FragmentListWhereToGoCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_where_to_go_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListWhereToGoCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListWhereToGoCategoryBinding>inflateInternal(inflater, R.layout.fragment_list_where_to_go_category, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListWhereToGoCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_where_to_go_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListWhereToGoCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListWhereToGoCategoryBinding>inflateInternal(inflater, R.layout.fragment_list_where_to_go_category, null, false, component);
  }

  public static FragmentListWhereToGoCategoryBinding bind(@NonNull View view) {
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
  public static FragmentListWhereToGoCategoryBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentListWhereToGoCategoryBinding)bind(component, view, R.layout.fragment_list_where_to_go_category);
  }
}