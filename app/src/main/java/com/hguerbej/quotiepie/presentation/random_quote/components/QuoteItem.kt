package com.hguerbej.quotiepie.presentation.random_quote.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.hguerbej.domain.models.Quote
import com.hguerbej.quotiepie.R

@Composable
fun QuoteItem(quote: Quote) {
    TypewriterText(texts = listOf(quote.content))
    Spacer(modifier = Modifier.height(16.dp))
    Box(
        modifier = Modifier
            .wrapContentSize()
            .padding(5.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = MaterialTheme.colorScheme.primary),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .padding(10.dp)
                .wrapContentHeight(),
            text = quote.tags.first(),
            color = colorResource(id = R.color.white)
        )
    }
}