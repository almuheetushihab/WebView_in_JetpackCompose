package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun DynamicInfoCard(
    modifier: Modifier = Modifier,
    titleName: String,
    value: String,
    backgroundColor: Color,
    borderColor: Color,
    textColor: Color
) {
    Column(
        modifier = modifier
            .padding(8.dp)
            .border(1.dp, borderColor, shape = RoundedCornerShape(8.dp))
            .background(backgroundColor, shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = titleName,
                color = textColor,
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = value,
                color = textColor,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@PreviewAppScreen
@Composable
fun DynamicInfoCardPreview() {
    DynamicInfoCard(
        titleName = "Due",
        value = "৳2,000.00",
        backgroundColor = Color(0xFFFFF8F8),
        borderColor = Color(0xFFFFC1C1),
        textColor = Color(0xFFFF0000)
    )
}

