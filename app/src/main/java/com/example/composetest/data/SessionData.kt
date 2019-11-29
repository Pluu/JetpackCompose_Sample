package com.example.composetest.data

import com.example.composetest.model.Session
import org.threeten.bp.LocalDateTime

private val startEventDate = LocalDateTime.of(
    2019, 10, 30,
    12, 0,0
).toLocalTime()

val speakers = listOf(
    Session(
        title = "체크인",
        startTime = startEventDate,
        endTime = startEventDate.plusMinutes(60),
        room = listOf("창업다락")
    ),
    Session(
        title = "Keynote",
        startTime = startEventDate.plusMinutes(60),
        endTime = startEventDate.plusMinutes(70),
        room = listOf("창업다락")
    ),
    Session(
        title = "Flutter",
        startTime = startEventDate.plusMinutes(70),
        endTime = startEventDate.plusMinutes(170),
        room = listOf("창업다락")
    ),
    Session(
        title = "Break Time",
        startTime = startEventDate.plusMinutes(170),
        endTime = startEventDate.plusMinutes(180),
        room = listOf("창업다락")
    ),
    Session(
        title = "최신 AndroidX 체크",
        speaker = "노현석",
        startTime = startEventDate.plusMinutes(180),
        endTime = startEventDate.plusMinutes(210),
        room = listOf("창업다락"),
        isActive = true
    ),
    Session(
        title = "Android 세션2",
        speaker = "Speaker",
        startTime = startEventDate.plusMinutes(215),
        endTime = startEventDate.plusMinutes(245),
        room = listOf("창업다락")
    ),
    Session(
        title = "Android 세션3",
        speaker = "Speaker",
        startTime = startEventDate.plusMinutes(250),
        endTime = startEventDate.plusMinutes(280),
        room = listOf("창업다락")
    ),
    Session(
        title = "Break Time",
        startTime = startEventDate.plusMinutes(280),
        endTime = startEventDate.plusMinutes(290),
        room = listOf("창업다락")
    )
)
