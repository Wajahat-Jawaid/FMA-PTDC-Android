package com.salampakistan.ui.fragments.itinerary;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/salampakistan/ui/fragments/itinerary/ItineraryListFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentItinerariesBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "adapter", "Lcom/salampakistan/ui/fragments/itinerary/ItinerariesAdapter;", "binding", "itineraries", "Ljava/util/ArrayList;", "Lcom/salampakistan/model/Itinerary;", "Lkotlin/collections/ArrayList;", "getViewId", "", "handleArguments", "", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "setData", "Companion", "app_debug"})
public final class ItineraryListFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentItinerariesBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.databinding.FragmentItinerariesBinding binding;
    private java.util.ArrayList<com.salampakistan.model.Itinerary> itineraries;
    private final com.salampakistan.ui.fragments.itinerary.ItinerariesAdapter adapter = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String ITINERARIES = null;
    public static final com.salampakistan.ui.fragments.itinerary.ItineraryListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void handleArguments(@org.jetbrains.annotations.NotNull()
    android.os.Bundle arguments) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setData() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentItinerariesBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public ItineraryListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/salampakistan/ui/fragments/itinerary/ItineraryListFragment$Companion;", "", "()V", "ITINERARIES", "", "TAG", "getInstance", "Lcom/salampakistan/ui/fragments/itinerary/ItineraryListFragment;", "itineraries", "Ljava/util/ArrayList;", "Lcom/salampakistan/model/Itinerary;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.itinerary.ItineraryListFragment getInstance(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.salampakistan.model.Itinerary> itineraries) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}