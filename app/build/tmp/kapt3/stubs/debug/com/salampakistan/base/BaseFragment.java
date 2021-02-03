package com.salampakistan.base;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010,\u001a\u00020-\"\u0004\b\u0001\u0010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H.0\u0000J\u0018\u00100\u001a\u00020\'2\u0006\u00101\u001a\u0002022\b\b\u0001\u00103\u001a\u00020\u0005J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020\u0005H\u0017J\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020-2\b\b\u0002\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u0004\u0018\u00010?J\b\u0010@\u001a\u00020\u0005H&J\u0010\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020CH\u0016J\u0006\u0010D\u001a\u00020-J\u0015\u0010E\u001a\u00028\u00002\u0006\u00101\u001a\u00020FH&\u00a2\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020=J\u0006\u0010J\u001a\u00020-J\u0012\u0010K\u001a\u00020-2\b\u0010L\u001a\u0004\u0018\u00010CH\u0016J&\u0010M\u001a\u0004\u0018\u00010F2\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010L\u001a\u0004\u0018\u00010CH\u0016J\u0006\u0010R\u001a\u00020-J-\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020\u00052\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0V2\u0006\u0010W\u001a\u00020XH\u0016\u00a2\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020-H\u0016J\u001a\u0010[\u001a\u00020-2\u0006\u00101\u001a\u00020F2\b\u0010L\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010\\\u001a\u00020-2\b\u0010L\u001a\u0004\u0018\u00010CH\u0016J\u0006\u0010]\u001a\u00020-J\u0006\u0010^\u001a\u00020-J\u001a\u0010_\u001a\u00020-\"\u0004\b\u0001\u0010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H.0\u0000J\u0006\u0010`\u001a\u00020-J\u0006\u0010a\u001a\u00020-J\u000e\u0010a\u001a\u00020-2\u0006\u0010b\u001a\u00020;J\u0010\u0010c\u001a\u00020-2\b\b\u0001\u0010d\u001a\u00020\u0005J\u000e\u0010c\u001a\u00020-2\u0006\u0010d\u001a\u00020=J\u0010\u0010e\u001a\u00020-2\b\b\u0001\u0010f\u001a\u00020\u0005J\u000e\u0010e\u001a\u00020-2\u0006\u0010f\u001a\u00020=J2\u0010g\u001a&\u0012\f\u0012\n j*\u0004\u0018\u00010i0i j*\u0012\u0012\f\u0012\n j*\u0004\u0018\u00010i0i\u0018\u00010h0h2\u0006\u0010k\u001a\u00020FJ\b\u0010l\u001a\u00020-H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001e\u0010\f\u001a\u00020\r8\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006m"}, d2 = {"Lcom/salampakistan/base/BaseFragment;", "VDB", "Landroidx/fragment/app/Fragment;", "()V", "CAMERA_PERMISSION_CODE", "", "getCAMERA_PERMISSION_CODE", "()I", "CAMERA_REQUEST", "getCAMERA_REQUEST", "Gallery_PERMISSION_CODE", "getGallery_PERMISSION_CODE", "dialogUtils", "Lcom/salampakistan/utils/DialogUtils;", "getDialogUtils", "()Lcom/salampakistan/utils/DialogUtils;", "setDialogUtils", "(Lcom/salampakistan/utils/DialogUtils;)V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "preferences", "Lcom/salampakistan/utils/Preferences;", "getPreferences", "()Lcom/salampakistan/utils/Preferences;", "setPreferences", "(Lcom/salampakistan/utils/Preferences;)V", "progressBar", "Landroid/widget/PopupWindow;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getViewSkeleton", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "setViewSkeleton", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "addFragment", "", "T", "fragment", "attachSkeletonViews", "view", "Landroidx/databinding/ViewDataBinding;", "resId", "getApplicationInstance", "Landroid/app/Application;", "getBackIcon", "getBaseActivity", "Lcom/salampakistan/base/BaseActivity;", "getImage", "isCamera", "", "getTitle", "", "getToolbar", "Landroidx/appcompat/widget/Toolbar;", "getViewId", "handleArguments", "arguments", "Landroid/os/Bundle;", "hideProgressBar", "injectBinding", "Landroid/view/View;", "(Landroid/view/View;)Ljava/lang/Object;", "launchWebView", "url", "onBackPressed", "onCreate", "savedInstanceState", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFragmentAddedToBackStack", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "onViewStateRestored", "popFragment", "popToRootFragment", "pushFragment", "showImageMenu", "showProgressBar", "fullScreen", "showSnack", "msg", "showToast", "text", "throttleListener", "Lrx/Observable;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "v", "transitionComplete", "app_debug"})
public abstract class BaseFragment<VDB extends java.lang.Object> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected com.salampakistan.utils.Preferences preferences;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected com.salampakistan.utils.DialogUtils dialogUtils;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    public com.ethanhua.skeleton.SkeletonScreen viewSkeleton;
    private final int CAMERA_PERMISSION_CODE = 102;
    private final int Gallery_PERMISSION_CODE = 101;
    private final int CAMERA_REQUEST = 1888;
    
    /**
     * PROGRESS BAR
     */
    private android.widget.PopupWindow progressBar;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.salampakistan.utils.Preferences getPreferences() {
        return null;
    }
    
    protected final void setPreferences(@org.jetbrains.annotations.NotNull()
    com.salampakistan.utils.Preferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.salampakistan.utils.DialogUtils getDialogUtils() {
        return null;
    }
    
    protected final void setDialogUtils(@org.jetbrains.annotations.NotNull()
    com.salampakistan.utils.DialogUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ethanhua.skeleton.SkeletonScreen getViewSkeleton() {
        return null;
    }
    
    public final void setViewSkeleton(@org.jetbrains.annotations.NotNull()
    com.ethanhua.skeleton.SkeletonScreen p0) {
    }
    
    public final int getCAMERA_PERMISSION_CODE() {
        return 0;
    }
    
    public final int getGallery_PERMISSION_CODE() {
        return 0;
    }
    
    public final int getCAMERA_REQUEST() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public void transitionComplete() {
    }
    
    public void handleArguments(@org.jetbrains.annotations.NotNull()
    android.os.Bundle arguments) {
    }
    
    @androidx.annotation.DrawableRes()
    public int getBackIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplicationInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.base.BaseActivity getBaseActivity() {
        return null;
    }
    
    public final void showToast(@androidx.annotation.StringRes()
    int text) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void showSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void showSnack(@androidx.annotation.StringRes()
    int msg) {
    }
    
    public final void onBackPressed() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    /**
     * LISTENERS
     */
    public final rx.Observable<java.lang.Void> throttleListener(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
        return null;
    }
    
    public final void showProgressBar(boolean fullScreen) {
    }
    
    public final void showProgressBar() {
    }
    
    public final void hideProgressBar() {
    }
    
    public final void launchWebView(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    /**
     * Abstract methods
     */
    public abstract int getViewId();
    
    public abstract VDB injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    /**
     * Fragment Transition Methods
     */
    public final void onFragmentAddedToBackStack() {
    }
    
    public final void popToRootFragment() {
    }
    
    public final void popFragment() {
    }
    
    public final <T extends java.lang.Object>void pushFragment(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<? extends T> fragment) {
    }
    
    public final <T extends java.lang.Object>void addFragment(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<? extends T> fragment) {
    }
    
    public final void showImageMenu() {
    }
    
    public final void getImage(boolean isCamera) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ethanhua.skeleton.SkeletonScreen attachSkeletonViews(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding view, @androidx.annotation.LayoutRes()
    int resId) {
        return null;
    }
    
    public BaseFragment() {
        super();
    }
}