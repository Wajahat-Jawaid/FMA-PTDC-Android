package com.salampakistan.network.repos

import androidx.lifecycle.LiveData
import com.salampakistan.model.response.SimpleApiResponse
import com.salampakistan.model.response.user.LoginResponse
import com.salampakistan.network.Result
import com.salampakistan.network.WebService
import com.salampakistan.network.resultLiveData
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Singleton
class UsersRepo @Inject constructor(private val service: WebService) : BaseRepo() {

    fun login(params: Array<String>) =
        resultLiveData { getResult { service.login(params[0], params[1]) } }

    fun forgotPassword(email: String): LiveData<Result<SimpleApiResponse>> {
        return resultLiveData { getResult { service.forgotPasswor(email) } }
    }

    fun register(params: Array<String>): LiveData<Result<LoginResponse>> {

        Timber.d("params: %s", params[0])
        Timber.d("params: %s", params[1])
        Timber.d("params: %s", params[2])
        Timber.d("params: %s", params[3])
        Timber.d("params: %s", params[4])
        Timber.d("params: %s", params[5])
        Timber.d("params: %s", params[6])
        return resultLiveData {
            getResult {
                service.register(
                    params[0], params[1], params[2], params[3], params[4], params[5], params[6]
                )
            }
        }
    }

    fun editProfile(
        id: String,
        token: String,
        firstName: String,
        lastName: String,
        mobile: String,
        nic: String,
        gender: String,
        dob: String
    ) = resultLiveData {
        getResult {
            val url = "${WebService.BASE_URL}users/$id"
            service.editProfile(
                url,
                token,
                firstName,
                lastName,
                mobile,
                nic,
                gender,
                dob
            )
        }
    }

    fun UpdatePassword(id: String, token: String, oldPassword: String, newPassword: String) =
        resultLiveData {
            getResult {
                val url = "${WebService.BASE_URL}users/$id/password"
                service.updatePassword(url, token, oldPassword, newPassword)
            }
        }

    fun updateProfilePhoto(id: String, token: String, photo: String) = resultLiveData {
        getResult {
            service.uploadProfileImage(token, id, photo)
        }
    }
}