package com.example.ad_lab2.ui.tabbed_activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TabbedActivityViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is tabbed_activity Fragment"
    }
    val text: LiveData<String> = _text
}