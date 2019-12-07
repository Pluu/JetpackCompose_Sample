package com.example.composetest.ui.util

import androidx.compose.Composable
import androidx.compose.onCommit
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

@Composable
fun <T> LiveData<T>.observe(): T? {
    val result = +state { value }
    +onCommit(this) {
        val observer = Observer<T> { result.value = it }
        observeForever(observer)
        onDispose { removeObserver(observer) }
    }
    return result.value
}