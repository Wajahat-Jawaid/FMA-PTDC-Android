package com.salampakistan.ui.adapters;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0018\u0012\u0014\u0012\u00120\u0004R\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00000\u00032\u00020\u0005:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u00120\u0004R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fH\u0016J!\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\b R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/salampakistan/ui/adapters/BaseListAdapter;", "VDB", "M", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/salampakistan/ui/adapters/BaseListAdapter$ViewHolder;", "Lcom/salampakistan/ui/adapters/AutoUpdatableAdapter;", "()V", "itemClickSubject", "Lrx/subjects/PublishSubject;", "getItemClickSubject", "()Lrx/subjects/PublishSubject;", "<set-?>", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items$delegate", "Lkotlin/properties/ReadWriteProperty;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "updateContent", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Landroid/view/ViewGroup;", "layoutRes", "inflate$app_debug", "ViewHolder", "app_debug"})
public abstract class BaseListAdapter<VDB extends java.lang.Object, M extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.salampakistan.ui.adapters.BaseListAdapter<VDB, M>.ViewHolder> implements com.salampakistan.ui.adapters.AutoUpdatableAdapter {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty items$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final rx.subjects.PublishSubject<M> itemClickSubject = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<M> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends M> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.adapters.BaseListAdapter<VDB, M>.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.subjects.PublishSubject<M> getItemClickSubject() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public void updateContent(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends M> items) {
    }
    
    public final android.view.View inflate$app_debug(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$inflate, int layoutRes) {
        return null;
    }
    
    public BaseListAdapter() {
        super();
    }
    
    public <T extends java.lang.Object>void autoNotify(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> $this$autoNotify, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> old, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p2_54480, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> compare) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/salampakistan/ui/adapters/BaseListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Lcom/salampakistan/ui/adapters/BaseListAdapter;Landroidx/databinding/ViewDataBinding;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private final androidx.databinding.ViewDataBinding binding = null;
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.databinding.ViewDataBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.Nullable()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
    }
}