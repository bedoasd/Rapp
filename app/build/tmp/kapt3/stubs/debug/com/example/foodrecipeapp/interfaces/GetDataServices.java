package com.example.foodrecipeapp.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/foodrecipeapp/interfaces/GetDataServices;", "", "getCategoryList", "Lretrofit2/Call;", "Lcom/example/foodrecipeapp/entities/Category;", "getMealsList", "Lcom/example/foodrecipeapp/entities/Meal;", "category", "", "getSpecificItem", "Lcom/example/foodrecipeapp/entities/MealResponse;", "id", "app_debug"})
public abstract interface GetDataServices {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "categories.php")
    public abstract retrofit2.Call<com.example.foodrecipeapp.entities.Category> getCategoryList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "filter.php")
    public abstract retrofit2.Call<com.example.foodrecipeapp.entities.Meal> getMealsList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "c")
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookup.php")
    public abstract retrofit2.Call<com.example.foodrecipeapp.entities.MealResponse> getSpecificItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "i")
    java.lang.String id);
}