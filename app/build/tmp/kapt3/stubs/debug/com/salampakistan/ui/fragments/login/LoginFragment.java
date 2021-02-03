package com.salampakistan.ui.fragments.login;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0013J\"\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u0013J\u001a\u0010 \u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/salampakistan/ui/fragments/login/LoginFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentLoginBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "callbackManager", "Lcom/facebook/CallbackManager;", "kotlin.jvm.PlatformType", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "loginSuccessSubject", "Lrx/subjects/PublishSubject;", "", "getLoginSuccessSubject", "()Lrx/subjects/PublishSubject;", "viewModel", "Lcom/salampakistan/ui/fragments/login/LoginRegisterViewModel;", "fbLoginn", "", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "login", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateAccountBtnClicked", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "validate", "Companion", "app_debug"})
public final class LoginFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentLoginBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.databinding.FragmentLoginBinding binding;
    private com.salampakistan.ui.fragments.login.LoginRegisterViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final rx.subjects.PublishSubject<java.lang.Boolean> loginSuccessSubject = null;
    private final com.facebook.CallbackManager callbackManager = null;
    public static final com.salampakistan.ui.fragments.login.LoginFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final rx.subjects.PublishSubject<java.lang.Boolean> getLoginSuccessSubject() {
        return null;
    }
    
    public final com.facebook.CallbackManager getCallbackManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void fbLoginn() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void login() {
    }
    
    public final void onCreateAccountBtnClicked() {
    }
    
    private final boolean validate() {
        return false;
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentLoginBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public LoginFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/login/LoginFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/login/LoginFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.login.LoginFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}