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
import com.e.wgbaty.Models.Appetizer;
import com.e.wgbaty.Models.Restaurants;
import com.e.wgbaty.R;

import java.util.ArrayList;

public class AppetizerAdapter  extends RecyclerView.Adapter<AppetizerAdapter.AppetizerRecyclerHolder> {

    Context context;
    ArrayList<Appetizer> appetizers;

    public AppetizerAdapter(Context context, ArrayList<Appetizer> appetizers) {
        this.context = context;
        this.appetizers = appetizers;
    }

    @NonNull
    @Override
    public AppetizerAdapter.AppetizerRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_appetizer, null);


        return new AppetizerAdapter.AppetizerRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppetizerAdapter.AppetizerRecyclerHolder holder, final int position) {

        holder.text_title.setText(appetizers.get(position).getTitles());
        holder.txt_hours.setText(appetizers.get(position).getHours());
        holder.txt_nis.setText(appetizers.get(position).getNis());

        holder.img.setImageResource(appetizers.get(position).getImg());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsAmeal.class);
                intent.putExtra("Title",appetizers.get(position).getTitles());
                intent.putExtra("Hours",appetizers.get(position).getHours());
                intent.putExtra("Image",appetizers.get(position).getImg());
                intent.putExtra("Nis",appetizers.get(position).getNis());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return appetizers.size();
    }


    class AppetizerRecyclerHolder extends RecyclerView.ViewHolder {

        TextView text_title, txt_hours, txt_nis;
        ImageView img;
        RelativeLayout relativeLayout;


        public AppetizerRecyclerHolder(@NonNull View itemView) {
            super(itemView);
            this.text_title = itemView.findViewById(R.id.text_appetizer);
            this.txt_hours = itemView.findViewById(R.id.txt_hours);
            this.txt_nis = itemView.findViewById(R.id.txt_nis);
            this.img = itemView.findViewById(R.id.imag_appetizer);
            this.relativeLayout = itemView.findViewById(R.id.relativeLayoutappetizer);
        }


    }

}


