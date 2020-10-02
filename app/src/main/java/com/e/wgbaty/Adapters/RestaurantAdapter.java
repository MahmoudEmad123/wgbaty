package com.e.wgbaty.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.wgbaty.Activitis.ResturantActivity;
import com.e.wgbaty.Models.Restaurants;
import com.e.wgbaty.R;

import java.util.ArrayList;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantRecyclerHolder> {

    Context context;
    ArrayList<Restaurants> restaurants;

    public RestaurantAdapter(Context context, ArrayList<Restaurants> restaurants) {
        this.context = context;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public RestaurantRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurants, null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ResturantActivity.class);

            }
        });

        return new RestaurantRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantRecyclerHolder holder, final int position) {


        holder.text_restaurants.setText(restaurants.get(position).getTitle());
        holder.txt_meals.setText(restaurants.get(position).getMeals());
        holder.txt_available.setText(restaurants.get(position).getAvailable());
        holder.txt_c.setText(restaurants.get(position).getTxt_c());
        holder.imag_restaurants.setImageResource(restaurants.get(position).getImgresturnt());
        holder.img_available.setImageResource(restaurants.get(position).getImg_available());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ResturantActivity.class);
                intent.putExtra("Title",restaurants.get(position).getTitle());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }


    class RestaurantRecyclerHolder extends RecyclerView.ViewHolder {

        TextView text_restaurants, txt_meals, txt_available,txt_c;
        ImageView imag_restaurants, img_available;
        RelativeLayout relativeLayout;


        public RestaurantRecyclerHolder(@NonNull View itemView) {
            super(itemView);
            this.text_restaurants = itemView.findViewById(R.id.text_restaurants);
            this.txt_meals = itemView.findViewById(R.id.txt_meals);
            this.txt_c = itemView.findViewById(R.id.txt_c);
            this.txt_available = itemView.findViewById(R.id.txt_available);
            this.imag_restaurants = itemView.findViewById(R.id.imag_restaurants);
            this.img_available = itemView.findViewById(R.id.img_available);
            this.relativeLayout = itemView.findViewById(R.id.relativeLayout);
        }


    }

}


