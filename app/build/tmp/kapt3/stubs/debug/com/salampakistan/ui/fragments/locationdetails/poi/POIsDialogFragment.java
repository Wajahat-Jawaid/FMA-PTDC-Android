package com.salampakistan.ui.fragments.locationdetails.poi;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/salampakistan/ui/fragments/locationdetails/poi/POIsDialogFragment;", "Lcom/salampakistan/base/BaseDialogFragment;", "Lcom/salampakistan/databinding/DialogFragmentListBinding;", "()V", "adapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowPoiListBinding;", "Lcom/salampakistan/model/POI;", "binding", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "poiSelectionSubject", "Lrx/subjects/PublishSubject;", "getPoiSelectionSubject", "()Lrx/subjects/PublishSubject;", "getViewId", "", "handleArguments", "", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Companion", "app_debug"})
public final class POIsDialogFragment extends com.salampakistan.base.BaseDialogFragment<com.salampakistan.databinding.DialogFragmentListBinding> {
    private java.util.ArrayList<com.salampakistan.model.POI> items;
    private com.salampakistan.databinding.DialogFragmentListBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final rx.subjects.PublishSubject<com.salampakistan.model.POI> poiSelectionSubject = null;
    private final com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowPoiListBinding, com.salampakistan.model.POI> adapter = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String SURROUNDINGS = null;
    public static final com.salampakistan.ui.fragments.locationdetails.poi.POIsDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final rx.subjects.PublishSubject<com.salampakistan.model.POI> getPoiSelectionSubject() {
        return null;
    }
    
    @java.lang.Override()
    public void handleArguments(@org.jetbrains.annotations.NotNull()
    android.os.Bundle arguments) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.DialogFragmentListBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public POIsDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/salampakistan/ui/fragments/locationdetails/poi/POIsDialogFragment$Companion;", "", "()V", "SURROUNDINGS", "", "TAG", "getInstance", "Lcom/salampakistan/ui/fragments/locationdetails/poi/POIsDialogFragment;", "surroundings", "Ljava/util/ArrayList;", "Lcom/salampakistan/model/POI;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.locationdetails.poi.POIsDialogFragment getInstance(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.salampakistan.model.POI> surroundings) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}