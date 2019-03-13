package me.khol.dagger.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import me.khol.dagger.screens.main.MainViewModel
import me.khol.dagger.screens.onboarding.OnboardingViewModel
import me.khol.dagger.screens.onboarding.step.one.OneViewModel
import me.khol.dagger.screens.onboarding.step.three.ThreeViewModel
import me.khol.dagger.screens.onboarding.step.two.TwoViewModel

/**
 * Dagger Module for providing general viewmodels and viewmodel factory
 */
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: SingletonViewModelFactory): ViewModelProvider.Factory

//    @Binds
//    @IntoMap
//    @ViewModelKey(IntroViewModel::class)
//    abstract fun bindIntroViewModel(): IntroViewModel

    @Binds
    @IntoMap
    @ViewModelKey(OnboardingViewModel::class)
    abstract fun bindOnboardingViewModel(vm: OnboardingViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(vm: MainViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(OneViewModel::class)
    abstract fun bindOneViewModel(vm: OneViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TwoViewModel::class)
    abstract fun bindTwoViewModel(vm: TwoViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ThreeViewModel::class)
    abstract fun bindThreeViewModel(vm: ThreeViewModel): ViewModel
}
