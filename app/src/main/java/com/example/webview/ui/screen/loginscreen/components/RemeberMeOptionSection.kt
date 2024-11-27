package com.example.webview.ui.screen.loginscreen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp

@Composable
fun RememberMeOption() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = false,
            onCheckedChange = {}
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text("Remember for 30 days")
    }
}

@PreviewLightDark
@Composable
fun RememberMeOptionPreview() {
    RememberMeOption()
}