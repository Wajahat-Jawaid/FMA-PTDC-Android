package com.salampakistan.dagger.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.salampakistan.dagger.ViewModelFactory
import com.salampakistan.dagger.ViewModelKey
import com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel
import com.salampakistan.ui.fragments.booking.bus.buslist.BusListViewModel
import com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel
import com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListViewModel
import com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsViewModel
import com.salampakistan.ui.fragments.booking.hotel.hoteldetails.HotelDetailsViewModel
import com.salampakistan.ui.fragments.booking.hotel.hotellist.HotelListViewModel
import com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel
import com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel
import com.salampakistan.ui.fragments.currency.CurrencyViewModel
import com.salampakistan.ui.fragments.event.EventListViewModel
import com.salampakistan.ui.fragments.event.detail.EventDetailsFragment
import com.salampakistan.ui.fragments.event.detail.EventDetailsViewModel
import com.salampakistan.ui.fragments.tripdetails.TripDetailsViewModel
import com.salampakistan.ui.fragments.forgotpassword.ForgotPasswordViewModel
import com.salampakistan.ui.fragments.home.HomeViewModel
import com.salampakistan.ui.fragments.home.seasonexperiences.SeasonViewModel
import com.salampakistan.ui.fragments.home.whattodo.WhatToDoSectionViewModel
import com.salampakistan.ui.fragments.locationdetails.LocationDetailsViewModel
import com.salampakistan.ui.fragments.locationdetails.poi.POIViewModel
import com.salampakistan.ui.fragments.login.LoginRegisterViewModel
import com.salampakistan.ui.fragments.map.MapViewModel
import com.salampakistan.ui.fragments.planning.PlanningViewModel
import com.salampakistan.ui.fragments.profile.update.UpdateProfileViewModel
import com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordViewModel
import com.salampakistan.ui.fragments.reviews.ReviewsListViewModel
import com.salampakistan.ui.fragments.visastatus.CheckVisaStatusViewModel
import com.salampakistan.ui.fragments.weather.WeatherViewModel
import com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListViewModel
import com.salampakistan.ui.fragments.whattodo.WhatToDoListViewModel
import com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListViewModel
import com.salampakistan.ui.fragments.wheretogo.WhereToGoListViewModel
import com.salampakistan.ui.fragments.wishlist.WishlistViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LoginRegisterViewModel::class)
    abstract fun bindLoginRegisterViewModel(viewModel: LoginRegisterViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WhereToGoListViewModel::class)
    abstract fun bindEventsListViewModel(viewModel: WhereToGoListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ReviewsListViewModel::class)
    abstract fun bindReviewsListViewModel(viewModel: ReviewsListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WeatherViewModel::class)
    abstract fun bindLiveWeatherViewModel(viewModel: WeatherViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CurrencyViewModel::class)
    abstract fun bindLiveCurrencyViewModel(viewModel: CurrencyViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CheckVisaStatusViewModel::class)
    abstract fun bindCheckVisaStatusViewModel(viewModel: CheckVisaStatusViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WhatToDoSectionViewModel::class)
    abstract fun bindWhatToDoSectionViewModel(viewModel: WhatToDoSectionViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FlightBookingViewModel::class)
    abstract fun bindFlightBookingViewModel(viewModel: FlightBookingViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WhereToGoCategoryListViewModel::class)
    abstract fun bindWhereToGoCategoryListViewModel(viewModel: WhereToGoCategoryListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LocationDetailsViewModel::class)
    abstract fun bindLocationDetailsViewModel(viewModel: LocationDetailsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WhatToDoListViewModel::class)
    abstract fun bindWhatToDoListViewModel(viewModel: WhatToDoListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WhatToDoCategoryListViewModel::class)
    abstract fun bindWhatToDoCategoryListViewModel(viewModel: WhatToDoCategoryListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(POIViewModel::class)
    abstract fun bindPOIViewModel(viewModel: POIViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HotelBookingViewModel::class)
    abstract fun bindHotelBookingViewModel(viewModel: HotelBookingViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TrainBookingViewModel::class)
    abstract fun bindTrainBookingViewModel(viewModel: TrainBookingViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TripDetailsViewModel::class)
    abstract fun bindTripDetailsViewModel(viewModel: TripDetailsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(UpdateProfileViewModel::class)
    abstract fun bindUpdateProfileViewModel(viewModel: UpdateProfileViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WishlistViewModel::class)
    abstract fun bindWishlistViewModel(viewModel: WishlistViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ForgotPasswordViewModel::class)
    abstract fun bindForgotPasswordViewModel(viewModel: ForgotPasswordViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PlanningViewModel::class)
    abstract fun bindPlanningViewModel(viewModel: PlanningViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(UpdatePasswordViewModel::class)
    abstract fun bindUpdatePasswordViewModel(viewModel: UpdatePasswordViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SeasonViewModel::class)
    abstract fun bindSeasonViewModel(viewModel:SeasonViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MapViewModel::class)
    abstract fun bindMapViewModel(viewModel:MapViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HotelListViewModel::class)
    abstract fun bindHotelListViewModel(viewModel:HotelListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HotelDetailsViewModel::class)
    abstract fun bindHotelDetailsViewModel(viewModel: HotelDetailsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HotelBookingDetailsViewModel::class)
    abstract fun bindHotelBookingDetailsViewModel(viewModel: HotelBookingDetailsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(EventListViewModel::class)
    abstract fun bindEventListViewModel(viewModel: EventListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(EventDetailsViewModel::class)
    abstract fun bindEventDetailsViewModel(viewModel: EventDetailsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FlightListViewModel::class)
    abstract fun bindFlightListViewModel(viewModel: FlightListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BusBookingSearchViewModel::class)
    abstract fun bindBusBookingSearchViewModel(viewModel: BusBookingSearchViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BusListViewModel::class)
    abstract fun bindBusListViewModel(viewModel: BusListViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}