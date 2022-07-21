package com.example.foodrecipeapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.foodrecipeapp.database.RecipesDatabase
import com.example.foodrecipeapp.entities.Category
import com.example.foodrecipeapp.entities.Meal
import com.example.foodrecipeapp.entities.MealsItems
import com.example.foodrecipeapp.interfaces.GetDataServices
import com.example.foodrecipeapp.retrofitclient.RetrofitClientInstance
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.launch
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashActivity : BaseActivity(), EasyPermissions.RationaleCallbacks,
    EasyPermissions.PermissionCallbacks {

    private var READ_STORAGE_PERM = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        readStorageTask()

        btnGetStarted.setOnClickListener {
            startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
            finish()

        }


    }

    fun getCategories() {
        val service = RetrofitClientInstance.retrofitInstance!!.create(GetDataServices::class.java)
        val call = service.getCategoryList()
        call.enqueue(object : Callback<Category> {


            override fun onResponse(
                call: Call<Category>,
                response: Response<Category>
            ) {

                for(arr in response.body()!!.categoriesitems!!){
                    getMeal(arr.strcategory)
                }
                insertDataintoRoom(response.body())

            }

            override fun onFailure(call: Call<Category>, t: Throwable) {
                loader.visibility = View.INVISIBLE
                Toast.makeText(this@SplashActivity, "SomeThing went Wrong", Toast.LENGTH_SHORT)
            }


        })

    }


    fun getMeal(categoryName: String) {
        val service = RetrofitClientInstance.retrofitInstance!!.create(GetDataServices::class.java)
        val call = service.getMealsList(categoryName)
        call.enqueue(object : Callback<Meal> {
            override fun onResponse(call: Call<Meal>, response: Response<Meal>) {
                insertMealDataintoRoom(categoryName, response.body())

            }

            override fun onFailure(call: Call<Meal>, t: Throwable) {
                loader.visibility = View.INVISIBLE
                Toast.makeText(this@SplashActivity, "SomeThing went Wrong", Toast.LENGTH_SHORT)
            }


        })
    }


    fun insertDataintoRoom(category: Category?) {

        launch {
            this.let {

                for (arr in category!!.categoriesitems!!) {
                    RecipesDatabase.getDatabase(this@SplashActivity).recipeDao().insertCategory(arr)
                }

            }
        }

    }

    fun insertMealDataintoRoom(categoryName: String, meal: Meal?) {

        launch {
            this.let {

                for (arr in meal!!.mealsItem!!) {
                    var mealsItemModel = MealsItems(
                        arr.id,
                        arr.idMeal,
                        categoryName,
                        arr.strMeal,
                        arr.strMealThumb

                    )
                    RecipesDatabase.getDatabase(this@SplashActivity).recipeDao()
                        .insertMeal(mealsItemModel)

                    Log.v("hi insert",mealsItemModel.toString())
                }

                btnGetStarted.visibility = View.VISIBLE


            }
        }

    }


    private fun clearDatabase() {
        launch {
            this.let {

                RecipesDatabase.getDatabase(this@SplashActivity).recipeDao().clearDb()
            }
        }
    }

    private fun hasReadstoragePermission(): Boolean {
        return EasyPermissions.hasPermissions(
            this,
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        )
    }

    private fun readStorageTask() {
        if (hasReadstoragePermission()) {
            clearDatabase()
            getCategories()

        } else {
            EasyPermissions.requestPermissions(
                this,
                "this app needs to access Storage",
                READ_STORAGE_PERM,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            )

        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    override fun onRationaleAccepted(requestCode: Int) {
    }

    override fun onRationaleDenied(requestCode: Int) {
        TODO("Not yet implemented")
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>) {
        TODO("Not yet implemented")
    }

    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            AppSettingsDialog.Builder(this).build().show()

        }
    }


}

