package com.salampakistan.ui.fragments.booking.hotel.hotellist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0004JO\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0015H\u0002J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010 H\u0016J\u0006\u0010\'\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/hotellist/HotelListFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentHotelListBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "adapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowHotelListBinding;", "Lcom/salampakistan/model/hotelsearchresponse/Hotel;", "adult", "", "binding", "child", "city", "", "endDate", "room", "startDate", "viewModel", "Lcom/salampakistan/ui/fragments/booking/hotel/hotellist/HotelListViewModel;", "getData", "", "departDate", "returnDate", "noOfAdults", "noOfChilderns", "noOfInfants", "noOfRooms", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;)V", "getViewId", "handleArguments", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "launchSort", "onViewCreated", "savedInstanceState", "setView", "Companion", "app_debug"})
public final class HotelListFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentHotelListBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListViewModel viewModel;
    private com.salampakistan.databinding.FragmentHotelListBinding binding;
    private com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowHotelListBinding, com.salampakistan.model.hotelsearchresponse.Hotel> adapter;
    private java.lang.String city;
    private java.lang.String startDate;
    private java.lang.String endDate;
    private int adult;
    private int child;
    private int room;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CITY = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STARTDATE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ENDDATE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ADULT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHILD = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ROOMS = null;
    public static final com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void launchSort() {
    }
    
    public final void setView() {
    }
    
    private final void getData(java.lang.String city, java.lang.String departDate, java.lang.String returnDate, int noOfAdults, int noOfChilderns, int noOfInfants, java.lang.Integer noOfRooms) {
    }
    
    @java.lang.Override()
    public void handleArguments(@org.jetbrains.annotations.NotNull()
    android.os.Bundle arguments) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentHotelListBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public HotelListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/hotellist/HotelListFragment$Companion;", "", "()V", "ADULT", "", "getADULT", "()Ljava/lang/String;", "CHILD", "getCHILD", "CITY", "getCITY", "ENDDATE", "getENDDATE", "ROOMS", "getROOMS", "STARTDATE", "getSTARTDATE", "TAG", "newInstance", "Lcom/salampakistan/ui/fragments/booking/hotel/hotellist/HotelListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCITY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSTARTDATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getENDDATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getADULT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCHILD() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getROOMS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}