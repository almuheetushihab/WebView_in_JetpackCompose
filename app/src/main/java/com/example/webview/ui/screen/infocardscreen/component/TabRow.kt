package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun TabRow(
    tabs: List<String>,
    onTabSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTabIndex by remember { mutableStateOf(0) }

    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        contentColor = Color.Black,
        containerColor = Color.Transparent,
        divider = {}
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                },
                text = {
                    Text(
                        text = title,
                        fontSize = 14.sp,
                        color = if (selectedTabIndex == index) Color.Blue else Color.Gray,
                        fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            )
        }
    }
}


@PreviewAppScreen
@Composable
fun TabRowPreview() {
    val tabs = listOf("Contact", "Mailing Address", "Additional Information")

    TabRow(
        tabs = tabs,
        onTabSelected = {},
        modifier = Modifier.fillMaxWidth()
    )
}