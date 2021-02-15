package com.salampakistan.model.hotelsearchresponse

import java.time.DayOfWeek

data class Hotel(
    val AccommodationTypeName: String,
    val addressInfo: String,
    val cancellationPolicyType: String,
    val currencyCode: String,
    val discountedRate: Int,
    val featuredImage: String,
    val hotelAmenities: ArrayList<String>,
    val hotelLocation: String,
    val hotelName: String,
    val hotelRefId: String,
    val hotelSource: String,
    val images: ArrayList<String>,
    val maximumRate: Int,
    val minimumRate: Int,
    val overview: String,
    val rating: Any,
    val roomsLeft: Int,
    var daysDifference:Int
)