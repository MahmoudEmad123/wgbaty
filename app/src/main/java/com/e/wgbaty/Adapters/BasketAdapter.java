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
import com.e.wgbaty.Models.Appetizer;
import com.e.wgbaty.Models.Basket;
import com.e.wgbaty.R;

import java.util.ArrayList;

public class BasketAdapter extends RecyclerView.Adapter<BasketAdapter.BasketsRecyclerHolder> {

    Context context;
    ArrayList<Basket> baskets;

    public BasketAdapter(Context context, ArrayList<Basket> baskets) {
        this.context = context;
        this.baskets = baskets;
    }

    @NonNull
    @Override
    public BasketAdapter.BasketsRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mybasket, null);


        return new BasketAdapter.BasketsRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasketAdapter.BasketsRecyclerHolder holder, final int position) {

        holder.txtnameOrder.setText(baskets.get(position).getName());
        holder.txtPrizeOrder.setText(baskets.get(position).getPrice());
//        holder.txt_nis.setText(baskets.get(position).getQnt());

        holder.img_basket.setImageResource(baskets.get(position).getImge());
//        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, DetailsAmeal.class);
//                intent.putExtra("Title",baskets.get(position).getTitles());
//                intent.putExtra("Hours",baskets.get(position).getHours());
//                intent.putExtra("Image",baskets.get(position).getImg());
//                intent.putExtra("Nis",baskets.get(position).getNis());
//
//                context.startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return baskets.size();
    }


    class BasketsRecyclerHolder extends RecyclerView.ViewHolder {

        TextView txtnameOrder, txtPrizeOrder, txt_nis;
        ImageView img_basket;
        RelativeLayout relativeLayout;


        public BasketsRecyclerHolder(@NonNull View itemView) {
            super(itemView);
            this.txtnameOrder = itemView.findViewById(R.id.txtnameOrder);
            this.txtPrizeOrder = itemView.findViewById(R.id.txtPrizeOrder);
            this.txt_nis = itemView.findViewById(R.id.txt_nis);
            this.img_basket = itemView.findViewById(R.id.img_basket);
            this.relativeLayout = itemView.findViewById(R.id.relativeLayoutappetizer);
        }


    }

}


