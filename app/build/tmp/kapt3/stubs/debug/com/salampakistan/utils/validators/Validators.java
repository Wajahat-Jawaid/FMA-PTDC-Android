package com.salampakistan.utils.validators;

import java.lang.System;

/**
 * General properties validations which can be used either collectively or individually at
 * different places
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/salampakistan/utils/validators/Validators;", "", "()V", "isCnicValid", "", "mobile", "", "isDateValid", "text", "disallowedText", "isLocationValid", "isMobileValid", "isPasswordValid", "pwd", "app_debug"})
public final class Validators {
    public static final com.salampakistan.utils.validators.Validators INSTANCE = null;
    
    public final boolean isLocationValid(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String disallowedText) {
        return false;
    }
    
    public final boolean isDateValid(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String disallowedText) {
        return false;
    }
    
    public final boolean isMobileValid(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile) {
        return false;
    }
    
    public final boolean isCnicValid(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile) {
        return false;
    }
    
    public final boolean isPasswordValid(@org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    private Validators() {
        super();
    }
}