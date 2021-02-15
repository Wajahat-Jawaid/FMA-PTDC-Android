package com.salampakistan.model.tripslist

data class GetAllTripsResponse(
    val `data`: List<Trip>,
    val meta: Meta,
    val statusCode: Int
)