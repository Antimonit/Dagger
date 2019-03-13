package me.khol.dagger.di.onboarding

import dagger.Subcomponent

@OnboardingScope
@Subcomponent(
    modules = [
        OnboardingRepositoryModule::class,
        OnboardingUIModule::class,
        OnboardingViewModelModule::class
    ]
)
interface OnboardingComponent {

    @Subcomponent.Builder
    interface Builder {

//        fun requestModule(module: RequestModule): Builder
        fun build(): OnboardingComponent
    }
}