package com.salampakistan.ui.fragments.locationdetails

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.PostReview
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class LocationDetailsViewModel @Inject constructor(app: Application, val repo: TripsRepo) :
    BaseViewModel(app) {

    fun getPlans(id: String, token: String) = repo.getPlans(id, token)
    fun getLocationDetails(slug: String) = repo.getLocationDetails(slug)
    fun addToWishList(token: String, id: String) = repo.addLocationToWishlist(token, id)
    fun removeFromWishList(token: String, id: String) = repo.removeLocationFromWishlist(token, id)
    fun getWishlist(id: String, token: String) = repo.getWishlist(id, token)
    fun addToPlan(token: String, id: String) = repo.addLocationToPlan(token, id)
    fun removeLocationFromPlan(token: String, id: String) = repo.removeLocationFromPlan(token, id)
    fun postReview(token:String, postReview: PostReview) = repo.postReview(token, postReview)
    fun getRelatedLocations() = repo.getRelatedLocations()

}