package com.objectarcueid.xcompose.app

import com.objectarcueid.xcompose.base.BaseApplication
import com.objectarcueid.xcompose.base.log.echoLogD
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        echoLogD("onCreate")
    }
}