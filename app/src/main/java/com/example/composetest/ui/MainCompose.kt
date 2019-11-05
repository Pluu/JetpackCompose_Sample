package com.example.composetest.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Padding
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.tooling.preview.Preview
import com.example.composetest.data.speakers
import com.example.composetest.themeColor
import com.example.composetest.themeTypography
import com.example.composetest.ui.component.BottomSection
import com.example.composetest.ui.component.SessionComponent
import com.example.composetest.ui.component.TopMenu

@Composable
fun MainCompose() {
    VerticalScroller {
        Padding(padding = 8.dp) {
            Column(
                crossAxisSize = LayoutSize.Expand,
                mainAxisSize = LayoutSize.Expand
            ) {
                TopMenu()
                HeightSpacer(height = 12.dp)
                Text("Timetable", style = +themeTextStyle { h6 })
                BottomSection(hasCancel = true)
                HeightSpacer(height = 12.dp)
                val iterator = speakers.iterator()
                while (iterator.hasNext()) {
                    HeightSpacer(height = 8.dp)
                    SessionComponent(session = iterator.next())
                    HeightSpacer(height = 8.dp)
                    if (iterator.hasNext()) {
                        Divider(color = Color.Red, height = 1.dp)
                    }
                }
            }
        }
    }
}

@Preview("Default colors")
@Composable
fun DefaultPreview2() {
    MaterialTheme(
        colors = themeColor,
        typography = themeTypography
    ) {
        Surface {
            MainCompose()
        }
    }
}
