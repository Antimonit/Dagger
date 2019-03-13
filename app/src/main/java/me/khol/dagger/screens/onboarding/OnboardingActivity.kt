package me.khol.dagger.screens.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.commit
import io.reactivex.rxkotlin.plusAssign
import me.khol.dagger.R
import me.khol.dagger.di.onboarding.OnboardingScope
import me.khol.dagger.screens.base.BaseActivity
import me.khol.dagger.repository.Action
import me.khol.dagger.repository.Step
import me.khol.dagger.screens.main.MainActivity
import me.khol.dagger.screens.onboarding.step.one.OneFragment
import me.khol.dagger.screens.onboarding.step.three.ThreeFragment
import me.khol.dagger.screens.onboarding.step.two.TwoFragment
import javax.inject.Inject

class OnboardingActivity : BaseActivity() {

    @Inject
    lateinit var viewModel: OnboardingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        disposables += viewModel.observeNavigation()
            .subscribe { action: Action ->
                when (action) {
                    Action.BACK -> {
                        super.onBackPressed()
                    }
                    Action.FINISH -> {
                        startActivity(Intent(this, MainActivity::class.java).apply {
                            putExtra(MainActivity.KEY_ID, 42)
                            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        })
                        finish()
                    }
                }
            }

        disposables += viewModel.observeStep()
            .subscribe { step: Step ->
                val fragment = when (step) {
                    Step.ONE -> OneFragment()
                    Step.TWO -> TwoFragment()
                    Step.THREE -> ThreeFragment()
                }
                supportFragmentManager.commit {
                    replace(R.id.contents, fragment)
                }
            }
    }

    override fun onBackPressed() {
        // Don't pass the back press to framework.
//        super.onBackPressed()
        viewModel.stepBack()
    }
}