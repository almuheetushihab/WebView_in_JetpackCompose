package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonGroupComponent(
    buttons: List<ButtonData>,
    onButtonClick: (ButtonData) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedButtonLabel by rememberSaveable { mutableStateOf("Park Sale") }

    Row(
        modifier = modifier
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        buttons.forEach { button ->
            Button(
                onClick = {
                    selectedButtonLabel = button.label
                    onButtonClick(button)
                },
                modifier = Modifier
                    .padding(horizontal = 2.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (selectedButtonLabel == button.label)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.surface,
                    contentColor = if (selectedButtonLabel == button.label)
                        MaterialTheme.colorScheme.onPrimary
                    else
                        MaterialTheme.colorScheme.onSurface
                ),
                border = ButtonDefaults.outlinedButtonBorder,
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
    val icon: ImageVector,
    val isHighlighted: Boolean = false
)

@Preview(showBackground = true)
@Composable
fun ButtonGroupPreview() {
    val buttons = listOf(
        ButtonData(label = "Void", icon = Icons.Outlined.Delete),
        ButtonData(label = "Retrieve Sale", icon = Icons.Outlined.Refresh),
        ButtonData(label = "Park Sale", icon = Icons.Outlined.Search, isHighlighted = true)
    )

    ButtonGroupComponent(
        buttons = buttons,
        onButtonClick = { button ->
            println("${button.label} button clicked")
        }
    )
}
