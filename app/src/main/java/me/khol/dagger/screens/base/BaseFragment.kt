package me.khol.dagger.screens.base

import dagger.android.support.DaggerFragment
import io.reactivex.disposables.CompositeDisposable

/**
 * Base fragment that all other custom fragment should extend
 */
abstract class BaseFragment : DaggerFragment() {

    protected val disposables = CompositeDisposable()

    override fun onDestroyView() {
        super.onDestroyView()
        disposables.clear()
    }
}
