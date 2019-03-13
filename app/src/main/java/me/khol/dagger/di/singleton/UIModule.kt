package me.khol.dagger.di.singleton

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.khol.dagger.di.onboarding.OnboardingModule
import me.khol.dagger.di.onboarding.OnboardingScope
import me.khol.dagger.screens.intro.IntroActivity
import me.khol.dagger.screens.main.MainActivity
import me.khol.dagger.screens.onboarding.OnboardingActivity

/**
 * Module that creates subcomponents and modules for UI components as Fragments or Activities
 */
@Module
abstract class UIModule {

    @ContributesAndroidInjector
    abstract fun bindIntroActivity(): IntroActivity

    @OnboardingScope
    @ContributesAndroidInjector(modules = [OnboardingModule::class])
    abstract fun bindOnboardingActivity(): OnboardingActivity

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}
