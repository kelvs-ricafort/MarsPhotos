package com.kelvsricafort101.wordpress.marsphotos.fake

import com.kelvsricafort101.wordpress.marsphotos.data.MarsPhotosRepository
import com.kelvsricafort101.wordpress.marsphotos.model.MarsPhoto

class FakeNetworkMarsPhotosRepository: MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}