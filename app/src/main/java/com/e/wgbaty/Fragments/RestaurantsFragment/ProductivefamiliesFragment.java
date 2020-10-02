package com.e.wgbaty.Fragments.RestaurantsFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.e.wgbaty.Adapters.RestaurantAdapter;
import com.e.wgbaty.Models.Restaurants;
import com.e.wgbaty.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductivefamiliesFragment extends Fragment {

    RecyclerView recyclerView;
    RestaurantAdapter adapter;
    View myFragment;

    public ProductivefamiliesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_productivefamilies, container, false);
        recyclerView = myFragment.findViewById(R.id.recycler_family);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new RestaurantAdapter(getContext(), getMyList());
        recyclerView.setAdapter(adapter);
        return myFragment;
    }

    private ArrayList<Restaurants> getMyList() {
        ArrayList<Restaurants> restaurants = new ArrayList<>();
        Restaurants restaurants1;

        restaurants1 = new Restaurants();
        restaurants1.setTitle("الشيف سنونو");
        restaurants1.setMeals("وجبة 20");
        restaurants1.setAvailable("متاح الان");
        restaurants1.setTxt_c("متاح ");
        restaurants1.setImgresturnt(R.drawable.img_restaurants);
        restaurants.add(restaurants1);

        restaurants1 = new Restaurants();
        restaurants1.setTitle("مطعم بالميرا");
        restaurants1.setMeals("وجبة 20");
        restaurants1.setAvailable("غير متاح الان");
        restaurants1.setTxt_c("غير متاح ");
        restaurants1.setImgresturnt(R.drawable.img_balmera);
        restaurants.add(restaurants1);

        restaurants1 = new Restaurants();
        restaurants1.setTitle("مطعم التايلندي");
        restaurants1.setMeals("وجبة 20");
        restaurants1.setAvailable("متاح الان");
        restaurants1.setImgresturnt(R.drawable.img_restaurants);
        restaurants.add(restaurants1);

        restaurants1 = new Restaurants();
        restaurants1.setTitle("مطعم التايلندي");
        restaurants1.setMeals("وجبة 20");
        restaurants1.setAvailable("متاح الان");
        restaurants1.setImgresturnt(R.drawable.img_restaurants);
        restaurants.add(restaurants1);

        return restaurants;
    }

}
