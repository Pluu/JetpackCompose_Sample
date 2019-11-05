package com.example.composetest

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

class ComposeApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}