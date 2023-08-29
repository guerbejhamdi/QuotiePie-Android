package com.hguerbej.quotiepie.di

import com.hguerbej.quotiepie.presentation.random_quote.RandomQuoteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {

    viewModel { RandomQuoteViewModel(getRandomQuoteUseCase = get())}
}


