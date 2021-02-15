package com.salampakistan.model.getbusservicesreponse

data class GetBusServicesResponse(
    val `data`: List<BusService>,
    val statusCode: Int
)