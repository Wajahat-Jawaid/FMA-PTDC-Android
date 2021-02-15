package com.salampakistan.model.getairportresponse

data class GetAirPortsResponse(
    val `data`: ArrayList<AirPort>,
    val statusCode: Int
)