package com.salampakistan.network.repos.openweather

import com.salampakistan.network.JSONKeys
import com.salampakistan.network.WebService
import com.salampakistan.network.repos.BaseRepo
import com.salampakistan.network.resultLiveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SeasonRepo @Inject constructor(private val service: WebService) : BaseRepo() {
    fun getAllSeasons(search:String?,pageSize:Int,skip:Int) =
        resultLiveData { getResult { service.getAllSeasons(search,pageSize,skip) } }

    fun getSeasonById(url:String) =
        resultLiveData { getResult { service.getSeasonById(url) } }

    fun getFestivalBySeasonId(seasonId:String) =
        resultLiveData { getResult { service.getFestivalBySeasonId(seasonId) } }

}