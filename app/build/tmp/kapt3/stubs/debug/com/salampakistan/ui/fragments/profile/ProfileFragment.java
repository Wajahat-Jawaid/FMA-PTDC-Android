package com.salampakistan.ui.fragments.profile;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/salampakistan/ui/fragments/profile/ProfileFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentProfileBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "currentViewType", "Lcom/salampakistan/ui/fragments/profile/ProfileFragment$ViewType;", "changeFragment", "", "viewType", "getTitle", "", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ViewType", "app_debug"})
public final class ProfileFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentProfileBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.profile.ProfileFragment.ViewType currentViewType;
    private com.salampakistan.databinding.FragmentProfileBinding binding;
    public static final com.salampakistan.ui.fragments.profile.ProfileFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void changeFragment(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.profile.ProfileFragment.ViewType viewType) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentProfileBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    public ProfileFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/salampakistan/ui/fragments/profile/ProfileFragment$ViewType;", "", "(Ljava/lang/String;I)V", "OPTIONS", "WISHLIST", "REVIEWS", "CONTACT", "ABOUT", "app_debug"})
    public static enum ViewType {
        /*public static final*/ OPTIONS /* = new OPTIONS() */,
        /*public static final*/ WISHLIST /* = new WISHLIST() */,
        /*public static final*/ REVIEWS /* = new REVIEWS() */,
        /*public static final*/ CONTACT /* = new CONTACT() */,
        /*public static final*/ ABOUT /* = new ABOUT() */;
        
        ViewType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/profile/ProfileFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/profile/ProfileFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.profile.ProfileFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}