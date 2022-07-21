package com.example.foodrecipeapp.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "Recipes")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/foodrecipeapp/entities/Recipes;", "Ljava/io/Serializable;", "id", "", "dishName", "", "(ILjava/lang/String;)V", "getDishName", "()Ljava/lang/String;", "setDishName", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "app_debug"})
public final class Recipes implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "dishName")
    private java.lang.String dishName;
    
    public Recipes(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String dishName) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDishName() {
        return null;
    }
    
    public final void setDishName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}