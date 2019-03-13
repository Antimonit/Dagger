package me.khol.dagger.di.singleton

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import me.khol.dagger.di.SingletonViewModelFactory
import me.khol.dagger.di.ViewModelKey
import me.khol.dagger.screens.main.MainViewModel

/**
 * Dagger Module for providing general viewmodels and viewmodel factory
 */
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: SingletonViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(vm: MainViewModel): ViewModel
}
