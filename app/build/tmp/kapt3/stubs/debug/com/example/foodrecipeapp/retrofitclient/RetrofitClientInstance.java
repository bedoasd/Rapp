package com.example.foodrecipeapp.retrofitclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/foodrecipeapp/retrofitclient/RetrofitClientInstance;", "", "()V", "Companion", "app_debug"})
public final class RetrofitClientInstance {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.foodrecipeapp.retrofitclient.RetrofitClientInstance.Companion Companion = null;
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://www.themealdb.com/api/json/v1/1/";
    
    public RetrofitClientInstance() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/foodrecipeapp/retrofitclient/RetrofitClientInstance$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "retrofit", "Lretrofit2/Retrofit;", "retrofitInstance", "getRetrofitInstance", "()Lretrofit2/Retrofit;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Retrofit getRetrofitInstance() {
            return null;
        }
    }
}