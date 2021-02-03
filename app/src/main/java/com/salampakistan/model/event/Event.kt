package com.salampakistan.model.event

data class Event(
    val _id: String,
    val address: String,
    val city: List<String>,
    val description: String,
    val endDate: Long,
    val endTime: String,
    val location: Location,
    val numberOfPasses: Int,
    val price: Int,
    val province: List<String>,
    val slug: String,
    val startDate: Long,
    val startTime: String,
    val status: String,
    val thumbnails: List<String>,
    val title: String,
    val vendor: List<Any>
)