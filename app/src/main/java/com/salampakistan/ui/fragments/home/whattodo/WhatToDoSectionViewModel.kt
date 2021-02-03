package com.salampakistan.ui.fragments.home.whattodo

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WhatToDoSectionViewModel @Inject constructor(app: Application, repo: TripsRepo) :
    BaseViewModel(app) {

    val activities = repo.getActivities()
}