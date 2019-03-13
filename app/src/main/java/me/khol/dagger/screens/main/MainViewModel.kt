package me.khol.dagger.screens.main

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val id: Int
) : ViewModel()