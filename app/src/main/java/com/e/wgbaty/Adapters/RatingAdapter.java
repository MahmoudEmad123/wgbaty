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

import com.e.wgbaty.Activitis.DetailsAmeal;
import com.e.wgbaty.Activitis.ResturantActivity;
import com.e.wgbaty.Models.Rating;
import com.e.wgbaty.Models.Restaurants;
import com.e.wgbaty.R;

import java.util.ArrayList;

public class RatingAdapter  extends RecyclerView.Adapter<RatingAdapter.RestaurantRecyclerHolder> {

    Context context;
    ArrayList<Rating> ratings;

    public RatingAdapter(Context context, ArrayList<Rating> ratings) {
        this.context = context;
        this.ratings = ratings;
    }

    @NonNull
    @Override
    public RatingAdapter.RestaurantRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rating, null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ResturantActivity.class);

            }
        });

        return new RatingAdapter.RestaurantRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RatingAdapter.RestaurantRecyclerHolder holder, final int position) {

        TextView name, time, taste;
        ImageView image;
        holder.name.setText(ratings.get(position).getName());
        holder.time.setText(ratings.get(position).getTime());
        holder.taste.setText(ratings.get(position).getTaste());
         holder.image.setImageResource(ratings.get(position).getImg());
         holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsAmeal.class);
//                intent.putExtra("Title",ratings.get(position).getName());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ratings.size();
    }


    class RestaurantRecyclerHolder extends RecyclerView.ViewHolder {

        TextView name, time, taste;
        ImageView image;
        RelativeLayout relativeLayout;


        public RestaurantRecyclerHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.textname);
            this.time = itemView.findViewById(R.id.textTime);
            this.taste = itemView.findViewById(R.id.textf);
            this.image = itemView.findViewById(R.id.circleImage);
            this.relativeLayout = itemView.findViewById(R.id.relativeLayoutappetizer);
        }


    }

}


