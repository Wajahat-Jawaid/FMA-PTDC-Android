package com.salampakistan.network.repos

import androidx.lifecycle.LiveData
import com.salampakistan.model.PostReview
import com.salampakistan.model.response.GetPlansResponse
import com.salampakistan.model.response.GetWishlistResponse
import com.salampakistan.model.response.getreviewsresponse.GetReviewsResponse
import com.salampakistan.model.tripdetailsresponse.TripDetailsResponse
import com.salampakistan.model.tripslist.GetAllTripsResponse
import com.salampakistan.network.JSONKeys
import com.salampakistan.network.Result
import com.salampakistan.network.WebService
import com.salampakistan.network.fma.FMAWebService
import com.salampakistan.network.resultLiveData
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Singleton
class TripsRepo @Inject constructor(private val service: WebService) : BaseRepo() {

    fun getLocationsCategoryListing(pageSize: Int = 6) =
        resultLiveData {
            getResult {
                service.getLocationTypeCategoryListing(
                    JSONKeys.destination,
                    pageSize
                )
            }
        }

    fun getLocationsForCategory(catId: String?) =
        resultLiveData { getResult { service.getLocationsForCategory("[\"$catId\"]") } }

    fun getLocations() =
        resultLiveData { getResult { service.getLocations() } }

    fun getLocationsForActivity(catId: String) =
        resultLiveData { getResult { service.getLocationsForActivity("[\"$catId\"]") } }

    fun getLocationDetails(slug: String) =
        resultLiveData { getResult { service.getLocationDetails(slug) } }

    fun getRelatedLocations() =
        resultLiveData { getResult { service.getRelatedLocations() } }

    fun getPOIs(coordinates: String) =
        resultLiveData { getResult { service.getPOIs(coordinates = coordinates) } }

    fun getPOIPlaces(coordinates: String, typeKey: String) =
        resultLiveData {
            getResult {
                service.getPOIPlaces(
                    coordinates = coordinates,
                    typeKey = typeKey
                )
            }
        }

    fun addActivityToWishList(token: String, id: String) =
        resultLiveData { getResult { service.addActivityToWishlist(token, id) } }

    fun addTripToWishlist(token: String, id: String) =
        resultLiveData { getResult { service.addTripToWishlist(token, id) } }


    fun addLocationToWishlist(token: String, id: String) =
        resultLiveData { getResult { service.addLocationToWishlist(token, id) } }


    fun addLocationToPlan(token: String, id: String) =
        resultLiveData { getResult { service.addLocationToPlan(token, id) } }

    fun addTripToPlan(token: String, id: String) =
        resultLiveData { getResult { service.addTripToPlan(token, id) } }

    fun removeLocationFromPlan(token: String, id: String) =
        resultLiveData { getResult { service.removeLocationFromPlan(token, id) } }

    fun removeTripFromPlan(token: String, id: String) =
        resultLiveData { getResult { service.removeTripFromPlan(token, id) } }

    fun getActivities() = resultLiveData { getResult { service.getActivities() } }
    fun getTripsUCantMiss() = resultLiveData { getResult { service.getTripsUCantMiss() } }

    fun getReviews(userId: String, token: String): LiveData<Result<GetReviewsResponse>> {
        val url = "${WebService.BASE_URL}review/${userId}"
        return resultLiveData { getResult { service.getReviews(url, token) } }
    }

    fun getWishlist(id: String, token: String): LiveData<Result<GetWishlistResponse>> {
        val url = "${WebService.BASE_URL}user/wishlist/$id"
        Timber.d("url: %s", url)
        return resultLiveData { getResult { service.getWishlist(url, token) } }
    }

    fun getPlans(id: String, token: String): LiveData<Result<GetPlansResponse>> {
        val url = "${WebService.BASE_URL}user/plan/$id"
        Timber.d("url: %s", url)
        return resultLiveData { getResult { service.getPlans(url, token) } }
    }

    fun removeLocationFromWishlist(token: String, id: String) =
        resultLiveData { getResult { service.removeLocationFromWishlist(token, id) } }

    fun removeTripFromWishlist(token: String, id: String) =
        resultLiveData { getResult { service.removeTripFromWishlist(token, id) } }

    fun removeActivityFromWishlist(token: String, id: String) =
        resultLiveData { getResult { service.removeActivityFromWishlist(token, id) } }


    fun postReview(token: String, postReview: PostReview) = resultLiveData {
        getResult { service.postReview(token, postReview) }
    }

    fun getTripDetails(id: String): LiveData<Result<TripDetailsResponse>> {
        val url = "${WebService.BASE_URL}trip/${id}"
        return resultLiveData { getResult { service.getTripDetails(url) } }
    }


    fun getTrips(pageSize: Int): LiveData<Result<GetAllTripsResponse>> {
        val url = "${WebService.BASE_URL}trip?pageSize=$pageSize"
        return resultLiveData { getResult { service.getTrips(url) } }
    }

}