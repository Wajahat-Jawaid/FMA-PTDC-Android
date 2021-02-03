package com.salampakistan.dagger.module;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'J\b\u0010\'\u001a\u00020(H\'J\b\u0010)\u001a\u00020*H\'J\b\u0010+\u001a\u00020,H\'J\b\u0010-\u001a\u00020.H\'J\b\u0010/\u001a\u000200H\'J\b\u00101\u001a\u000202H\'J\b\u00103\u001a\u000204H\'J\b\u00105\u001a\u000206H\'J\b\u00107\u001a\u000208H\'J\b\u00109\u001a\u00020:H\'J\b\u0010;\u001a\u00020<H\'J\b\u0010=\u001a\u00020>H\'J\b\u0010?\u001a\u00020@H\'J\b\u0010A\u001a\u00020BH\'J\b\u0010C\u001a\u00020DH\'J\b\u0010E\u001a\u00020FH\'J\b\u0010G\u001a\u00020HH\'J\b\u0010I\u001a\u00020JH\'J\b\u0010K\u001a\u00020LH\'J\b\u0010M\u001a\u00020NH\'J\b\u0010O\u001a\u00020PH\'J\b\u0010Q\u001a\u00020RH\'J\b\u0010S\u001a\u00020TH\'J\b\u0010U\u001a\u00020VH\'J\b\u0010W\u001a\u00020XH\'J\b\u0010Y\u001a\u00020ZH\'\u00a8\u0006["}, d2 = {"Lcom/salampakistan/dagger/module/FragmentBuildersModule;", "", "()V", "contributeAboutUsFragment", "Lcom/salampakistan/ui/fragments/profile/AboutUsFragment;", "contributeBookingFragment", "Lcom/salampakistan/ui/fragments/booking/BookingFragment;", "contributeBusBookingSearchFragment", "Lcom/salampakistan/ui/fragments/booking/bus/BusBookingSearchFragment;", "contributeBusListFragment", "Lcom/salampakistan/ui/fragments/booking/bus/buslist/BusListFragment;", "contributeCheckVisaStatusFragment", "Lcom/salampakistan/ui/fragments/visastatus/CheckVisaStatusFragment;", "contributeContactUsFragment", "Lcom/salampakistan/ui/fragments/profile/ContactUsFragment;", "contributeEventDetailsFragment", "Lcom/salampakistan/ui/fragments/event/detail/EventDetailsFragment;", "contributeEventListFragment", "Lcom/salampakistan/ui/fragments/event/EventListFragment;", "contributeExpertTipsSectionFragment", "Lcom/salampakistan/ui/fragments/home/ExpertTipsSectionFragment;", "contributeFlightBookingFragment", "Lcom/salampakistan/ui/fragments/booking/flight/FlightBookingFragment;", "contributeFlightListFragment", "Lcom/salampakistan/ui/fragments/booking/flight/flightlist/FlightListFragment;", "contributeForgotPasswordFragment", "Lcom/salampakistan/ui/fragments/forgotpassword/ForgotPasswordFragment;", "contributeHomeFragment", "Lcom/salampakistan/ui/fragments/home/HomeFragment;", "contributeHotelBookingDetailsFragment", "Lcom/salampakistan/ui/fragments/booking/hotel/bookingdetails/HotelBookingDetailsFragment;", "contributeHotelBookingFragment", "Lcom/salampakistan/ui/fragments/booking/hotel/hotelsearch/HotelBookingFragment;", "contributeHotelDetailsFragment", "Lcom/salampakistan/ui/fragments/booking/hotel/hoteldetails/HotelDetailsFragment;", "contributeHotelListFragment", "Lcom/salampakistan/ui/fragments/booking/hotel/hotellist/HotelListFragment;", "contributeImageCarouselFragment", "Lcom/salampakistan/ui/fragments/ImageCarouselFragment;", "contributeItineraryListFragment", "Lcom/salampakistan/ui/fragments/itinerary/ItineraryListFragment;", "contributeLiveCurrencyWidgetFragment", "Lcom/salampakistan/ui/fragments/currency/CurrencyFragment;", "contributeLiveWeatherWidgetFragment", "Lcom/salampakistan/ui/fragments/weather/WeatherFragment;", "contributeLocationDetailsFragment", "Lcom/salampakistan/ui/fragments/locationdetails/LocationDetailsFragment;", "contributeLoginFragment", "Lcom/salampakistan/ui/fragments/login/LoginFragment;", "contributeMapFragment", "Lcom/salampakistan/ui/fragments/map/MapFragment;", "contributePOIFragment", "Lcom/salampakistan/ui/fragments/locationdetails/poi/POIFragment;", "contributePlanningFragment", "Lcom/salampakistan/ui/fragments/planning/PlanningFragment;", "contributeProfileFragment", "Lcom/salampakistan/ui/fragments/profile/ProfileFragment;", "contributeProfileOptionsFragment", "Lcom/salampakistan/ui/fragments/profile/ProfileOptionsFragment;", "contributeRegisterFragment", "Lcom/salampakistan/ui/fragments/login/RegisterFragment;", "contributeReviewsListFragment", "Lcom/salampakistan/ui/fragments/reviews/ReviewsListFragment;", "contributeSeasonDetailsFragment", "Lcom/salampakistan/ui/fragments/season/SeasonDetailsFragment;", "contributeSeasonsSectionFragment", "Lcom/salampakistan/ui/fragments/home/seasonexperiences/SeasonsSectionFragment;", "contributeTrainBookingFragment", "Lcom/salampakistan/ui/fragments/booking/train/TrainBookingFragment;", "contributeTripDetailsFragment", "Lcom/salampakistan/ui/fragments/tripdetails/TripDetailsFragment;", "contributeTripsUCannotMissSectionFragment", "Lcom/salampakistan/ui/fragments/home/TripsCannotMissSectionFragment;", "contributeUpdateFragment", "Lcom/salampakistan/ui/fragments/profile/updatepassword/UpdatePasswordFragment;", "contributeUpdateProfileFragment", "Lcom/salampakistan/ui/fragments/profile/update/UpdateProfileFragment;", "contributeWhatToDoCategoryListFragment", "Lcom/salampakistan/ui/fragments/whattodo/WhatToDoCategoryListFragment;", "contributeWhatToDoListFragment", "Lcom/salampakistan/ui/fragments/whattodo/WhatToDoListFragment;", "contributeWhatToDoSectionFragment", "Lcom/salampakistan/ui/fragments/home/whattodo/WhatToDoSectionFragment;", "contributeWhereToGoCategoryListFragment", "Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoCategoryListFragment;", "contributeWhereToGoListFragment", "Lcom/salampakistan/ui/fragments/wheretogo/WhereToGoListFragment;", "contributeWhereToGoSectionFragment", "Lcom/salampakistan/ui/fragments/home/WhereToGoSectionFragment;", "contributeWishlistListFragment", "Lcom/salampakistan/ui/fragments/wishlist/WishlistListFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.home.HomeFragment contributeHomeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.profile.AboutUsFragment contributeAboutUsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.profile.ContactUsFragment contributeContactUsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.profile.ProfileFragment contributeProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.profile.ProfileOptionsFragment contributeProfileOptionsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.login.LoginFragment contributeLoginFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.login.RegisterFragment contributeRegisterFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.home.WhereToGoSectionFragment contributeWhereToGoSectionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.home.whattodo.WhatToDoSectionFragment contributeWhatToDoSectionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.home.seasonexperiences.SeasonsSectionFragment contributeSeasonsSectionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.home.TripsCannotMissSectionFragment contributeTripsUCannotMissSectionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.home.ExpertTipsSectionFragment contributeExpertTipsSectionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment contributeLocationDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.reviews.ReviewsListFragment contributeReviewsListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.wishlist.WishlistListFragment contributeWishlistListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.itinerary.ItineraryListFragment contributeItineraryListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.weather.WeatherFragment contributeLiveWeatherWidgetFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.currency.CurrencyFragment contributeLiveCurrencyWidgetFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.visastatus.CheckVisaStatusFragment contributeCheckVisaStatusFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.BookingFragment contributeBookingFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment contributeHotelBookingFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment contributeFlightBookingFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.train.TrainBookingFragment contributeTrainBookingFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.wheretogo.WhereToGoListFragment contributeWhereToGoListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment contributeWhereToGoCategoryListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.ImageCarouselFragment contributeImageCarouselFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.whattodo.WhatToDoListFragment contributeWhatToDoListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListFragment contributeWhatToDoCategoryListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.locationdetails.poi.POIFragment contributePOIFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment contributeTripDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.season.SeasonDetailsFragment contributeSeasonDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment contributeUpdateProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.forgotpassword.ForgotPasswordFragment contributeForgotPasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.planning.PlanningFragment contributePlanningFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordFragment contributeUpdateFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.map.MapFragment contributeMapFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment contributeHotelListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsFragment contributeHotelDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsFragment contributeHotelBookingDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.event.EventListFragment contributeEventListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.event.detail.EventDetailsFragment contributeEventDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListFragment contributeFlightListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment contributeBusBookingSearchFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment contributeBusListFragment();
    
    public FragmentBuildersModule() {
        super();
    }
}