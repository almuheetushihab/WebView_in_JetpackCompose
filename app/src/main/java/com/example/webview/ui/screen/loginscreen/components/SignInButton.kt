package com.example.webview.ui.screen.loginscreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun SignInButton() {
    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Sign In")
    }
}

@PreviewLightDark
@Composable
fun SignInButtonPreview() {
    SignInButton()
}
