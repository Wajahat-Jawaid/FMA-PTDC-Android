package com.salampakistan.model

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class User(
    val id: String,
    val token: String,
    val firstName: String,
    val middleName: String?,
    val lastName: String,
    val email: String,
    val password: String,
    val mobile: String,
    val cnic: String?,
    val gender: String,
    val dob: Long
)