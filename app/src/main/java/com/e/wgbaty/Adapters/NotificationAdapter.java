package com.e.wgbaty.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.wgbaty.Models.Notifi;
import com.e.wgbaty.R;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationRecyclerHolder> {

    Context context;
    ArrayList<Notifi> notifis;

    public NotificationAdapter(Context context, ArrayList<Notifi> notifis) {
        this.context = context;
        this.notifis = notifis;
    }

    @NonNull
    @Override
    public NotificationAdapter.NotificationRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification, null);


        return new NotificationAdapter.NotificationRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.NotificationRecyclerHolder holder, final int position) {

        holder.text_title.setText(notifis.get(position).getName());
        holder.txt_Time.setText(notifis.get(position).getTime());
        holder.txt_Details.setText(notifis.get(position).getDetails());

        holder.img.setImageResource(notifis.get(position).getImg());
        boolean isExpanded = notifis.get(position).isExpanded();
        holder.txt_Details.setVisibility(isExpanded ? View.VISIBLE  : View.GONE);

//        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, DetailsAmeal.class);
//                intent.putExtra("Name",notifis.get(position).getName());
//                intent.putExtra("Time",notifis.get(position).getTime());
//                intent.putExtra("Image",notifis.get(position).getImg());
//                intent.putExtra("Details",notifis.get(position).getDetails());
//
//                context.startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return notifis.size();
    }


    class NotificationRecyclerHolder extends RecyclerView.ViewHolder {

        TextView text_title, txt_Time, txt_Details;
        ImageView img,img2;
        RelativeLayout relativeLayout;



        public NotificationRecyclerHolder(@NonNull View itemView) {
            super(itemView);
            this.text_title = itemView.findViewById(R.id.textrejected);
            this.txt_Time = itemView.findViewById(R.id.textTime);
            this.txt_Details = itemView.findViewById(R.id.textnot);
            this.img = itemView.findViewById(R.id.circleImage);
            this.img2 = itemView.findViewById(R.id.imageView2);
            img2.setVisibility(View.VISIBLE);
            img2.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

            this.relativeLayout = itemView.findViewById(R.id.relativeLayoutappetizer);
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Notifi notifi = notifis.get(getAdapterPosition());
                    notifi.setExpanded(!notifi.isExpanded());
                    notifyItemChanged(getAdapterPosition());
//                    if (is()) {
//                        collapseView();
//                    } else {
//                        expandView();
//                    }
                    img2.setImageResource(R.drawable.ic_re_bottom);
                }
            });
        }


    }

}


