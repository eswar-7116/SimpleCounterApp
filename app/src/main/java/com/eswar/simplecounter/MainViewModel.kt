package com.eswar.simplecounter

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var countState = mutableIntStateOf(0)
    fun getCount() = countState.intValue
    fun incrementCount() { countState.intValue++ }
    fun decrementCount() {
        if (countState.intValue > 0)
            countState.intValue--
    }
    fun resetCount() { countState.intValue = 0 }
}