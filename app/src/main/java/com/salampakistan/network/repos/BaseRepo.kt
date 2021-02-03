package com.salampakistan.network.repos

import androidx.lifecycle.MutableLiveData
import org.json.JSONObject
import retrofit2.Response
import timber.log.Timber

/**
 * Abstract Base Repository class with error handling
 */
abstract class BaseRepo {

    private val retryCount = MutableLiveData(0)

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): com.salampakistan.network.Result<T> {
        try {
            val response = call()
            val url = response.raw().request.url
            Timber.d("request url: %s", url)
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return com.salampakistan.network.Result.success(body)
            }
            // Retry for another 2 times
            if (retryCount.value!! < retryLimit) {
                retryCount.value = retryCount.value?.inc()
                return getResult(call)
            }
            // If after 3 attempts, it still fails, return an error
            return error(" ${response.code()} ${JSONObject(response.errorBody()?.string()).getJSONObject("error").getString("message")}")
        } catch (e: Exception) {
            return error(e.message ?: e.toString())
        }
    }

    private fun <T> error(message: String): com.salampakistan.network.Result<T> {
        Timber.e(message)
        return com.salampakistan.network.Result.error("Network call has failed for a following reason: $message")
    }

    companion object {
        private const val retryLimit = 3
    }
}