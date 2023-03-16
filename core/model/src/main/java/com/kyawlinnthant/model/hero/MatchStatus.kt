package com.kyawlinnthant.model.hero

data class MatchStatus(
    val isEnabledInCaptainMode: Boolean = false,
    val turboPick: Int = 0,
    val turboWin: Int = 0,
    val proPick: Int = 0,
    val proWin: Int = 0,
    val proBan: Int = 0,
)
