package com.example.foodrecipeapp.entities

import androidx.room.*
import com.example.foodrecipeapp.entities.converters.MealsListConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Meal")
class Meal(

    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "meals")
    @Expose
    @SerializedName("meals")
    @TypeConverters(MealsListConverter::class)
    var mealsItem: List<MealsItems>? = null

)