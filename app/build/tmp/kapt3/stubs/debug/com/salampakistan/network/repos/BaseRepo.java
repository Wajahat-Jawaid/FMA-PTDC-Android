package com.salampakistan.network.repos;

import java.lang.System;

/**
 * Abstract Base Repository class with error handling
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\nH\u0002JA\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/salampakistan/network/repos/BaseRepo;", "", "()V", "retryCount", "Landroidx/lifecycle/MutableLiveData;", "", "error", "Lcom/salampakistan/network/Result;", "T", "message", "", "getResult", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract class BaseRepo {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> retryCount = null;
    private static final int retryLimit = 3;
    public static final com.salampakistan.network.repos.BaseRepo.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>java.lang.Object getResult(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.salampakistan.network.Result<? extends T>> p1) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.salampakistan.network.Result<T> error(java.lang.String message) {
        return null;
    }
    
    public BaseRepo() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/network/repos/BaseRepo$Companion;", "", "()V", "retryLimit", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}