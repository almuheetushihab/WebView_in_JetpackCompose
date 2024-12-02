package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonGroupComponent(
    onVoidClick: () -> Unit,
    onRetrieveClick: () -> Unit,
    onParkClick: () -> Unit,
    voidButtonColor: Color,
    retrieveButtonColor: Color,
    parkButtonColor: Color,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = {
                onVoidClick()
            },
            modifier = Modifier
                .padding(horizontal = 2.dp)
                .weight(1f),
            colors = ButtonDefaults.buttonColors(
                containerColor = voidButtonColor,
                contentColor = MaterialTheme.colorScheme.onSurface
            ),
            border = ButtonDefaults.outlinedButtonBorder,
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Delete,
                contentDescription = "Void",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Void")
        }

        Button(
            onClick = {
                onRetrieveClick()
            },
            modifier = Modifier
                .padding(horizontal = 2.dp)
                .weight(1f),
            colors = ButtonDefaults.buttonColors(
                containerColor = retrieveButtonColor,
                contentColor = MaterialTheme.colorScheme.onSurface
            ),
            border = ButtonDefaults.outlinedButtonBorder,
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Refresh,
                contentDescription = "",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Retrieve Sale")
        }

        Button(
            onClick = {
                onParkClick()
            },
            modifier = Modifier
                .padding(horizontal = 2.dp)
                .weight(1f),
            colors = ButtonDefaults.buttonColors(
                containerColor = parkButtonColor,
                contentColor = MaterialTheme.colorScheme.surface
            ),
            border = ButtonDefaults.outlinedButtonBorder,
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Search,
                contentDescription = "Park Sale",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Park Sale")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonGroupComponentPreview() {
    ButtonGroupComponent(
        onVoidClick = {},
        onRetrieveClick = {},
        onParkClick = {},
        voidButtonColor = MaterialTheme.colorScheme.surface,
        retrieveButtonColor = MaterialTheme.colorScheme.surface,
        parkButtonColor = MaterialTheme.colorScheme.primary,
    )
}