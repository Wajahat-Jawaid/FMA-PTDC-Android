package com.salampakistan.ui.fragments.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010%\u001a\u00020&H\u0002J\n\u0010\'\u001a\u0004\u0018\u00010(H\u0002J&\u0010)\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010*\u001a\u00020+H\u0016J\u001b\u0010,\u001a\u00020&2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002\u00a2\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u00020&2\b\u00105\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u00106\u001a\u00020&2\u0006\u00102\u001a\u0002032\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020&H\u0002J\b\u0010:\u001a\u00020&H\u0002J\b\u0010;\u001a\u00020&H\u0002J.\u0010<\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/salampakistan/ui/fragments/map/MapFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentMapBinding;", "Lcom/salampakistan/dagger/Injectable;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "adapter", "Lcom/salampakistan/ui/adapters/MapPOIListAdapter;", "Lcom/salampakistan/databinding/RowMapPoiBinding;", "Lcom/salampakistan/model/mapLocationResponse/Surrounding;", "getAdapter", "()Lcom/salampakistan/ui/adapters/MapPOIListAdapter;", "setAdapter", "(Lcom/salampakistan/ui/adapters/MapPOIListAdapter;)V", "binding", "coordinates", "", "", "getCoordinates", "()Ljava/util/List;", "setCoordinates", "(Ljava/util/List;)V", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/salampakistan/ui/custom/CustomSupportMapFragment;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "surrounding", "getSurrounding", "setSurrounding", "viewModel", "Lcom/salampakistan/ui/fragments/map/MapViewModel;", "getData", "", "getMarkerIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "getPOIData", "getViewId", "", "initiateLocationAutoCompleteAdapter", "cities", "", "Lcom/salampakistan/model/mapLocationResponse/Data;", "([Lcom/salampakistan/model/mapLocationResponse/Data;)V", "injectBinding", "view", "Landroid/view/View;", "onMapReady", "p0", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapterClick", "setUpMap", "setView", "updateLocationPOIOnMap", "data", "Lcom/salampakistan/model/response/getpoiresponse/Data;", "Companion", "app_debug"})
public final class MapFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentMapBinding> implements com.salampakistan.dagger.Injectable, com.google.android.gms.maps.OnMapReadyCallback {
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.salampakistan.ui.fragments.map.MapViewModel viewModel;
    private com.salampakistan.databinding.FragmentMapBinding binding;
    private com.salampakistan.ui.custom.CustomSupportMapFragment mapFragment;
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.ui.adapters.MapPOIListAdapter<com.salampakistan.databinding.RowMapPoiBinding, com.salampakistan.model.mapLocationResponse.Surrounding> adapter;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.salampakistan.model.mapLocationResponse.Surrounding> surrounding;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.Double> coordinates;
    public static final com.salampakistan.ui.fragments.map.MapFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.ui.adapters.MapPOIListAdapter<com.salampakistan.databinding.RowMapPoiBinding, com.salampakistan.model.mapLocationResponse.Surrounding> getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.adapters.MapPOIListAdapter<com.salampakistan.databinding.RowMapPoiBinding, com.salampakistan.model.mapLocationResponse.Surrounding> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.mapLocationResponse.Surrounding> getSurrounding() {
        return null;
    }
    
    public final void setSurrounding(@org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.mapLocationResponse.Surrounding> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> getCoordinates() {
        return null;
    }
    
    public final void setCoordinates(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setAdapterClick() {
    }
    
    private final void getData() {
    }
    
    private final void initiateLocationAutoCompleteAdapter(com.salampakistan.model.mapLocationResponse.Data[] cities) {
    }
    
    private final void getPOIData(java.lang.String name, com.salampakistan.model.mapLocationResponse.Surrounding surrounding, java.util.List<java.lang.Double> coordinates) {
    }
    
    private final void setView() {
    }
    
    private final void updateLocationPOIOnMap(java.lang.String name, java.util.List<com.salampakistan.model.response.getpoiresponse.Data> data, java.util.List<java.lang.Double> coordinates) {
    }
    
    private final com.google.android.gms.maps.model.BitmapDescriptor getMarkerIcon() {
        return null;
    }
    
    private final void setUpMap() {
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
    public com.salampakistan.databinding.FragmentMapBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public MapFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/map/MapFragment$Companion;", "", "()V", "newInstance", "Lcom/salampakistan/ui/fragments/map/MapFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.map.MapFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}