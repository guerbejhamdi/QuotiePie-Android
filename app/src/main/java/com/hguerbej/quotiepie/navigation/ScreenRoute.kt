package com.hguerbej.quotiepie.navigation

sealed class ScreenRoute(val route: String) {
    object RandomQuoteScreen : ScreenRoute("random_quote_screen")
}
