package com.kyawlinnthant.network.dto.hero

import com.kyawlinnthant.model.hero.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HeroDto(
    @SerialName("id") val pkId: Int,
    @SerialName("hero_id") val id: Int,
    @SerialName("name") val pkName: String,
    @SerialName("localized_name") val heroName: String,
    @SerialName("primary_attr") val primaryAttribute: String,
    @SerialName("attack_type") val attackType: String,
    @SerialName("roles") val heroRoles: List<String>,
    @SerialName("img") val heroImage: String,
    @SerialName("icon") val heroIcon: String,
    @SerialName("base_health") val baseHealth: Int,
    @SerialName("base_mana") val baseMana: Int,
    @SerialName("base_armor") val baseArmor: Float,
    @SerialName("base_str") val baseStrength: Int,
    @SerialName("base_agi") val baseAgility: Int,
    @SerialName("base_int") val baseIntelligence: Int,
    @SerialName("base_health_regen") val baseHealthRegen: Float,
    @SerialName("base_mana_regen") val baseManaRegen: Float,
    @SerialName("str_gain") val strengthGain: Float,
    @SerialName("agi_gain") val agilityGain: Float,
    @SerialName("int_gain") val intelligenceGain: Float,
    @SerialName("attack_range") val attackRange: Int,
    @SerialName("attack_rate") val attackRate: Float,
    @SerialName("attack_point") val attackPoint: Float,
    @SerialName("projectile_speed") val projectileSpeed: Int,
    @SerialName("move_speed") val movementSpeed: Int,
    @SerialName("day_vision") val dayVision: Int,
    @SerialName("night_vision") val nightVision: Int,
    @SerialName("base_attack_max") val baseMaxAttack: Int,
    @SerialName("base_attack_min") val baseMinAttack: Int,
    @SerialName("base_attack_time") val baseAttackTime: Int,
    @SerialName("cm_enabled") val isEnabledInCM: Boolean,
    @SerialName("pro_pick") val proMatchPick: Int,
    @SerialName("pro_ban") val proMatchBan: Int,
    @SerialName("pro_win") val proMatchWin: Int,
    @SerialName("turbo_picks") val turboPick: Int,
    @SerialName("turbo_wins") val turboWin: Int,
) {
    fun toHero() = Hero(
        id = pkId,
        heroId = id,
        name = pkName,
        heroName = heroName,
        image = heroImage,
        icon = heroIcon,
        baseAttribute = BaseAttribute(
            baseHealth = baseHealth,
            baseHealthRegen = baseHealthRegen,
            baseMana = baseMana,
            baseManaRegen = baseManaRegen,
            baseArmor = baseArmor,
            baseStrength = baseStrength,
            baseAgility = baseAgility,
            baseIntelligence = baseIntelligence,
            baseAttackMax = baseMaxAttack,
            baseAttackMin = baseMinAttack,
            baseAttackTime = baseAttackTime
        ),
        attribute = Attribute(
            attackType = attackType.asAttackType(),
            primaryAttribute = primaryAttribute.asPrimaryAttribute(),
            roles = heroRoles.map { it.asRoles() },
            movementSpeed = movementSpeed,
            attackRange = attackRange,
            attackRate = attackRate,
            projectileSpeed = projectileSpeed,
            attackPoint = attackPoint,
            dayVision = dayVision,
            nightVision = nightVision,
            strengthGain = strengthGain,
            agilityGain = agilityGain,
            intelligenceGain = intelligenceGain
        ),
        matchStatus = MatchStatus(
            isEnabledInCaptainMode = isEnabledInCM,
            turboPick = turboPick,
            turboWin = turboWin,
            proPick = proMatchPick,
            proWin = proMatchWin,
            proBan = proMatchBan
        )
    )
}