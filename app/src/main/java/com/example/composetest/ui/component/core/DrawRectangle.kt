package com.example.composetest.ui.component.core

import androidx.compose.Composable
import androidx.ui.core.Draw
import androidx.ui.core.toRect
import androidx.ui.graphics.Color
import androidx.ui.graphics.Paint

@Composable
fun DrawRectangle(color: Color) {
    val paint = Paint()
    paint.color = color
    Draw { canvas, parentSize ->
        canvas.drawRect(parentSize.toRect(), paint)
    }
}
