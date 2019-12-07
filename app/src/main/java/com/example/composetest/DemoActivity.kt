package com.example.composetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.setViewContent
import androidx.ui.core.Text
import androidx.ui.graphics.Color
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setViewContent {
            MaterialTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name")
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Surface(color = Color.White) {
            Greeting(name = "Android")
        }
    }
}