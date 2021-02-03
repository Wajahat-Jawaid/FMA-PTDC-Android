package com.salampakistan.network.fma

import com.salampakistan.model.response.TripDetailsResponse
import com.salampakistan.model.response.GetCategoryBlogsResponse
import com.salampakistan.model.response.GetTripsResponse
import com.salampakistan.network.JSONKeys
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
interface FMAWebService {

    companion object {
        const val BASE_URL = "https://www.findmyadventure.pk/api/"
    }

    @GET("blog/blogCategory")
    suspend fun getCategoryBlogs(@Query("blogCategory") category: String):
            Response<GetCategoryBlogsResponse>

    @GET("v2/events/search?durationFrom=1&durationTo=3&dateFrom=2020-10-21&dateTo=2021-03-20&eventType=fma&isDomestic=true&country=PK&pageSize=4")
    suspend fun getTrips(): Response<GetTripsResponse>

    @GET("v2/events/")
    suspend fun getEventDetails(
        @Query(JSONKeys.autoId) id: Int,
        @Query(JSONKeys.trimmedSlug) trimmedSlug: String
    ): Response<TripDetailsResponse>
}