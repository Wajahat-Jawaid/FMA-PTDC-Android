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

    fun getTripDetails(id: String) = repo.getTripDetails(id)


    fun getPlans(id: String, token: String) = repo.getPlans(id, token)
    fun addToWishList(token: String, id: String) = repo.addTripToWishlist(token, id)
    fun removeFromWishList(token: String, id: String) = repo.removeTripFromWishlist(token, id)
    fun getWishlist(id: String, token: String) = repo.getWishlist(id, token)
    fun addToPlan(token: String, id: String) = repo.addTripToPlan(token, id)
    fun removeTripFromPlan(token: String, id: String) = repo.removeTripFromPlan(token, id)

}