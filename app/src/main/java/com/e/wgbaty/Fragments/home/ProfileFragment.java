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

import com.e.wgbaty.Adapters.NotificationAdapter;
import com.e.wgbaty.Models.Notifi;
import com.e.wgbaty.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {
         ImageView image_shopping, image_search, image_back;
        TextView textTile;
        private Toolbar toolbar;
        View myFragment;
        RecyclerView recycler_notification;
        RecyclerView recyclerView;
        NotificationAdapter adapter;


    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment getInstance()    {
        return new ProfileFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         myFragment = inflater.inflate(R.layout.fragment_dashboard, container, false);

        recyclerView = myFragment.findViewById(R.id.recycler_profile);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new NotificationAdapter(getContext(), getMyList());
        recyclerView.setAdapter(adapter);
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


        return notifis;
    }

}
