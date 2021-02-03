package com.salampakistan.ui.fragments.home.seasonexperiences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\u0006\u0010\u0012\u001a\u00020\fJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\b2\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/salampakistan/ui/fragments/home/seasonexperiences/SeasonViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "app", "Landroid/app/Application;", "repo", "Lcom/salampakistan/network/repos/openweather/SeasonRepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/openweather/SeasonRepo;)V", "getAllSeasons", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/seasons/FetchAllSeasonsResponse;", "search", "", "pageSize", "", "skip", "getFestivalBySeasonId", "Lcom/salampakistan/model/seasons/festival/GetFestivalBySeasonIdResponse;", "seasonId", "getSeasonById", "Lcom/salampakistan/model/seasons/seasonbyid/FetchSeasonByIdResponse;", "app_debug"})
public final class SeasonViewModel extends com.salampakistan.base.BaseViewModel {
    private final com.salampakistan.network.repos.openweather.SeasonRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.seasons.FetchAllSeasonsResponse>> getAllSeasons(@org.jetbrains.annotations.Nullable()
    java.lang.String search, int pageSize, int skip) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.seasons.seasonbyid.FetchSeasonByIdResponse>> getSeasonById(@org.jetbrains.annotations.NotNull()
    java.lang.String seasonId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.seasons.festival.GetFestivalBySeasonIdResponse>> getFestivalBySeasonId(@org.jetbrains.annotations.NotNull()
    java.lang.String seasonId) {
        return null;
    }
    
    @javax.inject.Inject()
    public SeasonViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.openweather.SeasonRepo repo) {
        super(null);
    }
}