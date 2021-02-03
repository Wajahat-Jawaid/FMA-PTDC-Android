package com.salampakistan.network.repos

import com.salampakistan.network.WebService
import com.salampakistan.network.resultLiveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventRepo @Inject constructor(private val service: WebService) : BaseRepo() {
    fun getEvents() =
        resultLiveData { getResult { service.getEvents() } }

    fun getEventDetails(id: String) =
        resultLiveData { getResult { service.getEventDetails(id) } }

}