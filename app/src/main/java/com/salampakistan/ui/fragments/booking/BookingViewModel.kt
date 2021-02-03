package com.salampakistan.ui.fragments.booking

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class BookingViewModel @Inject constructor(app: Application, val repo: TripsRepo) :
    BaseViewModel(app) {


}