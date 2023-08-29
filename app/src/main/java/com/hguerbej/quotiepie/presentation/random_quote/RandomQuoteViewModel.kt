package com.hguerbej.quotiepie.presentation.random_quote

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hguerbej.common.Resource
import com.hguerbej.domain.models.Quote
import com.hguerbej.domain.usecase.GetRandomQuoteUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class RandomQuoteViewModel(private val getRandomQuoteUseCase: GetRandomQuoteUseCase) : ViewModel(){


    //TODO : refactor this
    private val _quote = mutableStateOf<Quote?>(null)
    val quote = _quote


    init {
        Log.d("RandomQuoteViewModel", "init")
        getRandomQuote()
    }

    fun getRandomQuote() {
        viewModelScope.launch {
            getRandomQuoteUseCase().onEach {
                result ->
                when(result) {
                    is Resource.Loading -> {
                        Log.d("RandomQuoteViewModel", "Loading")
                    }
                    is Resource.Success -> {
                        Log.d("RandomQuoteViewModel", "Success")
                        _quote.value = result.data
                    }
                    is Resource.Error -> {
                        Log.d("RandomQuoteViewModel", "Error")
                    }
                }
            }.launchIn(viewModelScope)
        }
    }

}