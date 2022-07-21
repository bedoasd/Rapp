package com.example.foodrecipeapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Lcom/example/foodrecipeapp/HomeActivity;", "Lcom/example/foodrecipeapp/BaseActivity;", "()V", "arrMainCategory", "Ljava/util/ArrayList;", "Lcom/example/foodrecipeapp/entities/CategoryItems;", "getArrMainCategory", "()Ljava/util/ArrayList;", "setArrMainCategory", "(Ljava/util/ArrayList;)V", "arrsubCategory", "Lcom/example/foodrecipeapp/entities/MealsItems;", "getArrsubCategory", "setArrsubCategory", "mainCategoryAdapter", "Lcom/example/foodrecipeapp/adapter/MainCategoryAdapter;", "getMainCategoryAdapter", "()Lcom/example/foodrecipeapp/adapter/MainCategoryAdapter;", "setMainCategoryAdapter", "(Lcom/example/foodrecipeapp/adapter/MainCategoryAdapter;)V", "onclicked", "Lcom/example/foodrecipeapp/adapter/MainCategoryAdapter$onItemClickListener;", "onclickedSubItem", "Lcom/example/foodrecipeapp/adapter/SubCategoryAdapter$onItemClickedListener;", "subCategoryAdapter", "Lcom/example/foodrecipeapp/adapter/SubCategoryAdapter;", "getSubCategoryAdapter", "()Lcom/example/foodrecipeapp/adapter/SubCategoryAdapter;", "setSubCategoryAdapter", "(Lcom/example/foodrecipeapp/adapter/SubCategoryAdapter;)V", "getDataFromDb", "", "getMealdataFromDb", "categoryName", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class HomeActivity extends com.example.foodrecipeapp.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.foodrecipeapp.entities.CategoryItems> arrMainCategory;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.foodrecipeapp.entities.MealsItems> arrsubCategory;
    @org.jetbrains.annotations.NotNull()
    private com.example.foodrecipeapp.adapter.MainCategoryAdapter mainCategoryAdapter;
    @org.jetbrains.annotations.NotNull()
    private com.example.foodrecipeapp.adapter.SubCategoryAdapter subCategoryAdapter;
    private final com.example.foodrecipeapp.adapter.MainCategoryAdapter.onItemClickListener onclicked = null;
    private final com.example.foodrecipeapp.adapter.SubCategoryAdapter.onItemClickedListener onclickedSubItem = null;
    private java.util.HashMap _$_findViewCache;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.foodrecipeapp.entities.CategoryItems> getArrMainCategory() {
        return null;
    }
    
    public final void setArrMainCategory(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.foodrecipeapp.entities.CategoryItems> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.foodrecipeapp.entities.MealsItems> getArrsubCategory() {
        return null;
    }
    
    public final void setArrsubCategory(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.foodrecipeapp.entities.MealsItems> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foodrecipeapp.adapter.MainCategoryAdapter getMainCategoryAdapter() {
        return null;
    }
    
    public final void setMainCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.example.foodrecipeapp.adapter.MainCategoryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foodrecipeapp.adapter.SubCategoryAdapter getSubCategoryAdapter() {
        return null;
    }
    
    public final void setSubCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.example.foodrecipeapp.adapter.SubCategoryAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getDataFromDb() {
    }
    
    private final void getMealdataFromDb(java.lang.String categoryName) {
    }
}