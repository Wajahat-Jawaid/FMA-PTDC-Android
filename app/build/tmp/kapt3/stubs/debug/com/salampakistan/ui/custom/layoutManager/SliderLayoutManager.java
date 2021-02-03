package com.salampakistan.ui.custom.layoutManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/salampakistan/ui/custom/layoutManager/SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mShrinkAmount", "", "mShrinkDistance", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToWindow", "", "view", "onLayoutChildren", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "scrollHorizontallyBy", "", "dx", "app_debug"})
public final class SliderLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private final float mShrinkAmount = 0.08F;
    private final float mShrinkDistance = 0.9F;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    
    @java.lang.Override()
    public void onAttachedToWindow(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView view) {
    }
    
    @java.lang.Override()
    public void onLayoutChildren(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override()
    public int scrollHorizontallyBy(int dx, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
    
    public SliderLayoutManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
}