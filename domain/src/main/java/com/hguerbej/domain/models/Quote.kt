package com.hguerbej.domain.models

data class Quote(
    val id: String,
    val author: String,
    val authorSlug: String,
    val content: String,
    val dateAdded: String,
    val dateModified: String,
    val length: Int,
    val tags: List<String>
)

fun getFakeJokeData() = Quote(
    id = "1",
    author = "Hugo Guerbej",
    authorSlug = "hugo-guerbej",
    content = "This is a fake quote",
    dateAdded = "2021-09-18 19:00:00",
    dateModified = "2021-09-18 19:00:00",
    length = 1,
    tags = listOf("CategoryCategoryCategory", "quote")
)



