package me.khol.dagger.di.singleton

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.khol.dagger.App
import me.khol.dagger.di.onboarding.OnboardingComponent
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ConstantModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

    fun onboardingComponent(): OnboardingComponent.Builder
}
