package com.example.webview.ui.screen.infocardscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun SubTotalComponent(
    title: String,
    productInfo: String,
    amount: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFF5F5F5),
    borderColor: Color = Color(0xFFDDDDDD)
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                backgroundColor,
                shape = RoundedCornerShape(8.dp)
            )
            .border(
                1.dp, borderColor,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(
                horizontal = 16.dp,
                vertical = 12.dp
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .border(
                            1.dp, borderColor,
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(
                            horizontal = 8.dp,
                            vertical = 4.dp
                        )
                ) {
                    Text(
                        text = productInfo,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                }
            }

            Text(
                text = amount,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@PreviewAppScreen
@Composable
fun SubTotalComponentPreview() {
    SubTotalComponent(
        title = "Sub-Total",
        productInfo = "0 Products",
        amount = "৳0.00"
    )
}
