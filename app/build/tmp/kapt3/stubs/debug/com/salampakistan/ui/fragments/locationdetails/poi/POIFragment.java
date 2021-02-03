package com.salampakistan.ui.fragments.locationdetails.poi;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010&\u001a\u00020\u0019H\u0002J\u0006\u0010\'\u001a\u00020\u0019J\u0016\u0010(\u001a\u00020\u00192\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/salampakistan/ui/fragments/locationdetails/poi/POIFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentPoiBinding;", "Lcom/salampakistan/dagger/Injectable;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "LOCATION_PERMISSION", "", "binding", "coordinates", "", "locationName", "", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/salampakistan/ui/custom/CustomSupportMapFragment;", "selectedPOI", "Lcom/salampakistan/model/POI;", "surroundings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "viewModel", "Lcom/salampakistan/ui/fragments/locationdetails/poi/POIViewModel;", "getPOIPlaces", "", "typeKey", "getViewId", "handleArguments", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onMapReady", "p0", "onViewCreated", "savedInstanceState", "setUpMap", "showPOIsPopup", "updateLocationUI", "data", "", "Lcom/salampakistan/model/response/getpoiresponse/Data;", "updateSelectedPOIText", "Companion", "app_debug"})
public final class POIFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentPoiBinding> implements com.salampakistan.dagger.Injectable, com.google.android.gms.maps.OnMapReadyCallback {
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.salampakistan.ui.fragments.locationdetails.poi.POIViewModel viewModel;
    private com.salampakistan.databinding.FragmentPoiBinding binding;
    private java.util.ArrayList<com.salampakistan.model.POI> surroundings;
    private float[] coordinates;
    private java.lang.String locationName;
    private com.salampakistan.model.POI selectedPOI;
    private final int LOCATION_PERMISSION = 101;
    private com.salampakistan.ui.custom.CustomSupportMapFragment mapFragment;
    private static final java.lang.String TAG = null;
    private static final java.lang.String SURROUNDINGS = null;
    private static final java.lang.String LOCATIONNAME = null;
    private static final java.lang.String COORDINATES = null;
    public static final com.salampakistan.ui.fragments.locationdetails.poi.POIFragment.Companion Companion = null;
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
    
    public final void showPOIsPopup() {
    }
    
    private final void getPOIPlaces(float[] coordinates, java.lang.String typeKey) {
    }
    
    private final void updateSelectedPOIText() {
    }
    
    private final void setUpMap() {
    }
    
    private final void updateLocationUI(java.util.List<com.salampakistan.model.response.getpoiresponse.Data> data) {
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
    public com.salampakistan.databinding.FragmentPoiBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public POIFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/salampakistan/ui/fragments/locationdetails/poi/POIFragment$Companion;", "", "()V", "COORDINATES", "", "LOCATIONNAME", "SURROUNDINGS", "TAG", "getInstance", "Lcom/salampakistan/ui/fragments/locationdetails/poi/POIFragment;", "locationName", "surroundings", "Ljava/util/ArrayList;", "Lcom/salampakistan/model/POI;", "Lkotlin/collections/ArrayList;", "coordinates", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.locationdetails.poi.POIFragment getInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String locationName, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.salampakistan.model.POI> surroundings, @org.jetbrains.annotations.Nullable()
        float[] coordinates) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}