package com.salampakistan.ui.fragments.wishlist

import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.databinding.RowWishlistBinding
import com.salampakistan.model.WishList
import com.salampakistan.ui.adapters.SimpleListAdapter
import rx.subjects.PublishSubject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WishlistAdapter : SimpleListAdapter<RowWishlistBinding, WishList>(R.layout.row_wishlist) {

    val addToPlanSubject = PublishSubject.create<String>()
    val removeSubject = PublishSubject.create<Pair<Int, String>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding =
            DataBindingUtil.bind<RowWishlistBinding>(parent.inflate(R.layout.row_wishlist))
        val holder = ViewHolder(viewDataBinding)
        RxView.clicks(viewDataBinding!!.addToPlanBtn)
            .takeUntil(RxView.detaches(parent))
            .subscribe {
                val model = items[holder.adapterPosition]
                addToPlanSubject.onNext(model.id)
            }
        RxView.clicks(viewDataBinding.removeBtn)
            .takeUntil(RxView.detaches(parent))
            .subscribe {
                val model = items[holder.adapterPosition]
                removeSubject.onNext(Pair(holder.adapterPosition, model.id))
            }
        return holder
    }
}