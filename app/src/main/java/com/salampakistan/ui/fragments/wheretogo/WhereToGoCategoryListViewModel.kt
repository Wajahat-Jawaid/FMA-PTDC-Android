package com.salampakistan.ui.fragments.wheretogo

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.response.GetLocationsResponse
import com.salampakistan.network.Result
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhereToGoCategoryListViewModel @Inject constructor(app: Application, val repo: TripsRepo) :
    BaseViewModel(app) {

    var categoryLocations : MutableLiveData<Result<GetLocationsResponse>>?= null
    fun getCategoryLocations(categoryId: String) = repo.getLocationsForCategory(categoryId)
}