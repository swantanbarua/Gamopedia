package com.swantan.coreNetwork.model.game

data class Year(
    val count: Int,
    val decade: Int,
    val filter: String,
    val from: Int,
    val nofollow: Boolean,
    val to: Int,
    val years: List<YearX>
)