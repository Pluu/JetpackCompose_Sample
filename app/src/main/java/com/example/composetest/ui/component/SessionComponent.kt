package com.example.composetest.ui.component

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.FlexRow
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Padding
import androidx.ui.layout.Row
import androidx.ui.layout.WidthSpacer
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeColor
import androidx.ui.material.themeTextStyle
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import com.example.composetest.data.speakers
import com.example.composetest.model.Session
import com.example.composetest.themeColor
import com.example.composetest.themeTypography

@Composable
fun SessionComponent(session: Session) {
    Card(
        shape = RoundedCornerShape(4.dp),
        color = +themeColor {
            if (session.isActive) Color(0xFFB00020) else Color.White
        }
    ) {
        Padding(padding = 12.dp) {
            Column {
                Text(
                    text = session.title,
                    maxLines = 2,
                    style = +themeTextStyle {
                        if (session.isActive) h3.copy(color = Color.White) else h3
                    },
                    overflow = TextOverflow.Ellipsis
                )
                if (session.speaker != null) {
                    Container(expanded = true, alignment = Alignment.CenterRight) {
                        Text(
                            text = session.speaker,
                            style = +themeTextStyle {
                                if (session.isActive) h5.copy(color = Color.White) else h5
                            }
                        )
                    }
                }
                HeightSpacer(height = 12.dp)
                TimeComponent(
                    startTime = session.startTime,
                    endTime = session.endTime,
                    isActive = session.isActive
                )
                HeightSpacer(height = 8.dp)
                Row {
                    val rooms = session.room.iterator()
                    while (rooms.hasNext()) {
                        TrackComponent(rooms.next())
                        if (rooms.hasNext()) {
                            WidthSpacer(width = 4.dp)
                        }
                    }
                }

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

@Preview("Session Component - Active")
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

@Preview("Session Component")
@Composable
fun Preview_SessionComponent2() {
    MaterialTheme(colors = themeColor, typography = themeTypography) {
        Surface {
            Padding(12.dp) {
                SessionComponent(speakers[5])
            }
        }
    }
}