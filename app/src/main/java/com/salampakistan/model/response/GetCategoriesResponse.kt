package com.salampakistan.model.response

import com.google.gson.annotations.SerializedName
import com.salampakistan.model.Category

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class GetCategoriesResponse {

    @SerializedName("data")
    val data: List<Category>? = null
}