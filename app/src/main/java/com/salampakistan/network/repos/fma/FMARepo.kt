package com.salampakistan.network.repos.fma

import com.salampakistan.network.fma.FMAWebService
import com.salampakistan.network.repos.BaseRepo
import com.salampakistan.network.resultLiveData
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Singleton
class FMARepo @Inject constructor(private val service: FMAWebService) : BaseRepo() {

    fun getCategoryBlogs(category: String) =
        resultLiveData { getResult { service.getCategoryBlogs(category) } }

    fun getTrips() = resultLiveData { getResult { service.getTrips() } }

    fun getTripDetails(autoId: Int, trimmedSlug: String) =
        resultLiveData { getResult { service.getEventDetails(autoId, trimmedSlug) } }
}