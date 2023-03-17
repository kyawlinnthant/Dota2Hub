package com.kyawlinnthant.model.hero

enum class PrimaryAttribute {
    AGILITY,
    STRENGTH,
    INTELLIGENCE,
    OTHERS;
}
fun String.asPrimaryAttribute(): PrimaryAttribute {
    return when (this.trim()) {
        "str" -> PrimaryAttribute.STRENGTH
        "int" -> PrimaryAttribute.INTELLIGENCE
        "agi" -> PrimaryAttribute.AGILITY
        else -> PrimaryAttribute.OTHERS
    }
}