package com.salampakistan.utils

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

/**
 * Created by Wajahat Jawaid(wajahat.jawaid@pictabite.com)
 */
object InputUtils {

    fun showSoftKeyboard(context: Context, editText: EditText) {
        val mgr = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        mgr.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }

    fun showSoftKeyboardInDialogFragment(fragmentDialog: Dialog, editText: EditText) {
        editText.requestFocus()
        fragmentDialog.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
    }

    fun hideSoftKeyboard(activity: Activity) {
        // As the activity does not has focus in case of dialog is showing, so getting
        // view instead of activity.getCurrentFocus()
        val view = activity.findViewById<View>(android.R.id.content)
        val mgr = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        mgr.hideSoftInputFromWindow(view.windowToken, 0)
    }
}