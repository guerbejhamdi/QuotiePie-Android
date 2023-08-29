package com.hguerbej.domain.di

import com.hguerbej.domain.repository.QuoteRepository
import com.hguerbej.domain.usecase.GetRandomQuoteUseCase
import org.koin.dsl.module

val useCaseModule = module{
    single { createGetRandomQuoteUseCase(get()) }
}

fun createGetRandomQuoteUseCase(quoteRepository: QuoteRepository) : GetRandomQuoteUseCase {
    return GetRandomQuoteUseCase(quoteRepository)
}

