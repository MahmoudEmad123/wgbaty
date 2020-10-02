package com.e.wgbaty.Activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.e.wgbaty.R;
import com.e.wgbaty.Fragments.loginFragment.TabLogSingin;

public class Loginas extends AppCompatActivity {
    ImageButton img_Orderfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginas);

        img_Orderfood = findViewById(R.id.img_Orderfood);
        img_Orderfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext(), TabLogSingin.class);
                startActivity(i);

            }
        });


            }
}
