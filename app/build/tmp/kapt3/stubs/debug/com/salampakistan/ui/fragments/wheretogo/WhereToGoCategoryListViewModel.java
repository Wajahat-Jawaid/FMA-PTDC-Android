package com.salampakistan.ui.fragments.wheretogo;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00112\u0006\u0010\u0012\u001a\u00020\u0013R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoCategoryListViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "app", "Landroid/app/Application;", "repo", "Lcom/salampakistan/network/repos/TripsRepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/TripsRepo;)V", "categoryLocations", "Landroidx/lifecycle/MutableLiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/GetLocationsResponse;", "getCategoryLocations", "()Landroidx/lifecycle/MutableLiveData;", "setCategoryLocations", "(Landroidx/lifecycle/MutableLiveData;)V", "getRepo", "()Lcom/salampakistan/network/repos/TripsRepo;", "Landroidx/lifecycle/LiveData;", "categoryId", "", "app_debug"})
public final class WhereToGoCategoryListViewModel extends com.salampakistan.base.BaseViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> categoryLocations;
    @org.jetbrains.annotations.NotNull()
    private final com.salampakistan.network.repos.TripsRepo repo = null;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> getCategoryLocations() {
        return null;
    }
    
    public final void setCategoryLocations(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> getCategoryLocations(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.network.repos.TripsRepo getRepo() {
        return null;
    }
    
    @javax.inject.Inject()
    public WhereToGoCategoryListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.TripsRepo repo) {
        super(null);
    }
}