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
    ImageView imgv1;  //deklarasi variable untuk imageview
    Button btplay, btabout;  //deklarasi variable untuk button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgv1 = findViewById(R.id.imgv1); //menghubungkan variable imgv1 dengan komponen imageview pada layout
        btabout = findViewById(R.id.btntentang); //menghubungkan variable btnabout dengan komponen button pada layout
        btplay = findViewById(R.id.btplay); //menghubungkan variable btnplay dengan komponen button pada layout

        //deklarasi typeface untuk menyimpan font. jadi ini digunakan agar fontnya berubah.
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/GishellaMorely.ttf");

        btabout.setTypeface(typeface); //menyetel atau set btabout seperti var typeface
        btplay.setTypeface(typeface); //menyetel atau set btplay seperti var typeface

        //membuat fungsi onClick pada button btnabout
        btabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, halamanAbout.class);
                startActivity(i);
            }
        });

        //membuat fungsi onClick pada button btnplay
        btplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity.this, halamanPlay.class);
                startActivity(u);
            }
        });
    }
}