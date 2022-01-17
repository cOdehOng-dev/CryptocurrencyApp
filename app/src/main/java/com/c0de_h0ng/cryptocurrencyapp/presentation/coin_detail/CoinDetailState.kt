package com.c0de_h0ng.cryptocurrencyapp.presentation.coin_detail

import com.c0de_h0ng.cryptocurrencyapp.domain.model.CoinDetail

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
