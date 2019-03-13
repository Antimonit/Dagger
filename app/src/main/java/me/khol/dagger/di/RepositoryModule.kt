package me.khol.dagger.di

import dagger.Binds
import dagger.Module
import me.khol.dagger.repository.OnboardingRepository
import me.khol.dagger.repository.OnboardingRepositoryImpl
import javax.inject.Singleton

/**
 * Module for providing repositories
 */
@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindOnboardingRepository(repository: OnboardingRepositoryImpl): OnboardingRepository
}
