package com.salampakistan.ui.fragments.home;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0019\u001a\u00020\u001aJ\u0019\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u001d\u001a\u0002H\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u001aH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0016J\u0015\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010\'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0016\u0010*\u001a\u00020\u001c2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010,J\u0010\u0010-\u001a\u00020\u001c2\b\b\u0001\u0010.\u001a\u00020\u001aJ\u000e\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u00020\u001c2\b\b\u0001\u00103\u001a\u00020\u001aJ\u0016\u00104\u001a\u00020\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001c06H\u0002J\b\u00107\u001a\u00020\u001cH&R\u0016\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00068"}, d2 = {"Lcom/salampakistan/ui/fragments/home/BaseHomeSectionFragment;", "M", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/ViewHomeFragmentContainerBinding;", "()V", "adapter", "Lcom/salampakistan/ui/adapters/BaseListAdapter;", "binding", "getBinding", "()Lcom/salampakistan/databinding/ViewHomeFragmentContainerBinding;", "setBinding", "(Lcom/salampakistan/databinding/ViewHomeFragmentContainerBinding;)V", "skeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getSkeleton", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "setSkeleton", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "viewModel", "Lcom/salampakistan/ui/fragments/home/HomeViewModel;", "getViewModel", "()Lcom/salampakistan/ui/fragments/home/HomeViewModel;", "setViewModel", "(Lcom/salampakistan/ui/fragments/home/HomeViewModel;)V", "attachSkeletonViews", "resId", "", "configAdapter", "", "type", "(Ljava/lang/Object;)V", "getLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getViewId", "injectBinding", "view", "Landroid/view/View;", "onListItemClicked", "model", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setData", "items", "", "setIntro", "intro", "setSeeAllFlag", "seeAll", "", "setTitle", "title", "setViewAllTextAction", "clickSetter", "Lkotlin/Function0;", "viewAllTextClicked", "app_debug"})
public abstract class BaseHomeSectionFragment<M extends java.lang.Object> extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.ViewHomeFragmentContainerBinding> {
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.databinding.ViewHomeFragmentContainerBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.ui.fragments.home.HomeViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public com.ethanhua.skeleton.SkeletonScreen skeleton;
    private com.salampakistan.ui.adapters.BaseListAdapter<?, ?> adapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.databinding.ViewHomeFragmentContainerBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.salampakistan.databinding.ViewHomeFragmentContainerBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.ui.fragments.home.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.home.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ethanhua.skeleton.SkeletonScreen getSkeleton() {
        return null;
    }
    
    public final void setSkeleton(@org.jetbrains.annotations.NotNull()
    com.ethanhua.skeleton.SkeletonScreen p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setViewAllTextAction(kotlin.jvm.functions.Function0<kotlin.Unit> clickSetter) {
    }
    
    public final void setIntro(@androidx.annotation.StringRes()
    int intro) {
    }
    
    public final void setTitle(@androidx.annotation.StringRes()
    int title) {
    }
    
    public final void setSeeAllFlag(boolean seeAll) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ethanhua.skeleton.SkeletonScreen attachSkeletonViews(@androidx.annotation.LayoutRes()
    int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLayoutManager() {
        return null;
    }
    
    public final <M extends java.lang.Object>void configAdapter(M type) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends M> items) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.ViewHomeFragmentContainerBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public abstract void viewAllTextClicked();
    
    public abstract void onListItemClicked(M model);
    
    public BaseHomeSectionFragment() {
        super();
    }
}