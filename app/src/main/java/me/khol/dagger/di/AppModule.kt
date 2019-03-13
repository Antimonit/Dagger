package me.khol.dagger.di

import android.content.Context
import dagger.Binds
import dagger.Module
import me.khol.dagger.App
import javax.inject.Singleton

/**
 * Main application module
 */
@Module
abstract class AppModule {

	@Binds
	@Singleton
	abstract fun provideContext(context: App): Context
}
