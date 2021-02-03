package com.salampakistan.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0016\u0010 \u001a\u00120!R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\"\u001a\u00020\u0007H\u0016J(\u0010#\u001a\u00120!R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010\'\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/salampakistan/ui/adapters/FlightListAdapter;", "VDB", "M", "Lcom/salampakistan/ui/adapters/BaseListAdapter;", "context", "Landroid/content/Context;", "resId", "", "(Landroid/content/Context;I)V", "adapterServices", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowAmenitiesBinding;", "", "bookClickSubject", "Lrx/subjects/PublishSubject;", "getBookClickSubject", "()Lrx/subjects/PublishSubject;", "clickSubject", "Lcom/salampakistan/databinding/RowFlightBinding;", "getClickSubject", "selectedIndex", "", "animListener", "Landroid/animation/Animator$AnimatorListener;", "parentView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "view", "Landroid/view/View;", "isVisible", "", "onBindViewHolder", "", "holder", "Lcom/salampakistan/ui/adapters/BaseListAdapter$ViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setHeightAnimation", "app_debug"})
public final class FlightListAdapter<VDB extends java.lang.Object, M extends java.lang.Object> extends com.salampakistan.ui.adapters.BaseListAdapter<VDB, M> {
    @org.jetbrains.annotations.NotNull()
    private final rx.subjects.PublishSubject<com.salampakistan.databinding.RowFlightBinding> clickSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final rx.subjects.PublishSubject<M> bookClickSubject = null;
    private com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowAmenitiesBinding, java.lang.Object> adapterServices;
    private java.lang.String selectedIndex;
    private final android.content.Context context = null;
    private final int resId = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final rx.subjects.PublishSubject<com.salampakistan.databinding.RowFlightBinding> getClickSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.subjects.PublishSubject<M> getBookClickSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.ui.adapters.BaseListAdapter<VDB, M>.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.adapters.BaseListAdapter<VDB, M>.ViewHolder holder, int position) {
    }
    
    private final android.animation.Animator.AnimatorListener animListener(androidx.constraintlayout.widget.ConstraintLayout parentView, android.view.View view, boolean isVisible) {
        return null;
    }
    
    private final void setHeightAnimation(android.view.View view) {
    }
    
    public FlightListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.LayoutRes()
    int resId) {
        super();
    }
}