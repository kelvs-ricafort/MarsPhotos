package com.kelvsricafort101.wordpress.marsphotos

import com.kelvsricafort101.wordpress.marsphotos.fake.FakeDataSource
import com.kelvsricafort101.wordpress.marsphotos.fake.FakeNetworkMarsPhotosRepository
import com.kelvsricafort101.wordpress.marsphotos.rules.TestDispatcherRule
import com.kelvsricafort101.wordpress.marsphotos.ui.screens.MarsUiState
import com.kelvsricafort101.wordpress.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() = runTest {
        val marsViewModel = MarsViewModel(
            marsPhotosRepository = FakeNetworkMarsPhotosRepository()
        )
        assertEquals(
            MarsUiState.Success("Success: ${FakeDataSource.photosList.size} Mars photos retrieved"),
            marsViewModel.marsUiState
        )
    }
}