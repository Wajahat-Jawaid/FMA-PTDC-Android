package com.salampakistan.ui.fragments.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.gson.Gson
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentLoginBinding
import com.salampakistan.network.Result
import com.salampakistan.utils.InputUtils
import rx.subjects.PublishSubject
import timber.log.Timber


/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class LoginFragment : BaseFragment<FragmentLoginBinding>(), Injectable {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: LoginRegisterViewModel
    val loginSuccessSubject: PublishSubject<Boolean> = PublishSubject.create()
    val callbackManager = CallbackManager.Factory.create();
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this

        binding.forgotPwdText.setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.fragment = this;
        fbLoginn()
    }

    fun fbLoginn() {
        LoginManager.getInstance().registerCallback(callbackManager,
            object : FacebookCallback<LoginResult?> {
                override fun onSuccess(loginResult: LoginResult?) {
                    showToast("Login success")
                }

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
        super.onActivityResult(requestCode, resultCode, data)
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
                            navController.navigate(R.id.action_loginFragment_to_homeFragment)
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

    fun onCreateAccountBtnClicked() {
        navController.navigate(R.id.action_loginFragment_to_registerFragment)
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
    }
}