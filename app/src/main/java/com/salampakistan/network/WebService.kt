package com.salampakistan.network

import com.salampakistan.model.PostReview
import com.salampakistan.model.event.GetEventsResponse
import com.salampakistan.model.event.eventdetailsresponse.EventDetailsResponse
import com.salampakistan.model.transportservicesresponse.GetTransportServicesResponse
import com.salampakistan.model.getBusDestinationCities.GetBusDestinationCitiesResponse
import com.salampakistan.model.getairportresponse.GetAirPortsResponse
import com.salampakistan.model.getbusdeparturecities.GetBusDepartureCityResponse
import com.salampakistan.model.getbusservicesreponse.GetBusServicesResponse
import com.salampakistan.model.getflightsresponse.GetFlightResponse
import com.salampakistan.model.getuserdata.GetUserDataResponse
import com.salampakistan.model.hotelcities.HotelCityResponse
import com.salampakistan.model.hotelsearchresponse.HotelSearchResponse
import com.salampakistan.model.mapLocationResponse.MapLocationResponse
import com.salampakistan.model.response.*
import com.salampakistan.model.response.getpoiresponse.GetPOIPlacesResponse
import com.salampakistan.model.response.getreviewsresponse.GetReviewsResponse
import com.salampakistan.model.response.user.LoginResponse
import com.salampakistan.model.seasons.FetchAllSeasonsResponse
import com.salampakistan.model.seasons.festival.GetFestivalBySeasonIdResponse
import com.salampakistan.model.seasons.seasonbyid.FetchSeasonByIdResponse
import com.salampakistan.model.tripdetailsresponse.TripDetailsResponse
import com.salampakistan.model.tripslist.GetAllTripsResponse
import com.salampakistan.model.uploadprofilephotoresponse.UploadProfilePhotoResponse
import retrofit2.Response
import retrofit2.http.*

interface WebService {

    companion object {
        const val FMA_DOMAIN_URL = "https://www.findmyadventure.pk/"
        const val BASE_URL = "https://ptdc.findmyadventure.pk/api/"
    }

    @GET
    suspend fun getWishlist(@Url url: String, @Header(JSONKeys.token) header: String):
            Response<GetWishlistResponse>

    @GET
    suspend fun getPlans(@Url url: String, @Header(JSONKeys.token) header: String):
            Response<GetPlansResponse>

    /* LOCATIONS */
    @GET(JSONKeys.category)
    suspend fun getLocationTypeCategoryListing(
        @Query(JSONKeys.categoryType) type: String,
        @Query(JSONKeys.pageSize) size: Int = 0
    ): Response<GetLocationsResponse>

    @GET("location")
    suspend fun getLocationsForCategory(
        @Query("parentCategories") id: String? = null,
        @Query(JSONKeys.pageSize) size: Int = 0
    ): Response<GetLocationsResponse>

    @GET("location")
    suspend fun getLocations(
        @Query(JSONKeys.pageSize) size: Int = 0,
        @Query(JSONKeys.skip) skip: Int = 0
    ): Response<MapLocationResponse>

    @GET("location")
    suspend fun getRelatedLocations(): Response<MapLocationResponse>

    @GET("events")
    suspend fun getEvents(): Response<GetEventsResponse>

    @GET("events/{id}")
    suspend fun getEventDetails(@Path("id") id: String): Response<EventDetailsResponse>

    @GET("location/detail")
    suspend fun getLocationDetails(@Query(JSONKeys.slug) slug: String): Response<GetLocationDetailsResponse>

    @GET("poi")
    suspend fun getPOIs(
        @Query(JSONKeys.minDistance) min: Int = 0,
        @Query(JSONKeys.maxDistance) max: Int = 5000,
        @Query(JSONKeys.coordinates) coordinates: String
    ): Response<GetPOIsResponse>

    @GET("poi")
    suspend fun getPOIPlaces(
        @Query(JSONKeys.coordinates) coordinates: String,
        @Query(JSONKeys.typeKey) typeKey: String
    ): Response<GetPOIPlacesResponse>

    /* ACTIVITIES */
    @GET("activity")
    suspend fun getActivities(): Response<GetActivitiesResponse>


