package me.khol.dagger.di.onboarding

import dagger.Module

@Module(
    includes = [
        OnboardingRepositoryModule::class,
        OnboardingViewModelModule::class,
        OnboardingUIModule::class
    ]
)
class OnboardingModule