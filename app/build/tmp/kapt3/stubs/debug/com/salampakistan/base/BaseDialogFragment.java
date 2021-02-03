package com.salampakistan.base;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0015\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00020$H&\u00a2\u0006\u0002\u0010%J\u0012\u0010&\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010!H\u0016J&\u0010(\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010\'\u001a\u0004\u0018\u00010!H\u0016J\b\u0010-\u001a\u00020\u001fH\u0016J\u0012\u0010.\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010!H\u0016J\b\u0010/\u001a\u00020\u001fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00060"}, d2 = {"Lcom/salampakistan/base/BaseDialogFragment;", "VDB", "Landroidx/fragment/app/DialogFragment;", "()V", "dialogUtils", "Lcom/salampakistan/utils/DialogUtils;", "getDialogUtils", "()Lcom/salampakistan/utils/DialogUtils;", "setDialogUtils", "(Lcom/salampakistan/utils/DialogUtils;)V", "preferences", "Lcom/salampakistan/utils/Preferences;", "getPreferences", "()Lcom/salampakistan/utils/Preferences;", "setPreferences", "(Lcom/salampakistan/utils/Preferences;)V", "skeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getSkeleton", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "setSkeleton", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getViewId", "", "handleArguments", "", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "(Landroid/view/View;)Ljava/lang/Object;", "onCreate", "savedInstanceState", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewStateRestored", "transitionComplete", "app_debug"})
public abstract class BaseDialogFragment<VDB extends java.lang.Object> extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.salampakistan.utils.Preferences preferences;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected com.salampakistan.utils.DialogUtils dialogUtils;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.ethanhua.skeleton.SkeletonScreen skeleton;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.utils.Preferences getPreferences() {
        return null;
    }
    
    public final void setPreferences(@org.jetbrains.annotations.NotNull()
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
    public final com.ethanhua.skeleton.SkeletonScreen getSkeleton() {
        return null;
    }
    
    public final void setSkeleton(@org.jetbrains.annotations.NotNull()
    com.ethanhua.skeleton.SkeletonScreen p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
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
    
    /**
     * Abstract methods
     */
    public abstract int getViewId();
    
    public abstract VDB injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public BaseDialogFragment() {
        super();
    }
}