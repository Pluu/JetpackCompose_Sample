package com.example.composetest.ui.component

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.ColoredRect
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.AspectRatio
import androidx.ui.layout.Column
import androidx.ui.layout.FlexRow
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Padding
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.text.ParagraphStyle
import androidx.ui.text.style.TextAlign
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import com.example.composetest.data.speakers
import com.example.composetest.model.Session
import com.example.composetest.themeColor
import com.example.composetest.themeTypography
import com.example.composetest.ui.component.core.ContainerWithBackground

@Composable
fun SessionComponent(session: Session) {
    Card(shape = RoundedCornerShape(4.dp)) {
        Padding(padding = 12.dp) {
            Column {
                Text(
                    text = session.title,
                    maxLines = 2,
                    style = +themeTextStyle { h3 },
                    overflow = TextOverflow.Ellipsis
                )
                if (session.speaker != null) {
                    ContainerWithBackground(color = Color.LightGray) {
                        Text(
                            text = session.speaker,
                            style = +themeTextStyle { h5 },
                            paragraphStyle = ParagraphStyle(TextAlign.Right)
                        )
                        ColoredRect(color = Color.Green, modifier = AspectRatio(2f))

                    }
                }
                Text(text = "${session.startTime}~${session.endTime}")
                Text(text = session.room)
                HeightSpacer(height = 8.dp)
                FlexRow {
                    expanded(1f) {
                        Button(
                            "Listen",
                            style = ContainedButtonStyle(rippleColor = Color.Black),
                            onClick = { }
                        )
                    }
                }
            }
        }
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