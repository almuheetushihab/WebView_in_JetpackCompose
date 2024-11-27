package com.example.webview.ui.screen.loginscreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.webview.R

@Composable
fun AppLogo() {
    Image(
        painter = painterResource(id = R.drawable.barnoi_logo),
        contentDescription = "App Logo",
        modifier = Modifier.size(100.dp).clip(CircleShape)
    )
}

@PreviewLightDark
@Composable
fun AppLogoPreview() {
    AppLogo()
}