package com.example.logoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class halamanPlay extends AppCompatActivity {
    Button btnnext;
    ImageView imglogo;
    TextView tvnanya;
    EditText edtjawab;

    int x=0;
    int jmlclue;
    String jawaban;

    Question tanyajawab = new Question();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_play);

        btnnext= findViewById(R.id.btnnext);
        imglogo= findViewById(R.id.imgLogo);
        tvnanya= findViewById(R.id.tvtanya);
        edtjawab= findViewById(R.id.edtjawab);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/GishellaMorely.ttf");

        btnnext.setTypeface(typeface);

        isiPlay();

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtjawab.getText().toString().isEmpty()){
                    if(edtjawab.getText().toString().equalsIgnoreCase(tanyajawab.getClueAnswer(x))){
                        Toast.makeText(getApplicationContext(), "Yay! 🎉🎉",
                                Toast.LENGTH_SHORT).show();
                        isiPlay();
                    }else{
                        Toast.makeText(getApplicationContext(), "Salah 😪",
                                Toast.LENGTH_SHORT).show();
                        isiPlay();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "fill the blank",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void isiPlay() {
        edtjawab.setText(null);
        jmlclue = tanyajawab.clue.length;
        if(x >= jmlclue){
            Intent i = new Intent(halamanPlay.this, halamanAnswers.class);
            startActivity(i);

        }else{
            tvnanya.setText(tanyajawab.getClue(x));
            setLogo();
            jawaban = tanyajawab.getClueAnswer(x);
        }
        x++;
    }

    private void setLogo(){
        String gambar = tanyajawab.getImage(x);
        Drawable drawable = getResources().getDrawable
                (getResources().getIdentifier(gambar, "drawable", getPackageName()));
        imglogo.setImageDrawable(drawable);
    }

    public void onBackPressed(){
        Toast.makeText(getApplicationContext(), "finish it.", Toast.LENGTH_SHORT).show();
    }
}