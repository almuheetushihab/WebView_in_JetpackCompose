package com.example.webview.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("GFG | WebView", color = Color.White) },
               colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Gray)) },

        content = {
            WebViewPage(
                url = "https://www.geeksforgeeks.org",
                modifier = Modifier.padding(it)
            )
        }
    )
}