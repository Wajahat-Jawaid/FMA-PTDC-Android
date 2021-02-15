package com.salampakistan.ui.adapters

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.GridLayoutManager
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.BR
import com.salampakistan.R
import com.salampakistan.databinding.RowServicesBinding
import com.salampakistan.databinding.RowTrainBinding
import com.salampakistan.model.enums.TrainItemClick
import com.salampakistan.model.enums.TripDirection
import com.salampakistan.network.JSONKeys
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import rx.subjects.PublishSubject

class TrainListAdapter<VDB, M>(private val context: Context, @LayoutRes private val resId: Int) :
    BaseListAdapter<VDB, M>() {
    val clickSubject: PublishSubject<RowTrainBinding> = PublishSubject.create<RowTrainBinding>()
    val bookItemClick: PublishSubject<M> = PublishSubject.create<M>()
    val classItemClick: PublishSubject<Pair<Pair<M,TrainItemClick>,Int>> = PublishSubject.create<Pair<Pair<M,TrainItemClick>,Int>>()
    private var selectedIndex: String = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding = DataBindingUtil.bind<ViewDataBinding>(parent.inflate(resId))
        val holder = ViewHolder(viewDataBinding)
        RxView.clicks((holder.binding as RowTrainBinding).bookNowBtn)
            .subscribe {
                val model = items[holder.adapterPosition]
                bookItemClick.onNext(model)
            }
        RxView.clicks((holder.binding as RowTrainBinding).classTypeText)
            .subscribe {
                val model = items[holder.adapterPosition]
                classItemClick.onNext(Pair(Pair(model,TrainItemClick.CLASS_TYPE),holder.adapterPosition))
            }
        RxView.clicks((holder.binding as RowTrainBinding).root)
            .subscribe {
                selectedIndex = (holder.binding).model!!
                android.os.Handler().postDelayed({ notifyDataSetChanged() }, 130)
            }



        return holder
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding
        binding?.setVariable(BR.model, items[position])
        if ((binding as RowTrainBinding).model!! == selectedIndex) {
//            expand(binding.containerVew)

            if ((binding).bookNowBtn.visibility == View.VISIBLE) {
                (binding).bottomLogoText.animate().alpha(0f)
                    .setListener(animListener((binding).bottomLogoText)).duration = 100
                (binding).bookNowBtn.animate().alpha(0f)
                    .setListener(animListener((binding).bookNowBtn)).duration = 100
            } else {
                 (binding).bottomLogoText.animate().alphaBy(0f).alpha(1f)
                    .setListener(animListener((binding).bottomLogoText, true)).duration =
                    100
                (binding).bookNowBtn.animate().alphaBy(0f).alpha(1f)
                    .setListener(animListener((binding).bookNowBtn, true)).duration = 100
            }
        } else {
//                    collapse(binding.containerVew)
             (binding).bottomLogoText.animate().alpha(0f)
                .setListener(animListener((binding).bottomLogoText)).duration = 100
            (binding).bookNowBtn.animate().alpha(0f)
                .setListener(animListener((binding).bookNowBtn)).duration = 100
        }


        super.onBindViewHolder(holder, position)
    }

    private fun animListener(view: View, isVisible: Boolean = false): Animator.AnimatorListener =
        object : Animator.AnimatorListener {
            override fun onAnimationRepeat(p0: Animator?) {}
            override fun onAnimationEnd(p0: Animator?) {
                view.visibility = if (!isVisible) View.GONE else View.VISIBLE
            }

            override fun onAnimationCancel(p0: Animator?) {}
            override fun onAnimationStart(p0: Animator?) {}
        }

    private fun setHeightAnimation(view: View) {
        view.measure(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        );
        val targetHeight = ConstraintLayout.LayoutParams.WRAP_CONTENT;
        val anim = ValueAnimator.ofInt(view.measuredHeight, targetHeight)
        anim.interpolator = AccelerateInterpolator()
        anim.duration = 1600
        anim.addUpdateListener { animation ->
            val layoutParams: ViewGroup.LayoutParams = view.layoutParams
            layoutParams.height = (targetHeight * animation.animatedFraction).toInt()

        }

        anim.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                val layoutParams = view.layoutParams
                layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                view.layoutParams = layoutParams
            }
        })
        anim.start()
    }

}