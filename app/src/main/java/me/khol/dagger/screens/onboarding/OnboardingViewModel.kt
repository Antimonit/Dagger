package me.khol.dagger.screens.onboarding

import androidx.lifecycle.ViewModel
import me.khol.dagger.repository.OnboardingRepository
import javax.inject.Inject

class OnboardingViewModel @Inject constructor(
    private val repository: OnboardingRepository
) : ViewModel() {

    fun observeNavigation() = repository.observeNavigation()

    fun observeStep() = repository.observeStep()

    fun stepBack() = repository.previousStep()
}