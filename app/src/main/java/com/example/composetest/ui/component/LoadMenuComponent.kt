package com.example.composetest.ui.component

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.FlexRow
import androidx.ui.layout.Padding
import androidx.ui.layout.WidthSpacer
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TextButtonStyle
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview
import com.example.composetest.themeColor

@Composable
fun LoadMenuComponent(
    hasCancel: Boolean = false,
    listenerClick: () -> Unit = {},
    cancelClick: () -> Unit = {}
) {
    FlexRow {
        expanded(1f) {
            Button(
                "Load",
                style = ContainedButtonStyle(rippleColor = Color.Black),
                onClick = listenerClick
            )
        }
        if (hasCancel) {
            inflexible {
                WidthSpacer(width = 12.dp)
            }
            inflexible {
                Button(
                    text = "Clear",
                    style = TextButtonStyle(contentColor = Color.Gray),
                    onClick = cancelClick
                )
            }
        }
    }
}

@Preview("Bottom Section")
@Composable
fun Preview_BottomSection() {
    MaterialTheme(colors = themeColor) {
        Surface {
            Padding(12.dp) {
                LoadMenuComponent()
            }
        }
    }
}

@Preview("Bottom Section > HasCancel")
@Composable
fun Preview_BottomSection_HasCancel() {
    MaterialTheme(colors = themeColor) {
        Surface {
            Padding(12.dp) {
                LoadMenuComponent()
            }
        }
    }
}
