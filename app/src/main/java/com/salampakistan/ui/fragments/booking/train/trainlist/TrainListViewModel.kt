package com.salampakistan.ui.fragments.booking.train.trainlist

import android.app.Application
import androidx.lifecycle.ViewModel
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.BookingRepo
import javax.inject.Inject

class TrainListViewModel@Inject constructor(
    app: Application, private val repo: BookingRepo
) : BaseViewModel(app) {
}