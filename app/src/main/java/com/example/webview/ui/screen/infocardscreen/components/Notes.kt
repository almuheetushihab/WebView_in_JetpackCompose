package com.example.webview.ui.screen.infocardscreen.components

import androidx.compose.foundation.border
import androidx.compose.runtime.mutableStateOf

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TextArea(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth()
            .height(150.dp)
            .border(
                width = .5.dp,
                color = MaterialTheme.colorScheme.outline,
                shape = RoundedCornerShape(8.dp)
            ),
        maxLines = 10,
        minLines = 5,
        textStyle = MaterialTheme.typography.bodyLarge,
        singleLine = false,
        placeholder = {
            Text(
                text = "Write here",
                style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)) // Optional: styling placeholder
            )
        },
        shape = RoundedCornerShape(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TextAreaPreview() {
    val textState = remember { mutableStateOf("") }
    TextArea(
        value = textState.value,
        onValueChange = { textState.value = it },
    )
}
