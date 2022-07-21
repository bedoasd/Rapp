package com.example.foodrecipeapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.foodrecipeapp.entities.Category
import com.example.foodrecipeapp.entities.Meal
import com.example.foodrecipeapp.entities.MealResponse
import com.example.foodrecipeapp.interfaces.GetDataServices
import com.example.foodrecipeapp.retrofitclient.RetrofitClientInstance
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_splash.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {


    var youtubeLink = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var id = intent.getStringExtra("id")


        getSpecificMeal(id!!)

        imgToolbarBtnBack.setOnClickListener {
            finish()
        }

           btnYoutube.setOnClickListener {
                val uri = Uri.parse(youtubeLink)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
    }

    fun getSpecificMeal(id: String) {
        val service = RetrofitClientInstance.retrofitInstance!!.create(GetDataServices::class.java)
        val call = service.getSpecificItem(id)
        call.enqueue(object : Callback<MealResponse> {


            override fun onResponse(call: Call<MealResponse>, response: Response<MealResponse>) {

                Glide.with(this@DetailActivity).load(response.body()!!.mealsEntity[0].strmealthumb)
                    .into(imgItem)

                var ingredient =
                    "${response.body()!!.mealsEntity[0].stringredient1}      ${response.body()!!.mealsEntity[0].strmeasure1}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient2}      ${response.body()!!.mealsEntity[0].strmeasure2}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient3}      ${response.body()!!.mealsEntity[0].strmeasure3}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient4}      ${response.body()!!.mealsEntity[0].strmeasure4}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient5}      ${response.body()!!.mealsEntity[0].strmeasure5}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient6}      ${response.body()!!.mealsEntity[0].strmeasure6}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient7}      ${response.body()!!.mealsEntity[0].strmeasure7}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient8}      ${response.body()!!.mealsEntity[0].strmeasure8}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient9}      ${response.body()!!.mealsEntity[0].strmeasure9}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient10}      ${response.body()!!.mealsEntity[0].strmeasure10}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient11}      ${response.body()!!.mealsEntity[0].strmeasure11}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient12}      ${response.body()!!.mealsEntity[0].strmeasure12}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient13}      ${response.body()!!.mealsEntity[0].strmeasure13}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient14}      ${response.body()!!.mealsEntity[0].strmeasure14}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient15}      ${response.body()!!.mealsEntity[0].strmeasure15}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient16}      ${response.body()!!.mealsEntity[0].strmeasure16}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient17}      ${response.body()!!.mealsEntity[0].strmeasure17}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient18}      ${response.body()!!.mealsEntity[0].strmeasure18}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient19}      ${response.body()!!.mealsEntity[0].strmeasure19}\n" +
                            "${response.body()!!.mealsEntity[0].stringredient20}      ${response.body()!!.mealsEntity[0].strmeasure20}\n"


                tvIngredients.text = ingredient
                tvInstructions.text = response.body()!!.mealsEntity[0].strinstructions

                if(response.body()!!.mealsEntity[0].stryoutube!=null){
                    youtubeLink=response.body()!!.mealsEntity[0].stryoutube

                }else{
                    btnYoutube.visibility = View.GONE
                }

            }

            override fun onFailure(call: Call<MealResponse>, t: Throwable) {
                loader.visibility = View.INVISIBLE
                Toast.makeText(this@DetailActivity, "SomeThing went Wrong", Toast.LENGTH_SHORT)
            }


        })

    }

}