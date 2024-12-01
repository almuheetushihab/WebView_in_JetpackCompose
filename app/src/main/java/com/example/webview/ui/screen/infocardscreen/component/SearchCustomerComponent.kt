package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchCustomerComponent(
    onSearch: (String) -> Unit,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    placeholderText: String,
) {
    var searchText by remember { mutableStateOf("") }

    Row(
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(8.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.Person,
            contentDescription = "Search Icon",
            modifier = Modifier
                .padding(start = 16.dp)
                .size(30.dp),
            tint = Color.Gray
        )

        TextField(
            value = searchText,
            onValueChange = {
                searchText = it
                onSearch(it)
            },
            modifier = Modifier.weight(1f),
            placeholder = { Text(text = placeholderText, color = Color.Gray) },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = Color.Transparent
            )
        )

        TextButton(
            onClick = { onButtonClick() },
            modifier = Modifier
                .defaultMinSize(minWidth = 48.dp, minHeight = 52.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.White
            )
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add Button"
            )
        }
    }
}

@PreviewAppScreen
@Composable
fun SearchCustomerComponentPreview() {
    SearchCustomerComponent(
        onSearch = { },
        onButtonClick = { },
        placeholderText = "Search Customer"
    )
}