package com.e.wgbaty.Fragments.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.e.wgbaty.Adapters.PageAdapter;
import com.e.wgbaty.Fragments.OrdersFragment.Orders_n_progressFragment;
import com.e.wgbaty.Fragments.OrdersFragment.Previous_ordersFragment;
import com.e.wgbaty.R;
import com.e.wgbaty.Fragments.RestaurantsFragment.ProductivefamiliesFragment;
import com.e.wgbaty.Fragments.RestaurantsFragment.RestautFragment;
import com.google.android.material.tabs.TabLayout;


public class OrdersFragments extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    View myFragment;

    public OrdersFragments() {
        // Required empty public constructor
    }

    public static OrdersFragments getInstance()    {
        return new OrdersFragments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_shipping, container, false);
////        TextView textView = getSupportActionBar().getCustomView().findViewById(R.id.include);
//        TextView textView=((AppCompatActivity)getActivity()).getSupportActionBar().getCustomView().findViewById(R.id.include);
//        textView.setText("My Custom Title");
        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tablayout);

        return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        PageAdapter adapter = new PageAdapter(getChildFragmentManager());

        adapter.AddFragment(new Orders_n_progressFragment(), "'طلبيات قيد التنفيذ");
        adapter.AddFragment(new Previous_ordersFragment(), "طلبيات سابقة");

        viewPager.setAdapter(adapter);
    }
}