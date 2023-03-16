package com.kyawlinnthant.network.dto.player

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlayerDto(
    @SerialName("profile") val profile: ProfileDto,
    @SerialName("mmr_estimate") val estimateMmr: MmrEstimate,
    @SerialName("competitive_rank") val partyRank: Int,
    @SerialName("solo_competitive_rank") val soloRank: Int,
    @SerialName("leaderboard_rank") val leaderboard_rank: Int?,
    @SerialName("rank_tier") val rankTier: Int,
)