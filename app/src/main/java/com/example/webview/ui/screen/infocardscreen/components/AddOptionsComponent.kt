package com.example.webview.ui.screen.infocardscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen

@Composable
fun AddOptionsComponent(
    onCouponCodeClick: () -> Unit,
    onStoreCreditClick: () -> Unit,
    onNoteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Add",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )

            TextButton(
                onClick = onCouponCodeClick
            ) {
                Text(text = "Coupon Code")
            }

            Spacer(
                modifier = Modifier
                    .width(0.5.dp)
                    .height(20.dp)
                    .background(MaterialTheme.colorScheme.outline)
            )


            TextButton(
                onClick = onStoreCreditClick
            ) {
                Text(text = "Store Credit")
            }

            Spacer(
                modifier = Modifier
                    .width(0.5.dp)
                    .height(20.dp)
                    .background(MaterialTheme.colorScheme.outline)
            )


            TextButton(
                onClick = onNoteClick
            ) {
                Text(text = "Note")
            }

        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.5.dp,
            color = MaterialTheme.colorScheme.outline
        )

        TextValue(
            text = "Discount",
            value = "- ৳0.00",
        )

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.5.dp,
            color = MaterialTheme.colorScheme.outline
        )

        TextValue(
            text = "VAT",
            value = "+ ৳0.00",
        )

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.5.dp,
            color = MaterialTheme.colorScheme.outline
        )

        TextValue(
            text = "Total",
            value = "৳0.00"
        )

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.5.dp,
            color = MaterialTheme.colorScheme.outline
        )

        TextValue(
            text = "Grand-Total",
            value = "৳0.00"
        )

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.5.dp,
            color = MaterialTheme.colorScheme.outline
        )
    }

}


@PreviewAppScreen
@Composable
fun AddOptionsComponentPreview() {
    AddOptionsComponent(
        onCouponCodeClick = { },
        onStoreCreditClick = { },
        onNoteClick = { }
    )
}
