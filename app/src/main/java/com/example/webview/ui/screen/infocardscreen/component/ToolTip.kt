package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun CustomMessageBar(
    message: String,
    backgroundColor: Color,
    textColor: Color,
    modifier: Modifier = Modifier,

    ) {
    Column(
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = message,
            color = textColor,
        )
    }
}

@PreviewAppScreen
@Preview(showBackground = true)
@Composable
fun PreviewCustomMessageBar() {
    CustomMessageBar(
        message = "You need to open a register before starting POS operations.",
        backgroundColor = Color(0xFFFFF4E5),
        textColor = Color(0xFFB5532C)
    )
}
