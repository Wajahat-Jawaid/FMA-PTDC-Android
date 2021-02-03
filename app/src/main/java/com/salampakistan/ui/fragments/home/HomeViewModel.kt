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
    tripsRepo: TripsRepo,
    fmaRepo: FMARepo
) : BaseViewModel(app) {

    val locations = tripsRepo.getLocationsCategoryListing()
    val tripsUCantMiss = tripsRepo.getTripsUCantMiss()
    val events = fmaRepo.getTrips()
    val expertTips = fmaRepo.getCategoryBlogs("travellers of pakistan")
}