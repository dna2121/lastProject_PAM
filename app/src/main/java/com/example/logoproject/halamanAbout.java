package com.example.logoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class halamanAbout extends AppCompatActivity {
    Button btback;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_about);

        imageView = findViewById(R.id.imageViewabt);
        textView = findViewById(R.id.textView);
        btback = findViewById(R.id.buttonhome);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/sunflower.otf");

        btback.setTypeface(typeface);
        textView.setTypeface(typeface);

        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}