package com.e.wgbaty.Fragments.DetailsResturantFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.e.wgbaty.Adapters.AppetizerAdapter;
import com.e.wgbaty.Models.Appetizer;
import com.e.wgbaty.Models.Restaurants;
import com.e.wgbaty.R;

import java.util.ArrayList;

public class Food_and_restaurantFragment extends Fragment {

    RecyclerView recyclerView;
    AppetizerAdapter adapter;
    View myFragment;

    public Food_and_restaurantFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_food_and_restaurant, container, false);


        recyclerView = myFragment.findViewById(R.id.recycler_food);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new AppetizerAdapter(getContext(), getMyList());
        recyclerView.setAdapter(adapter);
        return myFragment;
    }

        private ArrayList<Appetizer> getMyList() {
            ArrayList<Appetizer> appetizers = new ArrayList<>();
            Appetizer appetizer2;


        appetizer2 = new Appetizer();
        appetizer2.setTitles(" سبانيولي ديليشاس ");
        appetizer2.setHours("  30 - 20 دقيقة");
        appetizer2.setNis("30 NIS");
        appetizer2.setImg(R.drawable.img_food);
        appetizers.add(appetizer2);

        appetizer2 = new Appetizer();
        appetizer2.setTitles(" سبانيولي  ");
        appetizer2.setHours("  30 - 20 دقيقة");
        appetizer2.setNis("20 NIS");
        appetizer2.setImg(R.drawable.img_food);
        appetizers.add(appetizer2);

        appetizer2 = new Appetizer();
        appetizer2.setTitles(" سبانيولي ديليشاس ");
        appetizer2.setHours("  30 - 20 دقيقة");
        appetizer2.setNis("30 NIS");
        appetizer2.setImg(R.drawable.img_food);
        appetizers.add(appetizer2);

        appetizer2 = new Appetizer();
        appetizer2.setTitles(" سبانيولي ديليشاس ");
        appetizer2.setHours("  30 - 20 دقيقة");
        appetizer2.setNis("30 NIS");
        appetizer2.setImg(R.drawable.img_food);
        appetizers.add(appetizer2);

        return appetizers;
    }

}
