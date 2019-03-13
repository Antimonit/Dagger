package me.khol.dagger.screens.main

import android.os.Bundle
import android.widget.Toast
import me.khol.dagger.screens.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    companion object {

        const val KEY_ID = "id"
    }

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "Loaded ${viewModel.id}", Toast.LENGTH_SHORT).show()
    }
}