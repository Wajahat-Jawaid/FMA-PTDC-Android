package com.salampakistan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.salampakistan.ui.onboarding.OnBoardingActivity
import com.salampakistan.utils.Preferences

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            if (Preferences(this).hasDisplayedOnBoarding()) startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )
            else startActivity(Intent(this, OnBoardingActivity::class.java))
        }, 2000)
//        try {
//            Thread.sleep(2000)
//        } catch (e: InterruptedException) {
//        } finally {
//            startActivity(Intent(this, MainActivity::class.java))
//        }
    }
}