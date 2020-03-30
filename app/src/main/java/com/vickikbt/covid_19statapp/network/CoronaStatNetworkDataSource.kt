package com.vickikbt.covid_19statapp.network

import androidx.lifecycle.LiveData
import com.vickikbt.covid_19statapp.data.CountriesCoronaData
import com.vickikbt.covid_19statapp.db.entity.GlobalCoronaData

interface CoronaStatNetworkDataSource {
    val downloadedGlobalStats: LiveData<GlobalCoronaData>
    val downloadCountriesStat: LiveData<CountriesCoronaData>

    suspend fun fetchGlobalStat()

    suspend fun fetchCountriesStat()
}