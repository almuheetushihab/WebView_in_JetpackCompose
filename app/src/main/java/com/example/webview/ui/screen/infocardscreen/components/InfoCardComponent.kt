package com.example.webview.ui.screen.infocardscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun InfoCardComponent(
    icon: @Composable () -> Unit,
    message: String,
    modifier: Modifier = Modifier,

) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier
                .size(40.dp)
                .background(Color(0xFFF5F5F5), shape = CircleShape),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            icon()
        }

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = message,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.labelSmall
        )
    }
}

@PreviewAppScreen
@Composable
fun InfoCardComponentPreview() {
    InfoCardComponent(
        icon = {
            Icon(
                imageVector = Icons.Outlined.Info,
                contentDescription = "Info Icon",
                tint = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.graphicsLayer(rotationZ = 180f)
            )
        },
        message = "Close your register to finalize payments and sales of the day"
    )
}
