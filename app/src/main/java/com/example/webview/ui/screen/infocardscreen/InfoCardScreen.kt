package com.example.webview.ui.screen.infocardscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen
import com.example.webview.ui.screen.infocardscreen.component.AddOptionsComponent
import com.example.webview.ui.screen.infocardscreen.component.ButtonData
import com.example.webview.ui.screen.infocardscreen.component.ButtonGroupComponent
import com.example.webview.ui.screen.infocardscreen.component.DynamicInfoCard
import com.example.webview.ui.screen.infocardscreen.components.DetailsCard
import com.example.webview.ui.screen.infocardscreen.components.InfoCard
import com.example.webview.ui.screen.infocardscreen.component.InfoCardComponent
import com.example.webview.ui.screen.infocardscreen.component.SearchCustomerComponent
import com.example.webview.ui.screen.infocardscreen.component.SubTotalComponent
import com.example.webview.ui.screen.infocardscreen.components.TextArea
import com.example.webview.ui.screen.infocardscreen.components.TextTitle


@Composable
fun InfoCardScreen() {
    val textState = rememberSaveable { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        Spacer(modifier = Modifier.height(16.dp))

        TextTitle(
            title = "Last Closer Details",
            modifier = Modifier.padding(8.dp),
        )

        InfoCard(
            title = "Nothing Found",
            firstDescription = "Look like you have not any details about your register.",
            secondDescription = "Details will appear here when you close your register.",
            modifier = Modifier
                .width(800.dp)
                .wrapContentHeight(),
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextTitle(
            title = "Register Details",
            modifier = Modifier.padding(8.dp),
        )

        DetailsCard(
            modifier = Modifier
                .width(800.dp)
                .wrapContentHeight(),
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextTitle(
            title = "Notes",
            modifier = Modifier.padding(8.dp),
        )

        TextArea(
            value = textState.value,
            onValueChange = { textState.value = it },
            modifier = Modifier
                .width(800.dp)
                .wrapContentHeight(),
        )

        Spacer(modifier = Modifier.height(16.dp))

        SubTotalComponent(
            title = "Sub-Total",
            productCount = "0 Products",
            amount = "৳0.00",
            backgroundColor = Color(0xFFFFF8F8),
            modifier = Modifier
                .width(500.dp)
        )

        AddOptionsComponent(
            onCouponCodeClick = { },
            onStoreCreditClick = { },
            onNoteClick = { },
            modifier = Modifier
                .width(500.dp)
                .wrapContentHeight(),
        )

        Spacer(modifier = Modifier.height(16.dp))

        InfoCardComponent(
            message = "Close your register to finalize payments and sales of the day",
            modifier = Modifier
                .width(800.dp)
                .wrapContentHeight(),
        )

        DynamicInfoCard(
            titleName = "Due",
            value = "৳2,000.00",
            backgroundColor = Color(0xFFFFF8F8),
            borderColor = Color(0xFFFFC1C1),
            textColor = Color(0xFFFF0000),
            modifier = Modifier.width(800.dp)
        )

        DynamicInfoCard(
            titleName = "Change Return",
            value = "৳80.00",
            backgroundColor = Color(0xFFFFF8E1),
            borderColor = Color(0xFFFFD180),
            textColor = Color(0xFFFF6F00),
            modifier = Modifier.width(800.dp)
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        SearchCustomerComponent(
            onSearch = {},
            onButtonClick = {},
            placeholderText = "Search Customer",
            modifier = Modifier.width(500.dp)
        )

         ButtonGroupComponent(
             buttons = listOf(
                 ButtonData(label = "Void", icon = Icons.Default.Delete),
                 ButtonData(label = "Retrieve Sale", icon = Icons.Default.Refresh),
                 ButtonData(label = "Park Sale", icon = Icons.Default.Search, isHighlighted = true)
             ),
                 onButtonClick = { button ->
                     println("${button.label} button clicked")
                 },
             modifier = Modifier.fillMaxWidth()
         )


    }
}


@PreviewAppScreen
@Composable
fun InfoCardScreenPreview() {
    InfoCardScreen()
}