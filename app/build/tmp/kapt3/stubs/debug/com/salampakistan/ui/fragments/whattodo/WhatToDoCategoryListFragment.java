package com.salampakistan.ui.fragments.whattodo;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/salampakistan/ui/fragments/whattodo/WhatToDoCategoryListFragment;", "Lcom/salampakistan/base/BaseListFragment;", "Lcom/salampakistan/databinding/FragmentListWhatToDoCategoryBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "categoryActivity", "Lcom/salampakistan/model/Activity;", "eventsAdapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowWhereToGoBinding;", "Lcom/salampakistan/model/Location;", "viewModel", "Lcom/salampakistan/ui/fragments/whattodo/WhatToDoCategoryListViewModel;", "getData", "", "getViewId", "", "handleArguments", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "setRecyclerView", "Companion", "app_debug"})
public final class WhatToDoCategoryListFragment extends com.salampakistan.base.BaseListFragment<com.salampakistan.databinding.FragmentListWhatToDoCategoryBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.model.Activity categoryActivity;
    private com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListViewModel viewModel;
    private com.salampakistan.databinding.FragmentListWhatToDoCategoryBinding binding;
    private final com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowWhereToGoBinding, com.salampakistan.model.Location> eventsAdapter = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String CATEGORY_ACTIVITY = null;
    public static final com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void handleArguments(@org.jetbrains.annotations.NotNull()
    android.os.Bundle arguments) {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentListWhatToDoCategoryBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public WhatToDoCategoryListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/salampakistan/ui/fragments/whattodo/WhatToDoCategoryListFragment$Companion;", "", "()V", "CATEGORY_ACTIVITY", "", "TAG", "getInstance", "Lcom/salampakistan/ui/fragments/whattodo/WhatToDoCategoryListFragment;", "categoryActivity", "Lcom/salampakistan/model/Activity;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListFragment getInstance(@org.jetbrains.annotations.NotNull()
        com.salampakistan.model.Activity categoryActivity) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}