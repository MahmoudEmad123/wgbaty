package com.e.wgbaty.Fragments.DetailsResturantFragment;


import android.os.Bundle;

 import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.wgbaty.Adapters.AppetizerAdapter;
import com.e.wgbaty.Adapters.RestaurantAdapter;
import com.e.wgbaty.Models.Appetizer;
import com.e.wgbaty.Models.Restaurants;
import com.e.wgbaty.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChurrosFragment extends Fragment {


    RecyclerView recyclerView;
    AppetizerAdapter adapter;
    View myFragment;


    public ChurrosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_churros, container, false);


        recyclerView = myFragment.findViewById(R.id.recycler_churros);
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
