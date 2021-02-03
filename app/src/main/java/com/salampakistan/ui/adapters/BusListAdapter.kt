package com.salampakistan.ui.adapters


import android.animation.Animator
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Transformation
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.GridLayoutManager
import androidx.transition.TransitionManager
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.BR
import com.salampakistan.R
import com.salampakistan.databinding.RowAmenitiesBinding
import com.salampakistan.databinding.RowBusBinding
import rx.subjects.PublishSubject


class BusListAdapter<VDB, M>(private val context: Context, @LayoutRes private val resId: Int) :
    BaseListAdapter<VDB, M>() {
    val bookClickSubject: PublishSubject<M> = PublishSubject.create<M>()

    private lateinit var adapterServices: SimpleListAdapter<RowAmenitiesBinding, Any>
    private var selectedIndex: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding = DataBindingUtil.bind<ViewDataBinding>(parent.inflate(resId))
        val holder = ViewHolder(viewDataBinding)
        RxView.clicks((holder.binding as RowBusBinding).bookNowBtn)
            .subscribe {
                val model = items[holder.adapterPosition]
                bookClickSubject.onNext(model)
            }


        RxView.clicks((holder.binding as RowBusBinding).root)
            .subscribe {
                selectedIndex = (holder.binding).model!!.service_id
                notifyDataSetChanged()
            }
        adapterServices = SimpleListAdapter(R.layout.row_services)
        val arr = ArrayList<Any>()
        arr.add(Any())
        arr.add(Any())
        arr.add(Any())
        arr.add(Any())
        arr.add(Any())
        arr.add(Any())
        arr.add(Any())
        arr.add(Any())
        val layoutManager = GridLayoutManager(context, 3)
        holder.binding.recServices.layoutManager = layoutManager
        holder.binding.recServices.adapter = adapterServices
        adapterServices.updateContent(arr)
        return holder
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding
        binding?.setVariable(BR.model, items[position])

        if ((binding as RowBusBinding).model!!.service_id == selectedIndex) {
//            expand(binding.containerVew)

            if ((binding).recServices.visibility == View.VISIBLE) {
                (binding).recServices.animate().alpha(0f)
                    .setListener(animListener((binding).recServices)).duration = 1000
                (binding).bottomLogoText.animate().alpha(0f)
                    .setListener(animListener((binding).bottomLogoText)).duration = 1000
                (binding).bookNowBtn.animate().alpha(0f)
                    .setListener(animListener((binding).bookNowBtn)).duration = 1000
            } else {
                (binding).recServices.animate().alphaBy(0f).alpha(1f)
                    .setListener(animListener((binding).recServices, true)).duration = 1000
                (binding).bottomLogoText.animate().alphaBy(0f).alpha(1f)
                    .setListener(animListener((binding).bottomLogoText, true)).duration =
                    1000
                (binding).bookNowBtn.animate().alphaBy(0f).alpha(1f)
                    .setListener(animListener((binding).bookNowBtn, true)).duration = 1000
            }
        } else {
//                    collapse(binding.containerVew)
            (binding).recServices.animate().alpha(0f)
                .setListener(animListener((binding).recServices)).duration = 1000
            (binding).bottomLogoText.animate().alpha(0f)
                .setListener(animListener((binding).bottomLogoText)).duration = 1000
            (binding).bookNowBtn.animate().alpha(0f)
                .setListener(animListener((binding).bookNowBtn)).duration = 1000
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

    fun expand(v: View) {
        val matchParentMeasureSpec = View.MeasureSpec.makeMeasureSpec(
            (v.parent as View).width,
            View.MeasureSpec.EXACTLY
        )
        val wrapContentMeasureSpec = View.MeasureSpec.makeMeasureSpec(
            0,
            View.MeasureSpec.UNSPECIFIED
        )
        v.measure(matchParentMeasureSpec, wrapContentMeasureSpec)
        val targetHeight = v.measuredHeight

        // Older versions of android (pre API 21) cancel animations for views with a height of 0.
        v.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
        v.visibility = View.VISIBLE
        val a: Animation = object : Animation() {
            override fun applyTransformation(
                interpolatedTime: Float,
                t: Transformation?
            ) {
                v.layoutParams.height =
                    if (interpolatedTime == 1f) ViewGroup.LayoutParams.WRAP_CONTENT else (targetHeight * interpolatedTime).toInt()
                v.requestLayout()
            }

            override fun willChangeBounds(): Boolean {
                return true
            }
        }

        // Expansion speed of 1dp/ms
        a.duration = (targetHeight / v.context.resources.displayMetrics.density).toLong()
        v.startAnimation(a)
    }

    private fun collapse(view: ConstraintLayout) {
        TransitionManager.beginDelayedTransition(view)

        val layoutParams = view.layoutParams
        layoutParams.height = context.resources.getDimension(R.dimen.collapse_height).toInt()
        view.requestLayout()
    }
}