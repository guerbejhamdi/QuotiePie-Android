package com.hguerbej.quotiepie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hguerbej.quotiepie.presentation.random_quote.RandomQuoteScreen
import com.hguerbej.quotiepie.presentation.ui.theme.QuotiePieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuotiePieTheme {
                // A surface container using the 'background' color from the theme
                RandomQuoteScreen()
            }
        }
    }
}