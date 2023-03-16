package com.kyawlinnthant.network.dto.team

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamDto(
    @SerialName("team_id") val teamId: Int,
    @SerialName("name") val name: String,
    @SerialName("tag") val nickname: String,
    @SerialName("logo_url") val logo: String,
    @SerialName("last_match_time") val lastMatchTime: Long,
    @SerialName("rating") val rating: Double,
    @SerialName("wins") val wins: Int,
    @SerialName("losses") val losses: Int,
)