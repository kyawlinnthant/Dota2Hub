package com.kyawlinnthant.model.hero

data class Attribute(
    val attackType: AttackType = AttackType.OTHERS,
    val primaryAttribute: PrimaryAttribute = PrimaryAttribute.OTHERS,
    val roles: List<Roles> = emptyList(),
    val movementSpeed: Int = 0,
    val attackRange: Int = 0,
    val attackRate: Float = 0f,
    val projectileSpeed: Int = 0,
    val attackPoint: Float = 0f,
    val dayVision: Int = 0,
    val nightVision: Int = 0,
    val strengthGain: Float = 0f,
    val agilityGain: Float = 0f,
    val intelligenceGain: Float = 0f,
)
