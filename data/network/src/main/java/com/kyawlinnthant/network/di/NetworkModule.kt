package com.kyawlinnthant.network.di

import com.kyawlinnthant.network.source.D2HubNetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient() : OkHttpClient = OkHttpClient.Builder().apply {

    }.build()

    @Provides
    @Singleton
    fun provideRetrofit(
        client: OkHttpClient
    ) : Retrofit = Retrofit.Builder().apply {

    }.build()

    @Provides
    @Singleton
    fun provideNetworkService(
        retrofit: Retrofit
    ) : D2HubNetworkService = retrofit.create(D2HubNetworkService::class.java)

}