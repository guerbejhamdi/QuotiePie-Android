package com.hguerbej.data.api

import com.hguerbej.data.models.QuoteDto
import retrofit2.http.GET

interface QuoteApi {

    @GET("random")
    suspend fun getRandomQuote(): QuoteDto

}