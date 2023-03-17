package com.kyawlinnthant.model.hero
enum class AttackType {
    MELEE, RANGED, OTHERS;
}
fun String.asAttackType(): AttackType {
    return when (this.trim()) {
        "Ranged" -> AttackType.RANGED
        "Melee" -> AttackType.MELEE
        else -> AttackType.OTHERS
    }
}