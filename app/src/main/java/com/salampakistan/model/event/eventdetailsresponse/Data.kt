package com.salampakistan.model.event.eventdetailsresponse

data class Data(
    val _id: String,
    val address: String,
    val cityId: String,
    val cityName: String,
    val description: String,
    val endDate: Long,
    val endTime: String,
    val location: Location,
    val numberOfPasses: Int,
    val photos: List<Any>,
    val price: Int,
    val provinceId: String,
    val provinceName: String,
    val slug: String,
    val startDate: Long,
    val startTime: String,
    val status: String,
    val thumbnails: List<Any>,
    val title: String,
    val vendorId: String,
    val vendorName: String
)