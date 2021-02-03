package com.salampakistan.dagger.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J1\u0010\r\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0002\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0007J\u001a\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J1\u0010\u0015\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0002\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J1\u0010\u001b\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0002\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/salampakistan/dagger/module/AppModule;", "", "()V", "createFMARetrofit", "Lretrofit2/Retrofit;", "okhttpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "createOpenWeatherRetrofit", "createRetrofit", "provideCoroutineScopeIO", "Lkotlinx/coroutines/CoroutineScope;", "provideFMAWebService", "Lcom/salampakistan/network/fma/FMAWebService;", "T", "clazz", "Ljava/lang/Class;", "(Lokhttp3/OkHttpClient;Lretrofit2/converter/gson/GsonConverterFactory;Ljava/lang/Class;)Ljava/lang/Object;", "provideOkHttpClient", "upstreamClient", "provideOpenWeatherService", "Lcom/salampakistan/network/openweather/OpenWeatherService;", "providePreferences", "Lcom/salampakistan/utils/Preferences;", "application", "Landroid/app/Application;", "provideService", "provideWebService", "Lcom/salampakistan/network/WebService;", "app_debug"})
@dagger.Module(includes = {com.salampakistan.dagger.module.ViewModelModule.class, com.salampakistan.dagger.module.CoreDataModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.WebAPI()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient upstreamClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.salampakistan.utils.Preferences providePreferences(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.CoroutineScopeIO()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineScope provideCoroutineScopeIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.salampakistan.network.WebService provideWebService(@org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.WebAPI()
    okhttp3.OkHttpClient okhttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    private final retrofit2.Retrofit createRetrofit(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    private final <T extends java.lang.Object>T provideService(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, java.lang.Class<T> clazz) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.salampakistan.network.openweather.OpenWeatherService provideOpenWeatherService(@org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.WebAPI()
    okhttp3.OkHttpClient okhttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    private final retrofit2.Retrofit createOpenWeatherRetrofit(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    private final <T extends java.lang.Object>T provideOpenWeatherService(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, java.lang.Class<T> clazz) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.salampakistan.network.fma.FMAWebService provideFMAWebService(@org.jetbrains.annotations.NotNull()
    @com.salampakistan.dagger.WebAPI()
    okhttp3.OkHttpClient okhttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    private final retrofit2.Retrofit createFMARetrofit(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    private final <T extends java.lang.Object>T provideFMAWebService(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, java.lang.Class<T> clazz) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}