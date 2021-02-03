package com.salampakistan.base

import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.ethanhua.skeleton.Skeleton
import com.ethanhua.skeleton.SkeletonScreen

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
abstract class BaseListFragment<out VDB> : BaseFragment<VDB>() {
    
    lateinit var skeleton: SkeletonScreen

    fun attachSkeletonViews(
        recyclerView: RecyclerView,
        adapter: RecyclerView.Adapter<*>, @LayoutRes resId: Int
    ): SkeletonScreen {
        skeleton = Skeleton.bind(recyclerView)
            .adapter(adapter)
            .angle(0)
            .duration(1500)
            .load(resId)
            .show()
        return skeleton
    }
}