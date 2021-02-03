package com.salampakistan.ui.fragments.event.detail

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.event.EventDetails
import com.salampakistan.network.repos.EventRepo
import com.salampakistan.network.repos.fma.FMARepo
import javax.inject.Inject

class EventDetailsViewModel @Inject constructor(app: Application, val repo: EventRepo) :
    BaseViewModel(app) {
    val event = MutableLiveData<EventDetails>()

    fun getEventDetails(id:String) = repo.getEventDetails(id)
    fun getEvents() = repo.getEvents()

}