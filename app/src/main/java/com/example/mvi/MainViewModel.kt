package com.example.mvi

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

/**
 *@author : hfj
 */
class MainViewModel(context: Context) : AndroidViewModel(context as Application) {


    private val _userIntent = MutableSharedFlow<UserIntent>()
    private var userIntent = _userIntent.asSharedFlow()

    init {
        viewModelScope.launch {
            userIntent.collect {
                Toast.makeText(context, it.action, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun handleIntent(intent: UserIntent) {
        viewModelScope.launch {
            _userIntent.emit(intent)
        }
    }

}