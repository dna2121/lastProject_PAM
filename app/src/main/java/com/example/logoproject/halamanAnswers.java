package com.example.logoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class halamanAnswers extends AppCompatActivity {
    GridLayout mainGrid; //deklarasi variable untuk Gridlayout
    Button btnhome; //deklarasi variable untuk button
    TextView txtgrid; //deklarasi variable untuk textview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_answers);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid); //menghubungkan variable maingrid dengan komponen gridlayout pada layout
        btnhome = (Button) findViewById(R.id.btHome); //menghubungkan variable btnhome dengan komponen button pada layout
        txtgrid = (TextView) findViewById(R.id.textGrid); //menghubungkan variable txtgrid dengan komponen textview pada layout

        //deklarasi typeface untuk menyimpan font. jadi ini digunakan agar fontnya berubah.
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/GishellaMorely.ttf");

        txtgrid.setTypeface(typeface); //menyetel atau set txtgrid seperti var typeface
        btnhome.setTypeface(typeface); //menyetel atau set btnhome seperti var typeface

        //membuat fungsi onClick pada button btnhome
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //method untuk memanggil activity Mainactivity
                Intent a = new Intent(halamanAnswers.this, MainActivity.class);

                //membersihkan activity
                //apabila sudah ke activity MainActivity, maka dia akan memulai dari nol lagi.
                a.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(a);
            }
        });
    }
}