package com.salampakistan.ui.fragments.home;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/salampakistan/ui/fragments/home/HomeViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "app", "Landroid/app/Application;", "tripsRepo", "Lcom/salampakistan/network/repos/TripsRepo;", "fmaRepo", "Lcom/salampakistan/network/repos/fma/FMARepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/TripsRepo;Lcom/salampakistan/network/repos/fma/FMARepo;)V", "events", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/GetTripsResponse;", "getEvents", "()Landroidx/lifecycle/LiveData;", "expertTips", "Lcom/salampakistan/model/response/GetCategoryBlogsResponse;", "getExpertTips", "locations", "Lcom/salampakistan/model/response/GetLocationsResponse;", "getLocations", "tripsUCantMiss", "Lcom/salampakistan/model/response/GetActivitiesResponse;", "getTripsUCantMiss", "app_debug"})
public final class HomeViewModel extends com.salampakistan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> locations = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetActivitiesResponse>> tripsUCantMiss = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetTripsResponse>> events = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetCategoryBlogsResponse>> expertTips = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> getLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetActivitiesResponse>> getTripsUCantMiss() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetTripsResponse>> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetCategoryBlogsResponse>> getExpertTips() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.TripsRepo tripsRepo, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.fma.FMARepo fmaRepo) {
        super(null);
    }
}