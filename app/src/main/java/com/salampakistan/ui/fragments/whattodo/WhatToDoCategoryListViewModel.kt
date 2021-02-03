package com.salampakistan.ui.fragments.whattodo

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhatToDoCategoryListViewModel @Inject constructor(app: Application, val repo: TripsRepo) :
    BaseViewModel(app) {

    fun getLocationsForActivity(categoryId: String) = repo.getLocationsForActivity(categoryId)
    fun getCategoryLocations(categoryId: String) = repo.getLocationsForCategory(categoryId)
}