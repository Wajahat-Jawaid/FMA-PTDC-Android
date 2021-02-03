package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Blog

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetCategoryBlogsResponse {

    @SerializedName("data")
    val blogs: ArrayList<Blog>? = null
}