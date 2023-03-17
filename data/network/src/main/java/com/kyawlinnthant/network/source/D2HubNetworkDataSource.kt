package com.kyawlinnthant.network.source

import com.kyawlinnthant.network.dto.hero.HeroDto
import com.kyawlinnthant.network.dto.player.PlayerDto
import com.kyawlinnthant.network.dto.player.ProPlayerDto
import com.kyawlinnthant.network.dto.team.TeamDto
import com.kyawlinnthant.network.state.NetworkDataState
interface D2HubNetworkDataSource {
    suspend fun getHeroStats(): NetworkDataState<List<HeroDto>>
    suspend fun getProPlayers(): NetworkDataState<List<ProPlayerDto>>
    suspend fun getTeams(): NetworkDataState<List<TeamDto>>
    suspend fun getPlayer(): NetworkDataState<PlayerDto>
}