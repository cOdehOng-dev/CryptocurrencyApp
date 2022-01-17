package com.c0de_h0ng.cryptocurrencyapp.presentation.coin_list

import com.c0de_h0ng.cryptocurrencyapp.domain.model.Coin

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
