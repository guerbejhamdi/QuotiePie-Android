package com.hguerbej.quotiepie.presentation.random_quote

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RandomQuoteScreen(viewModel: RandomQuoteViewModel) {

    val uiState = viewModel.uiState.value

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp), contentAlignment = Alignment.Center
    ) {
        RandomQuoteContent(uiState)
    }
}


@Composable
fun RandomQuoteContent(uiState: RandomQuoteState) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp), contentAlignment = Alignment.Center
    ) {
        if (uiState.isLoading) {
            CircularProgressIndicator()
        }

        if (uiState.error.isNotBlank()) {
            Text(text = uiState.error)
        }

        uiState.quote?.let { Text(text = it.content) }

    }
}

