package com.c0de_h0ng.cryptocurrencyapp.domain.model


/**
 * Created by c0de_h0ng on 2022/01/16.
 */
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)
