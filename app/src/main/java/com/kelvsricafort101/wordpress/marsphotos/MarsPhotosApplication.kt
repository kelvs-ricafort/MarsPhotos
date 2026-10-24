package com.kelvsricafort101.wordpress.marsphotos

import android.app.Application
import com.kelvsricafort101.wordpress.marsphotos.data.AppContainer
import com.kelvsricafort101.wordpress.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}