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
    GridLayout mainGrid;
    Button btnhome;
    TextView txtgrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_answers);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        btnhome = (Button) findViewById(R.id.btHome);
        txtgrid = (TextView) findViewById(R.id.textGrid);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/GishellaMorely.ttf");

        txtgrid.setTypeface(typeface);
        btnhome.setTypeface(typeface);

        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(halamanAnswers.this, MainActivity.class);
                a.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(a);
            }
        });
    }
}