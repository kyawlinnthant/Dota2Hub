package com.kyawlinnthant.network.source

import com.kyawlinnthant.network.dto.HeroDto
import com.kyawlinnthant.network.state.NetworkDataState

interface D2HubNetworkDataSource {
    suspend fun getHeroStats(): NetworkDataState<List<HeroDto>>
}