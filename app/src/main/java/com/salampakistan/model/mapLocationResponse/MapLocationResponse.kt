package com.salampakistan.model.mapLocationResponse

data class MapLocationResponse(
    val `data`: List<Data>,
    val meta: Meta,
    val statusCode: Int
)