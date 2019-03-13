package me.khol.dagger.di.singleton

import android.content.Context
import dagger.Binds
import dagger.Module
import me.khol.dagger.App
import me.khol.dagger.di.onboarding.OnboardingComponent
import javax.inject.Singleton

/**
 * Main application module
 */
// TODO: What are the subcomponents here? Why should we use it?
@Module(
    includes = [
        ViewModelModule::class,
        UIModule::class
    ],
    subcomponents = [
        OnboardingComponent::class
    ]
)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun provideContext(context: App): Context
}
