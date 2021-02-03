package com.salampakistan.ui.fragments.wishlist

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.LocationCoordinates
import com.salampakistan.model.WishList
import com.salampakistan.model.response.GetWishlistResponse
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WishlistViewModel @Inject constructor(app: Application, private val repo: TripsRepo) :
    BaseViewModel(app) {

    fun getWishlist(id: String, token: String) = repo.getWishlist(id, token)
    fun removeFromWishList(token: String, id: String) = repo.removeLocationFromWishlist(token, id)

    fun parseWishlist(response: GetWishlistResponse.Data): MutableList<WishList> {
        val list = mutableListOf<WishList>()
        if (!response.locations.isNullOrEmpty()) {
            val locs: List<WishList> =
                response.locations.map { WishList(it.id, it.name, it.description,it.location) }
            list.addAll(locs)
        }
        if (!response.activities.isNullOrEmpty()) {
            val acts: List<WishList> =
                response.activities.map { WishList(it.id, it.name, it.description
                        , LocationCoordinates(FloatArray(2),"","")
                ) }
            list.addAll(acts)
        }

        return list
    }
}