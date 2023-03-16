package com.kyawlinnthant.network.source

import com.kyawlinnthant.network.dto.hero.HeroDto
import com.kyawlinnthant.network.dto.player.PlayerDto
import com.kyawlinnthant.network.dto.player.ProPlayerDto
import com.kyawlinnthant.network.dto.team.TeamDto
import com.kyawlinnthant.network.state.NetworkDataState
import javax.inject.Inject

class D2HubNetworkDataSourceImpl @Inject constructor(

) : D2HubNetworkDataSource {
    override suspend fun getHeroStats(): NetworkDataState<List<HeroDto>> {
        return NetworkDataState.Error(message = "TODO")
    }

    override suspend fun getProPlayers(): NetworkDataState<List<ProPlayerDto>> {
        return NetworkDataState.Error(message = "TODO")
    }

    override suspend fun getTeams(): NetworkDataState<List<TeamDto>> {
        return NetworkDataState.Error(message = "TODO")
    }

    override suspend fun getPlayer(): NetworkDataState<PlayerDto> {
        return NetworkDataState.Error(message = "TODO")
    }
}