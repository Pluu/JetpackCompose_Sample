package com.example.composetest

import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.material.ColorPalette
import androidx.ui.material.Typography
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight

val themeColor: ColorPalette = ColorPalette(
    primary = Color(0xFF03A9F4),
    primaryVariant = Color(0xFF0288D1),
    onPrimary = Color.White,
    secondary = Color.White,
    onSecondary = Color.Black,
    background = Color.White,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black,
    error = MaterialColor.HOT_PINK,
    onError = Color.White
)

val themeTypography: Typography = Typography(
    h3 = TextStyle(fontSize = 40.sp, color = MaterialColor.HOT_PINK, fontWeight = FontWeight.Bold)
)

class MaterialColor {
    companion object {
        val HOT_PINK = Color(0xFFFF0266)
    }
}