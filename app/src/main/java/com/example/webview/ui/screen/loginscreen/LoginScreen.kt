package com.example.webview.ui.screen.loginscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.webview.ui.screen.loginscreen.components.AppLogo
import com.example.webview.ui.screen.loginscreen.components.BranchSelector
import com.example.webview.ui.screen.loginscreen.components.EmailInputField
import com.example.webview.ui.screen.loginscreen.components.PasswordInputField
import com.example.webview.ui.screen.loginscreen.components.RememberMeOption
import com.example.webview.ui.screen.loginscreen.components.SignInButton
import com.example.webview.ui.screen.loginscreen.components.WelcomeText

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppLogo()
        Spacer(modifier = Modifier.height(16.dp))
        WelcomeText()
        Spacer(modifier = Modifier.height(24.dp))
        EmailInputField()
        Spacer(modifier = Modifier.height(16.dp))
        PasswordInputField()
        Spacer(modifier = Modifier.height(24.dp))
        BranchSelector()
        Spacer(modifier = Modifier.height(24.dp))
        RememberMeOption()
        Spacer(modifier = Modifier.height(16.dp))
        SignInButton()
    }
}

@PreviewLightDark
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
