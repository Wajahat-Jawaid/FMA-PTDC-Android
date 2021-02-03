package com.salampakistan

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.salampakistan.base.BaseActivity
import com.salampakistan.ui.fragments.home.HomeFragment
import com.salampakistan.utils.extension.transform
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : BaseActivity(), HasSupportFragmentInjector {

    private var isBottomNavHidden = false

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    private val LOCATION_PERMISSION = 101
    override fun supportFragmentInjector() = dispatchingAndroidInjector

    lateinit var navController: NavController


    enum class BottomTabMode {
        HOME,
        PLANNING,
        SEARCH,
        BLOGS,
        PROFILE
    }

    private var currentMode = BottomTabMode.HOME

    fun getCurrentMode() = currentMode
    fun setCurrentMode(mode: BottomTabMode) {
        currentMode = mode
    }

    fun navigateToHomeFragment() {
        if (currentMode != BottomTabMode.HOME) {
            currentMode = BottomTabMode.HOME
            bottom_navigation_view.menu.findItem(R.id.home).isChecked = true
            popToRootFragment()
        } else {
            // Even if current tab mode is Home, but if the current fragment is not
            // a HomeFragment, but a different one like TripsList, EventDetails etc,
            // we still need to pop all to bring to the home
            if (supportFragmentManager
                    .findFragmentById(getMasterContainerId()) !is HomeFragment
            ) {
                popToRootFragment()
            }


        }
    }

    fun showHideBottomNav() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            var prevFragId = 0
            prevFragId = navController.previousBackStackEntry?.destination?.id ?: 0
            if (prevFragId != R.id.homeFragment && prevFragId != R.id.planningFragment && prevFragId != R.id.profileFragment) prevFragId =
                1
            when (destination.id) {
    //                R.id.homeFragment -> if (prevFragId == 1) showBottomNav()
    //                R.id.planningFragment -> if (prevFragId == 1) showBottomNav()
    //                R.id.profileFragment -> if (prevFragId == 1) showBottomNav()
    //                else -> if (bottom_navigation_view.isVisible) hideBottomNav()
            }
        }
    }

    fun showBottomNav() {
        bottom_navigation_view.startAnimation(
            AnimationUtils.loadAnimation(
                this,
                R.anim.show_bottom_nav
            )
        )
        Handler().postDelayed({
            bottom_navigation_view.visibility = View.VISIBLE
        }, 300)
    }

    fun hideBottomNav() {
        bottom_navigation_view.startAnimation(
            AnimationUtils.loadAnimation(
                this,
                R.anim.hide_bottom_nav
            )
        )
        Handler().postDelayed({
            bottom_navigation_view.visibility = View.GONE
        }, 300)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Enable home option from menu buttons
        if (isAtRootFragment()) {
            currentMode = BottomTabMode.HOME
//            bottom_navigation_view.menu.findItem(R.id.home).isChecked = true
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val displayMetrics = resources.displayMetrics
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        setContentView(R.layout.activity_main)
//        bottom_navigation_view.setOnNavigationItemSelectedListener { item ->\
//            when (item.itemId) {
//                R.id.home -> {
//                    navigateToHomeFragment()
//                }
//                R.id.planning -> {
//                    if (currentMode != BottomTabMode.PLANNING) {
//                        currentMode = BottomTabMode.PLANNING
//                        addFragment(PlanningFragment.getInstance())
//                    }
//                }
////                R._id.wishlist -> {
////                    if (currentMode != BottomTabMode.ITINERARY) {
////                        currentMode = BottomTabMode.ITINERARY
////                        addFragment(WishlistListFragment.getInstance())
////                    }
////                }
////                R._id.feedback -> {
////                    if (currentMode != BottomTabMode.BLOGS) {
////                        currentMode = BottomTabMode.BLOGS
////                        addFragment(ReviewsListFragment.getInstance())
////                    }
////                }
//                R.id.profile -> {
//                    if (currentMode != BottomTabMode.PROFILE) {
//                        currentMode = BottomTabMode.PROFILE
//                        addFragment(ProfileFragment.getInstance())
//                    }
//                }
//            }
//            true
//        }

        setNavigationMenu()
        showHideBottomNav()
//        checkPermission()
    }

    private fun setNavigationMenu() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        navController = navHostFragment.navController
        bottomNav.setupWithNavController(navController)
    }

    override fun onResume() {
        super.onResume()
    }
}

