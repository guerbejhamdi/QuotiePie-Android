package com.hguerbej.quotiepie.presentation.random_quote

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hguerbej.domain.models.getFakeJokeData
import com.hguerbej.quotiepie.R
import com.hguerbej.quotiepie.presentation.random_quote.components.QuoteHeader
import com.hguerbej.quotiepie.presentation.random_quote.components.QuoteItem
import com.hguerbej.quotiepie.presentation.random_quote.components.ShimmerListItem
import com.hguerbej.quotiepie.presentation.ui.theme.QuotiePieTheme
import timber.log.Timber

@Composable
fun RandomQuoteScreen(viewModel: RandomQuoteViewModel) {

    val uiState = viewModel.uiState.value

    Box(
        modifier = Modifier
            .fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        RandomQuoteContent(uiState, onRefreshQuote = { viewModel.onRefreshQuote() })
    }
}


@Composable
fun RandomQuoteContent(uiState: RandomQuoteState, onRefreshQuote: () -> Unit) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) { paddingValues ->
        Timber.d("Padding Values : $paddingValues")
        QuoteHeader(modifier = Modifier.padding(paddingValues = paddingValues))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 500.dp)
                .padding(start = 16.dp, end = 16.dp, top = 140.dp),
            colors = CardDefaults.cardColors(
                contentColor = colorResource(id = R.color.white)
            )
        )
        {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                ShimmerListItem(
                    isLoading = uiState.isLoading,
                    contentAfterLoading = {
                        uiState.quote?.let { QuoteItem(quote = it) } ?: run {
                            CheckError(error = uiState.error)
                        }
                    },
                )
            }

            CheckError(error = uiState.error)

            Spacer(modifier = Modifier.height(height = 10.dp))
        }

        Row(
            modifier = Modifier
                .padding(top = 470.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                modifier = Modifier
                    .size(size = 64.dp)
                    .clip(shape = MaterialTheme.shapes.extraLarge)
                    .background(color = MaterialTheme.colorScheme.primary)
                    .clickable { onRefreshQuote() }
                    .padding(all = 8.dp),
                painter = painterResource(id = R.drawable.ic_refresh),
                contentDescription = null,
            )
        }
    }
}

@Composable
fun CheckError(error: String) {
    if (error.isNotBlank()) {
        Text(
            modifier = Modifier
                .padding(10.dp)
                .wrapContentHeight(),
            text = error,
            color = colorResource(id = R.color.white),
            textAlign = TextAlign.Center
        )
    }
}


@Preview
@Composable
fun RandomQuoteScreenPreview() {
    QuotiePieTheme {
        Surface {
            RandomQuoteContent(
                uiState = RandomQuoteState(
                    quote = getFakeJokeData(),
                    isLoading = false,
                    error = ""
                ), onRefreshQuote = {}
            )
        }
    }
}

