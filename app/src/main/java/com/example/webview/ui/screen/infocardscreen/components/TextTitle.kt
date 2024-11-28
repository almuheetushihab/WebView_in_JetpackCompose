package com.example.webview.ui.screen.infocardscreen.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun TextTitle(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        style = MaterialTheme.typography.headlineMedium,
        modifier = modifier
    )
}

@PreviewAppScreen
@Composable
fun TextTitlePreview() {
    TextTitle("Last Closer Details")
}