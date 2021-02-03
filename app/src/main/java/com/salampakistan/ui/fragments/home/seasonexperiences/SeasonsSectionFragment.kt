package com.salampakistan.ui.fragments.home.seasonexperiences

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.salampakistan.R
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.model.Season
import com.salampakistan.model.seasons.Data
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.home.BaseHomeSectionFragment
import com.salampakistan.utils.Constants

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class SeasonsSectionFragment : BaseHomeSectionFragment<Data>(), Injectable {
    lateinit var seasonViewModel: SeasonViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        seasonViewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)
        configAdapter(Season)
        setIntro(R.string.all_four_seasons_to_enjoy)
        setTitle(R.string.experience_the_seasons)
        setSeeAllFlag(false)
        getData()
    }

    private fun getData() {
        seasonViewModel.getAllSeasons().observe(viewLifecycleOwner, Observer {
            when(it.status){
                Result.Status.SUCCESS -> {
                    if(it.data?.data!=null)
                    {
                        val item = it.data?.data
                        setData(item)
                    }
                }
                Result.Status.LOADING -> {}
                Result.Status.ERROR -> {
                    showSnack(it.message.toString())
                }
            }
        })
    }

    override fun viewAllTextClicked() {
    }

    override fun onListItemClicked(model: Data) {
        val bundle = Bundle()
        bundle.putParcelable(Constants.SEASONDETAILS,model)
        navController.navigate(R.id.action_homeFragment_to_seasonDetailsFragment,bundle)
    }

    companion object {
        fun getInstance() =
            SeasonsSectionFragment()
    }
}