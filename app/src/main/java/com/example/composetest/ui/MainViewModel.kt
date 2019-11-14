package com.example.composetest.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.composetest.data.speakers
import com.example.composetest.model.Session

private const val TAG = "MainViewModel"

class MainViewModel : ViewModel() {
    private val _list: MutableLiveData<List<Session>> = MutableLiveData()
    val list: LiveData<List<Session>>
        get() = _list

    fun loadData() {
        _list.value = speakers
        Log.d(TAG, "loadData() called")
    }

    fun clear() {
        _list.value = emptyList()
    }
}