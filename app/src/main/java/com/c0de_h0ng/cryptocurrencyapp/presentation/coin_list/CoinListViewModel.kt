package com.c0de_h0ng.cryptocurrencyapp.presentation.coin_list

import androidx.lifecycle.ViewModel
import com.c0de_h0ng.cryptocurrencyapp.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {

}