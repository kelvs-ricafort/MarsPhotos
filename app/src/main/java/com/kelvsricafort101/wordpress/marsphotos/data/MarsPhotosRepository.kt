package com.kelvsricafort101.wordpress.marsphotos.data

import com.kelvsricafort101.wordpress.marsphotos.model.MarsPhoto
import com.kelvsricafort101.wordpress.marsphotos.network.MarsApiService

interface MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi. */
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
): MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}