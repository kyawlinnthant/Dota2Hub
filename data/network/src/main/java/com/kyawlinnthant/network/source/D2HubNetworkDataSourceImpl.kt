package com.kyawlinnthant.network.source

import com.kyawlinnthant.network.dto.HeroDto
import com.kyawlinnthant.network.state.NetworkDataState
import javax.inject.Inject

class D2HubNetworkDataSourceImpl @Inject constructor(

) : D2HubNetworkDataSource {
    override suspend fun getHeroStats(): NetworkDataState<List<HeroDto>> {
        return NetworkDataState.Error(message = "TODO")
    }
}