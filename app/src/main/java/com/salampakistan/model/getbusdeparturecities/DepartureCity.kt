package com.salampakistan.model.getbusdeparturecities

data class DepartureCity(
    val lat: String,
    val lng: String,
    val origin_city_id: Int,
    val origin_city_name: String,
    val short_name: String
)