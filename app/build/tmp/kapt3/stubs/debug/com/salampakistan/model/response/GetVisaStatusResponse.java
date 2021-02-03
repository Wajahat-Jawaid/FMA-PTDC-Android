package com.salampakistan.model.response;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/salampakistan/model/response/GetVisaStatusResponse;", "", "()V", "statuses", "", "Lcom/salampakistan/model/CountryVisaStatus;", "getStatuses", "()Ljava/util/List;", "app_debug"})
public final class GetVisaStatusResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.List<com.salampakistan.model.CountryVisaStatus> statuses = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.salampakistan.model.CountryVisaStatus> getStatuses() {
        return null;
    }
    
    public GetVisaStatusResponse() {
        super();
    }
}