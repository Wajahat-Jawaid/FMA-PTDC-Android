package com.salampakistan.ui.fragments.dialog

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.salampakistan.R
import com.salampakistan.base.BaseDialogFragment
import com.salampakistan.databinding.DialogFragmentListBinding
import com.salampakistan.databinding.RowRadioListBinding
import com.salampakistan.model.transportservicesresponse.Service
import com.salampakistan.ui.adapters.SimpleListAdapter
import rx.subjects.PublishSubject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ListDialogFragment : BaseDialogFragment<DialogFragmentListBinding>() {

    private lateinit var items: List<String>
    private lateinit var binding: DialogFragmentListBinding
    val itemClickPositionSubject: PublishSubject<Int> = PublishSubject.create<Int>()
    private val adapter = SimpleListAdapter<RowRadioListBinding, String>(R.layout.row_radio_list)

    override fun handleArguments(arguments: Bundle) {
        items = arguments.getStringArrayList(ITEMS)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        adapter.updateContent(items)
        binding.recyclerView.adapter = adapter
        adapter.itemClickSubject.subscribe {
            itemClickPositionSubject.onNext(items.indexOf(it))
            itemClickPositionSubject.onCompleted()
        }
    }

    override fun getViewId() = R.layout.dialog_fragment_list
    override fun injectBinding(view: View) = DataBindingUtil.bind<DialogFragmentListBinding>(view)!!

    companion object {

        private val TAG = ListDialogFragment::class.java.simpleName
        private val ITEMS = "$TAG.items"

        fun getInstance(items: ArrayList<String>): ListDialogFragment {
            val fg = ListDialogFragment()
            val bundle = Bundle()
            bundle.putStringArrayList(ITEMS, items)
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