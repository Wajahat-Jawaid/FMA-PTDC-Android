package com.salampakistan.ui.fragments.event.detail

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.event.Event
import com.salampakistan.model.event.eventdetailsresponse.Data
import com.salampakistan.network.repos.EventRepo
import javax.inject.Inject

class EventDetailsViewModel @Inject constructor(app: Application, val repo: EventRepo) :
    BaseViewModel(app) {
    val event = MutableLiveData<Data>()

    fun getEventDetails(id:String) = repo.getEventDetails(id)
    fun getEvents() = repo.getEvents()

}