package com.salampakistan.ui.fragments.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/salampakistan/ui/fragments/event/EventListFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentEventListBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "binding", "eventListAdapter", "Lcom/salampakistan/ui/adapters/EventsListAdapter;", "Lcom/salampakistan/databinding/RowEventBinding;", "Lcom/salampakistan/model/event/Event;", "featuredEventAdapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowFeaturedEventBinding;", "viewModel", "Lcom/salampakistan/ui/fragments/event/EventListViewModel;", "getData", "", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setview", "Companion", "app_debug"})
public final class EventListFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentEventListBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.event.EventListViewModel viewModel;
    private com.salampakistan.databinding.FragmentEventListBinding binding;
    private com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowFeaturedEventBinding, com.salampakistan.model.event.Event> featuredEventAdapter;
    private com.salampakistan.ui.adapters.EventsListAdapter<com.salampakistan.databinding.RowEventBinding, com.salampakistan.model.event.Event> eventListAdapter;
    public static final com.salampakistan.ui.fragments.event.EventListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getData() {
    }
    
    private final void setview() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentEventListBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public EventListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/event/EventListFragment$Companion;", "", "()V", "newInstance", "Lcom/salampakistan/ui/fragments/event/EventListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.event.EventListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}