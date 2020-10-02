package com.e.wgbaty.Fragments.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.e.wgbaty.Adapters.PageAdapter;
import com.e.wgbaty.R;
import com.e.wgbaty.Fragments.RestaurantsFragment.ProductivefamiliesFragment;
import com.e.wgbaty.Fragments.RestaurantsFragment.RestautFragment;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    private Toolbar toolbar;
    View myFragment;
    ImageView image_shopping, image_search, image_back;
    TextView textTile;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment getInstance() {
        return new HomeFragment();
    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        myFragment = inflater.inflate(R.layout.fragment_home, container, false);
////        TextView textView = getSupportActionBar().getCustomView().findViewById(R.id.include);
//        TextView textView=((AppCompatActivity)getActivity()).getSupportActionBar().getCustomView().findViewById(R.id.include);
//        textView.setText("My Custom Title");
        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tablayout);

        toolbar = (Toolbar) myFragment.findViewById(R.id.toolbar);
        image_search = toolbar.findViewById(R.id.image_search);
        textTile = toolbar.findViewById(R.id.txtTitle);
        image_shopping = toolbar.findViewById(R.id.image_shopping);
        image_back = toolbar.findViewById(R.id.image_back);

        image_search.setVisibility(View.VISIBLE);
        image_shopping.setVisibility(View.VISIBLE);
        textTile.setVisibility(View.GONE);
        image_back.setVisibility(View.GONE);

        return myFragment;
    }

    //Call onActivity Create method


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
        adapter.AddFragment(new RestautFragment(), "مطاعم");
        adapter.AddFragment(new ProductivefamiliesFragment(), "أسر منتجة");


        viewPager.setAdapter(adapter);
    }
}