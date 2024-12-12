package com.example.webview.ui.screen.infocardscreen.component

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.webview.R
import com.example.webview.ui.components.PreviewAppScreen
import com.example.webview.ui.screen.infocardscreen.components.TextArea
import java.util.Calendar
import java.util.Locale

@Composable
fun AddCustomerAdditionalInformation() {
    var customerCode by remember { mutableStateOf("") }
    var dateOfBirth by remember { mutableStateOf("") }
    var companyName by remember { mutableStateOf("") }
    var selectedGender by remember { mutableStateOf("") }
    var isFocused by remember { mutableStateOf(false) }

    val context = LocalContext.current

    val calendar = Calendar.getInstance()
    val mYear = calendar.get(Calendar.YEAR)
    val mMonth = calendar.get(Calendar.MONTH)
    val mDay = calendar.get(Calendar.DAY_OF_MONTH)

    val datePickerDialog = DatePickerDialog(
        context,
        { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            dateOfBirth = String.format(Locale.US, "%02d/%02d/%04d", dayOfMonth, month + 1, year)
        },
        mYear, mMonth, mDay
    )


    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                InputTile(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.customer_code)
                )

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = customerCode,
                    singleLine = true,
                    onValueChange = { customerCode = it },
                    placeholder = { Text(stringResource(R.string.enter_customer_code)) },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = MaterialTheme.colorScheme.primary
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    ),
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                InputTile(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = stringResource(R.string.date_of_birth)

                )

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onFocusChanged { focusState ->
                            isFocused = focusState.isFocused
                        },
                    value = dateOfBirth,
                    onValueChange = {},
                    readOnly = true,
                    placeholder = { Text(stringResource(R.string.date_month)) },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Call,
                            contentDescription = null,
                            modifier = Modifier.clickable {
                                datePickerDialog.show()
                            }
                        )
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        InputTile(
            modifier = Modifier
                .fillMaxWidth(),
            text = stringResource(R.string.company_name)

        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = companyName,
            onValueChange = {
                companyName = it
            },
            placeholder = {
                Text(text = stringResource(R.string.enter_company_name))
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            singleLine = true

        )

        Spacer(modifier = Modifier.height(8.dp))

        Column {
            InputTile(
                modifier = Modifier
                    .fillMaxWidth(),
                text = stringResource(R.string.gender_name)

            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(end = 32.dp)
                        .clickable { selectedGender = "Male" }
                ) {
                    RadioButton(
                        selected = selectedGender == "Male",
                        onClick = { selectedGender = "Male" },
                    )
                    Text(
                        text = stringResource(R.string.male),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(end = 32.dp)
                        .clickable { selectedGender = "Female" }
                ) {
                    RadioButton(
                        selected = selectedGender == "Female",
                        onClick = { selectedGender = "Female" }
                    )
                    Text(
                        text = stringResource(R.string.female),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clickable { selectedGender = "Others" }
                ) {
                    RadioButton(
                        selected = selectedGender == "Others",
                        onClick = { selectedGender = "Others" }
                    )
                    Text(
                        text = stringResource(R.string.others),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                    )
                }
            }
        }

        InputTile(
            modifier = Modifier
                .fillMaxWidth(),
            text = stringResource(R.string.notes)
        )

        TextArea(
            value = "",
            onValueChange = {},
        )
    }
}


@PreviewAppScreen
@Composable
fun AddCustomerAdditionalInformationPreview() {
        AddCustomerAdditionalInformation()
}