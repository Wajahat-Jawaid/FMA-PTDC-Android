package com.salampakistan.model.getbusservicesreponse

data class Data(
    val cancellation_before: Int,
    val cancellation_fee: Int,
    val destination_city_id: Int,
    val destination_city_name: String,
    val destination_short: String,
    val destination_terminal_address: String,
    val destination_terminal_lat: String,
    val destination_terminal_lng: String,
    val flexifare: Int,
    val offer: String,
    val origin_city_id: Int,
    val origin_city_name: String,
    val origin_short: String,
    val origin_terminal_address: String,
    val origin_terminal_lat: String,
    val origin_terminal_lng: String,
    val priority: Int,
    val service_id: Int,
    val service_name: String,
    val thumbnail: String
)