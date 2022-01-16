package com.c0de_h0ng.cryptocurrencyapp.data.repository

import com.c0de_h0ng.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.CoinDto
import com.c0de_h0ng.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}