package com.salampakistan.model.response.user

import com.salampakistan.model.User
import com.salampakistan.model.response.ErrorResponse

class LoginResponse {

    val data: Data? = null
    val error: ErrorResponse? = null

    class Data {

        val id: String? = null
        val token: String? = null
        val type: String? = null
        val email: String? = null
        val profile: User? = null
    }
}