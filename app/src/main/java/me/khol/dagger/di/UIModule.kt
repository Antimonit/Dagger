package me.khol.dagger.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.khol.dagger.screens.intro.IntroActivity
import me.khol.dagger.screens.main.MainActivity
import me.khol.dagger.screens.onboarding.OnboardingActivity
import me.khol.dagger.screens.onboarding.step.one.OneFragment
import me.khol.dagger.screens.onboarding.step.three.ThreeFragment
import me.khol.dagger.screens.onboarding.step.two.TwoFragment

/**
 * Module that creates subcomponents and modules for UI components as Fragments or Activities
 */
@Module
abstract class UIModule {

	@ContributesAndroidInjector
	abstract fun bindIntroActivity(): IntroActivity

	@ContributesAndroidInjector
	abstract fun bindOnboardingActivity(): OnboardingActivity

	@ContributesAndroidInjector
	abstract fun bindMainActivity(): MainActivity


	@ContributesAndroidInjector
	abstract fun bindOneFragment(): OneFragment

	@ContributesAndroidInjector
	abstract fun bindTwoFragment(): TwoFragment

	@ContributesAndroidInjector
	abstract fun bindThreeFragment(): ThreeFragment
}
