package com.salampakistan.ui.fragments.search

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    companion object {
        fun newInstance() = SearchFragment()
    }


    override fun getViewId(): Int = R.layout.fragment_search
    override fun injectBinding(view: View): FragmentSearchBinding = DataBindingUtil.bind(view)!!

}