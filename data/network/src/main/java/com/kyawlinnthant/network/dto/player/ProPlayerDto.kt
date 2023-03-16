package com.kyawlinnthant.network.dto.player

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProPlayerDto(
    @SerialName("account_id") val accountId: Int,
    @SerialName("steamid") val steamId: String,
    @SerialName("avatar") val avatar: String,
    @SerialName("avatarmedium") val mediumAvatar: String,
    @SerialName("avatarfull") val fullAvatar: String,
    @SerialName("profileurl") val profileUrl: String,
    @SerialName("personaname") val nickname: String,
    @SerialName("name") val username: String,
    @SerialName("last_login") val lastLoginTime: String,
    @SerialName("full_history_time") val fullHistoryTime: String,
    @SerialName("last_match_time") val lastMatchTime: String,
    @SerialName("is_locked") val isLocked: Boolean,
    @SerialName("locked_until") val lockedUntil: String?,
    @SerialName("cheese") val wonTICount: Int,
    @SerialName("plus") val isPlus: Boolean,
    @SerialName("country_code") val countryCode: String,
    @SerialName("fantasy_role") val fantasyRole: Int,
    @SerialName("fh_unavailable") val fhUnavailable: Boolean,
    @SerialName("is_pro") val isProPlayer: Boolean,
    @SerialName("loccountrycode") val nativeCountryCode: String,
    @SerialName("team_id") val teamId: Int,
    @SerialName("team_name") val teamName: String,
    @SerialName("team_tag") val teamTag: String
)