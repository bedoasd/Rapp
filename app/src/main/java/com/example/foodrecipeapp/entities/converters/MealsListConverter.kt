package com.example.foodrecipeapp.entities.converters

import androidx.room.TypeConverter
import com.example.foodrecipeapp.entities.Category
import com.example.foodrecipeapp.entities.CategoryItems
import com.example.foodrecipeapp.entities.Meal
import com.example.foodrecipeapp.entities.MealsItems
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class MealsListConverter {

    @TypeConverter
    fun fromCategoryList(category: List<MealsItems>): String? {

        if (category == null) {
            return (null)
        } else {
            val gson = Gson()
            val type = object : TypeToken<MealsItems>() {

            }.type
            return gson.toJson(category, type)
        }


    }

    @TypeConverter
    fun toCategoryList(categoryString: String): List<MealsItems>? {

        if (categoryString == null) {
            return (null)
        }else{
            val gson=Gson()
            val type=object :TypeToken<MealsItems>(){

            }.type
            return gson.fromJson(categoryString,type)
        }
    }

}
//Creating converters allow us to convert list into string for room database