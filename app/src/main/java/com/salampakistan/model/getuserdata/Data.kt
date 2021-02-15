package com.salampakistan.model.getuserdata

data class Data(
    val _id: String,
    val address: Address,
    val isActive: Boolean,
    val misc: Misc,
    val photoIds: List<String>,
    val photos: List<String>,
    val profile: Profile,
    val thumbnails: List<String>,
    val type: String,
    val verify: Verify
)