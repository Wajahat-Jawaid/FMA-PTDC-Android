package com.salampakistan.ui.fragments.tripdetails;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u001bH\u0016J\b\u0010\'\u001a\u00020\u0013H\u0016J\u001a\u0010(\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016J\u0006\u0010*\u001a\u00020\u0013J\u0006\u0010+\u001a\u00020\u0013J\b\u0010,\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/salampakistan/ui/fragments/tripdetails/TripDetailsFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentTripDetailsBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "fragment", "Lcom/salampakistan/ui/fragments/ImageCarouselFragment;", "trip", "Landroidx/lifecycle/MutableLiveData;", "Lcom/salampakistan/model/Trip;", "tripArguments", "getTripArguments", "()Lcom/salampakistan/model/Trip;", "setTripArguments", "(Lcom/salampakistan/model/Trip;)V", "viewModel", "Lcom/salampakistan/ui/fragments/tripdetails/TripDetailsViewModel;", "addImagesFragment", "", "addItinerariesFragment", "addToPlan", "addToWishList", "fetchPlans", "fetchWishList", "getData", "getFacilityView", "Landroid/view/View;", "parentView", "Landroid/view/ViewGroup;", "text", "", "getViewId", "", "handleArguments", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "onDestroy", "onViewCreated", "savedInstanceState", "removeFromPlan", "removeFromWishList", "setFacilities", "Companion", "app_debug"})
public final class TripDetailsFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentTripDetailsBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.databinding.FragmentTripDetailsBinding binding;
    private com.salampakistan.ui.fragments.tripdetails.TripDetailsViewModel viewModel;
    private final androidx.lifecycle.MutableLiveData<com.salampakistan.model.Trip> trip = null;
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.model.Trip tripArguments;
    private com.salampakistan.ui.fragments.ImageCarouselFragment fragment;
    private static final java.lang.String TAG = null;
    private static final java.lang.String EVENT = null;
    public static final com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.Trip getTripArguments() {
        return null;
    }
    
    public final void setTripArguments(@org.jetbrains.annotations.NotNull()
    com.salampakistan.model.Trip p0) {
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
    
    private final void getData() {
    }
    
    public final void removeFromPlan() {
    }
    
    public final void addToWishList() {
    }
    
    public final void removeFromWishList() {
    }
    
    public final void addToPlan() {
    }
    
    private final void fetchPlans() {
    }
    
    private final void fetchWishList() {
    }
    
    private final void addItinerariesFragment() {
    }
    
    private final void addImagesFragment() {
    }
    
    private final android.view.View getFacilityView(android.view.ViewGroup parentView, java.lang.String text) {
        return null;
    }
    
    private final void setFacilities() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentTripDetailsBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public TripDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/salampakistan/ui/fragments/tripdetails/TripDetailsFragment$Companion;", "", "()V", "EVENT", "", "TAG", "getInstance", "Lcom/salampakistan/ui/fragments/tripdetails/TripDetailsFragment;", "trip", "Lcom/salampakistan/model/Trip;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment getInstance(@org.jetbrains.annotations.NotNull()
        com.salampakistan.model.Trip trip) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}