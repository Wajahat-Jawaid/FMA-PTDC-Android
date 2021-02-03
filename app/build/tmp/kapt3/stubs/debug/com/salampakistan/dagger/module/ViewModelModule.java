package com.salampakistan.dagger.module;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H\'J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H\'J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H\'J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H\'J\u0010\u0010\'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H\'J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020*H\'J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020,H\'J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020.H\'J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000200H\'J\u0010\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000202H\'J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000204H\'J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000206H\'J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000208H\'J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020:H\'J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\'J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020@H\'J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020BH\'J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020DH\'J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020FH\'J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020HH\'\u00a8\u0006I"}, d2 = {"Lcom/salampakistan/dagger/module/ViewModelModule;", "", "()V", "bindBusBookingSearchViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/salampakistan/ui/fragments/booking/bus/BusBookingSearchViewModel;", "bindBusListViewModel", "Lcom/salampakistan/ui/fragments/booking/bus/buslist/BusListViewModel;", "bindCheckVisaStatusViewModel", "Lcom/salampakistan/ui/fragments/visastatus/CheckVisaStatusViewModel;", "bindEventDetailsViewModel", "Lcom/salampakistan/ui/fragments/event/detail/EventDetailsViewModel;", "bindEventListViewModel", "Lcom/salampakistan/ui/fragments/event/EventListViewModel;", "bindEventsListViewModel", "Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoListViewModel;", "bindFlightBookingViewModel", "Lcom/salampakistan/ui/fragments/booking/flight/FlightBookingViewModel;", "bindFlightListViewModel", "Lcom/salampakistan/ui/fragments/booking/flight/flightlist/FlightListViewModel;", "bindForgotPasswordViewModel", "Lcom/salampakistan/ui/fragments/forgotpassword/ForgotPasswordViewModel;", "bindHomeViewModel", "Lcom/salampakistan/ui/fragments/home/HomeViewModel;", "bindHotelBookingDetailsViewModel", "Lcom/salampakistan/ui/fragments/booking/hotel/bookingdetails/HotelBookingDetailsViewModel;", "bindHotelBookingViewModel", "Lcom/salampakistan/ui/fragments/booking/hotel/hotelsearch/HotelBookingViewModel;", "bindHotelDetailsViewModel", "Lcom/salampakistan/ui/fragments/booking/hotel/hoteldetails/HotelDetailsViewModel;", "bindHotelListViewModel", "Lcom/salampakistan/ui/fragments/booking/hotel/hotellist/HotelListViewModel;", "bindLiveCurrencyViewModel", "Lcom/salampakistan/ui/fragments/currency/CurrencyViewModel;", "bindLiveWeatherViewModel", "Lcom/salampakistan/ui/fragments/weather/WeatherViewModel;", "bindLocationDetailsViewModel", "Lcom/salampakistan/ui/fragments/locationdetails/LocationDetailsViewModel;", "bindLoginRegisterViewModel", "Lcom/salampakistan/ui/fragments/login/LoginRegisterViewModel;", "bindMapViewModel", "Lcom/salampakistan/ui/fragments/map/MapViewModel;", "bindPOIViewModel", "Lcom/salampakistan/ui/fragments/locationdetails/poi/POIViewModel;", "bindPlanningViewModel", "Lcom/salampakistan/ui/fragments/planning/PlanningViewModel;", "bindReviewsListViewModel", "Lcom/salampakistan/ui/fragments/reviews/ReviewsListViewModel;", "bindSeasonViewModel", "Lcom/salampakistan/ui/fragments/home/seasonexperiences/SeasonViewModel;", "bindTrainBookingViewModel", "Lcom/salampakistan/ui/fragments/booking/train/TrainBookingViewModel;", "bindTripDetailsViewModel", "Lcom/salampakistan/ui/fragments/tripdetails/TripDetailsViewModel;", "bindUpdatePasswordViewModel", "Lcom/salampakistan/ui/fragments/profile/updatepassword/UpdatePasswordViewModel;", "bindUpdateProfileViewModel", "Lcom/salampakistan/ui/fragments/profile/update/UpdateProfileViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/salampakistan/dagger/ViewModelFactory;", "bindWhatToDoCategoryListViewModel", "Lcom/salampakistan/ui/fragments/whattodo/WhatToDoCategoryListViewModel;", "bindWhatToDoListViewModel", "Lcom/salampakistan/ui/fragments/whattodo/WhatToDoListViewModel;", "bindWhatToDoSectionViewModel", "Lcom/salampakistan/ui/fragments/home/whattodo/WhatToDoSectionViewModel;", "bindWhereToGoCategoryListViewModel", "Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoCategoryListViewModel;", "bindWishlistViewModel", "Lcom/salampakistan/ui/fragments/wishlist/WishlistViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.home.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.home.HomeViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.login.LoginRegisterViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindLoginRegisterViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.login.LoginRegisterViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.wheretogo.WhereToGoListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindEventsListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.wheretogo.WhereToGoListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.reviews.ReviewsListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindReviewsListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.reviews.ReviewsListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.weather.WeatherViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindLiveWeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.weather.WeatherViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.currency.CurrencyViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindLiveCurrencyViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.currency.CurrencyViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.visastatus.CheckVisaStatusViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindCheckVisaStatusViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.visastatus.CheckVisaStatusViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.home.whattodo.WhatToDoSectionViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindWhatToDoSectionViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.home.whattodo.WhatToDoSectionViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindFlightBookingViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindWhereToGoCategoryListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.locationdetails.LocationDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindLocationDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.locationdetails.LocationDetailsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.whattodo.WhatToDoListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindWhatToDoListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.whattodo.WhatToDoListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindWhatToDoCategoryListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.locationdetails.poi.POIViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindPOIViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.locationdetails.poi.POIViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHotelBookingViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindTrainBookingViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.tripdetails.TripDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindTripDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.tripdetails.TripDetailsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.profile.update.UpdateProfileViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindUpdateProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.profile.update.UpdateProfileViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.wishlist.WishlistViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindWishlistViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.wishlist.WishlistViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.forgotpassword.ForgotPasswordViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindForgotPasswordViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.forgotpassword.ForgotPasswordViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.planning.PlanningViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindPlanningViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.planning.PlanningViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindUpdatePasswordViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.home.seasonexperiences.SeasonViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSeasonViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.home.seasonexperiences.SeasonViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.map.MapViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMapViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.map.MapViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHotelListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHotelDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHotelBookingDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.event.EventListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindEventListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.event.EventListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.event.detail.EventDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindEventDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.event.detail.EventDetailsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindFlightListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindBusBookingSearchViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.ViewModelKey(value = com.salampakistan.ui.fragments.booking.bus.buslist.BusListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindBusListViewModel(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.fragments.booking.bus.buslist.BusListViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.salampakistan.dagger.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}