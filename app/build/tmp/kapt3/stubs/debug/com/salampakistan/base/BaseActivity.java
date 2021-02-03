package com.salampakistan.base;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007J\b\u0010\b\u001a\u00020\tH\u0004J;\u0010\n\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u000b\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\bJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0005H\u0014J\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005J\u0012\u0010\u001a\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0012\u0010\u001b\u001a\u00020\u0005*\u00020\u001c2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u001e"}, d2 = {"Lcom/salampakistan/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "()V", "addFragment", "", "fragment", "Lcom/salampakistan/base/BaseFragment;", "getMasterContainerId", "", "handleTransition", "T", "transitionType", "Lcom/salampakistan/base/BaseActivity$TransitionType;", "add", "", "isAtRootFragment", "isBackStackEmpty", "onBackPressed", "onBackStackChanged", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "popFragment", "popToRootFragment", "startWithFragment", "setTransition", "Landroidx/fragment/app/FragmentTransaction;", "TransitionType", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.fragment.app.FragmentManager.OnBackStackChangedListener {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void startWithFragment(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    public final void setTransition(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentTransaction $this$setTransition, @org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseActivity.TransitionType transitionType) {
    }
    
    public final void addFragment(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    public final void popToRootFragment() {
    }
    
    public final void popFragment() {
    }
    
    public final boolean isBackStackEmpty() {
        return false;
    }
    
    public final boolean isAtRootFragment() {
        return false;
    }
    
    @java.lang.Override()
    public void onBackStackChanged() {
    }
    
    protected final int getMasterContainerId() {
        return 0;
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/salampakistan/base/BaseActivity$TransitionType;", "", "(Ljava/lang/String;I)V", "SIBLING", "DETAIL", "MODAL", "app_debug"})
    public static enum TransitionType {
        /*public static final*/ SIBLING /* = new SIBLING() */,
        /*public static final*/ DETAIL /* = new DETAIL() */,
        /*public static final*/ MODAL /* = new MODAL() */;
        
        TransitionType() {
        }
    }
}