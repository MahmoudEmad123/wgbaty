package com.e.wgbaty.Helper;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.wgbaty.R;

public class RestaurantRecyclerHolder extends RecyclerView.ViewHolder
{

    TextView text_restaurants , txt_meals, txt_available;
    ImageView imag_restaurants ,img_available;


    public RestaurantRecyclerHolder(@NonNull View itemView) {
        super(itemView);
        this.text_restaurants = itemView.findViewById(R.id.text_restaurants);
        this.txt_meals = itemView.findViewById(R.id.txt_meals);
        this.txt_available = itemView.findViewById(R.id.txt_available);
        this.imag_restaurants = itemView.findViewById(R.id.imag_restaurants);
        this.img_available = itemView.findViewById(R.id.img_available);
    }
}
