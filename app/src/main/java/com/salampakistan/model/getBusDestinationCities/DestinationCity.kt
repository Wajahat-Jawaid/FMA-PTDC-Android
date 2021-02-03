package com.salampakistan.model.getBusDestinationCities

data class DestinationCity(
    val destination_city_id: Int,
    val destination_city_name: String,
    val lat: String,
    val lng: String,
    val short_name: String
)