package me.khol.dagger

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import me.khol.dagger.di.DaggerAppComponent

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<App> = DaggerAppComponent.builder().create(this)
}