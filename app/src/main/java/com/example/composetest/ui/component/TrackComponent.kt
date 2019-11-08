package com.example.composetest.ui.component

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.shape.corner.CornerSize
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Container
import androidx.ui.layout.EdgeInsets
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import com.example.composetest.themeColor
import com.example.composetest.themeTypography

@Composable
fun TrackComponent(name: String) {
    Surface(
        shape = RoundedCornerShape(corner = CornerSize(4.dp)),
        color = Color(color = 0xFFFFDE03)
    ) {
        Container(
            padding = EdgeInsets(
                left = 10.dp,
                top = 4.dp,
                right = 10.dp,
                bottom = 4.dp
            )
        ) {
            Text(
                text = "Track $name",
                style = TextStyle(
                    color = Color.DarkGray
                )
            )
        }
    }
}

@Preview("Track Component")
@Composable
fun Preview_TrackComponent() {
    MaterialTheme(colors = themeColor, typography = themeTypography) {
        Surface {
            Padding(12.dp) {
                TrackComponent("A")
            }
        }
    }
}