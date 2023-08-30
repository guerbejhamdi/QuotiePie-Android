package com.hguerbej.quotiepie.presentation.random_quote

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel

@Composable
fun RandomQuoteScreen(viewModel: RandomQuoteViewModel) {
    //TODO : refactor this
    //get the quote from the viewModel
    val quote = viewModel.quote.value
    //temporary UI to display the quote
    Box(modifier = Modifier.fillMaxSize().padding(18.dp), contentAlignment = Alignment.Center) {
        Text(text = quote?.content ?: "No Quote")
    }
}
