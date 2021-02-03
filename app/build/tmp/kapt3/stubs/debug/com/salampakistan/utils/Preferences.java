package com.salampakistan.utils;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001 B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\fJ\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001aJ\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u001bJ\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/salampakistan/utils/Preferences;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "emptyString", "", "preferences", "Landroid/content/SharedPreferences;", "clear", "", "getBool", "", "key", "getIncrementedPromptCounter", "", "getInt", "getLong", "", "getString", "getUser", "Lcom/salampakistan/model/User;", "has", "hasDisplayedOnBoarding", "insert", "value", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/Long;)V", "remove", "saveUser", "setDisplayedOnboarding", "KEYS", "app_debug"})
public final class Preferences {
    private final java.lang.String emptyString = "";
    private final android.content.SharedPreferences preferences = null;
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull()
    com.salampakistan.model.User value) {
    }
    
    public final void setDisplayedOnboarding(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.salampakistan.model.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0L;
    }
    
    public final boolean getBool(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final boolean hasDisplayedOnBoarding() {
        return false;
    }
    
    public final int getIncrementedPromptCounter() {
        return 0;
    }
    
    public final boolean has(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void clear() {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @javax.inject.Inject()
    public Preferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/salampakistan/utils/Preferences$KEYS;", "", "text", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "USER", "ONBOARDINGSCREEN", "PROMPT_COUNTER", "app_debug"})
    public static enum KEYS {
        /*public static final*/ USER /* = new USER(null) */,
        /*public static final*/ ONBOARDINGSCREEN /* = new ONBOARDINGSCREEN(null) */,
        /*public static final*/ PROMPT_COUNTER /* = new PROMPT_COUNTER(null) */;
        private final java.lang.String text = null;
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.NonNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        KEYS(java.lang.String text) {
        }
    }
}