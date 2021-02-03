package com.salampakistan.ui.fragments.booking.bus.buslist

import android.app.Application
import androidx.lifecycle.ViewModel
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.BookingRepo
import javax.inject.Inject

class BusListViewModel @Inject constructor(
    app: Application, private val repo: BookingRepo
) : BaseViewModel(app) {
    fun getBusServices(originCity: String, destinationCity: String, serviceName: String) =
        repo.getBusServices(
            originCity,
            destinationCity,
            serviceName
        )
}