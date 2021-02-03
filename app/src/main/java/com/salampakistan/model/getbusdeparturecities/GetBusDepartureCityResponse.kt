package com.salampakistan.model.getbusdeparturecities

data class GetBusDepartureCityResponse(
    val `data`: List<DepartureCity>,
    val statusCode: Int
)