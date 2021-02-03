package com.salampakistan.ui.fragments.booking.hotel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ3\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140%2\u0006\u0010&\u001a\u00020\u001bH\u0002\u00a2\u0006\u0002\u0010\'J\u0012\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00101\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/HotelListFilter;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "appliedFiltersData", "Lcom/salampakistan/model/AppliedFilterHotel;", "binding", "Lcom/salampakistan/databinding/SortBottomSheetBinding;", "getBinding", "()Lcom/salampakistan/databinding/SortBottomSheetBinding;", "setBinding", "(Lcom/salampakistan/databinding/SortBottomSheetBinding;)V", "filtersAppliedSubjecthotel", "Lrx/subjects/PublishSubject;", "getFiltersAppliedSubjecthotel", "()Lrx/subjects/PublishSubject;", "filtersClearedSubject", "Ljava/lang/Void;", "getFiltersClearedSubject", "starArray", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getStarArray", "()Ljava/util/ArrayList;", "setStarArray", "(Ljava/util/ArrayList;)V", "starChipClickListener", "Lcom/adroitandroid/chipcloud/ChipListener;", "applyFilters", "", "clearFilters", "generateChipCloud", "cloud", "Lcom/adroitandroid/chipcloud/ChipCloud;", "mode", "Lcom/adroitandroid/chipcloud/ChipCloud$Mode;", "strList", "", "chipListener", "(Lcom/adroitandroid/chipcloud/ChipCloud;Lcom/adroitandroid/chipcloud/ChipCloud$Mode;[Ljava/lang/String;Lcom/adroitandroid/chipcloud/ChipListener;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setView", "Companion", "app_debug"})
public final class HotelListFilter extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<java.lang.String> starArray;
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.databinding.SortBottomSheetBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final rx.subjects.PublishSubject<com.salampakistan.model.AppliedFilterHotel> filtersAppliedSubjecthotel = null;
    @org.jetbrains.annotations.NotNull()
    private final rx.subjects.PublishSubject<java.lang.Void> filtersClearedSubject = null;
    private com.salampakistan.model.AppliedFilterHotel appliedFiltersData;
    private final com.adroitandroid.chipcloud.ChipListener starChipClickListener = null;
    private static final java.lang.String TAG = null;
    public static final com.salampakistan.ui.fragments.booking.hotel.HotelListFilter.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getStarArray() {
        return null;
    }
    
    public final void setStarArray(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.databinding.SortBottomSheetBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.salampakistan.databinding.SortBottomSheetBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.subjects.PublishSubject<com.salampakistan.model.AppliedFilterHotel> getFiltersAppliedSubjecthotel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.subjects.PublishSubject<java.lang.Void> getFiltersClearedSubject() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setView() {
    }
    
    private final void generateChipCloud(com.adroitandroid.chipcloud.ChipCloud cloud, com.adroitandroid.chipcloud.ChipCloud.Mode mode, java.lang.String[] strList, com.adroitandroid.chipcloud.ChipListener chipListener) {
    }
    
    public final void applyFilters() {
    }
    
    public final void clearFilters() {
    }
    
    public HotelListFilter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/HotelListFilter$Companion;", "", "()V", "TAG", "", "getInstance", "Lcom/salampakistan/ui/fragments/booking/hotel/HotelListFilter;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.booking.hotel.HotelListFilter getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}