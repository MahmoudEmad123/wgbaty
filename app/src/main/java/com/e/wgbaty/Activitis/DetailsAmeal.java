package com.e.wgbaty.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.e.wgbaty.Adapters.ViewPagerAdapter;
import com.e.wgbaty.Fragments.Mealsdetails.MealdetailsFragment;
import com.e.wgbaty.Fragments.Mealsdetails.RatingsFragment;
import com.e.wgbaty.Fragments.loginFragment.RegisterFragment;
import com.e.wgbaty.Fragments.loginFragment.SigninFragment;
import com.e.wgbaty.MainActivity;
import com.e.wgbaty.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

public class DetailsAmeal extends AppCompatActivity {
    ImageView image_shopping, image_search, image_back;
    TextView textTile;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_ameal);
         appBarLayout=findViewById(R.id.appbarid);
        int Image;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                Image= Integer.parseInt(null);
            } else {
                Image= extras.getInt("Image");
            }
        } else {
            Image= (int) savedInstanceState.getSerializable("Image");
        }
         appBarLayout.setBackgroundResource(Image);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        image_search = findViewById(R.id.image_search);
        textTile = findViewById(R.id.txtTitle);
        image_shopping = findViewById(R.id.image_shopping);
        image_back = findViewById(R.id.image_back);
//        toolbar.setBackgroundColor(R.drawable.img_background_details);
        image_search.setVisibility(View.VISIBLE);
        image_shopping.setVisibility(View.GONE);
        textTile.setVisibility(View.GONE);
        image_back.setVisibility(View.VISIBLE);
         image_back.setImageResource(R.drawable.rate);
         image_back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 final BottomSheetDialog bottomSheetDialog  =new BottomSheetDialog(
                         DetailsAmeal.this, R.style.BottomSheetDialog
                 );
                 View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_bottom_sheet_ratting
                 ,(LinearLayout)findViewById(R.id.bottom_sheet_ratting));
                 view.findViewById(R.id.btnrating).setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {

                         bottomSheetDialog.dismiss();

                     }
                 });
                 bottomSheetDialog.setContentView(view);
                 bottomSheetDialog.show();

             }
         });
 //        textTile.setText(Tit);
         image_search.setImageResource(R.drawable.ic_back);


         image_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ResturantActivity.class);
                startActivity(i);
            }
        });


        tabLayout= findViewById(R.id.tablayout);
        appBarLayout= findViewById(R.id.appbarid);
        viewPager= findViewById(R.id.viewPager);

        ViewPagerAdapter adapter  = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new MealdetailsFragment(), "تقاصيل الوجبة");
        adapter.AddFragment(new RatingsFragment(), "التقييمات");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }



}
