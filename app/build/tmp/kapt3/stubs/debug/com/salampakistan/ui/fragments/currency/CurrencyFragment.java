package com.salampakistan.ui.fragments.currency;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/salampakistan/ui/fragments/currency/CurrencyFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentCurrencyBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "selectedCurrency", "Lcom/salampakistan/model/Currency;", "viewModel", "Lcom/salampakistan/ui/fragments/currency/CurrencyViewModel;", "calculateCurrency", "", "binding", "getCurrencyRate", "", "currency", "getData", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setViews", "currencies", "", "updateSelectedCurrencyText", "Companion", "app_debug"})
public final class CurrencyFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentCurrencyBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.currency.CurrencyViewModel viewModel;
    private com.salampakistan.model.Currency selectedCurrency;
    public static final com.salampakistan.ui.fragments.currency.CurrencyFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getData(com.salampakistan.databinding.FragmentCurrencyBinding binding) {
    }
    
    private final void setViews(com.salampakistan.databinding.FragmentCurrencyBinding binding, java.util.List<com.salampakistan.model.Currency> currencies) {
    }
    
    private final void updateSelectedCurrencyText(com.salampakistan.databinding.FragmentCurrencyBinding binding) {
    }
    
    private final void calculateCurrency(com.salampakistan.databinding.FragmentCurrencyBinding binding) {
    }
    
    private final float getCurrencyRate(com.salampakistan.model.Currency currency) {
        return 0.0F;
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentCurrencyBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public CurrencyFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/currency/CurrencyFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/currency/CurrencyFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.currency.CurrencyFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}