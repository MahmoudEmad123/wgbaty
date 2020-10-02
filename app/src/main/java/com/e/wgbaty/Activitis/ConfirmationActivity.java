package com.e.wgbaty.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.wgbaty.R;

public class ConfirmationActivity extends AppCompatActivity {
    ImageView image_shopping, image_search, image_back;
    TextView textTile;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        image_search = findViewById(R.id.image_search);
         textTile = findViewById(R.id.txtTitle);
        image_shopping = findViewById(R.id.image_shopping);
        image_back = findViewById(R.id.image_back);
//        toolbar.setBackgroundColor(R.drawable.img_background_details);
        image_search.setVisibility(View.VISIBLE);
        image_shopping.setVisibility(View.GONE);
        textTile.setVisibility(View.VISIBLE);
        image_back.setVisibility(View.GONE);
//        image_back.setImageResource(R.drawable.ic_blus);
        textTile.setText("تأكيد الطلب");
        textTile.setTextColor(getResources().getColor(R.color.textColor));
        image_search.setImageResource(R.drawable.ic_back_black);
        image_back.setBackground(getDrawable(R.drawable.circle_grey));
    }
}
