package com.example.composetest.data

import com.example.composetest.model.Session
import org.threeten.bp.LocalDateTime

private val startEventDate = LocalDateTime.of(
    2019, 10, 15,
    18, 35
).toLocalTime()

val speakers = listOf(
    Session(
        title = "체크인",
        startTime = startEventDate,
        endTime = startEventDate.plusMinutes(45),
        room = "Track A/B"
    ),
    Session(
        title = "Keynote",
        startTime = startEventDate.plusMinutes(45),
        endTime = startEventDate.plusMinutes(55),
        room = "Track A/B"
    ),
    Session(
        title = "ML을 여행하는 안드로이드 히치하이커를 위한 안내서 - ML Vision편",
        speaker = "안성용",
        startTime = startEventDate.plusMinutes(60),
        endTime = startEventDate.plusMinutes(75),
        room = "Track A"
    ),
    Session(
        title = "Stetho의 후계 Flipper 다루기",
        speaker = "안세원",
        startTime = startEventDate.plusMinutes(75),
        endTime = startEventDate.plusMinutes(105),
        room = "Track A"
    ),
    Session(
        title = "최신 AndroidX 체크",
        speaker = "노현석",
        startTime = startEventDate.plusMinutes(115),
        endTime = startEventDate.plusMinutes(145),
        room = "Track A"
    ),
    Session(
        title = "Break Time",
        startTime = startEventDate.plusMinutes(145),
        endTime = startEventDate.plusMinutes(155),
        room = "Track A/B"
    )
)
