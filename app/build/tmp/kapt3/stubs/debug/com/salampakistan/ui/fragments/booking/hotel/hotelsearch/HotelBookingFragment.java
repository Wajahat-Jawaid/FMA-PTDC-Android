package com.salampakistan.ui.fragments.booking.hotel.hotelsearch;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/hotelsearch/HotelBookingFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentHotelBookingBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "viewModel", "Lcom/salampakistan/ui/fragments/booking/hotel/hotelsearch/HotelBookingViewModel;", "getAdultsCount", "", "getChildrenCount", "getRoomsCount", "getViewId", "injectBinding", "view", "Landroid/view/View;", "onDateFieldClicked", "", "check", "Lcom/salampakistan/model/enums/HotelCheck;", "onDoneBtnClicked", "onLocationFieldClicked", "onPause", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "setView", "Companion", "app_debug"})
public final class HotelBookingFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentHotelBookingBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.databinding.FragmentHotelBookingBinding binding;
    private com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel viewModel;
    public static final com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setView() {
    }
    
    private final int getAdultsCount() {
        return 0;
    }
    
    private final int getChildrenCount() {
        return 0;
    }
    
    private final int getRoomsCount() {
        return 0;
    }
    
    private final void setListeners() {
    }
    
    public final void onDoneBtnClicked() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public final void onLocationFieldClicked() {
    }
    
    public final void onDateFieldClicked(@org.jetbrains.annotations.NotNull()
    com.salampakistan.model.enums.HotelCheck check) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentHotelBookingBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public HotelBookingFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/hotel/hotelsearch/HotelBookingFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/booking/hotel/hotelsearch/HotelBookingFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}