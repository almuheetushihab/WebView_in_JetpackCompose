package com.example.webview.ui.screen.loginscreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun EmailInputField() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = { Text("Email") },
        modifier = Modifier.fillMaxWidth()
    )
}

@PreviewLightDark
@Composable
fun EmailInputFieldPreview() {
    EmailInputField()
}
