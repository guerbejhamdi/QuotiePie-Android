package com.hguerbej.quotiepie.presentation.random_quote

import com.hguerbej.domain.models.Quote

data class RandomQuoteState(
    val isLoading : Boolean = false,
    val quote : Quote? = null,
    val error : String = ""
)
