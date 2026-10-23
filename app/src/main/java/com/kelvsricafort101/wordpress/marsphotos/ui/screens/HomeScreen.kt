package com.kelvsricafort101.wordpress.marsphotos.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvsricafort101.wordpress.marsphotos.R
import com.kelvsricafort101.wordpress.marsphotos.ui.theme.MarsPhotosTheme

@Composable
fun HomeScreen(
    marsUiState: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    ResultScreen(
        photos = marsUiState,
        modifier = modifier.padding(top = contentPadding.calculateTopPadding())
    )
}

/**
 * ResultScreen displaying number of photos retrieved.
 */
@Composable
fun ResultScreen(photos: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = photos
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    MarsPhotosTheme(darkTheme = false) {
        Surface {
            ResultScreen(photos = stringResource(R.string.placeholder_result))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenDarkPreview() {
    MarsPhotosTheme(darkTheme = true) {
        Surface {
            ResultScreen(photos = stringResource(R.string.placeholder_result))
        }
    }
}