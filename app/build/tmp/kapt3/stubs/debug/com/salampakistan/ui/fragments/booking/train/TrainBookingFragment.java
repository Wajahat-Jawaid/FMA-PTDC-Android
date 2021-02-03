package com.salampakistan.ui.fragments.booking.train;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/train/TrainBookingFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentTrainBookingBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "viewModel", "Lcom/salampakistan/ui/fragments/booking/train/TrainBookingViewModel;", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onDoneBtnClicked", "", "onLocationFieldClicked", "direction", "Lcom/salampakistan/model/enums/TripDirection;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class TrainBookingFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentTrainBookingBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel viewModel;
    public static final com.salampakistan.ui.fragments.booking.train.TrainBookingFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onDoneBtnClicked() {
    }
    
    public final void onLocationFieldClicked(@org.jetbrains.annotations.NotNull()
    com.salampakistan.model.enums.TripDirection direction) {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentTrainBookingBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public TrainBookingFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/train/TrainBookingFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/booking/train/TrainBookingFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.booking.train.TrainBookingFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}