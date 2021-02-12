package com.recepyesilkaya.databinding_sample.ui.detail

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recepyesilkaya.databinding_sample.data.model.Market
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {
    lateinit var market: Market

    private val _count = MutableLiveData<Int>()
    val count: LiveData<Int>
        get() = _count

    private val _soldOut = MutableLiveData<Boolean>()
    val soldOut: LiveData<Boolean>
        get() = _soldOut

    private var firstCount = 0

    fun minusCount() {
        firstCount = market.count
        _count.value = market.count
        viewModelScope.launch {
            while (true) {
                delay(1000)
                market.count -= 5
                if (_count.value!! > 0) _count.value = market.count

                if (_count.value == 0) {
                    _soldOut.value = true
                    return@launch
                }
            }
        }
    }

    fun onClick(view: View) {
        market.count = firstCount
        _soldOut.value = false
        minusCount()
    }
}