    @GET("activity")
    suspend fun getTripsUCantMiss(): Response<GetActivitiesResponse>

    @GET("location")
    suspend fun getLocationsForActivity(
        @Query("parentActivities") id: String,
        @Query(JSONKeys.pageSize) size: Int = 0
    ): Response<GetLocationsResponse>

    @FormUrlEncoded
    @POST("user/wishlist")
    suspend fun addActivityToWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("activityId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @POST("users/{id}/photos")
    suspend fun uploadProfileImage(
        @Header(JSONKeys.token) token: String,
        @Path("id") id: String,
        @Field("photo") photo: String
    ): Response<UploadProfilePhotoResponse>

    @FormUrlEncoded
    @POST("user/wishlist")
    suspend fun addLocationToWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("locationId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @POST("user/wishlist")
    suspend fun addTripToWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("tripId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @PUT("user/wishlist/remove")
    suspend fun removeLocationFromWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("locationId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @PUT("user/wishlist/remove")
    suspend fun removeTripFromWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("tripId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @POST("user/wishlist/remove")
    suspend fun removeActivityFromWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("activityId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @POST("user/plan")
    suspend fun addLocationToPlan(
        @Header(JSONKeys.token) header: String,
        @Field("locationId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @POST("user/plan")
    suspend fun addTripToPlan(
        @Header(JSONKeys.token) header: String,
        @Field("tripId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @PUT("user/plan/remove")
    suspend fun removeLocationFromPlan(
        @Header(JSONKeys.token) header: String,
        @Field("locationId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @PUT("user/plan/remove")
    suspend fun removeTripFromPlan(
        @Header(JSONKeys.token) header: String,
        @Field("tripId") id: String
    ): Response<SimpleApiResponse>

    /* Seasons */
    @GET("season")
    suspend fun getAllSeasons(
        @Query(JSONKeys.search) search: String?,
        @Query(JSONKeys.pageSize) pageSize: Int,
        @Query(JSONKeys.skip) skip: Int
    ): Response<FetchAllSeasonsResponse>

    @GET
    suspend fun getSeasonById(
        @Url url: String
    ): Response<FetchSeasonByIdResponse>

    @GET("seasonalEvent")
    suspend fun getFestivalBySeasonId(
        @Query(JSONKeys.seasonId) seasonId: String
    ): Response<GetFestivalBySeasonIdResponse>

    /* USERS */
    @FormUrlEncoded
    @POST("signin/local")
    suspend fun login(
        @Field(JSONKeys.email) email: String,
        @Field(JSONKeys.password) password: String
    ): Response<LoginResponse>

    @FormUrlEncoded
    @POST("resetPassword/request")
    suspend fun forgotPasswor(
        @Field(JSONKeys.email) email: String
    ): Response<SimpleApiResponse>

    @GET("users/{id}")
    suspend fun getUserData(
        @Path("id") id:String,
        @Header(JSONKeys.token) token:String
    ):Response<GetUserDataResponse>

    @FormUrlEncoded
    @POST("signin/local")
    suspend fun forgotPassword(@Field(JSONKeys.email) email: String): Response<LoginResponse>

    @FormUrlEncoded
    @POST("signup")
    suspend fun register(
        @Field(JSONKeys.firstName) firstName: String,
        @Field(JSONKeys.lastName) lastName: String,
        @Field(JSONKeys.mobile) mobile: String,
        @Field(JSONKeys.email) email: String,
        @Field(JSONKeys.password) password: String,
        @Field(JSONKeys.gender) gender: String,
        @Field(JSONKeys.dob) dob: String,
        @Field("type") userType: String = "customer"
    ): Response<LoginResponse>

    @FormUrlEncoded
    @PUT
    suspend fun editProfile(
        @Url url: String,
        @Header(JSONKeys.token) header: String,
        @Field(JSONKeys.firstName) firstName: String,
        @Field(JSONKeys.lastName) lastName: String,
        @Field(JSONKeys.mobile) mobile: String,
        @Field(JSONKeys.nic) nic: String,
        @Field(JSONKeys.gender) gender: String,
        @Field(JSONKeys.dob) dob: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @PUT
    suspend fun updatePassword(
        @Url url: String,
        @Header(JSONKeys.token) header: String,
        @Field("oldPassword") oldPassword: String,
        @Field("newPassword") newPassword: String
    ): Response<SimpleApiResponse>

    /* Review */
    @POST("review")
    suspend fun postReview(
        @Header(JSONKeys.token) header: String,
        @Body postReview: PostReview
    ): Response<SimpleApiResponse>

    @GET
    suspend fun getReviews(
        @Url url: String,
        @Header(JSONKeys.token) header: String
    ): Response<GetReviewsResponse>


    /*trip*/
    @GET
    suspend fun getTripDetails(
        @Url url: String
    ): Response<TripDetailsResponse>


/* Booking*/

    /*Hotel*/
    @GET("hotel-search")
    suspend fun searchHotels(
        @Query(JSONKeys.cityName) city: String,
        @Query(JSONKeys.dep_date) departDate: String,
        @Query(JSONKeys.return_date) returnDate: String,
        @Query(JSONKeys.no_of_adults) noOfAdults: Int = 0,
        @Query(JSONKeys.no_of_children) noOfChilderns: Int = 0,
        @Query(JSONKeys.no_of_infants) noOfInfants: Int = 0,
        @Query(JSONKeys.rooms) noOfRooms: Int? = 0,
        @Query(JSONKeys.skip) skip: Int? = 0,
        @Query(JSONKeys.pageSize) pageSize: Int = 0
    ): Response<HotelSearchResponse>

    @GET("hotel-details")
    suspend fun hotelsDetails(
        @Query("refId") refId: String,
        @Query("hotelRefId") hotelRefId: String,
        @Query(JSONKeys.checkin_date) checkInDate: String,
        @Query(JSONKeys.checkout_date) checkOutDate: String,
        @Query(JSONKeys.no_of_adults) noOfAdults: Int = 0,
        @Query(JSONKeys.rooms) noOfRooms: Int? = 0
    ): Response<HotelSearchResponse>

    @GET("hotel_city_list")
    suspend fun getHotelCities(): Response<HotelCityResponse>


    /*Bus*/
    @GET("get_transport_services")
    suspend fun getTransportServices(): Response<GetTransportServicesResponse>

    @GET("get_departure_cities")
    suspend fun getDepartureCities(@Query(JSONKeys.serviceId) serviceId: Int? = null): Response<GetBusDepartureCityResponse>

    @GET("get_destination_cities")
    suspend fun getDestinationCities(
        @Query(JSONKeys.originCityId) originId: Int,
        @Query(JSONKeys.serviceId) serviceId: Int?
    ): Response<GetBusDestinationCitiesResponse>

    @GET("all_bus_services")
    suspend fun getAllBusServices(
        @Query(JSONKeys.originCityName) originName: String,
        @Query(JSONKeys.destinationCityname) destinationName: String,
        @Query(JSONKeys.date) date: String,
        @Query(JSONKeys.serviceName, encoded = false) service: String? = null,
        @Query(JSONKeys.skip) skip: Int = 0,
        @Query(JSONKeys.pageSize) pageSize: Int = 0
    ): Response<GetBusServicesResponse>

    /*Flight*/
    @GET("searchAir")
    suspend fun getFlights(
        @Query("departureCityName") departureCity: String,
        @Query("destinationCityName") destinationName: String,
        @Query("dep_date") departDate: String,
        @Query("return_date") returnDate: String = "",
        @Query("no_of_adults") noOfAdults: Int = 1,
        @Query("no_of_infants") noOfInfants: Int = 0,
        @Query("cabin") cabin: String = "",
        @Query("no_of_children") noOfChildren: Int = 0,
        @Query("sortBy") sort: Int = 0,
        @Query(JSONKeys.pageSize) pageSize: Int = 0,
        @Query(JSONKeys.skip) skip: Int = 0
    ):Response<GetFlightResponse>

    @GET("airports")
    suspend fun getAirports(): Response<GetAirPortsResponse>

    /* OTHERS */
    @GET("currencies")
    suspend fun getCurrencies(): Response<GetCurrenciesResponse>

    @GET("visa/availability")
    suspend fun getVisaStatuses(): Response<GetVisaStatusResponse>

    @GET
    suspend fun getTrips(
        @Url url:String
    ): Response<GetAllTripsResponse>
}