package com.example.myfirstapp


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    val navigationItems = listOf(
        NavigationItem("Announcements", Icons.Default.Notifications, "announcements"),
        NavigationItem("Exam Schedule", Icons.Default.Schedule, "exam_schedule"),
        NavigationItem("Workshops", Icons.Default.Build, "workshops"),
        NavigationItem("Placements & Internships", Icons.Default.Work, "placements"),
        NavigationItem("Events & Competitions", Icons.Default.Event, "events")
    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true, // ✅ Allows full swipe to close
        scrimColor = Color.Black.copy(alpha = 0.3f), // ✅ Adds a slight background dimming
        drawerContent = {
            Box(Modifier.fillMaxWidth(0.75f)) { // ✅ Ensures the drawer never exceeds 75% width
                DrawerContent(navController, navigationItems)
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("CampusBoard", color = MaterialTheme.colorScheme.onPrimary) },
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                scope.launch {
                                    if (drawerState.isOpen) {
                                        drawerState.close() // ✅ Forces full closure
                                    } else {
                                        drawerState.open()
                                    }
                                }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menu",
                                tint = Color.White, // ✅ Ensures visibility
                                modifier = Modifier.size(36.dp) // ✅ Enlarges icon for clarity
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        titleContentColor = Color.White
                    )
                )
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { /* Handle add notice */ },
                    shape = CircleShape
                ) {
                    Icon(Icons.Default.Add, contentDescription = "Add Notice")
                }
            }
        ) { padding ->
            Box(modifier = Modifier.padding(padding)) {
                NavigationGraph(navController)
            }
        }
    }

}

@Composable
fun DrawerContent(navController: NavHostController, navigationItems: List<NavigationItem>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 16.dp)
    ) {
        Text(
            text = "Home",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Divider()

        navigationItems.forEach { item ->
            NavigationDrawerItem(
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) },
                selected = false,
                onClick = { navController.navigate(item.route) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
