package com.example.composetest.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composetest.data.speakers
import com.example.composetest.model.Session
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _list: MutableLiveData<List<Session>> = MutableLiveData<List<Session>>()
    val list: LiveData<List<Session>>
        get() = _list

    fun loadData() {
        viewModelScope.launch {
            _list.value = speakers
        }
    }

    fun clear() {
        _list.value = emptyList()
    }
}