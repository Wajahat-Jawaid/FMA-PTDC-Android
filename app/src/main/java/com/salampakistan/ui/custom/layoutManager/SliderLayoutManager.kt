package com.salampakistan.ui.custom.layoutManager

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.abs
import kotlin.math.min

class SliderLayoutManager(context: Context?) : LinearLayoutManager(context) {

    private val mShrinkAmount = 0.08f

    // The cards will be at 50% when they are 75% of the way between the
    // center and the edge.
    private val mShrinkDistance = 0.9f

    init {
        orientation = HORIZONTAL;
    }

    private lateinit var recyclerView: RecyclerView

    override fun onAttachedToWindow(view: RecyclerView?) {
        super.onAttachedToWindow(view)
        recyclerView = view!!

        // Smart snapping
        LinearSnapHelper().attachToRecyclerView(recyclerView)
    }

    override fun onLayoutChildren(recycler: RecyclerView.Recycler?, state: RecyclerView.State) {
        super.onLayoutChildren(recycler, state)
        scrollHorizontallyBy(0, recycler, state);
    }

    override fun scrollHorizontallyBy(dx: Int, recycler: RecyclerView.Recycler?, state: RecyclerView.State?): Int {
        val scrolled = super.scrollHorizontallyBy(dx, recycler, state)
        val midpoint = width / 2f
        val d0 = 0f
        val d1 = mShrinkDistance * midpoint
        val s0 = 1f
        var s1: Float = 1f - mShrinkAmount

        for (i in 0 until childCount) {
            val child = getChildAt(i);
            val childMidpoint =
            (getDecoratedRight(child!!) + getDecoratedLeft(child)) / 2f;
            val d = min(d1, abs(midpoint - childMidpoint));
            val scale = s0 + (s1 - s0) * (d - d0) / (d1 - d0);
            child.scaleX = scale;
            child.scaleY = scale;
        }

        return scrolled;
    }
//
//    @RequiresApi(Build.VERSION_CODES.HONEYCOMB)
//    private fun scaleDownView() {
//        val mid = width / 2.0f
//        for (i in 0 until childCount) {
//
//            // Calculating the distance of the child from the center
//            val child = getChildAt(i)
//            val childMid = child?.let{(getDecoratedLeft(it) + getDecoratedRight(it)) / 2.0f}
//            val distanceFromCenter = childMid?.let{Math.abs(mid - it)}
//
//            // The scaling formula
//            val scale = 1-Math.sqrt((distanceFromCenter?.div(width))?.toDouble()!!).toFloat()*0.66f
//
//            // Set scale to view
//            child?.scaleX = scale
//            child?.scaleY = scale
//        }
//    }

//    override fun onScrollStateChanged(state: Int) {
//        super.onScrollStateChanged(state)
//
//        // When scroll stops we notify on the selected item
//        if (state.equals(RecyclerView.SCROLL_STATE_IDLE)) {
//
//            // Find the closest child to the recyclerView center --> this is the selected item.
//            val recyclerViewCenterX = getRecyclerViewCenterX()
//            var minDistance = recyclerView.width
//            var position = -1
//            for (i in 0 until recyclerView.childCount) {
//                val child = recyclerView.getChildAt(i)
//                val childCenterX = getDecoratedLeft(child) + (getDecoratedRight(child) - getDecoratedLeft(child)) / 2
//                var newDistance = Math.abs(childCenterX - recyclerViewCenterX)
//                if (newDistance < minDistance) {
//                    minDistance = newDistance
//                    position = recyclerView.getChildLayoutPosition(child)
//                }
//            }
//
//            // Notify on item selection
//            callback?.onItemSelected(position)
//        }
//    }

//    private fun getRecyclerViewCenterX() : Int {
//        return (recyclerView.right - recyclerView.left)/2 + recyclerView.left
//    }
//
//    interface OnItemSelectedListener {
//        fun onItemSelected(layoutPosition: Int)
//    }
}