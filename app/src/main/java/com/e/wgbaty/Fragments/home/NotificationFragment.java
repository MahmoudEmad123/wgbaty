package com.e.wgbaty.Fragments.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.e.wgbaty.Adapters.AppetizerAdapter;
import com.e.wgbaty.Adapters.NotificationAdapter;
import com.e.wgbaty.Models.Notifi;
import com.e.wgbaty.R;

import java.util.ArrayList;


public class NotificationFragment extends Fragment {
    ImageView image_shopping, image_search, image_back;
    TextView textTile;
    private Toolbar toolbar;
    View myFragment;
    RecyclerView recycler_notification;
    RecyclerView recyclerView;
    NotificationAdapter adapter;

    public NotificationFragment() {
        // Required empty public constructor
    }

    public static NotificationFragment getInstance() {
        return new NotificationFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerView = myFragment.findViewById(R.id.recycler_notification);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new NotificationAdapter(getContext(), getMyList());
        recyclerView.setAdapter(adapter);



        toolbar = (Toolbar) myFragment.findViewById(R.id.toolbar);
        image_search = myFragment.findViewById(R.id.image_search);
        textTile = myFragment.findViewById(R.id.txtTitle);
        image_shopping = myFragment.findViewById(R.id.image_shopping);
        image_back = myFragment.findViewById(R.id.image_back);
//        toolbar.setBackgroundColor(R.drawable.img_background_details);
        image_search.setVisibility(View.VISIBLE);
         image_search.setImageResource(R.drawable.ic_shop_notification);
        image_shopping.setVisibility(View.GONE);
        textTile.setVisibility(View.VISIBLE);
        textTile.setText("تنبيهاتي");
        textTile.setTextColor(getResources().getColor(R.color.textColor));
        image_back.setVisibility(View.GONE);
        return myFragment;

    }

    private ArrayList<Notifi> getMyList() {
        ArrayList<Notifi> notifis = new ArrayList<>();
        Notifi notifi2;

        notifi2 = new Notifi();
        notifi2.setName(" لم يتم قبول الطلب ");
        notifi2.setTime(" منذ 20 ساعة");
        notifi2.setDetails("يسبسبسيبسي شبثسب");
        notifi2.setImg(R.drawable.ic_rejected);
        notifis.add(notifi2);


        notifi2 = new Notifi();
        notifi2.setName(" لم يتم قبول الطلب ");
        notifi2.setTime(" منذ 20 ساعة");
        notifi2.setDetails("يسبسبسيبسي شبثسب");
        notifi2.setImg(R.drawable.ic_rejected);
        notifis.add(notifi2);



        notifi2 = new Notifi();
        notifi2.setName(" لم يتم قبول الطلب ");
        notifi2.setTime(" منذ 20 ساعة");
        notifi2.setDetails("يسبسبسيبسي شبثسب");
        notifi2.setImg(R.drawable.ic_rejected);
        notifis.add(notifi2);



        notifi2 = new Notifi();
        notifi2.setName(" لم يتم قبول الطلب ");
        notifi2.setTime(" منذ 20 ساعة");
        notifi2.setDetails("يسبسبسيبسي شبثسب");
        notifi2.setImg(R.drawable.ic_rejected);
        notifis.add(notifi2);


        notifi2 = new Notifi();
        notifi2.setName(" لم يتم قبول الطلب ");
        notifi2.setTime(" منذ 20 ساعة");
        notifi2.setDetails("يسبسبسيبسي شبثسب");
        notifi2.setImg(R.drawable.ic_rejected);
        notifis.add(notifi2);



        notifi2 = new Notifi();
        notifi2.setName(" لم يتم قبول الطلب ");
        notifi2.setTime(" منذ 20 ساعة");
        notifi2.setDetails("يسبسبسيبسي شبثسب");
        notifi2.setImg(R.drawable.ic_rejected);
        notifis.add(notifi2);

        return notifis;
    }

}
