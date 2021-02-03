package com.salampakistan.ui.fragments.reviews

import android.app.Application
import androidx.lifecycle.LiveData
import com.salampakistan.base.BaseViewModel
import com.salampakistan.model.response.getreviewsresponse.GetReviewsResponse
import com.salampakistan.network.Result
import com.salampakistan.network.repos.TripsRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ReviewsListViewModel @Inject constructor(app: Application,private val repo: TripsRepo)
    : BaseViewModel(app) {

    fun reviews(userId:String,token:String): LiveData<Result<GetReviewsResponse>>
    { return repo.getReviews(userId,token)}
}