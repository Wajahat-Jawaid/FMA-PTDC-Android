package com.salampakistan.model.event

data class EventDetails(
    val __v: Int,
    val _id: String,
    val address: String,
    val city: String,
    val createdAt: String,
    val description: String,
    val endDate: Long,
    val endTime: String,
    val isActive: Boolean,
    val location: Location,
    val numberOfPasses: Int,
    val photos: List<String>,
    val price: Int,
    val province: String,
    val slug: String,
    val startDate: Long,
    val startTime: String,
    val status: String,
    val thumbnails: List<String>,
    val title: String,
    val updatedAt: String,
    val vendorId: String
)