package com.salampakistan.ui.fragments.booking.hotel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.DialogFragment
import com.adroitandroid.chipcloud.ChipCloud
import com.adroitandroid.chipcloud.ChipListener
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.databinding.SortBottomSheetBinding
import com.salampakistan.model.AppliedFilterHotel
import rx.subjects.PublishSubject

class HotelListSort : BottomSheetDialogFragment() {

    lateinit var starArray:ArrayList<String>
    lateinit var binding: SortBottomSheetBinding
    val filtersAppliedSubjecthotel: PublishSubject<AppliedFilterHotel> =
        PublishSubject.create<AppliedFilterHotel>()
    val filtersClearedSubject: PublishSubject<Void> = PublishSubject.create<Void>()

    private var appliedFiltersData = AppliedFilterHotel()
    lateinit var filters: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.AppBottomSheetDialogTheme)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SortBottomSheetBinding.inflate(inflater, container, false)
        setView()
        return binding.root
    }

    private fun setView() {
        RxView.clicks(binding.doneText).subscribe { applyFilters() }
        RxView.clicks(binding.clearText).subscribe { clearFilters() }


        starArray = ArrayList()
        starArray.add("rating: high to low")
        starArray.add("rating: low to high")
        starArray.add("Price: high to low")
        starArray.add("Price: low to high")

        binding.starsChipView.parentContainer.visibility = View.VISIBLE
        generateChipCloud(
            binding.starsChipView.chipCloud,
            ChipCloud.Mode.SINGLE,
            starArray.toTypedArray(),
            starChipClickListener
        )
        setSelections()
    }

    private fun setSelections() {
        if (!filters.isNullOrEmpty()) {
            for (item in filters) {
                when (item) {
                    "rating: high to low" -> {
                        binding.starsChipView.chipCloud.setSelectedChip(0)
                    }
                    "rating: low to high" -> {
                        binding.starsChipView.chipCloud.setSelectedChip(1)
                    }
                    "Price: high to low" -> {
                        binding.starsChipView.chipCloud.setSelectedChip(2)
                    }
                    "Price: low to high" -> {
                        binding.starsChipView.chipCloud.setSelectedChip(3)
                    }
                }
            }
            filters.removeAll(filters)
        }
    }


   private val starChipClickListener = object : ChipListener {
        override fun chipDeselected(index: Int) {
               appliedFiltersData.values.removeAt(appliedFiltersData.values.indexOf(starArray[index]))
        }

        override fun chipSelected(index: Int) {
            appliedFiltersData.values.removeAll(appliedFiltersData.values)
                appliedFiltersData.values.add(starArray[index])
        }
    }

    private fun generateChipCloud(
        cloud: ChipCloud, mode: ChipCloud.Mode, strList: Array<String>, chipListener: ChipListener
    ) {
        ChipCloud.Configure()
            .chipCloud(cloud)
            .selectedColor(ContextCompat.getColor(context!!, R.color.colorPrimary))
            .selectedFontColor(ContextCompat.getColor(context!!, R.color.white))
            .deselectedColor(ContextCompat.getColor(context!!, R.color.greyF0))
            .deselectedFontColor(ContextCompat.getColor(context!!, R.color.grey41434f))
            .selectTransitionMS(250)
            .deselectTransitionMS(250)
            .labels(strList)
            .mode(mode)
            .textSize(resources.getDimensionPixelSize(R.dimen.text_small))
            .verticalSpacing(resources.getDimensionPixelSize(R.dimen.vertical_spacing))
            .minHorizontalSpacing(resources.getDimensionPixelSize(R.dimen.min_horizontal_spacing))
            .typeface(ResourcesCompat.getFont(context!!, R.font.byom_reg))
            .chipListener(chipListener)
            .build()
    }


    fun applyFilters() {
        filtersAppliedSubjecthotel.onNext(appliedFiltersData)
        filtersAppliedSubjecthotel.onCompleted()
    }


    fun clearFilters() {
        appliedFiltersData.reset()
        filtersClearedSubject.onNext(null)
        filtersClearedSubject.onCompleted()
    }


    companion object {
        private val TAG = HotelListSort::class.java.simpleName

        fun getInstance(): HotelListSort {
            val bundle = Bundle()
            val fg = HotelListSort()
            fg.arguments = bundle
            return fg
        }
    }
}