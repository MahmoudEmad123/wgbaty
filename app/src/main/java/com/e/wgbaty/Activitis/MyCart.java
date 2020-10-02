package com.e.wgbaty.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.wgbaty.Adapters.AppetizerAdapter;
import com.e.wgbaty.Adapters.BasketAdapter;
import com.e.wgbaty.Models.Appetizer;
import com.e.wgbaty.Models.Basket;
import com.e.wgbaty.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MyCart extends AppCompatActivity {
    ImageView image_shopping, image_search, image_back;
    TextView textTile;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    RecyclerView recyclerView;
    BasketAdapter adapter;
    Button btnOrder_now;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        image_search = findViewById(R.id.image_search);
        btnOrder_now = findViewById(R.id.btnOrder_now);
        textTile = findViewById(R.id.txtTitle);
        image_shopping = findViewById(R.id.image_shopping);
        image_back = findViewById(R.id.image_back);
//        toolbar.setBackgroundColor(R.drawable.img_background_details);
        image_search.setVisibility(View.VISIBLE);
        image_shopping.setVisibility(View.GONE);
        textTile.setVisibility(View.VISIBLE);
        image_back.setVisibility(View.VISIBLE);
        image_back.setImageResource(R.drawable.ic_blus);
        textTile.setText("السلة");
        textTile.setTextColor(getResources().getColor(R.color.textColor));
        image_search.setImageResource(R.drawable.ic_back_black);
        image_back.setBackground(getDrawable(R.drawable.circle_grey));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter = new BasketAdapter(getApplicationContext(), getMyList());
        recyclerView.setAdapter(adapter);

        image_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ResturantActivity.class);
                startActivity(i);
            }
        });

        btnOrder_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ConfirmationActivity.class);
                startActivity(i);
            }
        });

    }

    private ArrayList<Basket> getMyList() {
        ArrayList<Basket> baskets = new ArrayList<>();
        Basket basket2;

        basket2 = new Basket();
        basket2.setName(" سبانيولي  ");
        basket2.setPrice("30 NIS");
//        basket2.setQnt();
        basket2.setImge(R.drawable.img_baket);
        baskets.add(basket2);



        basket2 = new Basket();
        basket2.setName(" سبانيولي  ");
        basket2.setPrice("30 NIS");
//        basket2.setQnt();
        basket2.setImge(R.drawable.img_baket);
        baskets.add(basket2);


        basket2 = new Basket();
        basket2.setName(" سبانيولي  ");
        basket2.setPrice("30 NIS");
//        basket2.setQnt();
        basket2.setImge(R.drawable.img_baket);
        baskets.add(basket2);


        basket2 = new Basket();
        basket2.setName(" سبانيولي  ");
        basket2.setPrice("30 NIS");
//        basket2.setQnt();
        basket2.setImge(R.drawable.img_baket);
        baskets.add(basket2);

        return baskets;
    }
}

