package com.hguerbej.data.di

import com.hguerbej.data.api.QuoteApi
import com.hguerbej.data.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val networkModule = module {
    single { createOkHttpClient() }
    single { createRetrofit(get(), BuildConfig.BASE_URL) }
    single { createQuoteApi(get()) }
}

fun createOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
    return OkHttpClient.Builder()

        .addInterceptor(httpLoggingInterceptor).build()
}

fun createRetrofit(okHttpClient: OkHttpClient, url: String): Retrofit {
    return Retrofit.Builder()
        .baseUrl(url)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}


fun createQuoteApi(retrofit: Retrofit): QuoteApi {
    return retrofit.create(QuoteApi::class.java)
}
