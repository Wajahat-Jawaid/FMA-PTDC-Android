package com.salampakistan.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"resultLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/salampakistan/network/Result;", "T", "networkCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "app_debug"})
public final class ResponseHandlerKt {
    
    /**
     * Function notify UI about:
     * [Result.Status.SUCCESS] - with data from database
     * [Result.Status.ERROR] - if error has occurred from any source
     * [Result.Status.LOADING]
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.salampakistan.network.Result<T>> resultLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.salampakistan.network.Result<? extends T>>, ? extends java.lang.Object> networkCall) {
        return null;
    }
}