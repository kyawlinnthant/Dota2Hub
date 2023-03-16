package com.kyawlinnthant.model.hero

enum class Roles {
    CARRY,
    SUPPORT,
    DISABLER,
    NUKER,
    INITIATOR,
    PUSHER,
    ESCAPE,
    DURABLE,
    OTHERS;
}

fun String.asRoles(): Roles {
    return when (this.trim()) {
        "Carry" -> Roles.CARRY
        "Support" -> Roles.SUPPORT
        "Disabler" -> Roles.DISABLER
        "Nuker" -> Roles.NUKER
        "Initiator" -> Roles.INITIATOR
        "Pusher" -> Roles.PUSHER
        "Escape" -> Roles.ESCAPE
        "Durable" -> Roles.DURABLE
        else -> Roles.OTHERS
    }
}
