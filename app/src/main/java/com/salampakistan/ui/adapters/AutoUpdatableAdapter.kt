package com.salampakistan.ui.adapters

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
interface AutoUpdatableAdapter {

    fun <T> RecyclerView.Adapter<*>.autoNotify(
        old: List<T>,
        new: List<T>,
        compare: (T, T) -> Boolean
    ) {
        val diffResult = DiffUtil.calculateDiff(object : DiffUtil.Callback() {

            override fun getOldListSize() = old.size
            override fun getNewListSize() = new.size

            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                compare(old[oldItemPosition], new[newItemPosition])

            override fun areContentsTheSame(
                oldItemPosition: Int,
                newItemPosition: Int
            ) = old[oldItemPosition] == new[newItemPosition]
        })

        diffResult.dispatchUpdatesTo(this)
    }
}