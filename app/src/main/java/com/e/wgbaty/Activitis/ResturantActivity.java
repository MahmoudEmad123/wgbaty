package com.e.wgbaty.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.wgbaty.Adapters.ViewPagerAdapter;
import com.e.wgbaty.Fragments.DetailsResturantFragment.ChurrosFragment;
import com.e.wgbaty.Fragments.DetailsResturantFragment.Food_and_restaurantFragment;
import com.e.wgbaty.Fragments.DetailsResturantFragment.Pizza_sliceFragment;
import com.e.wgbaty.Fragments.OrdersFragment.Orders_n_progressFragment;
import com.e.wgbaty.Fragments.loginFragment.RegisterFragment;
import com.e.wgbaty.Fragments.loginFragment.SigninFragment;
import com.e.wgbaty.MainActivity;
import com.e.wgbaty.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class ResturantActivity extends AppCompatActivity {
    private TabLayout tab_layout_restu;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager_restu;
    ImageView image_shopping, image_search, image_back;
    TextView textTile;
    private Toolbar toolbar;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);

        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("Title");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("Title");
        }

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        image_search = findViewById(R.id.image_search);
        textTile = findViewById(R.id.txtTitle);
        image_shopping = findViewById(R.id.image_shopping);
        image_back = findViewById(R.id.image_back);

        image_search.setVisibility(View.VISIBLE);
        image_shopping.setVisibility(View.GONE);
        textTile.setVisibility(View.VISIBLE);
        image_back.setVisibility(View.GONE);
        textTile.setText(newString);
        textTile.setTextColor(getResources().getColor(R.color.textColor));
        image_search.setImageResource(R.drawable.ic_back_black);
        image_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        tab_layout_restu = findViewById(R.id.tab_layout_restu);
        appBarLayout = findViewById(R.id.appbarid);
        viewPager_restu = findViewById(R.id.viewPager_restu);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new ChurrosFragment(), "مقبلات");
        adapter.AddFragment(new Pizza_sliceFragment(), "بيتزا");
        adapter.AddFragment(new Orders_n_progressFragment(), "سلطات");
        adapter.AddFragment(new Food_and_restaurantFragment(), "حلويات");




        viewPager_restu.setAdapter(adapter);
//        tab_layout_restu.setupWithViewPager(viewPager_restu);
//        tab_layout_restu.getTabAt(0).setIcon(R.drawable.img_food_and_restaurant);
//        tab_layout_restu.getTabAt(1).setIcon(R.drawable.img_food_and_restaurant);
//        tab_layout_restu.getTabAt(2).setIcon(R.drawable.img_food_and_restaurant);
//        tab_layout_restu.getTabAt(3).setIcon(R.drawable.img_food_and_restaurant);


        tab_layout_restu.setupWithViewPager(viewPager_restu);
        TabLayout.Tab tab = tab_layout_restu.getTabAt(0);
        tab.setIcon(R.drawable.img_food_and_restaurant);
        TabLayout.Tab tab2 = tab_layout_restu.getTabAt(1);
        tab2.setIcon(R.drawable.img_food_and_restaurant);
        TabLayout.Tab tab3 = tab_layout_restu.getTabAt(2);
        tab3.setIcon(R.drawable.img_food_and_restaurant);
        TabLayout.Tab tab4 = tab_layout_restu.getTabAt(3);
        tab4.setIcon(R.drawable.img_food_and_restaurant);

    }
}
