package com.salampakistan.ui.fragments.season

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentSeasonDetailsBinding
import com.salampakistan.databinding.RowSeasonFestivityBinding
import com.salampakistan.model.Season
import com.salampakistan.model.seasons.Data
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.home.seasonexperiences.SeasonViewModel
import com.salampakistan.utils.Constants.SEASONDETAILS

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class SeasonDetailsFragment : BaseFragment<FragmentSeasonDetailsBinding>(), Injectable {

    private lateinit var season: Data
    private lateinit var viewModel: SeasonViewModel
    private lateinit var binding: FragmentSeasonDetailsBinding

    override fun handleArguments(arguments: Bundle) {
        season = arguments.getParcelable(SEASONDETAILS)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)
        setData()
        RxView.clicks(binding.toolbar.backBtnView.backBtn).subscribe { navController.navigateUp() }
    }

    private fun setData() {
        viewModel.getSeasonById(season._id).observe(viewLifecycleOwner, Observer {
            when(it.status){
                Result.Status.LOADING -> {
                    showProgressBar()
                }
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if(it.data?.data != null){
//                        val data = resources.getStringArray(R.array.fall)
                        val data = it.data?.data

                setViews(
                    data.photos[0], data.title.capitalize(), data.shortDescription, data.longDescription,
                    data.photos[1], data.photos[2], data.photos[3], data.photos[4],
                    data.photos[5], getString(R.string.sights_of_text, data.title),
                    data.sightShort, data.sightLong, data.seasonalShort, data.seasonalLong, data.photos[6],
                    getString(R.string.travelling_text, data.title),
                    data.travelingShort, data.travelingLong, data.photos[7],
                    getString(R.string.festivities_n_events_text, data.title),"", null,null
//                    festivitiesTitles, festivitiesDesc, festivitiesImages
                )
                    }
                }
                Result.Status.ERROR -> {hideProgressBar()}
            }
        })
        viewModel.getFestivalBySeasonId(season._id).observe(viewLifecycleOwner, Observer {
            when(it.status){
                Result.Status.LOADING -> {
                    showProgressBar()
                }
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if(it.data?.data != null){
                        val data = it.data?.data
                        val images = data.map { it -> it.thumbnail }
                        for (i in data.indices) {
                            val rowBinding = inflateFestivitiesRow(binding.festivitiesLayout)
                            rowBinding.index = i.inc()
                            rowBinding.festivity = data[i].title
                            rowBinding.desc = data[i].description

                            binding.festivitiesLayout.addView(rowBinding.root)
                            expandCollapseFestivityRow(0, images)
                            throttleListener(rowBinding.root).subscribe {
                                expandCollapseFestivityRow(i, images)
                            }
                        }
                    }
                }
                Result.Status.ERROR -> {hideProgressBar()}
            }
        })
    }

    private fun setViews(
        bannerImg: String, title: String, shortDesc: String,
        desc: String, img1: String, img2: String, img3: String, img4: String, img5: String,
        sightsTitle: String, sightsText1: String, sightsText2: String, foodsText1: String,
        foodsText2: String, foodsImg: String, travellingTitle: String,
        travellingText1: String, travellingText2: String, travellingImg: String,
        festivitiesHeading: String, festivitiesText:String,
        festivitiesDesc: Array<String>?, festivitiesImages: Array<Int>?
    ) {
        Glide.with(this).load(bannerImg).into(binding.bannerImg)
        binding.titleText.text = title
        binding.shortDescText.text = shortDesc
        binding.descText.text = desc
        Glide.with(this).load(img1).error(R.drawable.bg_loader).into(binding.img1)
        Glide.with(this).load(img2).error(R.drawable.bg_loader).into(binding.img2)
        Glide.with(this).load(img3).error(R.drawable.bg_loader).into(binding.img3)
        Glide.with(this).load(img4).error(R.drawable.bg_loader).into(binding.img4)
        Glide.with(this).load(img5).error(R.drawable.bg_loader).into(binding.img5)

        binding.sightsTitle.text = sightsTitle
        binding.sightText1.text = sightsText1
        binding.sightText2.text = sightsText2

        binding.seasonalFoodsText1.text = foodsText1
        binding.seasonalFoodsText2.text = foodsText2
        Glide.with(this).load(foodsImg).error(R.drawable.bg_loader).into(binding.seasonalFoodsImg)

        binding.travellingTitle.text = travellingTitle
        binding.travellingText1.text = travellingText1
        binding.travellingText2.text = travellingText2
        Glide.with(this).load(travellingImg).error(R.drawable.bg_loader).into(binding.travellingImg)


        binding.festivitiesTitle.text = festivitiesHeading
        binding.festivitiesText.text = festivitiesText
    }

    private fun expandCollapseFestivityRow(rowIndex: Int, images: List<String>) {
        for (i in 0 until binding.festivitiesLayout.childCount) {
            val db = DataBindingUtil.getBinding<RowSeasonFestivityBinding>(
                binding.festivitiesLayout.getChildAt(i)
            )!!
            if (i == rowIndex) {
                db.descText.visibility = View.VISIBLE
                db.indexText.background =
                    ContextCompat.getDrawable(context!!, R.drawable.bg_green_circle)
                Glide.with(context!!).load(images[i]).error(R.drawable.bg_loader).into(binding.festivitiesImg)
            } else {
                db.descText.visibility = View.GONE
                db.indexText.background =
                    ContextCompat.getDrawable(context!!, R.drawable.bg_grey_circle)
            }
        }
    }

    private fun inflateFestivitiesRow(parent: ViewGroup) =
        DataBindingUtil.inflate<RowSeasonFestivityBinding>(
            LayoutInflater.from(context),
            R.layout.row_season_festivity,
            parent,
            false
        )

    override fun getViewId() = R.layout.fragment_season_details
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentSeasonDetailsBinding>(view)!!

    companion object {
        private val TAG = SeasonDetailsFragment::class.java.simpleName
        private val SEASON = "$TAG.season"

        fun getInstance(season: Season): SeasonDetailsFragment {
            val fg = SeasonDetailsFragment()
//            FragmentTransitionHelper.setupTransitionFromEnd(fg)
//            val bundle = Bundle()
//            bundle.putParcelable(SEASON, season)
//            fg.arguments = bundle
            return fg
        }
    }
}