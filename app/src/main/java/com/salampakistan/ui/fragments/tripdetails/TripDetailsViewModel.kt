package com.salampakistan.ui.fragments.tripdetails

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.TripsRepo
import com.salampakistan.network.repos.fma.FMARepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class TripDetailsViewModel @Inject constructor(app: Application, val repo: TripsRepo) :
    BaseViewModel(app) {

    fun getTripDetails(autoId: Int, slug: String) = repo.getTripDetails(autoId, slug)


    fun getPlans(id: String, token: String) = repo.getPlans(id, token)
    fun addToWishList(token: String, id: String) = repo.addLocationToWishlist(token, id)
    fun removeFromWishList(token: String, id: String) = repo.removeLocationFromWishlist(token, id)
    fun getWishlist(id: String, token: String) = repo.getWishlist(id, token)
    fun addToPlan(token: String, id: String) = repo.addLocationToPlan(token, id)
    fun removeLocationFromPlan(token: String, id: String) = repo.removeLocationFromPlan(token, id)

}