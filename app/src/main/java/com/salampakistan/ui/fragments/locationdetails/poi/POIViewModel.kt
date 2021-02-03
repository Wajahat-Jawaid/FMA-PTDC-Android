package com.salampakistan.ui.fragments.locationdetails.poi

import android.app.Application
import androidx.lifecycle.LiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.response.GetPOIsResponse
import com.salampakistan.model.response.getpoiresponse.GetPOIPlacesResponse
import com.salampakistan.network.Result
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class POIViewModel @Inject constructor(app: Application, val repo: TripsRepo) :
    BaseViewModel(app) {

    fun validateCoordinates(coordinates: FloatArray) = coordinates.size > 1

    fun getPOIs(coordinates: FloatArray): LiveData<Result<GetPOIsResponse>> {
        return repo.getPOIs("[${coordinates[0]},${coordinates[1]}]")
    }

    fun getPOIPlaces(coordinates: FloatArray,typeKey:String): LiveData<Result<GetPOIPlacesResponse>> {
        return repo.getPOIPlaces("[${coordinates[0]},${coordinates[1]}]",typeKey)
    }
}