package com.hguerbej.quotiepie

import android.app.Application
import com.hguerbej.data.di.networkModule
import com.hguerbej.data.di.repositoryModule
import com.hguerbej.domain.di.useCaseModule
import com.hguerbej.quotiepie.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class QuotiePieApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@QuotiePieApplication)
            modules(listOf(networkModule, repositoryModule, useCaseModule, presentationModule))
        }

    }
}