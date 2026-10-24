package com.kelvsricafort101.wordpress.marsphotos

import com.kelvsricafort101.wordpress.marsphotos.data.NetworkMarsPhotosRepository
import com.kelvsricafort101.wordpress.marsphotos.fake.FakeMarsApiService
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
        }
}