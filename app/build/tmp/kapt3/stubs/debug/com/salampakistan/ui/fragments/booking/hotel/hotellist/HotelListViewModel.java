package com.salampakistan.ui.fragments.booking.hotel.hotellist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JY\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010$\u001a\u00020\tR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/hotellist/HotelListViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "app", "Landroid/app/Application;", "repo", "Lcom/salampakistan/network/repos/BookingRepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/BookingRepo;)V", "appliedFiltersData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/salampakistan/model/AppliedFilterHotel;", "getAppliedFiltersData", "()Landroidx/lifecycle/MutableLiveData;", "setAppliedFiltersData", "(Landroidx/lifecycle/MutableLiveData;)V", "data", "", "Lcom/salampakistan/model/hotelsearchresponse/Hotel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "searchHotels", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/hotelsearchresponse/HotelSearchResponse;", "city", "", "departDate", "returnDate", "noOfAdults", "", "noOfChilderns", "noOfInfants", "noOfRooms", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;)Landroidx/lifecycle/LiveData;", "sortData", "filter", "app_debug"})
public final class HotelListViewModel extends com.salampakistan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.salampakistan.model.hotelsearchresponse.Hotel> data;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.salampakistan.model.AppliedFilterHotel> appliedFiltersData;
    private final com.salampakistan.network.repos.BookingRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.hotelsearchresponse.Hotel> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.hotelsearchresponse.Hotel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.hotelsearchresponse.HotelSearchResponse>> searchHotels(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String departDate, @org.jetbrains.annotations.NotNull()
    java.lang.String returnDate, int noOfAdults, int noOfChilderns, int noOfInfants, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfRooms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.salampakistan.model.AppliedFilterHotel> getAppliedFiltersData() {
        return null;
    }
    
    public final void setAppliedFiltersData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.salampakistan.model.AppliedFilterHotel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.hotelsearchresponse.Hotel> sortData(@org.jetbrains.annotations.NotNull()
    com.salampakistan.model.AppliedFilterHotel filter) {
        return null;
    }
    
    @javax.inject.Inject()
    public HotelListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.BookingRepo repo) {
        super(null);
    }
}