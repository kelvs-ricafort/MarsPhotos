package com.kelvsricafort101.wordpress.marsphotos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kelvsricafort101.wordpress.marsphotos.ui.MarsPhotosApp
import com.kelvsricafort101.wordpress.marsphotos.ui.theme.MarsPhotosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MarsPhotosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MarsPhotosApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MarsPhotosAppPreview() {
    MarsPhotosTheme(darkTheme = false) {
        MarsPhotosApp()
    }
}

@Preview(showBackground = true)
@Composable
fun MarsPhotosAppDarkPreview() {
    MarsPhotosTheme(darkTheme = true) {
        MarsPhotosApp()
    }
}