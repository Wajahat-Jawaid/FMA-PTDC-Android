package com.salampakistan.ui.fragments.planning

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.LocationCoordinates
import com.salampakistan.model.WishList
import com.salampakistan.model.response.GetPlansResponse
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class PlanningViewModel @Inject constructor(app: Application, private val repo: TripsRepo) :
    BaseViewModel(app) {

    fun getPlans(id: String, token: String) = repo.getPlans(id, token)

    // TODO not really a Wishlist :p =D
    fun parseWishlist(response: GetPlansResponse.Data): MutableList<WishList> {
        val list = mutableListOf<WishList>()
        if (!response.locations.isNullOrEmpty()) {
            val locs: List<WishList> =
                response.locations.map { WishList(it.id, it.name, it.description,it.location) }
            list.addAll(locs)
        }
        if (!response.activities.isNullOrEmpty()) {
            val acts: List<WishList> =
                response.activities.map { WishList(it.id, it.name, it.description,
                    LocationCoordinates(FloatArray(2),"","")
                ) }
            list.addAll(acts)
        }

        return list
    }
}