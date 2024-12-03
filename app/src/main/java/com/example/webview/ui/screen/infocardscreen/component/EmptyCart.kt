package com.example.webview.ui.screen.infocardscreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun EmptyCart(
    icon: ImageVector,
    title: String,
    description: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(
                    color = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "",
                tint = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
                modifier = Modifier.size((48 * 0.5).dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall.copy(
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = description,
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }
}

@PreviewAppScreen
@Preview(showBackground = true)
@Composable
fun EmptyCartComponentPreview() {
    EmptyCart(
        icon = Icons.Outlined.ShoppingCart,
        title = "Product Cart is Empty",
        description = "Look like you have not added anything to cart. Search product or scan barcode ..."
    )
}