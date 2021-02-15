package com.salampakistan.model.getflightsresponse

data class Data(
    val airline: List<Airline>,
    val meta: Meta,
    val refId: String
)