package com.salampakistan.ui.fragments.forgotpassword;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/salampakistan/ui/fragments/forgotpassword/ForgotPasswordViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "application", "Landroid/app/Application;", "repo", "Lcom/salampakistan/network/repos/UsersRepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/UsersRepo;)V", "sendRecoveryEmail", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/SimpleApiResponse;", "email", "", "app_debug"})
public final class ForgotPasswordViewModel extends com.salampakistan.base.BaseViewModel {
    private final com.salampakistan.network.repos.UsersRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> sendRecoveryEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @javax.inject.Inject()
    public ForgotPasswordViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.UsersRepo repo) {
        super(null);
    }
}