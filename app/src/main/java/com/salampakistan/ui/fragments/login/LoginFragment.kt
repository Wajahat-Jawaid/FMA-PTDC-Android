package com.salampakistan.ui.fragments.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.GraphRequest
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentLoginBinding
import com.salampakistan.network.Result
import com.salampakistan.utils.InputUtils
import com.salampakistan.utils.Preferences
import rx.subjects.PublishSubject
import timber.log.Timber


/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class LoginFragment : BaseFragment<FragmentLoginBinding>(), Injectable {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: LoginRegisterViewModel

    lateinit var mGoogleSignInClient: GoogleSignInClient
    val callbackManager = CallbackManager.Factory.create();
    private val RC_SIGN_IN = 1
    var email: String = ""
    var id: String = ""
    var firstName: String = ""
    var lastName: String = ""
    var pictureObject: String = ""
    var token: String = ""
    var photoUrl: String = ""

    private val gso: GoogleSignInOptions by lazy {
        GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
    }

    override fun onStart() {
        super.onStart()
        val account = GoogleSignIn.getLastSignedInAccount(activity!!)
        if (account != null) {
            try {
//                navController.navigate(R.id.action_loginFragment_to_homeFragment)
            } catch (e: Exception) {
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this

        binding.forgotPwdText.setOnClickListener {
            try {
                navController.navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
            } catch (e: Exception) {
            }
        }
        super.onViewCreated(view, savedInstanceState)

        setSocialLogin()
        RxView.clicks(binding.fb).subscribe {
            binding.fbLoginBtn.setReadPermissions("email")
            binding.fbLoginBtn.performClick()
            fbLogin()
        }
    }

    private fun setSocialLogin() {
        binding.fbLoginBtn.fragment = this;
        RxView.clicks(binding.google).subscribe { googlesignIn() }
        mGoogleSignInClient = GoogleSignIn.getClient(activity!!, gso)
    }

    private fun googlesignIn() {
        binding.googleSignInBtn.performClick()
        val intent = mGoogleSignInClient!!.signInIntent
        startActivityForResult(intent, RC_SIGN_IN)
    }

    fun fbLogin() {
        LoginManager.getInstance().registerCallback(callbackManager,
            object : FacebookCallback<LoginResult?> {
                override fun onSuccess(loginResult: LoginResult?) {
                    val request = GraphRequest.newMeRequest(
                        loginResult?.accessToken
                    ) { `object`, response ->
                        // Application code

                        try {
//                            Timber.d("das",response.jsonObject.toString())
                            email = response.jsonObject["email"].toString()
                            firstName = response.jsonObject["first_name"].toString()
                            lastName = response.jsonObject["last_name"].toString()
                            id = response.jsonObject["id"].toString()
                            photoUrl = "https://graph.facebook.com/$id/picture?type=large"
                            showSnack("token is missing")
                        } catch (e: java.lang.Exception) {
                        }
                    }
                    val parameters = Bundle()
                    parameters.putString(
                        "fields",
                        "id,name,email,link,first_name,last_name,picture.type(large)"
                    )
                    request.parameters = parameters
                    request.executeAsync()
                }

                // Application code


                override fun onCancel() {
                    // App code
                }

                override fun onError(exception: FacebookException) {
                    showToast("Login ${exception.localizedMessage}")
                }
            })
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) {
        callbackManager.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val task =
                GoogleSignIn.getSignedInAccountFromIntent(data)

            try {
                showSnack("token is missing")
                val account: GoogleSignInAccount? = task.getResult(ApiException::class.java)

//                val intent = Intent(this@LoginFragment, UserProfile::class.java)
//                startActivity(intent)

            } catch (e: ApiException) {
                // The ApiException status code indicates the detailed failure reason.
                // Please refer to the GoogleSignInStatusCodes class reference for more information.
//                Log.e("TAG","signInResult:failed code=" + e.statusCode)
            }
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    fun login() {
        InputUtils.hideSoftKeyboard(activity!!)
        if (validate()) {
            val params = arrayOf(
                binding.emailText.text.toString().trim(),
                binding.pwdText.text.toString().trim()
            )
            viewModel.login(params).observe(this, Observer {
                Timber.d("Got response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        hideProgressBar()
                        if (it.data?.data != null) {
                            val success =
                                ResponseHandler.handleSuccessResponse(context!!, it.data, params[1])
                            getUserData(it.data?.data?.id.toString(), it.data.data.token.toString())

                        } else {
                            showSnack(R.string.invalid_credentials)
                        }
                    }
                    Result.Status.LOADING -> {
                        showProgressBar(true)
                    }
                    Result.Status.ERROR -> {
                        hideProgressBar()
                        showSnack(R.string.invalid_credentials)
                    }
                }
            })
        }
    }

    fun getUserData(userId: String, token: String) {
        viewModel.getUserData(userId, token).observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                }
                Result.Status.SUCCESS -> {
                    if (it.data?.data != null) {
                        if (!it.data.data.photos.isNullOrEmpty()) {
                            preferences.insert(
                                Preferences.KEYS.PHOTOURL.toString(),
                                it.data?.data!!.photos[0]
                            )
                        }
                    }
                    navController.navigateUp()
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }


    fun onCreateAccountBtnClicked() {
        try {
            navController.navigate(R.id.action_loginFragment_to_registerFragment)
        } catch (e: Exception) {
        }
    }

    private fun validate(): Boolean {
        if (binding.emailText.toString().isEmpty()) {
            showSnack(R.string.invalid_email)
            return false
        }
        if (binding.emailText.toString().isEmpty()) {
            showSnack(R.string.invalid_pwd)
            return false
        }
        return true
    }

    override fun getViewId() = R.layout.fragment_login
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentLoginBinding>(view)!!

    companion object {
        fun getInstance() = LoginFragment()
        val loginSuccessSubject: PublishSubject<Boolean> = PublishSubject.create()
    }
}