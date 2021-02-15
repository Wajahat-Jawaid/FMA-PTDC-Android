package com.salampakistan.ui.fragments.profile.update

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.esafirm.imagepicker.features.ImagePicker
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentUpdateProfileBinding
import com.salampakistan.model.User
import com.salampakistan.model.response.SimpleApiResponse
import com.salampakistan.model.uploadprofilephotoresponse.UploadProfilePhotoResponse
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordFragment
import com.salampakistan.utils.*
import com.salampakistan.utils.extension.getFormattedSingleDigit
import com.salampakistan.utils.extension.getMonthInWords
import com.salampakistan.utils.validators.ProfileFormValidator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import rx.subjects.PublishSubject
import timber.log.Timber
import java.io.File
import java.lang.Exception
import java.util.*

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class UpdateProfileFragment : BaseFragment<FragmentUpdateProfileBinding>(), Injectable {

    private lateinit var binding: FragmentUpdateProfileBinding
    private lateinit var viewModel: UpdateProfileViewModel
    private lateinit var user: User
    private var dob: String = ""
    private var dobLong = 0L
    private var gender: String = ""
    private val male = "male"
    private val female = "female"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
        populateFields()
        RxView.clicks(binding.backBtnView.backBtn).subscribe { navController.navigateUp() }
        RxView.clicks(binding.editImageText).subscribe { showImageMenu() }
        setGenderRadioGroup()

    }

    fun uploadDoc(image: com.esafirm.imagepicker.model.Image) {
        CoroutineScope(Dispatchers.Main).launch {
            val compressedImages = ImageUtils.getCompressImage(image, context!!, Dispatchers.Main)
            val list = ImageUtils.convertFileToBase64(compressedImages[0])
            binding.circleImageView.setImageURI(Uri.fromFile(compressedImages[0]))

            viewModel.uploadProfilePhoto(
                preferences.getUser()?.id.toString(),
                preferences.getUser()?.token.toString(),
                list[0]
            ).observe(viewLifecycleOwner, Observer {result ->
                handleUploadPicsResponse(result)
            })
        }
    }

    private fun handleUploadPicsResponse(it: Result<UploadProfilePhotoResponse>) {
        when (it.status) {
            Result.Status.LOADING -> {
                showProgressBar(true)
            }
            Result.Status.SUCCESS -> {
                hideProgressBar()
                preferences.insert(Preferences.KEYS.PHOTOURL.toString(), it.data?.data!!.photo)
                showSnack("profile image has been updated!")
            }
            Result.Status.ERROR -> {
                hideProgressBar()
                showSnack(it.message.toString())
            }
        }
    }


    fun showDatePicker() {
        val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val cal = Calendar.getInstance()
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            cal.set(Calendar.MONTH, month)
            cal.set(Calendar.YEAR, year)
            dobLong = cal.timeInMillis
            val formattedDate =
                "${dayOfMonth.getFormattedSingleDigit()} ${month.getMonthInWords(month)} $year"
            binding.dobText.text = formattedDate
            dob = CalendarUtils.getFormattedServerDate(year, month.inc(), dayOfMonth)
        }
        CalendarUtils.showDatePicker(context!!, listener, maxDate = System.currentTimeMillis() - 1)
    }

    fun onEditPasswordBtnClicked() {
        InputUtils.hideSoftKeyboard(getBaseActivity())
        try {
            navController.navigate(R.id.action_updateProfileFragment_to_updatePasswordFragment)
        } catch (e: Exception) {
        }
    }

    fun onSaveButtonClicked() {
        if (ProfileFormValidator.validate(
                binding.root,
                binding.firstNameText,
                binding.lastNameText,
                binding.mobileText,
                binding.cnicText,
                binding.dobText
            )
        ) {
            val updatedUser = User(
                user.id,
                user.token,
                binding.firstNameText.text.toString(),
                "",
                binding.lastNameText.text.toString(),
                user.email,
                user.password,
                binding.mobileText.text.toString(),
                binding.cnicText.text.toString(),
                gender,
                dobLong,
                ""
            )
            viewModel.editProfile(
                updatedUser.id,
                updatedUser.token,
                updatedUser.firstName,
                updatedUser.lastName,
                updatedUser.mobile,
                updatedUser.cnic!!,
                updatedUser.gender,
                dob
            )
                .observe(viewLifecycleOwner, Observer { result ->
                    Timber.d("result.status: %s", result.status)
                    Timber.d("result.data: %s", Gson().toJson(result.data))
                    when (result.status) {
                        com.salampakistan.network.Result.Status.SUCCESS -> {
                            InputUtils.hideSoftKeyboard(getBaseActivity())
                            showSnack(com.salampakistan.R.string.profile_updated_success)
                            preferences.saveUser(updatedUser)
                            hideProgressBar()
                            navController.navigateUp()
                        }
                        com.salampakistan.network.Result.Status.LOADING -> {
                            showProgressBar(true)
                        }
                        com.salampakistan.network.Result.Status.ERROR -> {
                            showSnack(result.message.toString())
                            hideProgressBar()
                        }
                    }
                })
        }
    }

    private fun populateFields() {

        if (!preferences.getString(Preferences.KEYS.PHOTOURL.toString()).isNullOrEmpty())
            Glide.with(context!!).load(preferences.getString(Preferences.KEYS.PHOTOURL.toString())).into(binding.circleImageView)

        user = preferences.getUser()!!
        Timber.d("user: %s", Gson().toJson(user))
        binding.user = user
        dobLong = user.dob
        val cal = Calendar.getInstance()
        cal.timeInMillis = dobLong
        dob = CalendarUtils.getFormattedServerDate(
            cal.get(Calendar.YEAR),
            cal.get(Calendar.MONTH) + 1,
            cal.get(Calendar.DAY_OF_MONTH)
        )
    }

    private fun setGenderRadioGroup() {
        binding.genderRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            Timber.d("Changed gender")
            gender = if (checkedId == com.salampakistan.R.id.male_radio_btn) male else female
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (ImagePicker.shouldHandle(requestCode, resultCode, data)) {
            val img = ImagePicker.getImages(data)[0]
            uploadDoc(img)
        } else if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            val img = listOf(ImagePicker.getFirstImageOrNull(data))
            uploadDoc(img[0])
        }
    }

//
//    override fun onStop() {
//        super.onStop()
//        (getBaseActivity() as MainActivity).showBottomNav(false)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        (getBaseActivity() as MainActivity).hideBottomNav()
//    }

    override fun getViewId() = com.salampakistan.R.layout.fragment_update_profile
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentUpdateProfileBinding>(view)!!

    companion object {
        val updateSuccessSubject = PublishSubject.create<Boolean>()

        fun getInstance(): UpdateProfileFragment {
            val fg = UpdateProfileFragment()
            FragmentTransitionHelper.setupTransitionFromEnd(fg)
            return fg
        }
    }
}