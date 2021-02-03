package com.salampakistan.model.hotelsearchresponse

data class HotelInfo(
    val AccommodationId: Int,
    val AccommodationTypeId: Int,
    val AccommodationTypeName: String,
    val Breakfast: String,
    val CurrencyCode: String,
    val Description: String,
    val HotelLocation: String,
    val HotelSource: String,
    val Image: String,
    val Name: String,
    val cancellation_policy: String,
    val cancellation_policy_type: String,
    val isFavorite: String,
    val multi_images: ArrayList<String>,
    val rooms_left: Int
)