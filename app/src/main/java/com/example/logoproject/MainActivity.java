package com.example.logoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {
    ImageView imgv1;
    Button btplay, btabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgv1 = findViewById(R.id.imgv1);
        btabout = findViewById(R.id.btntentang);
        btplay = findViewById(R.id.btplay);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/GishellaMorely.ttf");

        btabout.setTypeface(typeface);
        btplay.setTypeface(typeface);

        btabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, halamanAbout.class);
                startActivity(i);
            }
        });

        btplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity.this, halamanPlay.class);
                startActivity(u);
            }
        });
    }
}