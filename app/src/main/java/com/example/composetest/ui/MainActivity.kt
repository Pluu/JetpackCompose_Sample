package com.example.composetest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import com.example.composetest.themeColor
import com.example.composetest.themeTypography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                colors = themeColor,
                typography = themeTypography
            ) {
                MainCompose()
            }
        }
    }
}
