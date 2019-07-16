package com.ndscompany.newskotl.base

import android.app.Application
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class App: Application() {

    companion object {
        var retrofit = Retrofit.Builder()
            .client(
                OkHttpClient.Builder().addInterceptor(
                    HttpLoggingInterceptor().setLevel(
                        HttpLoggingInterceptor.Level.BODY)).build())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(" https://test.qqmf.ru/news/")
            .build()
        lateinit var mInstance: App
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }
}