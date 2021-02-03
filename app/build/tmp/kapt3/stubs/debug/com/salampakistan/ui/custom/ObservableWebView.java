package com.salampakistan.ui.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/salampakistan/ui/custom/ObservableWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onScrollChangedCallback", "Lcom/salampakistan/ui/custom/ObservableWebView$OnScrollChangeListener;", "getOnScrollChangedCallback", "()Lcom/salampakistan/ui/custom/ObservableWebView$OnScrollChangeListener;", "setOnScrollChangedCallback", "(Lcom/salampakistan/ui/custom/ObservableWebView$OnScrollChangeListener;)V", "onScrollChanged", "", "l", "t", "oldl", "oldt", "OnScrollChangeListener", "app_debug"})
public final class ObservableWebView extends android.webkit.WebView {
    @org.jetbrains.annotations.Nullable()
    private com.salampakistan.ui.custom.ObservableWebView.OnScrollChangeListener onScrollChangedCallback;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.salampakistan.ui.custom.ObservableWebView.OnScrollChangeListener getOnScrollChangedCallback() {
        return null;
    }
    
    public final void setOnScrollChangedCallback(@org.jetbrains.annotations.Nullable()
    com.salampakistan.ui.custom.ObservableWebView.OnScrollChangeListener p0) {
    }
    
    @java.lang.Override()
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
    }
    
    public ObservableWebView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public ObservableWebView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ObservableWebView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/salampakistan/ui/custom/ObservableWebView$OnScrollChangeListener;", "", "onScrollChanged", "", "l", "", "t", "oldl", "oldt", "app_debug"})
    public static abstract interface OnScrollChangeListener {
        
        public abstract void onScrollChanged(int l, int t, int oldl, int oldt);
    }
}