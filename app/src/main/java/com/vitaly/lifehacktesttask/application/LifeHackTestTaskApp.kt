package com.vitaly.lifehacktesttask.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class LifeHackTestTaskApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin { androidContext(this@LifeHackTestTaskApp) }
    }
}