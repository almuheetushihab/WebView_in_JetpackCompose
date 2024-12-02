package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen


@Composable
fun SearchCustomer(
    onSearch: (String) -> Unit,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    placeholderText: String,
) {
    val searchText = remember { mutableStateOf("") }

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

        TextField(
            value = searchText.value,
            onValueChange = {
                searchText.value = it
                onSearch(it)
            },
            modifier = Modifier.weight(1f),
            placeholder = {
                Text(text = placeholderText)
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription = "",
                    modifier = Modifier.size(24.dp)
                )
            },
            trailingIcon = {
                Box(
                    modifier = Modifier
                        .width(50.dp)
                        .height(54.dp)
                        .background(
                            color = MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable {
                            onButtonClick()
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Add,
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                }
            },
            singleLine = true,
        )
    }
}
@PreviewAppScreen
@Preview(showBackground = true)
@Composable
fun SearchCustomerPreview() {
    SearchCustomer(
        onSearch = {},
        onButtonClick = {},
        placeholderText = "Search Customer",
    )
}