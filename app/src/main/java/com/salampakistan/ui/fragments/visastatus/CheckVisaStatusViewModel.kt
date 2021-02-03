package com.salampakistan.ui.fragments.visastatus

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.OthersRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class CheckVisaStatusViewModel @Inject constructor(app: Application, repo: OthersRepo) :
    BaseViewModel(app) {

    val statuses = repo.getVisaStatuses()
}