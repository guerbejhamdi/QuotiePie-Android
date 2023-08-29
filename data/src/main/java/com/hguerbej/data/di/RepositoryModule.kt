package com.hguerbej.data.di

import com.hguerbej.data.api.QuoteApi
import com.hguerbej.data.repository.QuoteRepositoryImpl
import com.hguerbej.domain.repository.QuoteRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { createQuoteRepository(get()) }
}

fun createQuoteRepository(quoteApi: QuoteApi): QuoteRepository {
    return QuoteRepositoryImpl(quoteApi)
}