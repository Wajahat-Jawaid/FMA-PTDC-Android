package com.salampakistan.model.mapLocationResponse

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("_id")val id: String,
    val alias: String,
    val description: String,
    val flightId: String,
    val isActive: Boolean,
    val isFeatured: Boolean,
    val location: Location,
    val locationType: String,
    val longDescription: String,
    val name: String,
    val parentActivities: List<String>,
    val parentCategories: List<String>,
    val parentProvince: String,
    val slug: String,
    val surroundings: List<Surrounding>,
    val thumbnail: String,
    val trainId: Int,
    val type: String,
    val url: String,
    val weatherId: String
)