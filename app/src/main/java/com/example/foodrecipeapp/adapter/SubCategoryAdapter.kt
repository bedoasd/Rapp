package com.example.foodrecipeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodrecipeapp.R
import com.example.foodrecipeapp.entities.MealsItems
import kotlinx.android.synthetic.main.item_rv_main_category.view.img_dish
import kotlinx.android.synthetic.main.item_rv_main_category.view.tv_dish_name

class SubCategoryAdapter: RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {


    var listener:SubCategoryAdapter.onItemClickedListener?=null
    var ctx:Context?=null
    var arrSubCategory = ArrayList<MealsItems>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        ctx=parent.context
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_sub_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text=arrSubCategory[position].strMeal
        Glide.with(ctx!!).load(arrSubCategory[position].strMealThumb).into(holder.itemView.img_dish)

        holder.itemView.rootView.setOnClickListener{
            listener!!.onClicked(arrSubCategory[position].idMeal)
        }


    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }

    fun setData(arrData:List<MealsItems>){
        arrSubCategory=arrData as ArrayList<MealsItems>
    }

    fun setClickListener(listener1: onItemClickedListener){
        listener = listener1
    }



    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    interface onItemClickedListener{
        fun onClicked(id: String)
    }



}