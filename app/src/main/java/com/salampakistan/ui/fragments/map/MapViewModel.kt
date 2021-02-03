package com.salampakistan.ui.fragments.map

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

class MapViewModel@Inject constructor(app: Application, val repo: TripsRepo) :
    BaseViewModel(app) {

    fun getLocations() = repo.getLocations()
    fun getLocationPOIs(coordinates: List<Double>, typeKey:String) = repo.getPOIPlaces(coordinates = "[${coordinates[0]},${coordinates[1]}]", typeKey = typeKey)
}