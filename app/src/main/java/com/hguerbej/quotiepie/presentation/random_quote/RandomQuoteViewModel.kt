package com.hguerbej.quotiepie.presentation.random_quote

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hguerbej.common.Resource
import com.hguerbej.domain.models.Quote
import com.hguerbej.domain.usecase.GetRandomQuoteUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import timber.log.Timber

class RandomQuoteViewModel(private val getRandomQuoteUseCase: GetRandomQuoteUseCase) : ViewModel(){


    //TODO : refactor this
    private val _quote = mutableStateOf<Quote?>(null)
    val quote = _quote


    init {
        Timber.d("init")
        getRandomQuote()
    }

    private fun getRandomQuote() {
        viewModelScope.launch {
            getRandomQuoteUseCase().onEach {
                result ->
                when(result) {
                    is Resource.Loading -> {
                        Timber.d("Loading")
                    }
                    is Resource.Success -> {
                        _quote.value = result.data
                        Timber.d("Success")
                    }
                    is Resource.Error -> {
                        Timber.d("Error")
                    }
                }
            }.launchIn(viewModelScope)
        }
    }

}