package com.salampakistan.dagger.module

import com.salampakistan.ui.fragments.ImageCarouselFragment
import com.salampakistan.ui.fragments.booking.BookingFragment
import com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListFragment
import com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment
import com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListFragment
import com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsFragment
import com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsFragment
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListFragment
import com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment
import com.salampakistan.ui.fragments.booking.train.TrainBookingFragment
import com.salampakistan.ui.fragments.currency.CurrencyFragment
import com.salampakistan.ui.fragments.event.EventListFragment
import com.salampakistan.ui.fragments.event.detail.EventDetailsFragment
import com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment
import com.salampakistan.ui.fragments.forgotpassword.ForgotPasswordFragment
import com.salampakistan.ui.fragments.home.*
import com.salampakistan.ui.fragments.home.seasonexperiences.SeasonsSectionFragment
import com.salampakistan.ui.fragments.home.whattodo.WhatToDoSectionFragment
import com.salampakistan.ui.fragments.itinerary.ItineraryListFragment
import com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment
import com.salampakistan.ui.fragments.locationdetails.poi.POIFragment
import com.salampakistan.ui.fragments.login.LoginFragment
import com.salampakistan.ui.fragments.login.RegisterFragment
import com.salampakistan.ui.fragments.map.MapFragment
import com.salampakistan.ui.onboarding.OnBoardingActivity
import com.salampakistan.ui.fragments.planning.PlanningFragment
import com.salampakistan.ui.fragments.profile.AboutUsFragment
import com.salampakistan.ui.fragments.profile.ContactUsFragment
import com.salampakistan.ui.fragments.profile.ProfileFragment
import com.salampakistan.ui.fragments.profile.ProfileOptionsFragment
import com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment
import com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordFragment
import com.salampakistan.ui.fragments.reviews.ReviewsListFragment
import com.salampakistan.ui.fragments.season.SeasonDetailsFragment
import com.salampakistan.ui.fragments.visastatus.CheckVisaStatusFragment
import com.salampakistan.ui.fragments.weather.WeatherFragment
import com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListFragment
import com.salampakistan.ui.fragments.whattodo.WhatToDoListFragment
import com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment
import com.salampakistan.ui.fragments.wheretogo.WhereToGoListFragment
import com.salampakistan.ui.fragments.wishlist.WishlistListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeAboutUsFragment(): AboutUsFragment

    @ContributesAndroidInjector
    abstract fun contributeContactUsFragment(): ContactUsFragment

    @ContributesAndroidInjector
    abstract fun contributeProfileFragment(): ProfileFragment

    @ContributesAndroidInjector
    abstract fun contributeProfileOptionsFragment(): ProfileOptionsFragment

    @ContributesAndroidInjector
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector
    abstract fun contributeWhereToGoSectionFragment(): WhereToGoSectionFragment

    @ContributesAndroidInjector
    abstract fun contributeWhatToDoSectionFragment(): WhatToDoSectionFragment

    @ContributesAndroidInjector
    abstract fun contributeSeasonsSectionFragment(): SeasonsSectionFragment

    @ContributesAndroidInjector
    abstract fun contributeTripsUCannotMissSectionFragment(): TripsCannotMissSectionFragment

    @ContributesAndroidInjector
    abstract fun contributeExpertTipsSectionFragment(): ExpertTipsSectionFragment

    @ContributesAndroidInjector
    abstract fun contributeLocationDetailsFragment(): LocationDetailsFragment

    @ContributesAndroidInjector
    abstract fun contributeReviewsListFragment(): ReviewsListFragment

    @ContributesAndroidInjector
    abstract fun contributeWishlistListFragment(): WishlistListFragment

    @ContributesAndroidInjector
    abstract fun contributeItineraryListFragment(): ItineraryListFragment

    @ContributesAndroidInjector
    abstract fun contributeLiveWeatherWidgetFragment(): WeatherFragment

    @ContributesAndroidInjector
    abstract fun contributeLiveCurrencyWidgetFragment(): CurrencyFragment

    @ContributesAndroidInjector
    abstract fun contributeCheckVisaStatusFragment(): CheckVisaStatusFragment

    @ContributesAndroidInjector
    abstract fun contributeBookingFragment(): BookingFragment

    @ContributesAndroidInjector
    abstract fun contributeHotelBookingFragment(): HotelBookingFragment

    @ContributesAndroidInjector
    abstract fun contributeFlightBookingFragment(): FlightBookingFragment

    @ContributesAndroidInjector
    abstract fun contributeTrainBookingFragment(): TrainBookingFragment

    @ContributesAndroidInjector
    abstract fun contributeWhereToGoListFragment(): WhereToGoListFragment

    @ContributesAndroidInjector
    abstract fun contributeWhereToGoCategoryListFragment(): WhereToGoCategoryListFragment

    @ContributesAndroidInjector
    abstract fun contributeImageCarouselFragment(): ImageCarouselFragment

    @ContributesAndroidInjector
    abstract fun contributeWhatToDoListFragment(): WhatToDoListFragment

    @ContributesAndroidInjector
    abstract fun contributeWhatToDoCategoryListFragment(): WhatToDoCategoryListFragment

    @ContributesAndroidInjector
    abstract fun contributePOIFragment(): POIFragment

    @ContributesAndroidInjector
    abstract fun contributeTripDetailsFragment(): TripDetailsFragment

    @ContributesAndroidInjector
    abstract fun contributeSeasonDetailsFragment(): SeasonDetailsFragment

    @ContributesAndroidInjector
    abstract fun contributeUpdateProfileFragment(): UpdateProfileFragment

    @ContributesAndroidInjector
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment

    @ContributesAndroidInjector
    abstract fun contributePlanningFragment(): PlanningFragment

    @ContributesAndroidInjector
    abstract fun contributeUpdateFragment(): UpdatePasswordFragment

    @ContributesAndroidInjector
    abstract fun contributeMapFragment(): MapFragment

    @ContributesAndroidInjector
    abstract fun contributeHotelListFragment(): HotelListFragment

    @ContributesAndroidInjector
    abstract fun contributeHotelDetailsFragment(): HotelDetailsFragment

    @ContributesAndroidInjector
    abstract fun contributeHotelBookingDetailsFragment(): HotelBookingDetailsFragment

    @ContributesAndroidInjector
    abstract fun contributeEventListFragment(): EventListFragment

    @ContributesAndroidInjector
    abstract fun contributeEventDetailsFragment(): EventDetailsFragment

    @ContributesAndroidInjector
    abstract fun contributeFlightListFragment(): FlightListFragment

    @ContributesAndroidInjector
    abstract fun contributeBusBookingSearchFragment(): BusBookingSearchFragment

    @ContributesAndroidInjector
    abstract fun contributeBusListFragment(): BusListFragment

}