package com.example.foodrecipeapp.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.foodrecipeapp.entities.converters.CategoryListConverter.class, com.example.foodrecipeapp.entities.converters.MealsListConverter.class})
@androidx.room.Database(entities = {com.example.foodrecipeapp.entities.Recipes.class, com.example.foodrecipeapp.entities.CategoryItems.class, com.example.foodrecipeapp.entities.Category.class, com.example.foodrecipeapp.entities.Meal.class, com.example.foodrecipeapp.entities.MealsItems.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/foodrecipeapp/database/RecipesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "recipeDao", "Lcom/example/foodrecipeapp/dao/RecipeDao;", "Companion", "app_debug"})
public abstract class RecipesDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.foodrecipeapp.database.RecipesDatabase.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.example.foodrecipeapp.database.RecipesDatabase recipesDatabase;
    
    public RecipesDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.foodrecipeapp.dao.RecipeDao recipeDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/foodrecipeapp/database/RecipesDatabase$Companion;", "", "()V", "recipesDatabase", "Lcom/example/foodrecipeapp/database/RecipesDatabase;", "getRecipesDatabase", "()Lcom/example/foodrecipeapp/database/RecipesDatabase;", "setRecipesDatabase", "(Lcom/example/foodrecipeapp/database/RecipesDatabase;)V", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.foodrecipeapp.database.RecipesDatabase getRecipesDatabase() {
            return null;
        }
        
        public final void setRecipesDatabase(@org.jetbrains.annotations.Nullable()
        com.example.foodrecipeapp.database.RecipesDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized com.example.foodrecipeapp.database.RecipesDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}