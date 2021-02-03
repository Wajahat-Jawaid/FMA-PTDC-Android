package com.salampakistan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0007J\b\u0010\"\u001a\u00020\u0019H\u0002J\u0006\u0010#\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0019J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/salampakistan/MainActivity;", "Lcom/salampakistan/base/BaseActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "LOCATION_PERMISSION", "", "currentMode", "Lcom/salampakistan/MainActivity$BottomTabMode;", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroidx/fragment/app/Fragment;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "isBottomNavHidden", "", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "getCurrentMode", "hideBottomNav", "", "navigateToHomeFragment", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setCurrentMode", "mode", "setNavigationMenu", "showBottomNav", "showHideBottomNav", "supportFragmentInjector", "BottomTabMode", "app_debug"})
public final class MainActivity extends com.salampakistan.base.BaseActivity implements dagger.android.support.HasSupportFragmentInjector {
    private boolean isBottomNavHidden;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> dispatchingAndroidInjector;
    private final int LOCATION_PERMISSION = 101;
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavController navController;
    private com.salampakistan.MainActivity.BottomTabMode currentMode;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.MainActivity.BottomTabMode getCurrentMode() {
        return null;
    }
    
    public final void setCurrentMode(@org.jetbrains.annotations.NotNull()
    com.salampakistan.MainActivity.BottomTabMode mode) {
    }
    
    public final void navigateToHomeFragment() {
    }
    
    public final void showHideBottomNav() {
    }
    
    public final void showBottomNav() {
    }
    
    public final void hideBottomNav() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setNavigationMenu() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/salampakistan/MainActivity$BottomTabMode;", "", "(Ljava/lang/String;I)V", "HOME", "PLANNING", "SEARCH", "BLOGS", "PROFILE", "app_debug"})
    public static enum BottomTabMode {
        /*public static final*/ HOME /* = new HOME() */,
        /*public static final*/ PLANNING /* = new PLANNING() */,
        /*public static final*/ SEARCH /* = new SEARCH() */,
        /*public static final*/ BLOGS /* = new BLOGS() */,
        /*public static final*/ PROFILE /* = new PROFILE() */;
        
        BottomTabMode() {
        }
    }
}