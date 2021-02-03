package com.salampakistan.ui.fragments.booking.bus.buslist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/bus/buslist/BusListFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentBusListBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "busListAdapter", "Lcom/salampakistan/ui/adapters/BusListAdapter;", "Lcom/salampakistan/databinding/RowBusBinding;", "Lcom/salampakistan/model/getbusservicesreponse/Data;", "date", "", "destinationLongText", "destinationShotText", "originLongText", "originShotText", "serviceName", "viewModel", "Lcom/salampakistan/ui/fragments/booking/bus/buslist/BusListViewModel;", "getData", "", "getViewId", "", "handleArguments", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "setView", "Companion", "app_debug"})
public final class BusListFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentBusListBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.booking.bus.buslist.BusListViewModel viewModel;
    private com.salampakistan.databinding.FragmentBusListBinding binding;
    private com.salampakistan.ui.adapters.BusListAdapter<com.salampakistan.databinding.RowBusBinding, com.salampakistan.model.getbusservicesreponse.Data> busListAdapter;
    private java.lang.String serviceName;
    private java.lang.String destinationLongText;
    private java.lang.String destinationShotText;
    private java.lang.String originLongText;
    private java.lang.String originShotText;
    private java.lang.String date;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SERVICENAME = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DESTINATIONLOGN = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DESTINATIONSHORT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ORIGINLONG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ORIGINSHORT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATE = null;
    public static final com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment.Companion Companion = null;
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
    
    private final void getData() {
    }
    
    private final void setView() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentBusListBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public BusListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/bus/buslist/BusListFragment$Companion;", "", "()V", "DATE", "", "getDATE", "()Ljava/lang/String;", "DESTINATIONLOGN", "getDESTINATIONLOGN", "DESTINATIONSHORT", "getDESTINATIONSHORT", "ORIGINLONG", "getORIGINLONG", "ORIGINSHORT", "getORIGINSHORT", "SERVICENAME", "getSERVICENAME", "TAG", "newInstance", "Lcom/salampakistan/ui/fragments/booking/bus/buslist/BusListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVICENAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDESTINATIONLOGN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDESTINATIONSHORT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getORIGINLONG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getORIGINSHORT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}