package com.salampakistan.network

import com.salampakistan.model.PostReview
import com.salampakistan.model.transportservicesresponse.GetTransportServicesResponse
import com.salampakistan.model.event.GetEventDetailsResponse
import com.salampakistan.model.event.GetEventsResponse
import com.salampakistan.model.getBusDestinationCities.GetBusDestinationCitiesResponse
import com.salampakistan.model.getbusdeparturecities.GetBusDepartureCityResponse
import com.salampakistan.model.getbusservicesreponse.GetBusServicesResponse
import com.salampakistan.model.hotelsearchresponse.HotelSearchResponse
import com.salampakistan.model.mapLocationResponse.MapLocationResponse
import com.salampakistan.model.response.*
import com.salampakistan.model.response.getpoiresponse.GetPOIPlacesResponse
import com.salampakistan.model.response.getreviewsresponse.GetReviewsResponse
import com.salampakistan.model.response.user.LoginResponse
import com.salampakistan.model.seasons.FetchAllSeasonsResponse
import com.salampakistan.model.seasons.festival.GetFestivalBySeasonIdResponse
import com.salampakistan.model.seasons.seasonbyid.FetchSeasonByIdResponse
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
        @Query("parentCategories") id: String?=null,
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
    suspend fun getEventDetails(@Path("id") id:String): Response<GetEventDetailsResponse>

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
        @Query(JSONKeys.coordinates) coordinates:String,
        @Query(JSONKeys.typeKey) typeKey:String
    ):Response<GetPOIPlacesResponse>

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

    @POST("users/{id}/photos")
    suspend fun uploadProfileImage(
        @Header(JSONKeys.token) token: String,
        @Path("id") id:String,
        @Body photo: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @POST("user/wishlist")
    suspend fun addLocationToWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("locationId") id: String
    ): Response<SimpleApiResponse>

    @FormUrlEncoded
    @PUT("user/wishlist/remove")
    suspend fun removeLocationFromWishlist(
        @Header(JSONKeys.token) header: String,
        @Field("locationId") id: String
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
    @PUT("user/plan/remove")
    suspend fun removeLocationFromPlan(
        @Header(JSONKeys.token) header: String,
        @Field("locationId") id: String
    ): Response<SimpleApiResponse>

    /* Seasons */
    @GET("season")
    suspend fun getAllSeasons(
        @Query(JSONKeys.search) search:String?,
        @Query(JSONKeys.pageSize) pageSize:Int,
        @Query(JSONKeys.skip) skip:Int
    ):Response<FetchAllSeasonsResponse>

    @GET
    suspend fun getSeasonById(
        @Url url:String
    ):Response<FetchSeasonByIdResponse>

    @GET("seasonalEvent")
    suspend fun getFestivalBySeasonId(
        @Query(JSONKeys.seasonId) seasonId:String
    ):Response<GetFestivalBySeasonIdResponse>

    /* USERS */
    @FormUrlEncoded
    @POST("signin/local")
    suspend fun login(
        @Field(JSONKeys.email) email: String,
        @Field(JSONKeys.password) password: String
    ):
            Response<LoginResponse>

    @FormUrlEncoded
    @POST("resetPassword/request")
    suspend fun forgotPasswor(
        @Field(JSONKeys.email) email:String
    ):Response<SimpleApiResponse>

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
        @Field(JSONKeys.dob) dob: String
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
    ):Response<GetReviewsResponse>


    /*trip*/
    @GET
    suspend fun getTripDetails(
        @Url url: String
    ): Response<TripDetailsResponse>


/* Booking*/

    /*Hotel*/
    @GET("hotel-search")
    suspend fun searchHotels(
        @Query(JSONKeys.cityName) city:String,
        @Query(JSONKeys.dep_date) departDate:String,
        @Query(JSONKeys.return_date) returnDate:String,
        @Query(JSONKeys.no_of_adults) noOfAdults:Int = 0,
        @Query(JSONKeys.no_of_children) noOfChilderns:Int = 0,
        @Query(JSONKeys.no_of_infants) noOfInfants:Int = 0,
        @Query(JSONKeys.rooms) noOfRooms:Int? = 0
    ):Response<HotelSearchResponse>


    /*Bus*/
    @GET("get_transport_services")
    suspend fun getTransportServices():Response<GetTransportServicesResponse>

    @GET("get_departure_cities")
    suspend fun getDepartureCities(@Query(JSONKeys.serviceId) serviceId:Int):Response<GetBusDepartureCityResponse>

    @GET("get_destination_cities")
    suspend fun getDestinationCities(
        @Query(JSONKeys.originCityId) originId:Int,
        @Query(JSONKeys.serviceId) serviceId:Int
        ):Response<GetBusDestinationCitiesResponse>

    @GET("all_bus_services")
    suspend fun getAllBusServices(
        @Query(JSONKeys.originCityName) originName:String,
        @Query(JSONKeys.destinationCityname) destinationName:String,
        @Query(JSONKeys.serviceName,encoded = false) service:String
    ):Response<GetBusServicesResponse>

    /* OTHERS */
    @GET("currencies")
    suspend fun getCurrencies(): Response<GetCurrenciesResponse>

    @GET("visa/availability")
    suspend fun getVisaStatuses(): Response<GetVisaStatusResponse>
}