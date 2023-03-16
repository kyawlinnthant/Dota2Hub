package com.kyawlinnthant.model.hero

data class Hero(
    val id: Int = 0,
    val heroId: Int = 0,
    val name: String = "",
    val heroName: String = "",
    val image: String = "",
    val icon: String = "",
    val baseAttribute: BaseAttribute = BaseAttribute(),
    val attribute: Attribute = Attribute(),
    val matchStatus: MatchStatus = MatchStatus(),
)
