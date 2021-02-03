package com.salampakistan.utils

import android.transition.Slide
import android.transition.Transition
import android.view.Gravity
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.transition.Slide.GravityFlag
import com.salampakistan.base.BaseFragment
import timber.log.Timber

object FragmentTransitionHelper {

    private const val ENTER_DURATION = 190
    private const val EXIT_DURATION = 190

    private enum class Direction {
        TOP,
        END,
        BOTTOM,
        START
    }

    /** SETUP ENTER AND EXIT TRANSITIONS */
    fun setupTransitionFromTop(fragment: BaseFragment<*>) {
        setupTransition(fragment, Direction.TOP)
    }

    fun setupTransitionFromEnd(fragment: BaseFragment<*>) {
        setupTransition(fragment, Direction.END)
    }

    fun setupTransitionFromBottom(fragment: BaseFragment<*>) {
        setupTransition(fragment, Direction.BOTTOM)
    }

    fun setupTransitionFromStart(fragment: BaseFragment<*>) {
        setupTransition(fragment, Direction.START)
    }

    /** UPDATE ONLY ENTER TRANSITIONS */
    fun updateEnterTransitionFromStart(fragment: BaseFragment<*>) {
        updateEnterTransition(fragment, Direction.START)
    }

    fun updateEnterTransitionFromEnd(fragment: BaseFragment<*>) {
        updateExitTransition(fragment, Direction.END)
    }

    /** UPDATE ONLY EXIT TRANSITIONS */
    fun updateExitTransitionToStart(fragment: BaseFragment<*>) {
        updateExitTransition(fragment, Direction.START)
    }

    fun updateExitTransitionToEnd(fragment: BaseFragment<*>) {
        updateExitTransition(fragment, Direction.END)
    }

    private fun updateEnterTransition(fragment: BaseFragment<*>, direction: Direction) {
        @GravityFlag val gravity = when (direction) {
            Direction.TOP -> Gravity.TOP
            Direction.END -> Gravity.END
            Direction.BOTTOM -> Gravity.BOTTOM
            else -> Gravity.START
        }
        val enterSlide = Slide()
        enterSlide.slideEdge = gravity
        enterSlide.duration = ENTER_DURATION.toLong()
        enterSlide.interpolator = AccelerateDecelerateInterpolator()
        fragment.enterTransition = enterSlide
        fragment.reenterTransition = enterSlide
        enterSlide.addListener(createStandardTransitionListener(fragment))

        fragment.allowEnterTransitionOverlap = true
    }

    private fun updateExitTransition(fragment: BaseFragment<*>, direction: Direction) {
        @GravityFlag val gravity = when (direction) {
            Direction.TOP -> Gravity.TOP
            Direction.END -> Gravity.END
            Direction.BOTTOM -> Gravity.BOTTOM
            else -> Gravity.START
        }

        val exitSlide = Slide()
        exitSlide.slideEdge = gravity
        exitSlide.duration = EXIT_DURATION.toLong()
        exitSlide.interpolator = AccelerateDecelerateInterpolator()
        fragment.exitTransition = exitSlide
        fragment.returnTransition = exitSlide

        fragment.allowReturnTransitionOverlap = true
    }

    private fun setupTransition(fragment: BaseFragment<*>, direction: Direction) {
        updateEnterTransition(fragment, direction)
        updateExitTransition(fragment, direction)
//        @GravityFlag val gravity = when (direction) {
//            Direction.TOP -> Gravity.TOP
//            Direction.END -> Gravity.END
//            Direction.BOTTOM -> Gravity.BOTTOM
//            else -> Gravity.START
//        }
//        val enterSlide = Slide()
//        enterSlide.slideEdge = gravity
//        enterSlide.duration = ENTER_DURATION.toLong()
//        enterSlide.interpolator = AccelerateDecelerateInterpolator()
//        fragment.enterTransition = enterSlide
//        fragment.reenterTransition = enterSlide
//        enterSlide.addListener(createStandardTransitionListener(fragment))
//
//        val exitSlide = Slide()
//        exitSlide.slideEdge = gravity
//        exitSlide.duration = EXIT_DURATION.toLong()
//        exitSlide.interpolator = AccelerateDecelerateInterpolator()
//        fragment.exitTransition = exitSlide
//        fragment.returnTransition = exitSlide
//
//        fragment.allowEnterTransitionOverlap = true
//        fragment.allowReturnTransitionOverlap = true
    }

    private fun createStandardTransitionListener(fragment: BaseFragment<*>): Transition.TransitionListener {
        Timber.d("createStandardTransitionListener()...")
        return object : Transition.TransitionListener {
            override fun onTransitionStart(transition: Transition) {
                Timber.d("onTransitionStart()...")
            }

            override fun onTransitionCancel(transition: Transition) {
                Timber.d("onTransitionCancel()...")
            }

            override fun onTransitionPause(transition: Transition) {
                Timber.d("onTransitionPause()...")
            }

            override fun onTransitionResume(transition: Transition) {
                Timber.d("onTransitionResume()...")
            }

            override fun onTransitionEnd(transition: Transition) {
                Timber.d("onTransitionEnd()...")
                fragment.transitionComplete()
            }
        }
    }
}