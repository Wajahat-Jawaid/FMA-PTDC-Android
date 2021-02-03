package com.salampakistan.model.seasons.festival

data class Data(
    val _id: String,
    val description: String,
    val isActive: Boolean,
    val isFeatured: Boolean,
    val seasonId: String,
    val thumbnail: String,
    val title: String
)