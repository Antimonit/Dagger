package me.khol.dagger.di.onboarding

import dagger.Subcomponent

@OnboardingScope
@Subcomponent(
    modules = [
        OnboardingModule::class
    ]
)
interface OnboardingComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): OnboardingComponent
    }
}