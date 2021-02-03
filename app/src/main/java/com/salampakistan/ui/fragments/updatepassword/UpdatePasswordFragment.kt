package com.salampakistan.ui.fragments.profile.updatepassword

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentAboutBinding
import com.salampakistan.databinding.UpdatePasswordFragmentBinding
import com.salampakistan.utils.InputUtils
import rx.subjects.PublishSubject

class UpdatePasswordFragment : BaseFragment<UpdatePasswordFragmentBinding>(), Injectable {

    private lateinit var viewModel: UpdatePasswordViewModel
    private lateinit var binding: UpdatePasswordFragmentBinding
    lateinit var updatePasswordSubject: PublishSubject<Void>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.update_password_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)

        binding.confirmBtn.setOnClickListener { onConfirmBtnClick() }
        super.onViewCreated(view, savedInstanceState)
    }

    fun onConfirmBtnClick() {
        if (binding.oldPwdText.text.toString().isNullOrEmpty() || binding.newPwdText.text.toString()
                .isNullOrEmpty() || binding.oldPwdText.text.toString().isNullOrEmpty()
        ) {
            showSnack("Fields are empty")
            return
        }
        if (binding.confirmPwdText.text.toString() != binding.newPwdText.text.toString()) {
            showSnack("Confirm password mismatched!")
            return
        }

        viewModel.updatePassword(
            preferences.getUser()?.id!!,
            preferences.getUser()?.token!!,
            binding.oldPwdText.text.toString(),
            binding.newPwdText.text.toString()
        ).observe(viewLifecycleOwner, Observer {
            showProgressBar()
            InputUtils.hideSoftKeyboard(getBaseActivity())
            when(it.status){
                com.salampakistan.network.Result.Status.SUCCESS -> {
                    showSnack(it.data?.data?.message.toString())
                    updatePasswordSubject.onNext(null)
                    updatePasswordSubject.onCompleted()
                    hideProgressBar()
                }
                com.salampakistan.network.Result.Status.LOADING -> {
                    showProgressBar()
                }
                com.salampakistan.network.Result.Status.ERROR -> {
                    hideProgressBar()
                    showSnack("${it.message}.")
//                            showToast(it.message.toString())
                }
            }
        })
    }

    override fun getViewId(): Int = R.layout.update_password_fragment

    override fun injectBinding(view: View) =
        DataBindingUtil.bind<UpdatePasswordFragmentBinding>(view)!!


    companion object {
        fun getInstance(): UpdatePasswordFragment {
            val fg = UpdatePasswordFragment()
            fg.updatePasswordSubject = PublishSubject.create()
            return fg
        }
    }
}