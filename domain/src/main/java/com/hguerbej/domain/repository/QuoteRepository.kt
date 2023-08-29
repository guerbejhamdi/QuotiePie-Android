package com.hguerbej.domain.repository

import com.hguerbej.common.Resource
import com.hguerbej.domain.models.Quote
import kotlinx.coroutines.flow.Flow

interface QuoteRepository {

    suspend fun getRandomQuote(): Flow<Resource<Quote>>

}