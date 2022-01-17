package com.c0de_h0ng.cryptocurrencyapp.domain.use_case.get_coins

import com.c0de_h0ng.cryptocurrencyapp.common.Resource
import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.toCoin
import com.c0de_h0ng.cryptocurrencyapp.domain.model.Coin
import com.c0de_h0ng.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Coin>>("Couldn't reach server. Check your internet"))
        }
    }
}