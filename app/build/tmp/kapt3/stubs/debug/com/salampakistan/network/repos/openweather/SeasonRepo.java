package com.salampakistan.network.repos.openweather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00062\u0006\u0010\u0013\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/salampakistan/network/repos/openweather/SeasonRepo;", "Lcom/salampakistan/network/repos/BaseRepo;", "service", "Lcom/salampakistan/network/WebService;", "(Lcom/salampakistan/network/WebService;)V", "getAllSeasons", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/seasons/FetchAllSeasonsResponse;", "search", "", "pageSize", "", "skip", "getFestivalBySeasonId", "Lcom/salampakistan/model/seasons/festival/GetFestivalBySeasonIdResponse;", "seasonId", "getSeasonById", "Lcom/salampakistan/model/seasons/seasonbyid/FetchSeasonByIdResponse;", "url", "app_debug"})
@javax.inject.Singleton()
public final class SeasonRepo extends com.salampakistan.network.repos.BaseRepo {
    private final com.salampakistan.network.WebService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.seasons.FetchAllSeasonsResponse>> getAllSeasons(@org.jetbrains.annotations.Nullable()
    java.lang.String search, int pageSize, int skip) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.seasons.seasonbyid.FetchSeasonByIdResponse>> getSeasonById(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.seasons.festival.GetFestivalBySeasonIdResponse>> getFestivalBySeasonId(@org.jetbrains.annotations.NotNull()
    java.lang.String seasonId) {
        return null;
    }
    
    @javax.inject.Inject()
    public SeasonRepo(@org.jetbrains.annotations.NotNull()
    com.salampakistan.network.WebService service) {
        super();
    }
}