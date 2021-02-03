package com.salampakistan.utils.extension

import android.animation.ValueAnimator
import android.content.ContextWrapper
import android.view.View
import android.view.animation.Animation
import android.view.animation.DecelerateInterpolator
import android.view.animation.RotateAnimation
import androidx.appcompat.app.AppCompatActivity

/** For the Binding Adapters, provide parent activity for safe-casting */
fun View.getParentActivity(): AppCompatActivity? {
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}

fun View.transform(targetHeight: Int, duration: Int) {
    val prevHeight = this.height
    val valueAnimator = ValueAnimator.ofInt(prevHeight, targetHeight)
    valueAnimator.addUpdateListener { animation ->
        layoutParams.height = animation.animatedValue as Int
        requestLayout()
    }
    valueAnimator.interpolator = DecelerateInterpolator()
    valueAnimator.duration = duration.toLong()
    valueAnimator.start()
}

fun View.rotate(isExpand: Boolean, duration: Long) {
    val fromDegrees = if (isExpand) 180.0f else 0.0f
    val toDegrees = if (isExpand) 0.0f else 180.0f
    val rotateAnimation = RotateAnimation(
        fromDegrees,
        toDegrees,
        Animation.RELATIVE_TO_SELF,
        0.5f,
        Animation.RELATIVE_TO_SELF,
        0.5f
    )
    rotateAnimation.interpolator = DecelerateInterpolator()
    rotateAnimation.repeatCount = 0
    rotateAnimation.duration = duration
    rotateAnimation.fillAfter = true
    this.startAnimation(rotateAnimation)
}