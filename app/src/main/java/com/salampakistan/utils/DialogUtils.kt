package com.salampakistan.utils

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.StringRes
import com.salampakistan.R
import com.salampakistan.base.BaseActivity
import rx.Observable
import rx.subjects.PublishSubject
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class DialogUtils @Inject constructor() {

    private fun applyDialogWindowAttrs(dialog: Dialog) {
        dialog.context.theme.applyStyle(R.style.MyAlertDialog, true)
        val params = dialog.window!!.attributes
        params.width = dialog.context.resources.getDimension(R.dimen.dialog_width).toInt()
//        params.height = dialog.context.resources.getDimension(R.dimen.dialogHeight).toInt()
        dialog.window!!.attributes = params
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    fun showSingleActionDialog(activity: BaseActivity, @StringRes title: Int, @StringRes message: Int) =
        showSingleActionDialog(activity, activity.getString(title), activity.getString(message))

    fun showSingleActionDialog(activity: BaseActivity, title: String, message: String):
            Observable<Boolean> {
        val publishSubject = PublishSubject.create<Boolean>()
        activity.runOnUiThread {
            val dialog = Dialog(activity)

            dialog.setContentView(R.layout.dialog_simple)
            if (dialog.window == null)
                return@runOnUiThread
            applyDialogWindowAttrs(dialog)
            dialog.findViewById<TextView>(R.id.title_text).text = title
            dialog.findViewById<TextView>(R.id.msg_text).text = message
            // Buttons
            val okButton = dialog.findViewById<Button>(R.id.ok_btn)
            okButton.setOnClickListener {
                dialog.dismiss()
                publishSubject.onNext(false)
                publishSubject.onCompleted()
            }

            dialog.setCanceledOnTouchOutside(false)
            dialog.show()
        }

        return publishSubject
    }

    fun showDualActionDialog(activity: BaseActivity, @StringRes title: Int, @StringRes message: Int) =
        showDualActionDialog(activity, activity.getString(title), activity.getString(message))

    fun showDualActionDialog(activity: BaseActivity, title: String, message: String):
            Observable<Boolean> {
        Timber.d("ZZZZ showDualActionDialog()")
        val publishSubject = PublishSubject.create<Boolean>()
        activity.runOnUiThread {
            val dialog = Dialog(activity)
            dialog.setContentView(R.layout.dialog_two_btns)
            if (dialog.window == null)
                return@runOnUiThread
            applyDialogWindowAttrs(dialog)
            dialog.findViewById<TextView>(R.id.title_text).text = title
            dialog.findViewById<TextView>(R.id.msg_text).text = message
            // Buttons
            val okButton = dialog.findViewById<Button>(R.id.ok_btn)
            okButton.setOnClickListener {
                dialog.dismiss()
                publishSubject.onNext(true)
                publishSubject.onCompleted()
            }
            val cancelButton = dialog.findViewById<Button>(R.id.cancel_btn)
            cancelButton.setOnClickListener {
                dialog.dismiss()
//                publishSubject.onNext(false)
//                publishSubject.onCompleted()
            }

            dialog.setCanceledOnTouchOutside(false)

            Timber.d("Showing Dialog")
            dialog.show()
        }

        return publishSubject
    }

    fun showInputDialog(
        activity: BaseActivity,
        title: String,
        message: String,
        hint: String,
        inputType: Int,
        charLimit: Int = Constants.INVALID_INT
    ):
            Observable<String?> {
        val publishSubject = PublishSubject.create<String?>()
        activity.runOnUiThread {
            val dialog = Dialog(activity)
            dialog.setContentView(R.layout.dialog_input)
            if (dialog.window == null)
                return@runOnUiThread
            applyDialogWindowAttrs(dialog)
            dialog.findViewById<TextView>(R.id.title_text).text = title
            dialog.findViewById<TextView>(R.id.msg_text).text = message
            val inputText = dialog.findViewById<EditText>(R.id.input_text)
            inputText.inputType = inputType
            inputText.hint = hint
            if (charLimit != Constants.INVALID_INT) {
                inputText.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(4));
            }
            // Buttons
            val submitButton = dialog.findViewById<Button>(R.id.submit_btn)
            submitButton.setOnClickListener {
                if (inputText.text.toString().trim().isEmpty())
                    return@setOnClickListener
                dialog.dismiss()
                publishSubject.onNext(inputText.text.toString().trim())
                publishSubject.onCompleted()
            }
            val cancelButton = dialog.findViewById<Button>(R.id.cancel_btn)
            cancelButton.setOnClickListener {
                dialog.dismiss()
                publishSubject.onNext(null)
                publishSubject.onCompleted()
            }

            dialog.setCanceledOnTouchOutside(false)
            dialog.show()
        }

        return publishSubject
    }
}