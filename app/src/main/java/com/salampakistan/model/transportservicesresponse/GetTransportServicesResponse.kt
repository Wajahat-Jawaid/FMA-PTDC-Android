package com.salampakistan.model.transportservicesresponse

data class GetTransportServicesResponse(
    val `data`: List<Service>,
    val statusCode: Int
)