package com.salampakistan.ui.fragments.event

import android.app.Application
import androidx.lifecycle.ViewModel
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.EventRepo
import javax.inject.Inject

class EventListViewModel @Inject constructor(app: Application, val repo: EventRepo) :
    BaseViewModel(app) {
    fun getEvents() = repo.getEvents()

}