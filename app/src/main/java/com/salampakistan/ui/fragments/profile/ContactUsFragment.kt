package com.salampakistan.ui.fragments.profile

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.databinding.FragmentContactBinding

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ContactUsFragment : BaseFragment<FragmentContactBinding>(), Injectable {
    override fun getViewId() = R.layout.fragment_contact
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentContactBinding>(view)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        view!!.isFocusableInTouchMode = true
        view!!.requestFocus()
        view!!.setOnKeyListener { _, _, _ ->
            ((parentFragment as ProfileFragment).changeFragment(ProfileFragment.ViewType.OPTIONS))
            true
        }
    }

    fun onPhoneTextClicked(v: View) {
        dialogUtils.showDualActionDialog(
            getBaseActivity(),
            R.string.contact_us_confirmation_title,
            R.string.contact_us_call_confirmation_msg
        ).subscribe {
            if (it) {
                val u = Uri.parse("tel:${(v as TextView).text}")
                val i = Intent(Intent.ACTION_DIAL, u)
                try {
                    startActivity(i)
                } catch (s: SecurityException) {
                    showSnack(s.message!!)
                }
            }
        }
    }

    fun onCopyBtnClicked(text: String) {
        val clipboard = context?.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager?
        val clip = ClipData.newPlainText("label", text)
        clipboard!!.setPrimaryClip(clip)
        Handler().post {
            showSnack(
                resources.getString(
                    R.string.text_copied_to_clipboard,
                    if (text == getString(R.string.ptdc_email)) getString(R.string.email_address)
                    else getString(R.string.phone_number)
                )
            )
        }
    }

    fun onEmailTextClicked(v: View) {
        dialogUtils.showDualActionDialog(
            getBaseActivity(),
            R.string.contact_us_confirmation_title,
            R.string.contact_us_call_confirmation_msg
        ).subscribe {
            if (it) {
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("mailto:${(v as TextView).text}")
                startActivity(Intent.createChooser(intent, "Email via..."))
            }
        }
    }

    companion object {
        fun getInstance() = ContactUsFragment()
    }
}