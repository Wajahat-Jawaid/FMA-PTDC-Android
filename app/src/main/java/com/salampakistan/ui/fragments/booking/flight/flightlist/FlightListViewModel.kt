package com.salampakistan.ui.fragments.booking.flight.flightlist

import android.app.Application
import androidx.lifecycle.ViewModel
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.EventRepo
import javax.inject.Inject

class FlightListViewModel @Inject constructor(app: Application, val repo: EventRepo) :
    BaseViewModel(app) {
}