package com.salampakistan.dagger.module

import android.app.Application
import com.salampakistan.dagger.CoroutineScopeIO
import com.salampakistan.dagger.WebAPI
import com.salampakistan.network.WebService
import com.salampakistan.network.fma.FMAWebService
import com.salampakistan.network.openweather.OpenWeatherService
import com.salampakistan.utils.Preferences
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module(includes = [ViewModelModule::class, CoreDataModule::class])
class AppModule {

    @WebAPI
    @Provides
    fun provideOkHttpClient(
        upstreamClient: OkHttpClient
    ): OkHttpClient {
        return upstreamClient.newBuilder().build()
    }

    @Singleton
    @Provides
    fun providePreferences(application: Application): Preferences {
        return Preferences(application)
    }

    @CoroutineScopeIO
    @Provides
    fun provideCoroutineScopeIO() = CoroutineScope(Dispatchers.IO)

    /* App APIs Retrofit setup */
    @Singleton
    @Provides
    fun provideWebService(
        @WebAPI okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ) = provideService(okhttpClient, converterFactory, WebService::class.java)

    private fun createRetrofit(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ): Retrofit {
        val logging = HttpLoggingInterceptor()
// set your desired log level
// set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val httpClient = OkHttpClient.Builder()
        httpClient
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)

// add your other interceptors …
// add logging as last interceptor
// add your other interceptors …
// add logging as last interceptor
        httpClient.addInterceptor(logging)

        return Retrofit.Builder()
            .baseUrl(WebService.BASE_URL)
            .client(httpClient.build())
            .addConverterFactory(converterFactory)
            .build()
    }

    private fun <T> provideService(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory, clazz: Class<T>
    ): T {
        return createRetrofit(okhttpClient, converterFactory).create(clazz)
    }

    /* OpenWeather APIs Retrofit setup */

    @Singleton
    @Provides
    fun provideOpenWeatherService(
        @WebAPI okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ) = provideOpenWeatherService(okhttpClient, converterFactory, OpenWeatherService::class.java)

    private fun createOpenWeatherRetrofit(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(OpenWeatherService.BASE_URL)
            .client(okhttpClient)
            .addConverterFactory(converterFactory)
            .build()
    }

    private fun <T> provideOpenWeatherService(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory, clazz: Class<T>
    ): T {
        return createOpenWeatherRetrofit(okhttpClient, converterFactory).create(clazz)
    }

    /* FMA APIs Retrofit setup */

    @Singleton
    @Provides
    fun provideFMAWebService(
        @WebAPI okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ) = provideFMAWebService(okhttpClient, converterFactory, FMAWebService::class.java)

    private fun createFMARetrofit(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(FMAWebService.BASE_URL)
            .client(okhttpClient)
            .addConverterFactory(converterFactory)
            .build()
    }

    private fun <T> provideFMAWebService(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory, clazz: Class<T>
    ): T {
        return createFMARetrofit(okhttpClient, converterFactory).create(clazz)
    }
}