package com.salampakistan.model.hotelsearchresponse

data class HotelRateInfo(
    val MaximumAmount: String,
    val MinimumAmount: String,
    val changedRate: String,
    val discountedRate: String,
    val priceStartingFrom: String
)