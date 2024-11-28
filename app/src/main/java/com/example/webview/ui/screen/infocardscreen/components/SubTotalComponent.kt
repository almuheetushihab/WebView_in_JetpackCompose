package com.example.webview.ui.screen.infocardscreen.components

@Composable
fun SubTotalComponent(
    title: String,
    productInfo: String,
    amount: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFF5F5F5), // Light gray background
    borderColor: Color = Color(0xFFDDDDDD) // Border color
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor, shape = RoundedCornerShape(8.dp))
            .border(1.dp, borderColor, shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Title and Product Info
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Title
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.width(8.dp))

                // Product Info Box
                Box(
                    modifier = Modifier
                        .border(1.dp, borderColor, shape = RoundedCornerShape(4.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = productInfo,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                }
            }

            // Amount
            Text(
                text = amount,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SubTotalComponentPreview() {
    SubTotalComponent(
        title = "Sub-Total",
        productInfo = "0 Products",
        amount = "৳0.00"
    )
}
