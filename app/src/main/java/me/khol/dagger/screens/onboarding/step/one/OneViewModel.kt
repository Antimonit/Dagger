package me.khol.dagger.screens.onboarding.step.one

import androidx.lifecycle.ViewModel
import me.khol.dagger.repository.OnboardingRepository
import javax.inject.Inject

class OneViewModel @Inject constructor(
    private val repository: OnboardingRepository
) : ViewModel() {

    fun continueToNextStep() {
        repository.nextStep()
    }
}