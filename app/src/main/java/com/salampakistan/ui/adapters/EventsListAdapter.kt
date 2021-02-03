package com.salampakistan.ui.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.BR
import com.salampakistan.databinding.RowEventBinding
import com.salampakistan.databinding.RowMapPoiBinding
import rx.subjects.PublishSubject

class EventsListAdapter <VDB, M>(@LayoutRes private val resId: Int) :
    BaseListAdapter<VDB, M>() {
    val clickSubject: PublishSubject<M> = PublishSubject.create<M>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding = DataBindingUtil.bind<ViewDataBinding>(parent.inflate(resId))
        val holder = ViewHolder(viewDataBinding)
        RxView.clicks((holder.binding as RowEventBinding).readMoreBtn)
            .subscribe {
                val model = items[holder.adapterPosition]
                clickSubject.onNext(model)
            }
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding
        binding?.setVariable(BR.model, items[position])
        super.onBindViewHolder(holder, position)
    }

}