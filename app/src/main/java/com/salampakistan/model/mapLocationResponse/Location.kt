package com.salampakistan.model.mapLocationResponse

data class Location(
    val _id: String,
    val coordinates: List<Double>,
    val type: String
)