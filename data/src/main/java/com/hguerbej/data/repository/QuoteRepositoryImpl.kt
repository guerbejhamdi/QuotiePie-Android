package com.hguerbej.data.repository

import com.hguerbej.common.Resource
import com.hguerbej.data.api.QuoteApi
import com.hguerbej.data.models.toQuote
import com.hguerbej.domain.models.Quote
import com.hguerbej.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class QuoteRepositoryImpl(private val quoteApi: QuoteApi) : QuoteRepository {


    override suspend fun getRandomQuote(): Flow<Resource<Quote>> = flow {
        emit(Resource.Loading())
        try {
            val quote = quoteApi.getRandomQuote().toQuote()
            emit(Resource.Success(quote))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }

}