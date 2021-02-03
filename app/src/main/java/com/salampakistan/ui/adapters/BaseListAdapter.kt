package com.salampakistan.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import rx.subjects.PublishSubject
import kotlin.properties.Delegates

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
abstract class BaseListAdapter<VDB, M> : RecyclerView.Adapter<BaseListAdapter<VDB, M>.ViewHolder>(),
    AutoUpdatableAdapter {

    var items: List<M> by Delegates.observable(emptyList()) { _, old, new ->
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding?.executePendingBindings()
    }

    val itemClickSubject: PublishSubject<M> = PublishSubject.create<M>()
    override fun getItemCount() = items.size

    open fun updateContent(items: List<M>?) {
        if(items.isNullOrEmpty())
            return
        this.items = items
        notifyDataSetChanged()
    }

    internal fun ViewGroup.inflate(layoutRes: Int) =
        LayoutInflater.from(context).inflate(layoutRes, this, false)

    inner class ViewHolder(val binding: ViewDataBinding?) :
        RecyclerView.ViewHolder(binding!!.root)
}