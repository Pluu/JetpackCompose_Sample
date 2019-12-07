package com.example.composetest.ui.component

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview
import com.example.composetest.themeColor
import com.example.composetest.themeTypography
import org.threeten.bp.LocalTime
import org.threeten.bp.temporal.ChronoUnit

@Composable
fun TimeComponent(
    startTime: LocalTime,
    endTime: LocalTime,
    isActive: Boolean
) {
    Text(
        text = "$startTime ~ (${ChronoUnit.MINUTES.between(startTime, endTime)}min)",
        style = if (isActive) {
            (+MaterialTheme.typography()).h5.copy(color = Color.White)
        } else {
            (+MaterialTheme.typography()).h5
        }
    )
}

@Preview("Time Component - Active")
@Composable
fun Preview_TimeComponent() {
    val time = LocalTime.of(1, 1, 1)
    MaterialTheme(colors = themeColor, typography = themeTypography) {
        Surface(color = Color.Red) {
            Padding(12.dp) {
                TimeComponent(
                    startTime = time,
                    endTime = time.plusMinutes(40),
                    isActive = true
                )
            }
        }
    }
}

@Preview("Time Component")
@Composable
fun Preview_TimeComponent2() {
    val time = LocalTime.of(1, 1, 1)
    MaterialTheme(colors = themeColor, typography = themeTypography) {
        Surface(color = Color.White) {
            Padding(12.dp) {
                TimeComponent(
                    startTime = time,
                    endTime = time.plusMinutes(40),
                    isActive = false
                )
            }
        }
    }
}