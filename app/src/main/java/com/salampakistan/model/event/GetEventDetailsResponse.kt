package com.salampakistan.model.event

data class GetEventDetailsResponse(
    val data: EventDetails,
    val statusCode: Int
)