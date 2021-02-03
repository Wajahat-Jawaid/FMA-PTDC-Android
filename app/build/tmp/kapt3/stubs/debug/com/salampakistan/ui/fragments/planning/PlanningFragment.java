package com.salampakistan.ui.fragments.planning;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0016\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0%H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\u0010\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/salampakistan/ui/fragments/planning/PlanningFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentPlanningBinding;", "Lcom/salampakistan/dagger/Injectable;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "adapter", "Lcom/salampakistan/ui/fragments/planning/PlanningListAdapter;", "binding", "firstLocatoin", "Lcom/salampakistan/model/WishList;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/salampakistan/ui/custom/CustomSupportMapFragment;", "viewModel", "Lcom/salampakistan/ui/fragments/planning/PlanningViewModel;", "getData", "", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onDateFieldClicked", "check", "Lcom/salampakistan/model/enums/PlanningDate;", "onLocationFieldClicked", "direction", "Lcom/salampakistan/model/enums/TripDirection;", "onMapReady", "p0", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setTouchHelper", "plans", "", "setUpMap", "updateLocationUI", "data", "Companion", "app_debug"})
public final class PlanningFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentPlanningBinding> implements com.salampakistan.dagger.Injectable, com.google.android.gms.maps.OnMapReadyCallback {
    private com.salampakistan.ui.fragments.planning.PlanningViewModel viewModel;
    private com.salampakistan.databinding.FragmentPlanningBinding binding;
    private final com.salampakistan.ui.fragments.planning.PlanningListAdapter adapter = null;
    private com.salampakistan.ui.custom.CustomSupportMapFragment mapFragment;
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.salampakistan.model.WishList firstLocatoin;
    public static final com.salampakistan.ui.fragments.planning.PlanningFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onLocationFieldClicked(@org.jetbrains.annotations.NotNull()
    com.salampakistan.model.enums.TripDirection direction) {
    }
    
    private final void setUpMap() {
    }
    
    public final void onDateFieldClicked(@org.jetbrains.annotations.NotNull()
    com.salampakistan.model.enums.PlanningDate check) {
    }
    
    private final void updateLocationUI(com.salampakistan.model.WishList data) {
    }
    
    private final void getData() {
    }
    
    private final void setTouchHelper(java.util.List<com.salampakistan.model.WishList> plans) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentPlanningBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public PlanningFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/planning/PlanningFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/planning/PlanningFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.planning.PlanningFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}