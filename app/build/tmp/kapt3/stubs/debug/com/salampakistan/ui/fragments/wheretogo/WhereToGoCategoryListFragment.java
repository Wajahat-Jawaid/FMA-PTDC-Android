package com.salampakistan.ui.fragments.wheretogo;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u001a\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoCategoryListFragment;", "Lcom/salampakistan/base/BaseListFragment;", "Lcom/salampakistan/databinding/FragmentListWhereToGoCategoryBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "allAdapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowWhereToGoTypeAllBinding;", "Lcom/salampakistan/model/Location;", "binding", "categoryLocation", "featuredAdapter", "Lcom/salampakistan/databinding/RowWhereToGoBinding;", "ss", "", "viewModel", "Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoCategoryListViewModel;", "getData", "", "getViewId", "", "handleArguments", "arguments", "Landroid/os/Bundle;", "handleResponse", "it", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/GetLocationsResponse;", "injectBinding", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "setRecyclerView", "Companion", "app_debug"})
public final class WhereToGoCategoryListFragment extends com.salampakistan.base.BaseListFragment<com.salampakistan.databinding.FragmentListWhereToGoCategoryBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.model.Location categoryLocation;
    private com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListViewModel viewModel;
    private com.salampakistan.databinding.FragmentListWhereToGoCategoryBinding binding;
    private final com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowWhereToGoBinding, com.salampakistan.model.Location> featuredAdapter = null;
    private final com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowWhereToGoTypeAllBinding, com.salampakistan.model.Location> allAdapter = null;
    private boolean ss;
    private static final java.lang.String TAG = null;
    public static final com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment.Companion Companion = null;
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void handleResponse(com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse> it) {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentListWhereToGoCategoryBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public WhereToGoCategoryListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoCategoryListFragment$Companion;", "", "()V", "TAG", "", "getInstance", "Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoCategoryListFragment;", "categoryLocation", "Lcom/salampakistan/model/Location;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment getInstance(@org.jetbrains.annotations.NotNull()
        com.salampakistan.model.Location categoryLocation) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}