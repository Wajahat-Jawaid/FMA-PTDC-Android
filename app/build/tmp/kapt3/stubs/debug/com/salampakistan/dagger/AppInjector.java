package com.salampakistan.dagger;

import java.lang.System;

/**
 * Helper class to automatically inject fragments if they implement [Injectable].
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/salampakistan/dagger/AppInjector;", "", "()V", "handleActivity", "", "activity", "Landroid/app/Activity;", "init", "application", "Lcom/salampakistan/base/App;", "app_debug"})
public final class AppInjector {
    public static final com.salampakistan.dagger.AppInjector INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.App application) {
    }
    
    private final void handleActivity(android.app.Activity activity) {
    }
    
    private AppInjector() {
        super();
    }
}