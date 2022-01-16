package com.c0de_h0ng.cryptocurrencyapp.domain.repository

import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.CoinDto

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}