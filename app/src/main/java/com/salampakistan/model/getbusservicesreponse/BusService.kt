package com.salampakistan.model.getbusservicesreponse

data class BusService(
    var id: Int,
    val arrivalCityName: String,
    val arrivalTerminalAddress: String,
    val arrivalTime: String,
    val availableSeats: Int,
    val busName: String,
    val bustype: String,
    val date: String,
    val departureCityName: String,
    val departureTerminalAddress: String,
    val departureTime: String,
    val discountedFare: Int,
    val facilities: List<Facility>,
    val originalFare: Int,
    val rating: Int,
    val route_id: Int,
    val schedule_id: Int,
    val serviceName: String,
    val thumbnail: String,
    val time_id: Int,
    val totalSeats: Any
)