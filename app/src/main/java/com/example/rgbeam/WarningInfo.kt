package com.example.rgbeam

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties

@Composable
fun WarningInfo(onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest ={ },
        title = {
            Text("Warning")
        },
        text = {
            Text("Using this app for an extended period may cause your phone to overheat.")
        },
        confirmButton =  {
            Button(onClick = onDismiss) {
                Text("OK")
            }
        },
        properties =  DialogProperties(
            dismissOnBackPress = false,
            dismissOnClickOutside = false
        )
    )
}