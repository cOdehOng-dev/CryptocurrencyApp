package com.c0de_h0ng.cryptocurrencyapp.presentation

/**
 * Created by c0de_h0ng on 2022/01/17.
 */
sealed class Screen(val route: String) {
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")

}
