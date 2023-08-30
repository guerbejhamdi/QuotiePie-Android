package com.hguerbej.quotiepie.presentation.random_quote

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hguerbej.common.Resource
import com.hguerbej.domain.usecase.GetRandomQuoteUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import timber.log.Timber

class RandomQuoteViewModel(private val getRandomQuoteUseCase: GetRandomQuoteUseCase) : ViewModel(){


    //get ui state from RandomQuoteState class
    private val _uiState = mutableStateOf(RandomQuoteState())
    val uiState : State<RandomQuoteState> = _uiState



    init {
        getRandomQuote()
    }

    private fun getRandomQuote() {
        viewModelScope.launch {
            getRandomQuoteUseCase().onEach {
                result ->
                when(result) {
                    is Resource.Loading -> {
                        Timber.d("Loading")
                        _uiState.value = RandomQuoteState(isLoading = true)
                    }
                    is Resource.Success -> {
                        Timber.d("Success")
                        _uiState.value = RandomQuoteState(quote = result.data)
                    }
                    is Resource.Error -> {
                        Timber.d("Error")
                        _uiState.value = RandomQuoteState(error = result.message ?: "An unexpected error occurred")
                    }
                }
            }.launchIn(viewModelScope)
        }
    }

}