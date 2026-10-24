package com.kelvsricafort101.wordpress.marsphotos.fake

import com.kelvsricafort101.wordpress.marsphotos.model.MarsPhoto
import com.kelvsricafort101.wordpress.marsphotos.network.MarsApiService

class FakeMarsApiService: MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}