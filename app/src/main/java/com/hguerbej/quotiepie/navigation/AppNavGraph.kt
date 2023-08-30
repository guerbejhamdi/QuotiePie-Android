package com.hguerbej.quotiepie.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hguerbej.quotiepie.presentation.random_quote.RandomQuoteScreen
import com.hguerbej.quotiepie.presentation.random_quote.RandomQuoteViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenRoute.RandomQuoteScreen.route) {
        composable(route = ScreenRoute.RandomQuoteScreen.route) {
            val randomQuoteViewModel : RandomQuoteViewModel = koinViewModel()
            RandomQuoteScreen(viewModel = randomQuoteViewModel)
        }
    }
}