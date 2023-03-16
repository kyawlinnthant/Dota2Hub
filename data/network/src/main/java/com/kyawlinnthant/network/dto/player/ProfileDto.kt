package com.kyawlinnthant.network.dto.player

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProfileDto(
    @SerialName("account_id") val accountId: Int,
    @SerialName("steamid") val steamId: String,
    @SerialName("avatar") val avatarDefault: String,
    @SerialName("avatarmedium") val avatarMedium: String,
    @SerialName("avatarfull") val avatarFull: String,
    @SerialName("profileurl") val profileUrl: String,
    @SerialName("personaname") val nickname: String,
    @SerialName("name") val username: String?,
    @SerialName("cheese") val wonTICount: Int,
    @SerialName("last_login") val lastLoginTime: String,
    @SerialName("loccountrycode") val nativeCountryCode: String?,
    @SerialName("plus") val isPlus: Boolean,
    @SerialName("is_contributor") val isContributor: Boolean,
    @SerialName("is_subscriber") val isSubscriber: Boolean,
    @SerialName("status") val status: String?
)

