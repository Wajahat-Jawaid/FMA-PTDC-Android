package com.salampakistan.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.databinding.FragmentImageCarouselBinding
import com.salampakistan.databinding.RowCarouselImageBinding
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.utils.FragmentTransitionHelper
import rx.subjects.PublishSubject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ImageCarouselFragment : BaseFragment<FragmentImageCarouselBinding>(), Injectable {

    private lateinit var images: ArrayList<String>
    val imageViewSubject = PublishSubject.create<Pair<ArrayList<String>,Int>>()

    override fun handleArguments(arguments: Bundle) {
        images = arguments.getStringArrayList(IMAGES)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager =
            LinearLayoutManager(context!!, LinearLayoutManager.HORIZONTAL, false)
        val adapter =
            SimpleListAdapter<RowCarouselImageBinding, String>(R.layout.row_carousel_image)
        binding.recyclerView.adapter = adapter
        adapter.updateContent(images)
        adapter.itemClickSubject.subscribe {
            imageViewSubject.onNext(Pair(images,images.indexOf(it)))
        }
    }

    override fun getViewId() = R.layout.fragment_image_carousel
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentImageCarouselBinding>(view)!!

    companion object {

        private val TAG = ImageCarouselFragment::class.java.simpleName
        private val IMAGES = "$TAG.images"


        fun getInstance(images: ArrayList<String>): ImageCarouselFragment {
            val fg = ImageCarouselFragment()
            val bundle = Bundle()
            bundle.putStringArrayList(IMAGES, images)
            fg.arguments = bundle
            return fg
        }
    }
}