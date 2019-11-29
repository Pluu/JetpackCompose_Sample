package com.example.composetest.ui.component

import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.ContextAmbient
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.Container
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview
import com.example.composetest.R
import com.example.composetest.themeColor

@Composable
fun TopMenu() {
    Container(expanded = true, height = 180.dp) {
        Clip(shape = RoundedCornerShape(12.dp)) {
            val context = +ambient(ContextAmbient)
            DrawImage(
                image = imageFromResource(
                    context.resources,
                    resId = R.drawable.incheon
                )
            )
        }
    }
}

@Preview("Top Menu")
@Composable
fun Preview_TopMenu() {
    MaterialTheme(colors = themeColor) {
        Surface {
            Padding(12.dp) {
                TopMenu()
            }
        }
    }
}