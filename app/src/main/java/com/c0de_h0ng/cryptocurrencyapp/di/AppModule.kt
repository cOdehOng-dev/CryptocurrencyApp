package com.c0de_h0ng.cryptocurrencyapp.di

import com.c0de_h0ng.cryptocurrencyapp.common.Constants.BASE_URL
import com.c0de_h0ng.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.c0de_h0ng.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.c0de_h0ng.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}