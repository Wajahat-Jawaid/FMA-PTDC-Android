package com.salampakistan.model.getflightsresponse

data class Airline(
    val approxTotalPrice: Int,
    val cancelPenalty: Int,
    val changePenalty: Int,
    val direction: String,
    val discount: Int,
    val inboundRoute: List<InboundRoute>,
    val inboundRouteIsConnectingFlight: Boolean,
    val isRefundable: Boolean,
    val journey_ref_id: String,
    val outboundRoute: List<OutboundRoute>,
    val outboundRouteIsConnectingFlight: Boolean,
    val taxes: Int,
    var fromCompleteCityName:String,
    var toCompleteCityName:String
)