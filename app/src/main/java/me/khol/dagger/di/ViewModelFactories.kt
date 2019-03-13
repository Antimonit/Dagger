package me.khol.dagger.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * Factories for different scopes all implemented by single [ViewModelsFactory]
 */
@Singleton
class SingletonViewModelFactory @Inject constructor(
    creators: MutableMap<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory by ViewModelsFactory(creators)
