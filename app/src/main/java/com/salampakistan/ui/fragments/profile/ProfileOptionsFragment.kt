package com.salampakistan.ui.fragments.profile

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.databinding.FragmentProfileOptionsBinding
import com.salampakistan.ui.fragments.login.LoginFragment
import com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment
import com.salampakistan.utils.Preferences
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ProfileOptionsFragment : BaseFragment<FragmentProfileOptionsBinding>(), Injectable {

    private var clickable = true
    private lateinit var binding: FragmentProfileOptionsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        RxView.clicks(binding.wishlistLayout.root)
            .subscribe {
                ((parentFragment as ProfileFragment)
                    .changeFragment(ProfileFragment.ViewType.WISHLIST))
            }
        RxView.clicks(binding.contactUsLayout.root)
            .subscribe {
                ((parentFragment as ProfileFragment)
                    .changeFragment(ProfileFragment.ViewType.CONTACT))
            }
        RxView.clicks(binding.aboutUsLayout.root)
            .subscribe {
                ((parentFragment as ProfileFragment)
                    .changeFragment(ProfileFragment.ViewType.ABOUT))
            }
        RxView.clicks(binding.reviewLayout.root)
            .subscribe {
                ((parentFragment as ProfileFragment)
                    .changeFragment(ProfileFragment.ViewType.REVIEWS))
            }
    }

    override fun onResume() {
        setUserInfoContainer(binding)
        RxView.clicks(binding.logoutLayout)
            .subscribe {
                dialogUtils.showDualActionDialog(
                    getBaseActivity(),
                    R.string.logout_confirm_dialog_title,
                    R.string.logout_confirm_dialog_msg
                )
                    .subscribe {
                        if (it) {
                            clickable = true
                            binding.logoutLayout.visibility = View.GONE
                            binding.wishlistLayout.root.visibility = View.GONE
                            binding.reviewLayout.root.visibility = View.GONE
                            Preferences(context!!).clear()
                            binding.nameText.text = getString(R.string.login_signup)
                            binding.emailText.text = getString(R.string.login_to_view_details)
                            setUserInfoContainer(binding)
                        }
                    }
            }
        super.onResume()
    }

    private fun setUserInfoContainer(binding: FragmentProfileOptionsBinding) {
        val prefs = Preferences(context!!)
        if (prefs.getUser() == null) {
            binding.logoutLayout.visibility = View.GONE
            binding.editIcon.visibility = View.GONE
            binding.wishlistLayout.root.visibility = View.GONE
            binding.reviewLayout.root.visibility = View.GONE
            RxView.clicks(binding.loginContainer)
                .subscribe {
                    if (clickable) {
                        val loginFg = LoginFragment.getInstance()
                        navController.navigate(R.id.action_profileFragment_to_loginFragment)
                        loginFg.loginSuccessSubject
                            .subscribe {
                                Timber.d("Login Success Subject")
                                Handler().post {
                                    navController.navigateUp()
                                    // Update User Details View
                                    Timber.d(
                                        "prefs.getUser() != null: %b",
                                        (prefs.getUser() != null)
                                    )
                                    if (prefs.getUser() != null) {
                                        clickable = false
                                        binding.logoutLayout.visibility = View.VISIBLE
                                        binding.wishlistLayout.root.visibility = View.VISIBLE
                                        binding.reviewLayout.root.visibility = View.VISIBLE
                                        binding.userImage.visibility = View.VISIBLE
                                        binding.nameText.text = String.format(
                                            "%s %s",
                                            prefs.getUser()!!.firstName,
                                            prefs.getUser()!!.lastName
                                        )
                                        binding.emailText.text = prefs.getUser()!!.email
                                        binding.editIcon.visibility = View.VISIBLE
                                    }
                                }
                            }
                    }
                }
        } else {
            val user = prefs.getUser()
            binding.logoutLayout.visibility = View.VISIBLE
            binding.wishlistLayout.root.visibility = View.VISIBLE
            binding.reviewLayout.root.visibility = View.VISIBLE
            binding.userImage.visibility = View.VISIBLE
            binding.nameText.text = String.format(
                "%s %s",
                prefs.getUser()!!.firstName,
                prefs.getUser()!!.lastName
            )
            binding.emailText.text = user?.email
            binding.editIcon.visibility = View.VISIBLE
        }
        RxView.clicks(binding.editIcon)
            .throttleFirst(300, TimeUnit.MILLISECONDS)
            .subscribe {
                try{
                    navController.navigate(R.id.action_profileFragment_to_updateProfileFragment)
                }catch (e:Exception){}
                UpdateProfileFragment.updateSuccessSubject.subscribe { updateSuccess ->
                    run {
                        if (updateSuccess) {
                            navController.navigateUp()
                            binding.nameText.text =
                                "${prefs.getUser()?.firstName} ${prefs.getUser()?.lastName} "
                        }
                    }
                }
            }
    }

    override fun getViewId() = R.layout.fragment_profile_options
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentProfileOptionsBinding>(view)!!

    companion object {
        fun getInstance() = ProfileOptionsFragment()
    }
}