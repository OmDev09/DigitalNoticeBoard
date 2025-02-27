package com.example.myfirstapp


import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,      // Name of the tab (e.g., "Exam Schedule")
    val icon: ImageVector,  // Icon for the tab
    val route: String       // Navigation route (e.g., "exam_schedule")
)
