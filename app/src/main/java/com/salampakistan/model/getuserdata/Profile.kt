package com.salampakistan.model.getuserdata

data class Profile(
    val dob: Long,
    val email: String,
    val firstName: String,
    val gender: String,
    val lastName: String,
    val middleName: Any,
    val mobile: String,
    val nic: String,
    val profilePhoto: String
)