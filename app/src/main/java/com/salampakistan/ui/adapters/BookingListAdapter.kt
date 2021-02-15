package com.salampakistan.ui.adapters

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.BR

class BookingListAdapter<VDB, M>(@LayoutRes private val resId: Int):SimpleListAdapter<VDB, M>(resId) {


    override fun updateContent(items: List<M>?) {
        this.items = items!!
        notifyDataSetChanged()
    }
}