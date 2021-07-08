package com.example.logoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class halamanAbout extends AppCompatActivity {
    Button btback; //deklarasi variable untuk button
    TextView textView; //deklarasi variable untuk textview
    ImageView imageView; //deklarasi variable untuk imageview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_about);

        imageView = findViewById(R.id.imageViewabt); //menghubungkan variable dengan komponen imageview pada layout
        textView = findViewById(R.id.textView); //menghubungkan variable textView dengan komponen textView pada layout
        btback = findViewById(R.id.buttonhome); //menghubungkan variable btback dengan komponen button pada layout

        //deklarasi typeface untuk menyimpan font. jadi ini digunakan agar fontnya berubah.
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/sunflower.otf");

        btback.setTypeface(typeface); //menyetel atau set btback seperti var typeface
        textView.setTypeface(typeface); //menyetel atau set textView seperti var typeface

        //membuat fungsi onClick pada button btback
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //akan kembali ke activity sebelumnya.
            }
        });

    }
}