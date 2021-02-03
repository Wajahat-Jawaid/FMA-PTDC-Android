package com.salampakistan.ui.fragments.booking.hotel.bookingdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/bookingdetails/HotelBookingDetailsFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentHotelBookingDetailsBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "adult", "", "amenitiesAdapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowAmenitiesBinding;", "", "binding", "child", "city", "endDate", "hotelName", "room", "startDate", "viewModel", "Lcom/salampakistan/ui/fragments/booking/hotel/bookingdetails/HotelBookingDetailsViewModel;", "getViewId", "handleArguments", "", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "setView", "Companion", "app_debug"})
public final class HotelBookingDetailsFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentHotelBookingDetailsBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsViewModel viewModel;
    private com.salampakistan.databinding.FragmentHotelBookingDetailsBinding binding;
    private java.lang.String city;
    private java.lang.String startDate;
    private java.lang.String endDate;
    private java.lang.String hotelName;
    private int adult;
    private int child;
    private int room;
    private com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowAmenitiesBinding, java.lang.String> amenitiesAdapter;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CITY = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String HOTELNAME = null;
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
    public static final com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setView() {
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
    public com.salampakistan.databinding.FragmentHotelBookingDetailsBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public HotelBookingDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/bookingdetails/HotelBookingDetailsFragment$Companion;", "", "()V", "ADULT", "", "getADULT", "()Ljava/lang/String;", "CHILD", "getCHILD", "CITY", "getCITY", "ENDDATE", "getENDDATE", "HOTELNAME", "getHOTELNAME", "ROOMS", "getROOMS", "STARTDATE", "getSTARTDATE", "TAG", "newInstance", "Lcom/salampakistan/ui/fragments/booking/hotel/bookingdetails/HotelBookingDetailsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCITY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHOTELNAME() {
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
        public final com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}