package com.example.logoproject;

public class Question
{
    public  String clue[] = {
            "I'm one of the best chicken in town.", //1kfc
            "related to sports.",//2nike
            "boom boom",//3toyota
            "one of people's favorite spot.",//4sbux
            "superhero.",//5superman
            "",//6disney
            "nyatanya nyegerin.",//7sprite
            "dory",//8nemo
            "door is my partner",//9windows
            "dimana-mana ada aku"//10samsung

    };

    public String image[] = {
            "i1",
            "i2",
            "i3",
            "i4",
            "i5",
            "i6",
            "i7",
            "i8",
            "i9",
            "i10"
    };
    private String clueAnswer[] = {
            "",
            "kfc",
            "nike",
            "toyota",
            "starbucks",
            "superman",
            "disney",
            "sprite",
            "finding nemo",
            "windows",
            "samsung"
    };

    public String getClue(int x){
        String soal = clue[x];
        return soal;
    }

    public String getImage(int x){
        String gambar = image[x];
        return gambar;
    }

    public String getClueAnswer(int x){
        String jawaban = clueAnswer[x];
        return jawaban;
    }

}
