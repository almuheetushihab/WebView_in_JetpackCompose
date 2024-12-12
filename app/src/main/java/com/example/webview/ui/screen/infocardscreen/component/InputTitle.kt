package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun InputTile(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        fontSize = 20.sp
    )
}

@Preview(showBackground = true)
@Composable
private fun SignInSkeletonPreview() {
        InputTile(text = "Email")
}
