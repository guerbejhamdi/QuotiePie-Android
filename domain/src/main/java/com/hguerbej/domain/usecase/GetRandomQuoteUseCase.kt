package com.hguerbej.domain.usecase

import com.hguerbej.domain.repository.QuoteRepository

class GetRandomQuoteUseCase(private val quoteRepository: QuoteRepository) {

    suspend operator fun invoke() = quoteRepository.getRandomQuote()

}