package com.salampakistan.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.ethanhua.skeleton.SkeletonScreen
import com.salampakistan.utils.DialogUtils
import com.salampakistan.utils.Preferences
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
abstract class BaseDialogFragment<out VDB> : DialogFragment() {

    @Inject
    lateinit var preferences: Preferences
    @Inject
    protected lateinit var dialogUtils: DialogUtils
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var skeleton: SkeletonScreen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null)
            handleArguments(arguments!!)
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

        val window = dialog!!.window ?: return
        val params = window.attributes
        params.width = (resources.displayMetrics.widthPixels * 0.90).toInt()
        params.height = (resources.displayMetrics.heightPixels * 0.80).toInt()
        window.attributes = params
    }

    open fun transitionComplete() {}

    open fun handleArguments(arguments: Bundle) {}

    /** Abstract methods */
    abstract fun getViewId(): Int

    abstract fun injectBinding(view: View): VDB
}