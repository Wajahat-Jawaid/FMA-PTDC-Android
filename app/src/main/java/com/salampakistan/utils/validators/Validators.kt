package com.salampakistan.utils.validators

/**
 * General properties validations which can be used either collectively or individually at
 * different places
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
object Validators {

    fun isLocationValid(text: String?, disallowedText: String? = null): Boolean {
        return !text.isNullOrEmpty() && !text.equals(disallowedText, true)
    }

    fun isDateValid(text: String?, disallowedText: String? = null): Boolean {
        return !text.isNullOrEmpty() && !text.equals(disallowedText, true)
    }

    fun isMobileValid(mobile: String) = mobile.trim().length == 11 || mobile.trim().length == 13
    fun isCnicValid(mobile: String) = mobile.trim().length == 13 || mobile.trim().length == 15
    fun isPasswordValid(pwd: String) = pwd.trim().length >= 6
}