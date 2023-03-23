package com.aafaq.network.domain.usecases

import com.aafaq.network.ApiService
import com.aafaq.network.data.models.GeneralResponse
import com.aafaq.network.data.models.Salah.Methods
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class GetCalendarByAddressUseCase (
    private val apiService: ApiService
) {
    suspend fun execute(
        year: Int,
        month: Int?,
        address: String,
        method: Methods,
    ): Flow<GeneralResponse> {
        return flowOf(apiService.getCalendarByAddress(
            year = year,
            month = month,
            address = address,
            method = method.numberValue
        ))
    }
}