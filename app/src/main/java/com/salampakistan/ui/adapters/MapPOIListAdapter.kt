package com.salampakistan.ui.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.BR
import com.salampakistan.R
import com.salampakistan.databinding.RowMapPoiBinding

class MapPOIListAdapter<VDB, M>(private val context: Context, @LayoutRes private val resId: Int) :
    BaseListAdapter<VDB, M>() {

    private lateinit var mRecyclerView: RecyclerView
    private var mSelectedId = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding = DataBindingUtil.bind<ViewDataBinding>(parent.inflate(resId))
        val holder = ViewHolder(viewDataBinding)
        RxView.clicks((holder.binding as RowMapPoiBinding).root)
            .subscribe {
                mSelectedId = (holder.binding).model!!._id
                val model = items[holder.layoutPosition]
                itemClickSubject.onNext(model)
                notifyDataSetChanged()
            }
        return holder
    }

    override fun updateContent(items: List<M>?) {
        super.updateContent(items)
        mSelectedId = ""
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        mRecyclerView = recyclerView
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding
        binding?.setVariable(BR.model, items[position])

        if ((binding as RowMapPoiBinding).model!!._id == mSelectedId) {
            binding.poiText.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
            binding.iconPoi.setColorFilter(
                ContextCompat.getColor(
                    context,
                    R.color.colorPrimary
                )
            )
        } else {
            binding.poiText.setTextColor(ContextCompat.getColor(context, R.color.black))
            binding.iconPoi.setColorFilter(
                ContextCompat.getColor(
                    context,
                    R.color.black
                )
            )
        }
        super.onBindViewHolder(holder, position)
    }
}