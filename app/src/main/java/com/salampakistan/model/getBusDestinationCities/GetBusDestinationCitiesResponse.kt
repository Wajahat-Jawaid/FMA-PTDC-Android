package com.salampakistan.model.getBusDestinationCities

data class GetBusDestinationCitiesResponse(
    val `data`: List<DestinationCity>,
    val statusCode: Int
)