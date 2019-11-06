package com.example.composetest.ui.component.core

import androidx.compose.Composable
import androidx.ui.core.Dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Container
import androidx.ui.layout.Wrap

@Composable
fun ContainerWithBackground(
    width: Dp? = null,
    height: Dp? = null,
    color: Color,
    children: @Composable() () -> Unit
) {
    Wrap {
        DrawRectangle(color = color)
        Container(width = width, height = height, children = children)
    }
}