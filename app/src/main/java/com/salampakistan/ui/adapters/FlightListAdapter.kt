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
import com.salampakistan.databinding.RowAmenitiesBinding
import com.salampakistan.databinding.RowFlightBinding
import rx.subjects.PublishSubject
import java.util.logging.Handler


class FlightListAdapter<VDB, M>(private val context: Context, @LayoutRes private val resId: Int) :
    BaseListAdapter<VDB, M>() {
    val clickSubject: PublishSubject<RowFlightBinding> = PublishSubject.create<RowFlightBinding>()
    val bookClickSubject: PublishSubject<M> = PublishSubject.create<M>()

    private lateinit var adapterServices: SimpleListAdapter<RowAmenitiesBinding, Any>
    private var selectedIndex: String = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding = DataBindingUtil.bind<ViewDataBinding>(parent.inflate(resId))
        val holder = ViewHolder(viewDataBinding)
        RxView.clicks((holder.binding as RowFlightBinding).bookNowBtn)
            .subscribe {
                val model = items[holder.adapterPosition]
                bookClickSubject.onNext(model)
            }
        RxView.clicks((holder.binding as RowFlightBinding).root)
            .subscribe {
                selectedIndex = (holder.binding).model!!
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
        if ((binding as RowFlightBinding).model!! == selectedIndex) {
            (binding).recServices.animate().alphaBy(0f).alpha(1f).setListener(animListener(binding.containerVew,(binding).recServices,true)).duration = 1000
            (binding).bookNowBtn.animate().alphaBy(0f).alpha(1f).setListener(animListener(binding.containerVew,(binding).bookNowBtn,true)).duration = 1000
            (binding).bottomLogoText.animate().alphaBy(0f).alpha(1f).setListener(animListener(binding.containerVew,(binding).bottomLogoText,true)).duration = 1000

            android.os.Handler().postDelayed({setHeightAnimation(binding.containerVew)},1000)
        } else {

            (binding).recServices.animate().alpha(0f).setListener(animListener(binding.containerVew,(binding).recServices)).duration = 1000
            (binding).bookNowBtn.animate().alpha(0f).setListener(animListener(binding.containerVew,(binding).bookNowBtn)).duration = 1000
            (binding).bottomLogoText.animate().alpha(0f).setListener(animListener(binding.containerVew,(binding).bottomLogoText)).duration = 1000
            android.os.Handler().postDelayed({setHeightAnimation(binding.containerVew)},1000)

        }

        super.onBindViewHolder(holder, position)
    }

    private fun animListener(parentView:ConstraintLayout, view:View, isVisible:Boolean=false):Animator.AnimatorListener = object : Animator.AnimatorListener {
        override fun onAnimationRepeat(p0: Animator?) {}
        override fun onAnimationEnd(p0: Animator?) {
            view.visibility = if(!isVisible) View.GONE else View.VISIBLE
        }
        override fun onAnimationCancel(p0: Animator?) {}
        override fun onAnimationStart(p0: Animator?) {}
    }

    private fun setHeightAnimation(view:View){
        view.measure(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
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