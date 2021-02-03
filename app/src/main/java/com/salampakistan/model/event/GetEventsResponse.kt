package com.salampakistan.model.event

data class GetEventsResponse(
    val `data`: List<Event>,
    val meta: Meta,
    val statusCode: Int
)