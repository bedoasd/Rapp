package com.example.foodrecipeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.foodrecipeapp.dao.RecipeDao
import com.example.foodrecipeapp.entities.*
import com.example.foodrecipeapp.entities.converters.CategoryListConverter
import com.example.foodrecipeapp.entities.converters.MealsListConverter

@Database(entities = [Recipes::class,CategoryItems::class,Category::class,Meal::class,MealsItems::class], version = 3, exportSchema = false)
@TypeConverters(CategoryListConverter::class,MealsListConverter::class)
abstract class RecipesDatabase:RoomDatabase()  {

    companion object{

        var recipesDatabase:RecipesDatabase?=null //can be null"nullable"

        @Synchronized
        fun getDatabase(context: Context): RecipesDatabase {
            if(recipesDatabase==null){
                recipesDatabase= Room.databaseBuilder(
                    context,
                    RecipesDatabase::class.java,
                    "recipe.db"
                )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return recipesDatabase!! // converts any value to a non-null type and throws an
                                    // exception if the value is null "not-null"
        }
    }

     abstract fun recipeDao():RecipeDao
}