package com.denispotapov.marvelheroes

import android.app.Application
import android.content.Context
import com.denispotapov.marvelheroes.di.AppComponent
import com.denispotapov.marvelheroes.di.DaggerAppComponent

class MarvelApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .context(this)
            .build()
    }

}

val Context.appComponent: AppComponent
    get() = when (this) {
        is MarvelApplication -> appComponent
        else -> this.applicationContext.appComponent
    }