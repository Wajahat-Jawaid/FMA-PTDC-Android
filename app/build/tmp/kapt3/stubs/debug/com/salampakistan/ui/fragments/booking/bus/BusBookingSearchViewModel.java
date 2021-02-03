package com.salampakistan.ui.fragments.booking.bus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&J\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0#0\"2\u0006\u0010\'\u001a\u00020&J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0#0\"J\b\u0010,\u001a\u00020\u001eH\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006-"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/bus/BusBookingSearchViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "app", "Landroid/app/Application;", "repo", "Lcom/salampakistan/network/repos/BookingRepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/BookingRepo;)V", "arrivalLocation", "Landroidx/lifecycle/MutableLiveData;", "", "getArrivalLocation", "()Landroidx/lifecycle/MutableLiveData;", "date", "getDate", "departLocation", "getDepartLocation", "departureCitiesList", "", "Lcom/salampakistan/model/getbusdeparturecities/DepartureCity;", "getDepartureCitiesList", "destinationCitiesList", "Lcom/salampakistan/model/getBusDestinationCities/DestinationCity;", "getDestinationCitiesList", "services", "getServices", "servicesList", "Lcom/salampakistan/model/transportservicesresponse/Service;", "getServicesList", "valid", "Landroidx/lifecycle/MediatorLiveData;", "", "getValid", "()Landroidx/lifecycle/MediatorLiveData;", "getDestinationCities", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "Lcom/salampakistan/model/getBusDestinationCities/GetBusDestinationCitiesResponse;", "originCity", "", "serviceId", "getOriginCities", "Lcom/salampakistan/model/getbusdeparturecities/GetBusDepartureCityResponse;", "getTransportServices", "Lcom/salampakistan/model/transportservicesresponse/GetTransportServicesResponse;", "validate", "app_debug"})
public final class BusBookingSearchViewModel extends com.salampakistan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> departLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> arrivalLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> services = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> date = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.salampakistan.model.transportservicesresponse.Service>> servicesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.salampakistan.model.getbusdeparturecities.DepartureCity>> departureCitiesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.salampakistan.model.getBusDestinationCities.DestinationCity>> destinationCitiesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> valid = null;
    private final com.salampakistan.network.repos.BookingRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDepartLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getArrivalLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getServices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.salampakistan.model.transportservicesresponse.Service>> getServicesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.salampakistan.model.getbusdeparturecities.DepartureCity>> getDepartureCitiesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.salampakistan.model.getBusDestinationCities.DestinationCity>> getDestinationCitiesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getValid() {
        return null;
    }
    
    private final boolean validate() {
        return false;
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
    
    @javax.inject.Inject()
    public BusBookingSearchViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.BookingRepo repo) {
        super(null);
    }
}