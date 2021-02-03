package com.salampakistan.model.hotelsearchresponse

data class Hotel(
    val addressInfo: AddressInfo,
    val hotelAmenities: HotelAmenities,
    val hotelInfo: HotelInfo,
    val hotelRateInfo: HotelRateInfo,
    val hotelRating: HotelRating,
    val hotelRefId: String,
    val sortByPrice: Int
)