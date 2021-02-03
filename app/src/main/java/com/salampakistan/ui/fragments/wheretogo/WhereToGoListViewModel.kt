package com.salampakistan.ui.fragments.wheretogo

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhereToGoListViewModel @Inject constructor(app: Application, repo: TripsRepo) :
    BaseViewModel(app) {

    val locations = repo.getLocationsCategoryListing(0)
}