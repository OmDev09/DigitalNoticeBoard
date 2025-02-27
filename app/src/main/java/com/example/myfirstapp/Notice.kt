package com.example.myfirstapp


data class Notice(
    val id: String,
    val title: String,
    val description: String,
    val category: String,
    val date: String,
    val isUrgent: Boolean = false
)
