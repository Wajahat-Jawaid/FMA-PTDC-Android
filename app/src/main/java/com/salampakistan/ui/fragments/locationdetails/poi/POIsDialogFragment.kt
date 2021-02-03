package com.salampakistan.ui.fragments.locationdetails.poi

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.salampakistan.R
import com.salampakistan.base.BaseDialogFragment
import com.salampakistan.databinding.DialogFragmentListBinding
import com.salampakistan.databinding.RowPoiListBinding
import com.salampakistan.databinding.RowRadioListBinding
import com.salampakistan.model.POI
import com.salampakistan.ui.adapters.SimpleListAdapter
import rx.subjects.PublishSubject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class POIsDialogFragment : BaseDialogFragment<DialogFragmentListBinding>() {

    private lateinit var items: ArrayList<POI>
    private lateinit var binding: DialogFragmentListBinding
    val poiSelectionSubject: PublishSubject<POI> = PublishSubject.create<POI>()
    private val adapter = SimpleListAdapter<RowPoiListBinding, POI>(R.layout.row_poi_list)

    override fun handleArguments(arguments: Bundle) {
        items = arguments.getParcelableArrayList(SURROUNDINGS)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        adapter.updateContent(items)
        binding.recyclerView.adapter = adapter
        adapter.itemClickSubject.subscribe {
            poiSelectionSubject.onNext(it)
            poiSelectionSubject.onCompleted()
        }
    }

    override fun getViewId() = R.layout.dialog_fragment_list
    override fun injectBinding(view: View) = DataBindingUtil.bind<DialogFragmentListBinding>(view)!!

    companion object {

        private val TAG = POIsDialogFragment::class.java.simpleName
        private val SURROUNDINGS = "$TAG.surroundings"

        fun getInstance(surroundings: ArrayList<POI>): POIsDialogFragment {
            val fg = POIsDialogFragment()
            val bundle = Bundle()
            bundle.putParcelableArrayList(SURROUNDINGS, surroundings)
            fg.arguments = bundle
            return fg
        }

//        fun <M> getInstance(): ListDialogFragment<M> {
//            val fg = ListDialogFragment<M>()
//            val bundle = Bundle()
//            fg.arguments = bundle
//            return fg
//        }
    }
}