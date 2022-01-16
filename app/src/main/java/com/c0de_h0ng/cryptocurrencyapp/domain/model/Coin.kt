package com.c0de_h0ng.cryptocurrencyapp.domain.model

import com.google.gson.annotations.SerializedName

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
