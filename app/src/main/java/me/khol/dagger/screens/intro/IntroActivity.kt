package me.khol.dagger.screens.intro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import me.khol.dagger.R
import me.khol.dagger.screens.base.BaseActivity
import me.khol.dagger.screens.onboarding.OnboardingActivity

class IntroActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        findViewById<Button>(R.id.btn_onboarding).setOnClickListener {
            startActivity(Intent(this, OnboardingActivity::class.java))
        }
    }
}