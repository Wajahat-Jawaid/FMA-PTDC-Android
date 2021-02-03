package com.salampakistan.ui.fragments.home.seasonexperiences

import android.app.Application
import androidx.lifecycle.LiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.seasons.festival.GetFestivalBySeasonIdResponse
import com.salampakistan.model.seasons.seasonbyid.FetchSeasonByIdResponse
import com.salampakistan.network.Result
import com.salampakistan.network.WebService.Companion.BASE_URL
import com.salampakistan.network.repos.openweather.SeasonRepo
import javax.inject.Inject

class SeasonViewModel @Inject constructor(app: Application, private val repo: SeasonRepo) : BaseViewModel(app) {
    fun getAllSeasons(search:String?=null,pageSize:Int=0,skip:Int=0)
    = repo.getAllSeasons(search,pageSize,skip)

    fun getSeasonById(seasonId:String):LiveData<Result<FetchSeasonByIdResponse>>{
        val url = "${BASE_URL}season/$seasonId"
        return repo.getSeasonById(url)
    }

    fun getFestivalBySeasonId(seasonId:String):LiveData<Result<GetFestivalBySeasonIdResponse>>{
        return repo.getFestivalBySeasonId(seasonId)
    }

}
