package com.salampakistan.utils.validators

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.StringRes
import com.salampakistan.R
import com.salampakistan.utils.SnackbarUtils
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
object ProfileFormValidator {

    fun validate(
        view: View,
        firstNameText: EditText,
        lastNameText: EditText,
        mobileText: EditText,
        cnicText: EditText,
        dobText: TextView,
        pwdText: EditText? = null,
        confirmPwdText: EditText? = null
    ): Boolean {
        return when {
            firstNameText.text.toString().isEmpty() -> {
                showSnack(view, R.string.invalid_first_name)
                false
            }
            lastNameText.text.toString().isEmpty() -> {
                showSnack(view, R.string.invalid_last_name)
                false
            }
            mobileText.text.toString().isEmpty() || !Validators.isMobileValid(mobileText.text.toString()) -> {
                Timber.d("mobileText has an issue")
                showSnack(view, R.string.invalid_mobile)
                false
            }
            cnicText.text.toString().isEmpty() || !Validators.isCnicValid(cnicText.text.toString()) -> {
                Timber.d("mobileText has an issue")
                showSnack(view, R.string.invalid_cnic)
                false
            }
            dobText.text.toString().isEmpty() -> {
                Timber.d("dobText has an issue")
                showSnack(view, R.string.invalid_dob)
                false
            }
            (pwdText != null && pwdText.text.toString().isEmpty()) -> {
                Timber.d(" has an issue")
                showSnack(view, R.string.invalid_pwd)
                false
            }
            // When register screen is there
            (confirmPwdText != null && confirmPwdText.text.toString().isEmpty()) -> {
                showSnack(view, R.string.invalid_cnfrm_pwd)
                false
            }
            (confirmPwdText != null && pwdText?.text.toString().trim() != confirmPwdText.text.toString().trim()) -> {
                showSnack(view, R.string.cnfrm_pwd)
                false
            }
            else -> true
        }
    }

    private fun showSnack(view: View, @StringRes text: Int) {
        SnackbarUtils.showSnackbar(view, text)
    }
}