package org.example.greeting


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(modifier = Modifier.padding(12.dp)) {
            Greeting().greet().forEach { courseCode ->
                Text(
                    text = courseCode,
                    modifier = Modifier.blur(1.dp),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}