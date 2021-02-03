package com.salampakistan.ui.fragments.event.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\u0015H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/salampakistan/ui/fragments/event/detail/EventDetailsFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentEventDetailsBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "arrList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "binding", "eventAdapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowRelatedEventBinding;", "Lcom/salampakistan/model/event/Event;", "eventId", "", "fragment", "Lcom/salampakistan/ui/fragments/ImageCarouselFragment;", "viewModel", "Lcom/salampakistan/ui/fragments/event/detail/EventDetailsViewModel;", "addImagesFragment", "", "getData", "id", "getRelatedEvents", "getViewId", "", "handleArguments", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "setView", "Companion", "app_debug"})
public final class EventDetailsFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentEventDetailsBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.event.detail.EventDetailsViewModel viewModel;
    private com.salampakistan.databinding.FragmentEventDetailsBinding binding;
    private com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowRelatedEventBinding, com.salampakistan.model.event.Event> eventAdapter;
    private com.salampakistan.ui.fragments.ImageCarouselFragment fragment;
    private java.util.ArrayList<java.lang.Object> arrList;
    private java.lang.String eventId;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EVENTID = null;
    public static final com.salampakistan.ui.fragments.event.detail.EventDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getRelatedEvents() {
    }
    
    private final void getData(java.lang.String id) {
    }
    
    private final void addImagesFragment() {
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
    public com.salampakistan.databinding.FragmentEventDetailsBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public EventDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/salampakistan/ui/fragments/event/detail/EventDetailsFragment$Companion;", "", "()V", "EVENTID", "", "getEVENTID", "()Ljava/lang/String;", "TAG", "newInstance", "Lcom/salampakistan/ui/fragments/event/detail/EventDetailsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEVENTID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.event.detail.EventDetailsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}