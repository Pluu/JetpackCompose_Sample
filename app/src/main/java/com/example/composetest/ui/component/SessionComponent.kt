package com.example.composetest.ui.component

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import com.example.composetest.data.speakers
import com.example.composetest.model.Session
import com.example.composetest.themeColor
import com.example.composetest.themeTypography

@Composable
fun SessionComponent(session: Session) {
    Column {
        Text(
            text = session.title,
            maxLines = 2,
            style = +themeTextStyle { h3 },
            overflow = TextOverflow.Ellipsis
        )
        if (session.speaker != null) {
            Container(expanded = true, alignment = Alignment.CenterRight) {
                Text(
                    text = session.speaker,
                    style = +themeTextStyle { h5 }
                )
            }
        }
        Text(text = "${session.startTime}~${session.endTime}")
        Text(text = session.room)
        HeightSpacer(height = 8.dp)
        BottomSection()
    }
}

@Preview("Session Component")
@Composable
fun Preview_SessionComponent() {
    MaterialTheme(colors = themeColor, typography = themeTypography) {
        Surface {
            Padding(12.dp) {
                SessionComponent(speakers[4])
            }
        }
    }
}