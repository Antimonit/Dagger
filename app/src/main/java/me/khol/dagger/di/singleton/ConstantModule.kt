package me.khol.dagger.di.singleton

import dagger.Module
import dagger.Provides

@Module
class ConstantModule {

    @Provides
    fun provideInteger(): Int = 3
}
