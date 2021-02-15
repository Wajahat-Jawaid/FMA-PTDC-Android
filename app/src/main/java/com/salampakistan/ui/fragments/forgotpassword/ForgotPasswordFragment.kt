package com.salampakistan.ui.fragments.forgotpassword

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.salampakistan.MainActivity
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentForgotBinding
import com.salampakistan.network.JSONKeys.email
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.login.RegisterFragment
import com.salampakistan.ui.fragments.login.ResponseHandler
import com.salampakistan.utils.InputUtils
import rx.subjects.PublishSubject
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ForgotPasswordFragment : BaseFragment<FragmentForgotBinding>(), Injectable {

    private lateinit var binding: FragmentForgotBinding
    private lateinit var viewModel: ForgotPasswordViewModel
    val loginSuccessSubject: PublishSubject<Boolean> = PublishSubject.create()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
    }

    fun submit() {
        InputUtils.hideSoftKeyboard(activity!!)
        if(binding.emailText.text.isNullOrEmpty()){
            showSnack(getString(R.string.pleaseProvideEmail))
            return
        }
        viewModel.sendRecoveryEmail(binding.emailText.text.toString()).observe(this, Observer {
            when (it.status) {
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if (it.data?.data != null) {
                        showSnack("Password has been sent to you registered email.")
                        navController.navigateUp()
                    }
                }
                Result.Status.LOADING -> {
                    showProgressBar(true)
                }
                Result.Status.ERROR -> {
                    hideProgressBar()
                    showSnack("Invalid email address")
                }
            }
        })
    }
    private fun validate(): Boolean {
        if (binding.emailText.toString().isEmpty()) {
            showSnack(R.string.invalid_email)
            return false
        }
        return true
    }

    override fun getViewId() = R.layout.fragment_forgot
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentForgotBinding>(view)!!

    companion object {
        fun getInstance() = ForgotPasswordFragment()
    }
}