package com.salampakistan.model.response.getpoiresponse

data class Location(
    val _id: String,
    val coordinates: List<Double>,
    val type: String
)