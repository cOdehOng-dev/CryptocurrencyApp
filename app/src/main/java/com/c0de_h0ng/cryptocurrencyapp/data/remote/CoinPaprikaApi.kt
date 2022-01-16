package com.c0de_h0ng.cryptocurrencyapp.data.remote

import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}