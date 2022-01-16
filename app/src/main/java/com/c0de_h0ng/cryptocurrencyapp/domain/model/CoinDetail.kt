package com.c0de_h0ng.cryptocurrencyapp.domain.model

import com.c0de_h0ng.cryptocurrencyapp.data.remote.dto.TeamMember

/**
 * Created by c0de_h0ng on 2022/01/16.
 */
data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
