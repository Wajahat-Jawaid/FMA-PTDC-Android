package com.salampakistan.base

import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.esafirm.imagepicker.features.ImagePicker
import com.ethanhua.skeleton.Skeleton
import com.ethanhua.skeleton.SkeletonScreen
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.databinding.MenuBottomCameraBinding
import com.salampakistan.utils.ActionBarHelper
import com.salampakistan.utils.DialogUtils
import com.salampakistan.utils.Preferences
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
abstract class BaseFragment<out VDB> : Fragment() {

    @Inject
    protected lateinit var preferences: Preferences
    @Inject
    protected lateinit var dialogUtils: DialogUtils
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var navController: NavController

    lateinit var viewSkeleton: SkeletonScreen

    val CAMERA_PERMISSION_CODE: Int = 102
    val Gallery_PERMISSION_CODE: Int = 101
    val CAMERA_REQUEST = 1888

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Handle fragment arguments
        if (arguments != null)
            handleArguments(arguments!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(activity!!,R.id.nav_host_fragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(getViewId(), container, false)
        injectBinding(view)
        return view
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        transitionComplete()
    }

    override fun onResume() {
        super.onResume()
        val displayMetrics = resources.displayMetrics
        activity?.windowManager?.defaultDisplay?.getMetrics(displayMetrics)
    }

    open fun transitionComplete() {}

    open fun handleArguments(arguments: Bundle) {}

    @DrawableRes
    open fun getBackIcon(): Int {
        return R.drawable.ic_back_white_24dp
    }

    open fun getTitle(): String {
        return getString(R.string.app_name)
    }

    fun getApplicationInstance(): Application = getBaseActivity().application
    fun getBaseActivity() = activity as BaseActivity
    fun showToast(@StringRes text: Int) {
        showSnack(getString(text))
    }

    fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    fun showSnack(msg: String) {
        Snackbar.make(view!!, msg, Snackbar.LENGTH_SHORT).show()
    }

    fun showSnack(@StringRes msg: Int) {
        showSnack(getString(msg))
    }

    fun onBackPressed() {
        getBaseActivity().onBackPressed()
    }

    fun getToolbar(): Toolbar? {
        return view?.findViewById(R.id.toolbar)
    }

    /** LISTENERS */
    fun throttleListener(v: View) =
        RxView.clicks(v).throttleFirst(300, TimeUnit.MILLISECONDS)

    /** PROGRESS BAR */
    private var progressBar: PopupWindow? = null

    fun showProgressBar(fullScreen: Boolean) {
        if (progressBar != null) {
            return
        }
        val inflater =
            context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?
        val progressBarView =
            inflater!!.inflate(R.layout.view_progressbar, null)
        progressBar =
            PopupWindow(
                progressBarView,
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
            )
        Handler().post {
            progressBar!!.showAtLocation(view!!, Gravity.CENTER, 0, 0)
        }
    }

    fun showProgressBar() {
        if (progressBar != null) {
            return
        }
        val inflater =
            context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?
        progressBar =
            PopupWindow(
                inflater!!.inflate(R.layout.view_progressbar, null),
                context!!.resources.getDimension(R.dimen.progressbar_container_dimens).toInt(),
                context!!.resources.getDimension(R.dimen.progressbar_container_dimens).toInt()
            )
        progressBar!!.isOutsideTouchable = false
        Handler().post {
            progressBar!!.showAtLocation(view!!, Gravity.CENTER, 0, 0)
        }
    }

    fun hideProgressBar() {
        if (progressBar == null) {
            return
        }

        progressBar!!.dismiss()
        progressBar = null
    }

    fun launchWebView(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    /** Abstract methods */
    abstract fun getViewId(): Int

    abstract fun injectBinding(view: View): VDB

    /** Fragment Transition Methods */

    fun onFragmentAddedToBackStack() {
        ActionBarHelper.initialize(this)
    }

    fun popToRootFragment() {
        getBaseActivity().popToRootFragment()
    }

    fun popFragment() {
        getBaseActivity().popFragment()
    }

    fun <T> pushFragment(fragment: BaseFragment<T>) {
        getBaseActivity().handleTransition<BaseFragment<T>>(fragment = fragment)
    }

    fun <T> addFragment(fragment: BaseFragment<T>) {
        getBaseActivity().handleTransition<BaseFragment<T>>(fragment = fragment, add = true)
    }

    fun showImageMenu() {
        val dialogView =
            MenuBottomCameraBinding.inflate(LayoutInflater.from(context!!), null, false)
        val dialog = BottomSheetDialog(context!!, R.style.BottomSheetDialog_Transparent)
        dialog.setContentView(dialogView.root)
        dialog.show()

        RxView.clicks(dialogView.cameraText).subscribe {
            getImage()
            dialog.dismiss()
        }
        RxView.clicks(dialogView.galleryText).subscribe {
            getImage(false)
            dialog.dismiss()
        }
        RxView.clicks(dialogView.cancelText).subscribe { dialog.dismiss() }
    }

    fun getImage(isCamera: Boolean = true) {
        if (isCamera) {
            if (ContextCompat.checkSelfPermission(
                    context!!,
                    android.Manifest.permission.CAMERA
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                requestPermissions(
                    arrayOf(android.Manifest.permission.CAMERA),
                    CAMERA_PERMISSION_CODE
                )
            }else{
                ImagePicker.cameraOnly().start(this, CAMERA_REQUEST)
            }
        } else {
            if (ContextCompat.checkSelfPermission(
                    context!!,
                    android.Manifest.permission.READ_EXTERNAL_STORAGE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                requestPermissions(
                    arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                    Gallery_PERMISSION_CODE
                )
            }else{
                ImagePicker.create(this)
                    .multi()
                    .limit(1)
                    .showCamera(false)
                    .start()
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                ImagePicker.cameraOnly().start(this, CAMERA_REQUEST)
            } else {
                showSnack( getString(R.string.err_grant_permission))
            }
        } else if (requestCode == Gallery_PERMISSION_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                ImagePicker.create(this)
                    .multi()
                    .limit(1)
                    .showCamera(false)
                    .start()
            } else {
                showSnack( getString(R.string.err_grant_permission))
            }
        }
    }

    fun attachSkeletonViews(
        view: ViewDataBinding , @LayoutRes resId: Int
    ): SkeletonScreen {
        viewSkeleton = Skeleton.bind(view.root)
            .angle(0)
            .duration(1500)
            .load(resId)
            .show()
        return viewSkeleton
    }
}