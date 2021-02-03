package com.salampakistan.ui.fragments.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/salampakistan/ui/fragments/event/EventListViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "app", "Landroid/app/Application;", "repo", "Lcom/salampakistan/network/repos/EventRepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/EventRepo;)V", "getRepo", "()Lcom/salampakistan/network/repos/EventRepo;", "getEvents", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/event/GetEventsResponse;", "app_debug"})
public final class EventListViewModel extends com.salampakistan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.salampakistan.network.repos.EventRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.event.GetEventsResponse>> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.network.repos.EventRepo getRepo() {
        return null;
    }
    
    @javax.inject.Inject()
    public EventListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.EventRepo repo) {
        super(null);
    }
}