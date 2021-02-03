package com.salampakistan.ui.fragments.login;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0013J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0006\u0010\u0019\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/salampakistan/ui/fragments/login/RegisterFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentRegisterBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "dob", "", "female", "gender", "male", "viewModel", "Lcom/salampakistan/ui/fragments/login/LoginRegisterViewModel;", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onLoginHereBtnClicked", "", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "register", "setGenderRadioGroup", "showDatePicker", "validate", "", "Companion", "app_debug"})
public final class RegisterFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentRegisterBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.databinding.FragmentRegisterBinding binding;
    private com.salampakistan.ui.fragments.login.LoginRegisterViewModel viewModel;
    private java.lang.String dob;
    private java.lang.String gender;
    private final java.lang.String male = "male";
    private final java.lang.String female = "female";
    public static final com.salampakistan.ui.fragments.login.RegisterFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showDatePicker() {
    }
    
    public final void register() {
    }
    
    public final void onLoginHereBtnClicked() {
    }
    
    private final void setGenderRadioGroup() {
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
    public com.salampakistan.databinding.FragmentRegisterBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public RegisterFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/login/RegisterFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/login/RegisterFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.login.RegisterFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}