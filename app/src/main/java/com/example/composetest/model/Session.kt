package com.example.composetest.model

import org.threeten.bp.LocalTime

class Session(
    val title: String,
    val speaker: String? = null,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val room: List<String> = emptyList(),
    val isActive: Boolean = false
)