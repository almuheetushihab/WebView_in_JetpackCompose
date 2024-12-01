package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun ButtonGroupComponent(
    buttons: List<ButtonData>,
    onButtonClick: (ButtonData) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        buttons.forEach { button ->
            Button(
                onClick = { onButtonClick(button) },
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (button.isHighlighted) MaterialTheme.colorScheme.primary else Color.LightGray,
                    contentColor = if (button.isHighlighted) Color.White else Color.Black
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(
                    imageVector = button.icon,
                    contentDescription = button.label,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = button.label)
            }
        }
    }
}

data class ButtonData(
    val label: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector,
    val isHighlighted: Boolean = false
)

@PreviewAppScreen
@Composable
fun ButtonGroupPreview() {
    val buttons = listOf(
        ButtonData(label = "Void", icon = Icons.Default.Delete),
        ButtonData(label = "Retrieve Sale", icon = Icons.Default.Refresh),
        ButtonData(label = "Park Sale", icon = Icons.Default.Search, isHighlighted = true)
    )

    ButtonGroupComponent(
        buttons = buttons,
        onButtonClick = { button ->
            println("${button.label} button clicked")
        }
    )
}
