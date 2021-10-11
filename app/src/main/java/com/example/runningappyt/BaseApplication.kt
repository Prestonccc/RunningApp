package com.example.runningappyt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.plant

@HiltAndroidApp /* inject dependencies using dagger hilt */
class BaseApplication: Application() {
//
//    override fun onCreate() {
//        super.onCreate()
//        timber.plant(Timber.DebugTree())
//    }

}