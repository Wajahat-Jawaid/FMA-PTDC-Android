package com.salampakistan.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.salampakistan.R

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
abstract class BaseActivity : AppCompatActivity(), FragmentManager.OnBackStackChangedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.addOnBackStackChangedListener(this)
    }

    override fun onDestroy() {
        supportFragmentManager.removeOnBackStackChangedListener(this)
        super.onDestroy()
    }

    override fun onBackPressed() {
        if (isAtRootFragment())
            moveTaskToBack(true)
        else {
            super.onBackPressed()
        }
    }

    /* FRAGMENT TRANSITIONS */
    enum class TransitionType {
        SIBLING, DETAIL, MODAL
    }

    fun startWithFragment(fragment: BaseFragment<*>) {
        val tag = System.currentTimeMillis().toString()
        supportFragmentManager
            .beginTransaction()
            .add(getMasterContainerId(), fragment, tag)
            .addToBackStack(tag)
            .commit()
    }

    inline fun <reified T : BaseFragment<*>> handleTransition(
        transitionType: TransitionType? = null,
        fragment: BaseFragment<*>,
        add: Boolean = false
    ) {
        supportFragmentManager.beginTransaction().apply {
            transitionType?.let { setTransition(it) }
            val tag = T::class.java.name
            if (add) add(R.id.master_container, fragment, tag)
            else replace(R.id.master_container, fragment, tag)
            addToBackStack(tag)
            setReorderingAllowed(true)
            commitAllowingStateLoss()
        }
    }

    fun FragmentTransaction.setTransition(transitionType: TransitionType) {
        setCustomAnimations(
            when (transitionType) {
                TransitionType.SIBLING -> R.anim.fade_in
                TransitionType.DETAIL -> R.anim.slide_in_fragment_from_right
                TransitionType.MODAL -> R.anim.slide_in_fragment_from_right
            },
            R.anim.fade_out,
            R.anim.fade_in,
            when (transitionType) {
                TransitionType.SIBLING -> R.anim.fade_out
                TransitionType.DETAIL -> R.anim.slide_out_fragment_to_right
                TransitionType.MODAL -> R.anim.slide_out_fragment_to_right
            }
        )
    }

    fun addFragment(fragment: BaseFragment<*>) {
        val tag = System.currentTimeMillis().toString()
        supportFragmentManager
            .beginTransaction()
            .add(getMasterContainerId(), fragment, tag)
            .addToBackStack(tag)
            .commit()
    }

    fun popToRootFragment() {
        val manager = supportFragmentManager
        for (i in 0 until manager.backStackEntryCount - 1)
            manager.popBackStack()
    }

    fun popFragment() {
        supportFragmentManager.popBackStackImmediate()
    }

    fun isBackStackEmpty() = supportFragmentManager.backStackEntryCount == 0
    fun isAtRootFragment() = supportFragmentManager.backStackEntryCount == 1

    override fun onBackStackChanged() {
//        val length = supportFragmentManager.backStackEntryCount
//        val backStackEntry = supportFragmentManager.getBackStackEntryAt(length - 1)
//        val baseFragment: BaseFragment<*>? =
//            (supportFragmentManager.findFragmentByTag(backStackEntry.name) as BaseFragment<*>)
//        baseFragment?.onFragmentAddedToBackStack()
    }

    protected fun getMasterContainerId() = R.id.master_container
}