package com.example.composetest.ui

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.WithDensity
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.Container
import androidx.ui.res.vectorResource

@Composable
fun VectorImage(@DrawableRes id: Int, tint: Color = Color.Transparent) {
    val vector = +vectorResource(id)
    WithDensity {
        Container(
            width = vector.defaultWidth.toDp(),
            height = vector.defaultHeight.toDp()
        ) {
            DrawVector(vector, tint)
        }
    }
}
