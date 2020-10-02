package com.e.wgbaty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.e.wgbaty.Adapters.PageAdapter;
import com.e.wgbaty.Helper.BottomNavigationViewHelper;
import com.e.wgbaty.Fragments.home.HomeFragment;
import com.e.wgbaty.Fragments.home.ProfileFragment;
import com.e.wgbaty.Fragments.home.NotificationFragment;
import com.e.wgbaty.Fragments.home.OrdersFragments;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem tabProduct;
    TabItem tabRestaut;
    TextView txtTitle;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitle = findViewById(R.id.txtTitle);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.action_home :
                        selectedFragment = HomeFragment.getInstance();
                        break;

                    case R.id.action_notify:
                        selectedFragment = NotificationFragment.getInstance();
                        break;

                    case R.id.action_orders:
                        selectedFragment = OrdersFragments.getInstance();
                        break;

                    case R.id.action_profile :
                        selectedFragment = ProfileFragment.getInstance();
                        break;
                }

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame, selectedFragment);
                transaction.commit();
                return false;
            }
        });
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, HomeFragment.getInstance());
        transaction.commit();
    }
}
