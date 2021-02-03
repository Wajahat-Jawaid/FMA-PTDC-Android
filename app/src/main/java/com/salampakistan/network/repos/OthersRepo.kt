package com.salampakistan.network.repos

import com.salampakistan.network.WebService
import com.salampakistan.network.resultLiveData
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Singleton
class OthersRepo @Inject constructor(private val service: WebService) : BaseRepo() {

    fun getCurrencies() = resultLiveData { getResult { service.getCurrencies() } }
    fun getVisaStatuses() = resultLiveData { getResult { service.getVisaStatuses() } }
}