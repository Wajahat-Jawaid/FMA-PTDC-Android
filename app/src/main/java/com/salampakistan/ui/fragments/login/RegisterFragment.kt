package com.salampakistan.ui.fragments.login

import android.app.DatePickerDialog
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
import com.salampakistan.databinding.FragmentRegisterBinding
import com.salampakistan.network.Result
import com.salampakistan.utils.CalendarUtils
import com.salampakistan.utils.extension.getFormattedSingleDigit
import com.salampakistan.utils.extension.getMonthInWords
import com.salampakistan.utils.extension.isValidEmail
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class RegisterFragment : BaseFragment<FragmentRegisterBinding>(), Injectable {

    private lateinit var binding: FragmentRegisterBinding
    private lateinit var viewModel: LoginRegisterViewModel
    private var dob: String = ""
    private var gender: String = "male"
    private val male = "male"
    private val female = "female"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
        setGenderRadioGroup()
        setView()
    }

    private fun setView() {
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val df = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
//        binding.dobText.text = df.format(System.currentTimeMillis() - 1)
//        dob = sdf.format(System.currentTimeMillis() - 1)
    }

    fun showDatePicker() {
        val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val formattedDate =
                "${dayOfMonth.getFormattedSingleDigit()} ${month.getMonthInWords(month)} $year"
            binding.dobText.text = formattedDate
            dob = CalendarUtils.getFormattedServerDate(year, month.inc(), dayOfMonth)
        }
        CalendarUtils.showDatePicker(context!!, listener)
    }

    fun register() {
        Timber.d("validate(): %b", validate())
        if (validate()) {
            val params = arrayOf(
                binding.firstNameText.text.toString().trim(),
                binding.lastNameText.text.toString().trim(),
                binding.mobileText.text.toString().trim(),
                binding.emailText.text.toString().trim(),
                binding.pwdText.text.toString().trim(),
                gender,
                dob
            )
            viewModel.register(params).observe(this, Observer {
                Timber.d("Got response: %s", Gson().toJson(it))
                when (it.status) {
                    Result.Status.SUCCESS -> {
                        hideProgressBar()
                        if (it.data?.data != null) {
                            val success =
                                ResponseHandler.handleSuccessResponse(context!!, it.data, params[4])
                            try {
                                navController.navigate(R.id.action_registerFragment_to_homeFragment)
                            }catch (e:Exception){}
                        } else {
                            showSnack(it.message.toString())
                        }
                    }
                    Result.Status.LOADING -> {
                        showProgressBar(true)
                    }
                    Result.Status.ERROR -> {
                        hideProgressBar()
                        showSnack(it.message.toString())
                    }
                }
            })
        }
    }

    fun onLoginHereBtnClicked() {
        try{
            navController.navigate(R.id.action_registerFragment_to_loginFragment)
        }catch (e:Exception){}
    }

    private fun setGenderRadioGroup() {
        binding.genderRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            gender = if (checkedId == R.id.male_radio_btn) male else female
        }
    }

    private fun validate(): Boolean {
        return when {
            binding.firstNameText.text.toString().isEmpty() -> {
                showSnack(R.string.invalid_first_name)
                false
            }
            binding.lastNameText.text.toString().isEmpty() -> {
                showSnack(R.string.invalid_last_name)
                false
            }
            binding.mobileText.text.toString().isEmpty() -> {
                showSnack(R.string.invalid_mobile)
                false
            }
            binding.emailText.text.toString().isEmpty() -> {
                showSnack(R.string.email_empty)
                false
            }
            !binding.emailText.text.toString().isValidEmail() -> {
                showSnack(R.string.invalid_email)
                false
            }
            binding.pwdText.text.toString().isEmpty() -> {
                showSnack(R.string.invalid_pwd)
                false
            }
            binding.cnfrmPwdText.text.toString().isEmpty() -> {
                showSnack(R.string.invalid_cnfrm_pwd)
                false
            }
            binding.cnfrmPwdText.text.toString().trim().length < 6 -> {
                showSnack(R.string.pwd_length_error)
                false
            }
            binding.pwdText.text.toString().trim() != binding.cnfrmPwdText.text.toString()
                .trim() -> {
                showSnack(R.string.cnfrm_pwd)
                false
            }
            gender.isEmpty() -> {
                showSnack(R.string.invalid_gender)
                false
            }
            binding.dobText.text.toString().isNullOrEmpty() -> {
                showSnack(R.string.invalid_dob)
                false
            }
            else -> true
        }
    }

    override fun getViewId() = R.layout.fragment_register
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentRegisterBinding>(view)!!

    companion object {
        fun getInstance() = RegisterFragment()
    }
}