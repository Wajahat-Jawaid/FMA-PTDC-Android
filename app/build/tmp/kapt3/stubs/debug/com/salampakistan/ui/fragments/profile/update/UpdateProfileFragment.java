package com.salampakistan.ui.fragments.profile.update;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u0010 \u001a\u00020\u0014J\u0006\u0010!\u001a\u00020\u0014J\u001a\u0010\"\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0002J\u0006\u0010\'\u001a\u00020\u0014J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/salampakistan/ui/fragments/profile/update/UpdateProfileFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentUpdateProfileBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "dob", "", "dobLong", "", "female", "gender", "male", "user", "Lcom/salampakistan/model/User;", "viewModel", "Lcom/salampakistan/ui/fragments/profile/update/UpdateProfileViewModel;", "getViewId", "", "handleUploadPicsResponse", "", "it", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/SimpleApiResponse;", "injectBinding", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onEditPasswordBtnClicked", "onSaveButtonClicked", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "populateFields", "setGenderRadioGroup", "showDatePicker", "uploadDoc", "image", "Lcom/esafirm/imagepicker/model/Image;", "Companion", "app_debug"})
public final class UpdateProfileFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentUpdateProfileBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.databinding.FragmentUpdateProfileBinding binding;
    private com.salampakistan.ui.fragments.profile.update.UpdateProfileViewModel viewModel;
    private com.salampakistan.model.User user;
    private java.lang.String dob;
    private long dobLong;
    private java.lang.String gender;
    private final java.lang.String male = "male";
    private final java.lang.String female = "female";
    private static final rx.subjects.PublishSubject<java.lang.Boolean> updateSuccessSubject = null;
    public static final com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void uploadDoc(@org.jetbrains.annotations.NotNull()
    com.esafirm.imagepicker.model.Image image) {
    }
    
    private final void handleUploadPicsResponse(com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse> it) {
    }
    
    public final void showDatePicker() {
    }
    
    public final void onEditPasswordBtnClicked() {
    }
    
    public final void onSaveButtonClicked() {
    }
    
    private final void populateFields() {
    }
    
    private final void setGenderRadioGroup() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentUpdateProfileBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public UpdateProfileFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/salampakistan/ui/fragments/profile/update/UpdateProfileFragment$Companion;", "", "()V", "updateSuccessSubject", "Lrx/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getUpdateSuccessSubject", "()Lrx/subjects/PublishSubject;", "getInstance", "Lcom/salampakistan/ui/fragments/profile/update/UpdateProfileFragment;", "app_debug"})
    public static final class Companion {
        
        public final rx.subjects.PublishSubject<java.lang.Boolean> getUpdateSuccessSubject() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}