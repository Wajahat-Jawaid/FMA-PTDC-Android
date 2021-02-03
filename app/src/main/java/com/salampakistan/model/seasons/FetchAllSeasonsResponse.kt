package com.salampakistan.model.seasons

data class FetchAllSeasonsResponse(
    val `data`: List<Data>,
    val meta: Meta,
    val statusCode: Int
)