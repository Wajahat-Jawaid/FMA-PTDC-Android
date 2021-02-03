package com.salampakistan.model.seasons.seasonbyid

data class Data(
    val __v: Int,
    val _id: String,
    val alias: String,
    val createdAt: String,
    val isActive: Boolean,
    val isFeatured: Boolean,
    val longDescription: String,
    val photoIds: List<String>,
    val photos: List<String>,
    val seasonalLong: String,
    val seasonalShort: String,
    val shortDescription: String,
    val sightLong: String,
    val sightShort: String,
    val thumbnails: List<String>,
    val title: String,
    val travelingLong: String,
    val travelingShort: String,
    val updatedAt: String
)