package com.salampakistan.utils

import android.view.View
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
object SnackbarUtils {

    fun showSnackbar(v: View?, @StringRes text: Int) {
        showSnackbar(v, v?.context?.getString(text))
    }

    fun showSnackbar(v: View?, snackbarText: String?) {
        if (v == null || snackbarText == null) {
            return
        }
        Snackbar.make(v, snackbarText, Snackbar.LENGTH_SHORT).show()
    }
}