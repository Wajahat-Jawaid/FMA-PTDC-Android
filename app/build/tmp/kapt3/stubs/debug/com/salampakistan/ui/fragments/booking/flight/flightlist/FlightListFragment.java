package com.salampakistan.ui.fragments.booking.flight.flightlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/flight/flightlist/FlightListFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentFlightListBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "flightListAdapter", "Lcom/salampakistan/ui/adapters/FlightListAdapter;", "Lcom/salampakistan/databinding/RowFlightBinding;", "", "viewModel", "Lcom/salampakistan/ui/fragments/booking/flight/flightlist/FlightListViewModel;", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "setView", "Companion", "app_debug"})
public final class FlightListFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentFlightListBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListViewModel viewModel;
    private com.salampakistan.databinding.FragmentFlightListBinding binding;
    private com.salampakistan.ui.adapters.FlightListAdapter<com.salampakistan.databinding.RowFlightBinding, java.lang.String> flightListAdapter;
    public static final com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setView() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentFlightListBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public FlightListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/flight/flightlist/FlightListFragment$Companion;", "", "()V", "newInstance", "Lcom/salampakistan/ui/fragments/booking/flight/flightlist/FlightListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}