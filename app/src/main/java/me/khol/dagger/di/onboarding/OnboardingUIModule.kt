package me.khol.dagger.di.onboarding

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.khol.dagger.screens.onboarding.step.one.OneFragment
import me.khol.dagger.screens.onboarding.step.three.ThreeFragment
import me.khol.dagger.screens.onboarding.step.two.TwoFragment

@Module
abstract class OnboardingUIModule {

    @ContributesAndroidInjector
    abstract fun bindOneFragment(): OneFragment

    @ContributesAndroidInjector
    abstract fun bindTwoFragment(): TwoFragment

    @ContributesAndroidInjector
    abstract fun bindThreeFragment(): ThreeFragment
}
