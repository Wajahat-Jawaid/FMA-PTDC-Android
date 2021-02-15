package com.salampakistan.ui.fragments.home

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.TripsRepo
import com.salampakistan.network.repos.fma.FMARepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class HomeViewModel @Inject constructor(
    app: Application,
    private val tripsRepo: TripsRepo,
    fmaRepo: FMARepo
) : BaseViewModel(app) {

    val locations = tripsRepo.getLocationsCategoryListing()
    val tripsUCantMiss = tripsRepo.getTripsUCantMiss()
    fun trips(pageSize:Int = 0) = tripsRepo.getTrips(pageSize)
    val expertTips = fmaRepo.getCategoryBlogs("travellers of pakistan")

    var scrollPostion = 0
}