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
    Button btnnext; //deklarasi variable untuk button
    ImageView imglogo; //deklarasi variable untuk imageview
    TextView tvnanya; //deklarasi variable untuk textview
    EditText edtjawab; //deklarasi variable untuk edittext

    int x=0; //deklarasi nilai x=0 yang merupakan value array pada question.java
    int jmlclue; //deklarasi integer untuk jumlah soal/clue/hint
    String jawaban; //deklarasi string untuk nilai jawaban pada array clueanswer

    Question tanyajawab = new Question(); //instance class Question

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_play);

        btnnext= findViewById(R.id.btnnext); //menghubungkan variable btnnext dengan komponen button pada layout
        imglogo= findViewById(R.id.imgLogo); //menghubungkan variable imglogo dengan komponen imageview pada layout
        tvnanya= findViewById(R.id.tvtanya); //menghubungkan variable tvnanya dengan komponen textview pada layout
        edtjawab= findViewById(R.id.edtjawab); //menghubungkan variable edtjawab dengan komponen edittext pada layout

        //deklarasi typeface untuk menyimpan font. jadi ini digunakan agar fontnya berubah.
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/GishellaMorely.ttf"); //

        btnnext.setTypeface(typeface); //menyetel atau set btnnext seperti var typeface

        isiPlay(); //memanggil method isiPlay

        //membuat fungsi onClick pada button btnnext
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtjawab.getText().toString().isEmpty()){ //jika edittext edtjawab tidak kosong

                    //jika edittext edtjawab sama seperti method getClueAnswer
                    //ignorecase digunakan untuk mengabaikan huruf kapital/tidak pada edittext edtjawab
                    if(edtjawab.getText().toString().equalsIgnoreCase(tanyajawab.getClueAnswer(x))){
                        Toast.makeText(getApplicationContext(), "Yay! 🎉🎉",
                                Toast.LENGTH_SHORT).show(); //pesan teks atau umpan balik
                        isiPlay(); //memanggil method isiplay()
                    }else{
                        Toast.makeText(getApplicationContext(), "Salah 😪",
                                Toast.LENGTH_SHORT).show(); //pesan teks atau umpan balik
                        isiPlay(); //memanggil method isiplay()
                    }
                }else{ //jika edittext edtjawab kosong
                    Toast.makeText(getApplicationContext(), "fill the blank",
                            Toast.LENGTH_SHORT).show(); //umpan balik
                }
            }
        });
    }

    private void isiPlay() {
        edtjawab.setText(null); //set edittext menjadi null atau kosong

        //variable jmlclue untuk menyimpan semua isi method clue yg ada di kelas tanyajawab, length disini sama spt jumlah valuenya
        jmlclue = tanyajawab.clue.length;

        if(x >= jmlclue){ //kondisi apabila x lebih dari atau sama dengan variable jmlclue
            //method untuk memanggil activity halamanAnswers
            Intent i = new Intent(halamanPlay.this, halamanAnswers.class);
            startActivity(i);

        }else{ //kondisi apabila x masih kurang dari variable jmlclue
            tvnanya.setText(tanyajawab.getClue(x)); //textview tvnanya akan menampilkan/set isi getClue
            setLogo(); //memanggil method setlogo
            jawaban = tanyajawab.getClueAnswer(x); //variable jawaban untuk menyimpan isi method getCLueAnswer yg terdapat pd kelas tanyajawab
        }
        x++; //agar value nya berubah, ini mksdnya supaya gambar/clue nya berubah ke selanjutnya.
    }

    private void setLogo(){
        String gambar = tanyajawab.getImage(x); //deklarasi variable untuk menyimpan isi method getIMage

        //deklarasi variable untuk mendapatkan isi method getImage, dimana isinya diidentifikasi kan pd file drawable.
        //drawable ini digunakan untuk menampilkan atau mengimplementasikan file ke dalam layout sebagai penampil gambar.
        Drawable drawable = getResources().getDrawable(getResources()
                .getIdentifier(gambar, "drawable", getPackageName()));
        imglogo.setImageDrawable(drawable); //menghubungkan agar imageview imglogo ini menampilkan gambar yang dideklarasikan pd var. drawable
    }

    public void onBackPressed(){ //method back ini digunakan agar tidak berpindah ke activity lain. jd dia akan tetap di halaman/activity yg sama
        //apabila tekan back, maka akan ada umpan balik.
        Toast.makeText(getApplicationContext(), "finish it.", Toast.LENGTH_SHORT).show();
    }
}