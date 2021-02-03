package com.salampakistan.network.fma;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/salampakistan/network/fma/FMAWebService;", "", "getCategoryBlogs", "Lretrofit2/Response;", "Lcom/salampakistan/model/response/GetCategoryBlogsResponse;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEventDetails", "Lcom/salampakistan/model/response/TripDetailsResponse;", "id", "", "trimmedSlug", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrips", "Lcom/salampakistan/model/response/GetTripsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface FMAWebService {
    public static final com.salampakistan.network.fma.FMAWebService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://www.findmyadventure.pk/api/";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "blog/blogCategory")
    public abstract java.lang.Object getCategoryBlogs(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "blogCategory")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.salampakistan.model.response.GetCategoryBlogsResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/events/search?durationFrom=1&durationTo=3&dateFrom=2020-10-21&dateTo=2021-03-20&eventType=fma&isDomestic=true&country=PK&pageSize=4")
    public abstract java.lang.Object getTrips(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.salampakistan.model.response.GetTripsResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/events/")
    public abstract java.lang.Object getEventDetails(@retrofit2.http.Query(value = "autoId")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "trimmedSlug")
    java.lang.String trimmedSlug, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.salampakistan.model.response.TripDetailsResponse>> p2);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/network/fma/FMAWebService$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://www.findmyadventure.pk/api/";
        
        private Companion() {
            super();
        }
    }
}