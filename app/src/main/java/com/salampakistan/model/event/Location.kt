package com.salampakistan.model.event

data class Location(
    val _id: String,
    val coordinates: List<Double>,
    val type: String
)