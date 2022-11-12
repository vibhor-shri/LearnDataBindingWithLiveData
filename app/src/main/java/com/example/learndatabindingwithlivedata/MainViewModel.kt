package com.example.learndatabindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var number: Int = 0
    var _number = MutableLiveData<Int>()

    init {
        _number.value = 0
    }

    fun add() {
        number = number.inc()
        _number.value = number
    }
}