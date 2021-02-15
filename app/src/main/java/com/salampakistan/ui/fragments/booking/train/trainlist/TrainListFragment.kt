package com.salampakistan.ui.fragments.booking.train.trainlist

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentTrainListBinding
import com.salampakistan.databinding.RowTrainBinding
import com.salampakistan.network.JSONKeys
import com.salampakistan.ui.adapters.TrainListAdapter
import com.salampakistan.ui.fragments.dialog.ListDialogFragment

class TrainListFragment : BaseFragment<FragmentTrainListBinding>(), Injectable {

    private lateinit var trainListAdapter: TrainListAdapter<RowTrainBinding, String>
    private lateinit var viewModel: TrainListViewModel
    private lateinit var binding: FragmentTrainListBinding
    val arr = ArrayList<String>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)

        setView()
    }

    private fun setView() {
        arr.add("1")
        arr.add("2")
        arr.add("3")
        arr.add("4")
        arr.add("5")

        trainListAdapter = TrainListAdapter(context!!, R.layout.row_train)
        trainListAdapter.updateContent(arr)
        binding.flightRecyclerView.adapter = trainListAdapter

        trainListAdapter.bookItemClick.subscribe {
            // book now btn click implementation
        }
        trainListAdapter.classItemClick.subscribe {
            onClassTypeClicked(it.first.first,it.second)
        }
        trainListAdapter.clickSubject.subscribe {}
        RxView.clicks(binding.backBtn).subscribe { navController.navigateUp() }
    }

    fun onClassTypeClicked(t:String,index: Int) {
        val classType = ArrayList<String>()
        classType.add("Business")
        classType.add("Economy")
        val dialogFg = ListDialogFragment.getInstance(classType as ArrayList<String>)
        dialogFg.show(childFragmentManager, JSONKeys.locations)
        dialogFg.itemClickPositionSubject
            .subscribe { position ->
                run {
                    dialogFg.dismissAllowingStateLoss()
                    val classType = classType[position]
                    arr[index] = classType
                    trainListAdapter.notifyItemChanged(index)

                }
            }
    }


    override fun getViewId(): Int = R.layout.fragment_train_list

    override fun injectBinding(view: View): FragmentTrainListBinding = DataBindingUtil.bind(view)!!


    companion object {
        fun newInstance() = TrainListFragment()
    }

}