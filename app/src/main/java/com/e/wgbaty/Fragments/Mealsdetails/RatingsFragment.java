package com.e.wgbaty.Fragments.Mealsdetails;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.e.wgbaty.Adapters.RatingAdapter;
import com.e.wgbaty.Models.Rating;
import com.e.wgbaty.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RatingsFragment extends Fragment {
View myFragment;
    RecyclerView recyclerView;
    RatingAdapter adapter;
    public RatingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_ratings, container, false);

        recyclerView = myFragment.findViewById(R.id.recycler_churros);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new RatingAdapter(getContext(), getMyList());
        recyclerView.setAdapter(adapter);
        return myFragment;
    }

    private ArrayList<Rating> getMyList() {
        ArrayList<Rating> ratings = new ArrayList<>();
        Rating rating2;

        rating2 = new Rating();
        rating2.setName(" لانا لانا ");
        rating2.setTime("20 APR 2020, 10:30 AM");
        rating2.setTaste("الطعم شهي ولذيذ");
        rating2.setImg(R.drawable.oval);
        ratings.add(rating2);



        rating2 = new Rating();
        rating2.setName(" لانا لانا ");
        rating2.setTime("20 APR 2020, 10:30 AM");
        rating2.setTaste("الطعم شهي ولذيذ");
        rating2.setImg(R.drawable.oval);
        ratings.add(rating2);


        rating2 = new Rating();
        rating2.setName(" لانا لانا ");
        rating2.setTime("20 APR 2020, 10:30 AM");
        rating2.setTaste("الطعم شهي ولذيذ");
        rating2.setImg(R.drawable.oval);
        ratings.add(rating2);


        rating2 = new Rating();
        rating2.setName(" لانا لانا ");
        rating2.setTime("20 APR 2020, 10:30 AM");
        rating2.setTaste("الطعم شهي ولذيذ");
        rating2.setImg(R.drawable.oval);
        ratings.add(rating2);

        return ratings;
    }

}
