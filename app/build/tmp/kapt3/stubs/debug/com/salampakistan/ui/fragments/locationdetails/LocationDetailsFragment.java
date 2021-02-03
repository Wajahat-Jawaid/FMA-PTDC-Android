package com.salampakistan.ui.fragments.locationdetails;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020 2\u0006\u0010/\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010-H\u0016J\u0006\u00103\u001a\u00020 J\u0006\u00104\u001a\u00020 J\u000e\u00105\u001a\u00020 2\u0006\u00106\u001a\u000207J\b\u00108\u001a\u00020 H\u0002R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/salampakistan/ui/fragments/locationdetails/LocationDetailsFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentLocationDetailsBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "getBinding", "()Lcom/salampakistan/databinding/FragmentLocationDetailsBinding;", "setBinding", "(Lcom/salampakistan/databinding/FragmentLocationDetailsBinding;)V", "fragment", "Lcom/salampakistan/ui/fragments/ImageCarouselFragment;", "location", "Landroidx/lifecycle/MutableLiveData;", "Lcom/salampakistan/model/LocationDetails;", "locationId", "", "locationName", "locationSlug", "rating", "", "getRating", "()F", "setRating", "(F)V", "relatedLocationAdapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowRelatedLocationBinding;", "Lcom/salampakistan/model/mapLocationResponse/Data;", "viewModel", "Lcom/salampakistan/ui/fragments/locationdetails/LocationDetailsViewModel;", "addImagesFragment", "", "addPOIsFragment", "addToPlan", "addToWishList", "fetchPlans", "fetchWishList", "getData", "slug", "getRelatedLocationsData", "getViewId", "", "handleArguments", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "removeFromPlan", "removeFromWishList", "setScrollView", "set", "", "submitFeedback", "Companion", "app_debug"})
public final class LocationDetailsFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentLocationDetailsBinding> implements com.salampakistan.dagger.Injectable {
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.databinding.FragmentLocationDetailsBinding binding;
    private com.salampakistan.ui.fragments.locationdetails.LocationDetailsViewModel viewModel;
    private com.salampakistan.ui.fragments.ImageCarouselFragment fragment;
    private com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowRelatedLocationBinding, com.salampakistan.model.mapLocationResponse.Data> relatedLocationAdapter;
    private float rating;
    private final androidx.lifecycle.MutableLiveData<com.salampakistan.model.LocationDetails> location = null;
    private java.lang.String locationId;
    private java.lang.String locationName;
    private java.lang.String locationSlug;
    private static final java.lang.String TAG = null;
    public static final com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.databinding.FragmentLocationDetailsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.salampakistan.databinding.FragmentLocationDetailsBinding p0) {
    }
    
    public final float getRating() {
        return 0.0F;
    }
    
    public final void setRating(float p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchWishList() {
    }
    
    public final void removeFromPlan() {
    }
    
    private final void fetchPlans() {
    }
    
    @java.lang.Override()
    public void handleArguments(@org.jetbrains.annotations.NotNull()
    android.os.Bundle arguments) {
    }
    
    public final void setScrollView(boolean set) {
    }
    
    private final void submitFeedback() {
    }
    
    public final void addToWishList() {
    }
    
    public final void removeFromWishList() {
    }
    
    public final void addToPlan() {
    }
    
    private final void getData(java.lang.String slug) {
    }
    
    private final void getRelatedLocationsData() {
    }
    
    private final void addImagesFragment() {
    }
    
    private final void addPOIsFragment() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentLocationDetailsBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public LocationDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/salampakistan/ui/fragments/locationdetails/LocationDetailsFragment$Companion;", "", "()V", "TAG", "", "getInstance", "Lcom/salampakistan/ui/fragments/locationdetails/LocationDetailsFragment;", "location", "Lcom/salampakistan/model/Location;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment getInstance(@org.jetbrains.annotations.NotNull()
        com.salampakistan.model.Location location) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}