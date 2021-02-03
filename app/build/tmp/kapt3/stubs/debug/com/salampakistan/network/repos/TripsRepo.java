package com.salampakistan.network.repos;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u0006J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\u0006\u0010\u0012\u001a\u00020\nJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u0006J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nJ\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u00062\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00070\u00062\u0006\u0010\u001e\u001a\u00020\nJ\"\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u0006J\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00070\u00062\u0006\u0010\'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00070\u00062\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\nJ\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u0006J\"\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\"\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010/\u001a\u000200J\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\"\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\"\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/salampakistan/network/repos/TripsRepo;", "Lcom/salampakistan/network/repos/BaseRepo;", "service", "Lcom/salampakistan/network/WebService;", "(Lcom/salampakistan/network/WebService;)V", "addActivityToWishList", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/response/SimpleApiResponse;", "token", "", "id", "addLocationToPlan", "addLocationToWishlist", "getActivities", "Lcom/salampakistan/model/response/GetActivitiesResponse;", "getLocationDetails", "Lcom/salampakistan/model/response/GetLocationDetailsResponse;", "slug", "getLocations", "Lcom/salampakistan/model/mapLocationResponse/MapLocationResponse;", "getLocationsCategoryListing", "Lcom/salampakistan/model/response/GetLocationsResponse;", "pageSize", "", "getLocationsForActivity", "catId", "getLocationsForCategory", "getPOIPlaces", "Lcom/salampakistan/model/response/getpoiresponse/GetPOIPlacesResponse;", "coordinates", "typeKey", "getPOIs", "Lcom/salampakistan/model/response/GetPOIsResponse;", "getPlans", "Lcom/salampakistan/model/response/GetPlansResponse;", "getRelatedLocations", "getReviews", "Lcom/salampakistan/model/response/getreviewsresponse/GetReviewsResponse;", "userId", "getTripDetails", "Lcom/salampakistan/model/response/TripDetailsResponse;", "autoId", "trimmedSlug", "getTripsUCantMiss", "getWishlist", "Lcom/salampakistan/model/response/GetWishlistResponse;", "postReview", "Lcom/salampakistan/model/PostReview;", "removeActivityFromWishlist", "removeLocationFromPlan", "removeLocationFromWishlist", "app_debug"})
@javax.inject.Singleton()
public final class TripsRepo extends com.salampakistan.network.repos.BaseRepo {
    private final com.salampakistan.network.WebService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> getLocationsCategoryListing(int pageSize) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> getLocationsForCategory(@org.jetbrains.annotations.Nullable()
    java.lang.String catId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.mapLocationResponse.MapLocationResponse>> getLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationsResponse>> getLocationsForActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String catId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetLocationDetailsResponse>> getLocationDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.mapLocationResponse.MapLocationResponse>> getRelatedLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetPOIsResponse>> getPOIs(@org.jetbrains.annotations.NotNull()
    java.lang.String coordinates) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.getpoiresponse.GetPOIPlacesResponse>> getPOIPlaces(@org.jetbrains.annotations.NotNull()
    java.lang.String coordinates, @org.jetbrains.annotations.NotNull()
    java.lang.String typeKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> addActivityToWishList(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> addLocationToWishlist(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> addLocationToPlan(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> removeLocationFromPlan(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetActivitiesResponse>> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetActivitiesResponse>> getTripsUCantMiss() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.getreviewsresponse.GetReviewsResponse>> getReviews(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetWishlistResponse>> getWishlist(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.GetPlansResponse>> getPlans(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> removeLocationFromWishlist(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> removeActivityFromWishlist(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.SimpleApiResponse>> postReview(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.PostReview postReview) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.response.TripDetailsResponse>> getTripDetails(int autoId, @org.jetbrains.annotations.NotNull()
    java.lang.String trimmedSlug) {
        return null;
    }
    
    @javax.inject.Inject()
    public TripsRepo(@org.jetbrains.annotations.NotNull()
    com.salampakistan.network.WebService service) {
        super();
    }
}