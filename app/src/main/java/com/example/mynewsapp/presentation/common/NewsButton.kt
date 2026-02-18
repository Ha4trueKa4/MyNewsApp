package com.example.mynewsapp.presentation.common

import android.widget.Button
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Label
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text
import javax.security.auth.callback.Callback

@Composable
fun NewsButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White,
        ),
        shape= RoundedCornerShape(size = 6.dp)
    ) {
        Text(text, style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold))
    }
}

@Composable
fun NewsTextButton(
    text: String,
    onClick: () -> Unit
) {
    TextButton(
        onClick
    ) {
        Text(text, style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold), color = Color.LightGray)
    }
}