package com.salampakistan.model.event

data class Event(
    val _id: String,
    val address: String,
    val city: String,
    val description: String,
    val endDate: Long,
    val endTime: String,
    val location: Location,
    val numberOfPasses: Int,
    val price: Int,
    val province: String,
    val slug: String,
    val startDate: Long,
    val startTime: String,
    val status: String,
    val thumbnails: List<Any>,
    val title: String,
    val vendor: String
)