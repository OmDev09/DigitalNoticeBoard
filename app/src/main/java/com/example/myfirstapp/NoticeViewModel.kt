package com.example.myfirstapp


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class NoticeViewModel : ViewModel() {
    private val _notices = MutableStateFlow<List<Notice>>(emptyList())
    val notices: StateFlow<List<Notice>> = _notices

    init {
        loadFakeNotices()
    }

    private fun loadFakeNotices() {
        viewModelScope.launch {
            _notices.value = listOf(
                Notice("1", "Exam Schedule", "Final exams start next week", "General", "2025-03-01"),
                Notice("2", "Workshop", "Android Workshop on Saturday", "CSE", "2025-02-28")
            )
        }
    }
}
