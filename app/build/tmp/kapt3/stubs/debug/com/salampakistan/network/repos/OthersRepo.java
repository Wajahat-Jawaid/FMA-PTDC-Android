package com.salampakistan.network.repos;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/salampakistan/network/repos/OthersRepo;", "Lcom/salampakistan/network/repos/BaseRepo;", "service", "Lcom/salampakistan/network/WebService;", "(Lcom/salampakistan/network/WebService;)V", "getCurrencies", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/GetCurrenciesResponse;", "getVisaStatuses", "Lcom/salampakistan/model/response/GetVisaStatusResponse;", "app_debug"})
@javax.inject.Singleton()
public final class OthersRepo extends com.salampakistan.network.repos.BaseRepo {
    private final com.salampakistan.network.WebService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetCurrenciesResponse>> getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetVisaStatusResponse>> getVisaStatuses() {
        return null;
    }
    
    @javax.inject.Inject()
    public OthersRepo(@org.jetbrains.annotations.NotNull()
    com.salampakistan.network.WebService service) {
        super();
    }
}