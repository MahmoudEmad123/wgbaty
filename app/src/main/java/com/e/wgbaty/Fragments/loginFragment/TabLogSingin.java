package com.e.wgbaty.Fragments.loginFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.e.wgbaty.Adapters.ViewPagerAdapter;
import com.e.wgbaty.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class TabLogSingin extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_log_singin);

        tabLayout= findViewById(R.id.tablayout);
        appBarLayout= findViewById(R.id.appbarid);
        viewPager= findViewById(R.id.viewPager);

        ViewPagerAdapter adapter  = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new RegisterFragment(), "مستخدم جديد");
        adapter.AddFragment(new SigninFragment(), "تسجيل دخول");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }



}
