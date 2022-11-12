package com.example.learndatabindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var number: Int = 0
    var _number = MutableLiveData<Int>()

    fun add() {
        number = number.inc()
        _number.value = number
    }
}