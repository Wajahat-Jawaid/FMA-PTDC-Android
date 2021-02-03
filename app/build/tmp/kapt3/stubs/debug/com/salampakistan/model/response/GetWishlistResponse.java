package com.salampakistan.model.response;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/salampakistan/model/response/GetWishlistResponse;", "", "()V", "data", "Lcom/salampakistan/model/response/GetWishlistResponse$Data;", "getData", "()Lcom/salampakistan/model/response/GetWishlistResponse$Data;", "Data", "app_debug"})
public final class GetWishlistResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final com.salampakistan.model.response.GetWishlistResponse.Data data = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.salampakistan.model.response.GetWishlistResponse.Data getData() {
        return null;
    }
    
    public GetWishlistResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/salampakistan/model/response/GetWishlistResponse$Data;", "", "()V", "activities", "", "Lcom/salampakistan/model/Activity;", "getActivities", "()Ljava/util/List;", "locations", "Lcom/salampakistan/model/Location;", "getLocations", "app_debug"})
    public static final class Data {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.salampakistan.model.Location> locations = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.salampakistan.model.Activity> activities = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.salampakistan.model.Location> getLocations() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.salampakistan.model.Activity> getActivities() {
            return null;
        }
        
        public Data() {
            super();
        }
    }
}