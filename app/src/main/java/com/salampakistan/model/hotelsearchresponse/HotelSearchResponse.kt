package com.salampakistan.model.hotelsearchresponse

data class HotelSearchResponse(
    val `data`: List<Hotel>,
    val meta: Meta,
    val statusCode: Int
)