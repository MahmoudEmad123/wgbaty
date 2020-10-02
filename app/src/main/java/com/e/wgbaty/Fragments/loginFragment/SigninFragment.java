package com.e.wgbaty.Fragments.loginFragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.wgbaty.MainActivity;
import com.e.wgbaty.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SigninFragment extends Fragment {

    View view;
    TextView hometext;

    public SigninFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_signin, container, false);
// get the reference of Button
        hometext =  view.findViewById(R.id.hometext);
// perform setOnClickListener on first Button
        hometext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MainActivity.class);
                startActivity(i);

            }
        });
        return view;
    }
}