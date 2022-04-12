package com.sebasorozcob.stockmarketapp.domain.repository

import com.sebasorozcob.stockmarketapp.domain.model.CompanyListing
import com.sebasorozcob.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {


    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

}