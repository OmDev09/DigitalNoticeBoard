package com.example.myfirstapp

import androidx.compose.material3.Divider
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.clickable
import androidx.compose.foundation.verticalScroll

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "announcements"
    ) {
        composable("announcements") { AnnouncementsScreen() }
        composable("exam_schedule") { PlaceholderScreen("Exam Schedule") }
        composable("workshops") { PlaceholderScreen("Workshops") }
        composable("placements") { PlaceholderScreen("Placements & Internships") }
        composable("events") { EventsScreen() }
        composable("exam_schedule") { ExamScheduleScreen() }
        composable("workshops") { WorkshopsScreen() }
        composable("placements") { PlacementsScreen() }



    }
}

@Composable
fun AnnouncementsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // ✅ Enables scrolling
    ) {
        // 📢 Important Announcements
        Text(text = "📢 Important Announcements", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "🔹 Dear Students,\nThe college will remain closed on March 15th due to maintenance work. Please plan accordingly.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 🎓 Academic Notice
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "🎓 Academic Notice", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "📌 Mid-semester exams will commence from April 10th. The detailed schedule will be shared soon.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 🏆 Sports Announcement
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "🏆 Sports Announcement", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "⚽ The Annual Sports Meet will be held on March 25th. Students interested in participating must register by March 20th.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 📅 Event Reminder
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "📅 Event Reminder", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "📢 The Cultural Fest ‘VIBRANCE 2024’ is scheduled for April 5th & 6th. Get ready for an exciting lineup of competitions and performances!", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 📢 Library Notice
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "📚 Library Notice", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "📖 Library books must be returned by March 20th to avoid penalties. Students can also renew books online through the college portal.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 🛠️ Maintenance Alert
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "🛠️ Maintenance Alert", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "🚧 Due to ongoing renovations, the Science Block will remain closed on March 18th & 19th. Classes scheduled there will be shifted to alternate rooms.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 💼 Internship Opportunity
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "💼 Internship Opportunity", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "🚀 XYZ Tech is offering summer internships for final-year students. Interested students must apply before March 30th via the Placement Portal.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Composable
fun EventsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "🎭 Upcoming Event",
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(8.dp))

        // Placeholder for event poster
        Image(
            painter = painterResource(id = R.drawable.event_poster), // Replace with your actual drawable resource
            contentDescription = "Event Poster",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
    }
}

@Composable
fun PlaceholderScreen(title: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = title, fontSize = 24.sp)
    }
}

@Composable
fun ExamScheduleScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // ✅ Enables scrolling
    ) {
        // 📅 Mid-Semester Exams
        Text(text = "📅 Mid-Semester Exams", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "📌 Mid-semester exams will be held from **April 10th to April 20th**. The detailed schedule for each subject will be uploaded soon.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 🏁 Final Exams
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "🏁 Final Exams", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "📆 Final exams are scheduled from **June 5th to June 20th**. Students must complete their internal assessments before May 30th.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 📝 Practical Exams
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "📝 Practical Exams", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "⚙️ Practical exams will begin from **May 25th**. Students must check the department noticeboard for their assigned slots.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 🎓 Project Submission
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "🎓 Project Submission", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "🛠️ Final-year students must submit their project reports by **May 10th**. Late submissions will not be accepted.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()

        // 📢 Important Guidelines
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "📢 Important Guidelines", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "✅ Students must carry their ID cards and hall tickets for all exams.\n✅ Use of unfair means will lead to strict disciplinary action.\n✅ Exam timings will be from **10:00 AM to 1:00 PM** unless mentioned otherwise.", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Composable
fun WorkshopsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // ✅ Enables scrolling
    ) {
        Text(text = "🛠️ Upcoming Workshops", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(8.dp))

        WorkshopCard(
            title = "🚀 AI & Machine Learning",
            speaker = "Dr. Ramesh Gupta",
            date = "March 25, 2025",
            location = "Seminar Hall A",
            description = "Learn the basics of AI and ML with hands-on projects.",
            registrationLink = "https://college-ml-workshop.com"
        )

        WorkshopCard(
            title = "💻 Full Stack Web Development",
            speaker = "Ms. Neha Sharma",
            date = "April 5, 2025",
            location = "Computer Lab 1",
            description = "Master front-end and back-end technologies in this interactive session.",
            registrationLink = "https://fullstack-workshop.com"
        )

        WorkshopCard(
            title = "🎤 Public Speaking & Personality Development",
            speaker = "Mr. Anand Verma",
            date = "April 15, 2025",
            location = "Auditorium",
            description = "Boost your confidence and improve your speaking skills.",
            registrationLink = "https://public-speaking-workshop.com"
        )

        WorkshopCard(
            title = "🎨 UI/UX Design Principles",
            speaker = "Ms. Priya Kapoor",
            date = "April 22, 2025",
            location = "Design Lab",
            description = "Learn user experience design with hands-on practice.",
            registrationLink = "https://uiux-workshop.com"
        )
    }
}

@Composable
fun WorkshopCard(title: String, speaker: String, date: String, location: String, description: String, registrationLink: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { /* Open registration link (if needed in future) */ },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFFAFAFA)), // Light Background
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title, fontSize = 20.sp, color = Color(0xFF3E50B4)) // Title in blue
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "🗣️ Speaker: $speaker", fontSize = 16.sp, color = Color.Gray)
            Text(text = "📅 Date: $date", fontSize = 16.sp, color = Color.Gray)
            Text(text = "📍 Location: $location", fontSize = 16.sp, color = Color.Gray)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "🔗 Register: $registrationLink", fontSize = 14.sp, color = Color.Blue)
        }
    }
}

@Composable
fun PlacementsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Enables scrolling
    ) {
        Text(
            text = "💼 Latest Internship & Placement Opportunities",
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(12.dp))

        val opportunities = listOf(
            PlacementItem(
                company = "Google",
                role = "Software Engineer Intern",
                deadline = "Apply by March 25th",
                logo = R.drawable.google_logo
            ),
            PlacementItem(
                company = "Microsoft",
                role = "Data Analyst Intern",
                deadline = "Apply by April 1st",
                logo = R.drawable.microsoft_logo
            ),
            PlacementItem(
                company = "Amazon",
                role = "Web Developer Internship",
                deadline = "Apply by March 30th",
                logo = R.drawable.amazon_logo
            ),
            PlacementItem(
                company = "Tesla",
                role = "Machine Learning Intern",
                deadline = "Apply by April 5th",
                logo = R.drawable.tesla_logo
            )
        )

        opportunities.forEach { item ->
            PlacementCard(item)
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
fun PlacementCard(item: PlacementItem) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFE3F2FD)), // Light blue background
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* Open details */ }
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = item.logo),
                contentDescription = item.company,
                modifier = Modifier
                    .size(50.dp)
                    .padding(end = 12.dp)
            )

            Column {
                Text(text = item.company, fontSize = 18.sp, color = Color.Black)
                Text(text = item.role, fontSize = 16.sp, color = Color.DarkGray)
                Text(text = item.deadline, fontSize = 14.sp, color = Color.Red)
            }
        }
    }
}

// Data class to store placement details
data class PlacementItem(
    val company: String,
    val role: String,
    val deadline: String,
    val logo: Int
)
