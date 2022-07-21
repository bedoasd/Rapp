package com.example.foodrecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodrecipeapp.adapter.MainCategoryAdapter
import com.example.foodrecipeapp.adapter.SubCategoryAdapter
import com.example.foodrecipeapp.database.RecipesDatabase
import com.example.foodrecipeapp.entities.CategoryItems
import com.example.foodrecipeapp.entities.MealsItems
import com.example.foodrecipeapp.entities.Recipes
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.coroutines.launch
import java.util.ArrayList

class HomeActivity : BaseActivity    () {
    var arrMainCategory=ArrayList<CategoryItems>()
    var arrsubCategory=ArrayList<MealsItems>()

    var mainCategoryAdapter=MainCategoryAdapter();
    var subCategoryAdapter=SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

            getDataFromDb()


        mainCategoryAdapter.setClickListener(onclicked)
        subCategoryAdapter.setClickListener(onclickedSubItem)





    }

    private val onclicked=object :MainCategoryAdapter.onItemClickListener
    {
        override fun onClicked(category: String) {
            getMealdataFromDb(category)
        }

    }

    private val onclickedSubItem=object :SubCategoryAdapter.onItemClickedListener
    {
        override fun onClicked(id: String) {

            var intent=Intent(this@HomeActivity,DetailActivity::class.java)
            intent.putExtra("id",id)
            startActivity(intent)
        }


    }

    private fun getDataFromDb(){
        launch { this.let {

            var cat=RecipesDatabase.getDatabase(this@HomeActivity).recipeDao().getallCategory()
            arrMainCategory=cat as ArrayList<CategoryItems>
            arrMainCategory.reverse()

            getMealdataFromDb(arrMainCategory[0].strcategory)
            mainCategoryAdapter.setData(arrMainCategory)
            rv_main_category.layoutManager=LinearLayoutManager(this@HomeActivity,LinearLayoutManager.HORIZONTAL,false)
            rv_main_category.adapter=mainCategoryAdapter
        }

        }
    }

    private fun getMealdataFromDb(categoryName: String){
        tvCategory.text="$categoryName category"
        launch {
            this.let {

            var cat=RecipesDatabase.getDatabase(this@HomeActivity).recipeDao().getSpecificMealList(categoryName)
            arrsubCategory=cat as ArrayList<MealsItems>
            arrsubCategory.reverse()
            subCategoryAdapter.setData(arrsubCategory)
            rv_sub_category.layoutManager=LinearLayoutManager(this@HomeActivity,LinearLayoutManager.HORIZONTAL,false)
            rv_sub_category.adapter=subCategoryAdapter

            Log.v("hi",arrsubCategory.toString())
        }

        }
    }


}