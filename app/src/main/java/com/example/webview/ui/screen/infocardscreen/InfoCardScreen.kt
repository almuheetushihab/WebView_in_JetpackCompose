package com.example.webview.ui.screen.infocardscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.webview.ui.components.PreviewAppScreen
import com.example.webview.ui.screen.infocardscreen.components.AddOptionsComponent
import com.example.webview.ui.screen.infocardscreen.components.DetailsCard
import com.example.webview.ui.screen.infocardscreen.components.InfoCard
import com.example.webview.ui.screen.infocardscreen.components.InfoCardComponent
import com.example.webview.ui.screen.infocardscreen.components.TextArea
import com.example.webview.ui.screen.infocardscreen.components.TextTitle


@Composable
fun InfoCardScreen() {
    val textState = rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
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
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Info,
                    contentDescription = "Info Icon",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            },
            message = "Close your register to finalize payments and sales of the day",
            modifier = Modifier
                .width(800.dp)
                .wrapContentHeight(),
        )
    }
}


@PreviewAppScreen
@Composable
fun InfoCardScreenPreview() {
    InfoCardScreen()
}