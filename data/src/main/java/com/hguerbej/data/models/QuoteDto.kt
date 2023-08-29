package com.hguerbej.data.models

import com.hguerbej.domain.models.Quote

data class QuoteDto(
    val _id: String,
    val author: String,
    val authorSlug: String,
    val content: String,
    val dateAdded: String,
    val dateModified: String,
    val length: Int,
    val tags: List<String>
)

fun QuoteDto.toQuote() = Quote(
    id = _id,
    author = author,
    authorSlug = authorSlug,
    content = content,
    dateAdded = dateAdded,
    dateModified = dateModified,
    length = length,
    tags = tags
)