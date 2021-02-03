package com.salampakistan.model.response

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class SimpleApiResponse {

    val data: Data? = null
    val error: ErrorResponse? = null

    data class Data(val message: String)
}