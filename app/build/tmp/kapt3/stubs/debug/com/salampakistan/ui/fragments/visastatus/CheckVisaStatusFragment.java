package com.salampakistan.ui.fragments.visastatus;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/salampakistan/ui/fragments/visastatus/CheckVisaStatusFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentCheckVisaStatusBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "viewModel", "Lcom/salampakistan/ui/fragments/visastatus/CheckVisaStatusViewModel;", "getData", "", "binding", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setViews", "statuses", "", "Lcom/salampakistan/model/CountryVisaStatus;", "showStatusDialog", "visa", "updateSelectedCountryText", "country", "", "Companion", "app_debug"})
public final class CheckVisaStatusFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentCheckVisaStatusBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.visastatus.CheckVisaStatusViewModel viewModel;
    public static final com.salampakistan.ui.fragments.visastatus.CheckVisaStatusFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getData(com.salampakistan.databinding.FragmentCheckVisaStatusBinding binding) {
    }
    
    private final void setViews(com.salampakistan.databinding.FragmentCheckVisaStatusBinding binding, java.util.List<com.salampakistan.model.CountryVisaStatus> statuses) {
    }
    
    private final void updateSelectedCountryText(com.salampakistan.databinding.FragmentCheckVisaStatusBinding binding, java.lang.String country) {
    }
    
    private final void showStatusDialog(com.salampakistan.model.CountryVisaStatus visa) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentCheckVisaStatusBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public CheckVisaStatusFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/visastatus/CheckVisaStatusFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/visastatus/CheckVisaStatusFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.visastatus.CheckVisaStatusFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}