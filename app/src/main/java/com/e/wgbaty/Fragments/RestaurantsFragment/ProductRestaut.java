package com.e.wgbaty.Fragments.RestaurantsFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;

import com.e.wgbaty.Adapters.PageAdapter;
import com.e.wgbaty.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ProductRestaut extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem tabProduct;
    TabItem tabRestaut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_restaut);
//        toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle(getResources().getString(R.string.app_name));
//        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tablayout);
        tabProduct = findViewById(R.id.tabProduct);
        tabRestaut = findViewById(R.id.tabRestaut);
        viewPager = findViewById(R.id.viewPager);

//        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(pageAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(ProductRestaut.this,
                            R.color.colorAccent));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(ProductRestaut.this,
                            R.color.colorAccent));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(ProductRestaut.this,
                                R.color.colorAccent));
                    }
                } else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(ProductRestaut.this,
                            android.R.color.darker_gray));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(ProductRestaut.this,
                            android.R.color.darker_gray));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(ProductRestaut.this,
                                android.R.color.darker_gray));
                    }
                } else {
                    toolbar.setBackgroundColor(ContextCompat.getColor(ProductRestaut.this,
                            R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(ProductRestaut.this,
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(ProductRestaut.this,
                                R.color.colorPrimaryDark));
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}
