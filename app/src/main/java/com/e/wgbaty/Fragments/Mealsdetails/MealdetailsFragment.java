package com.e.wgbaty.Fragments.Mealsdetails;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.e.wgbaty.Activitis.MyCart;
import com.e.wgbaty.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class MealdetailsFragment extends Fragment {
    View myFragment;
    TextView text_nameMeal, textDetailsMeal, textNis;
    Button button_addCart;

    public MealdetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_mealdetails, container, false);
        button_addCart = myFragment.findViewById(R.id.button_addCart);
        text_nameMeal = myFragment.findViewById(R.id.text_nameMeal);
        textDetailsMeal = myFragment.findViewById(R.id.textDetailsMeal);
        textNis = myFragment.findViewById(R.id.textNis);


        button_addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MyCart.class);
                startActivity(i);
            }
        });
        String Title, Hours, Nis;
        int Image;
        if (savedInstanceState == null) {
            Bundle extras = Objects.requireNonNull(getActivity()).getIntent().getExtras();
            if (extras == null) {
                Title = null;
                Hours = null;
                Nis = null;
                Image = Integer.parseInt(null);
            } else {
                Title = extras.getString("Title");
//                Hours= extras.getString("Hours");
                Nis = extras.getString("Nis");
                Image = extras.getInt("Image");
            }
        } else {
            Title = (String) savedInstanceState.getSerializable("Title");
//            Hours= (String) savedInstanceState.getSerializable("Hours");
            Nis = (String) savedInstanceState.getSerializable("Nis");
            Image = (int) savedInstanceState.getSerializable("Image");
        }


        text_nameMeal.setText(Title);
//        textDetailsMeal.setText(Hours);
        textNis.setText(Nis);
        return myFragment;
    }

}
