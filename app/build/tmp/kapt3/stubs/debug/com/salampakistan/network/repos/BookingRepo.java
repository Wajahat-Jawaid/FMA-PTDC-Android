package com.salampakistan.network.repos;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u0006JY\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/salampakistan/network/repos/BookingRepo;", "Lcom/salampakistan/network/repos/BaseRepo;", "service", "Lcom/salampakistan/network/WebService;", "(Lcom/salampakistan/network/WebService;)V", "getBusServices", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/getbusservicesreponse/GetBusServicesResponse;", "originCity", "", "destinationCity", "serviceName", "getDestinationCities", "Lcom/salampakistan/model/getBusDestinationCities/GetBusDestinationCitiesResponse;", "", "serviceId", "getOriginCities", "Lcom/salampakistan/model/getbusdeparturecities/GetBusDepartureCityResponse;", "getTransportServices", "Lcom/salampakistan/model/transportservicesresponse/GetTransportServicesResponse;", "searchHotels", "Lcom/salampakistan/model/hotelsearchresponse/HotelSearchResponse;", "city", "departDate", "returnDate", "noOfAdults", "noOfChilderns", "noOfInfants", "noOfRooms", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;)Landroidx/lifecycle/LiveData;", "app_debug"})
@javax.inject.Singleton()
public final class BookingRepo extends com.salampakistan.network.repos.BaseRepo {
    private final com.salampakistan.network.WebService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.hotelsearchresponse.HotelSearchResponse>> searchHotels(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String departDate, @org.jetbrains.annotations.NotNull()
    java.lang.String returnDate, int noOfAdults, int noOfChilderns, int noOfInfants, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfRooms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.transportservicesresponse.GetTransportServicesResponse>> getTransportServices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.getbusdeparturecities.GetBusDepartureCityResponse>> getOriginCities(int serviceId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.getBusDestinationCities.GetBusDestinationCitiesResponse>> getDestinationCities(int originCity, int serviceId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salampakistan.network.Result<com.salampakistan.model.getbusservicesreponse.GetBusServicesResponse>> getBusServices(@org.jetbrains.annotations.NotNull()
    java.lang.String originCity, @org.jetbrains.annotations.NotNull()
    java.lang.String destinationCity, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceName) {
        return null;
    }
    
    @javax.inject.Inject()
    public BookingRepo(@org.jetbrains.annotations.NotNull()
    com.salampakistan.network.WebService service) {
        super();
    }
}