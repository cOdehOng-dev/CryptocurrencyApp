package com.c0de_h0ng.cryptocurrencyapp.domain.use_case.get_coin

import com.c0de_h0ng.cryptocurrencyapp.common.Resource
import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.toCoin
import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.c0de_h0ng.cryptocurrencyapp.domain.model.Coin
import com.c0de_h0ng.cryptocurrencyapp.domain.model.CoinDetail
import com.c0de_h0ng.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet"))
        }
    }
}