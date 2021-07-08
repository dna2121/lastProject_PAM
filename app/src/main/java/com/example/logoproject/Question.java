package com.example.logoproject;

public class Question
{
    //array untuk menyimpan clue atau hint jawaban pertanyaan
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

    //array untuk menyimpan nama file foto yang akan dipanggil di halaman play
    public String image[] = {
            "i1", //gambar logo yg akan muncul pada halaman 1
            "i2", //gambar logo yg akan muncul pada halaman 2
            "i3", //gambar logo yg akan muncul pada halaman 3
            "i4", //gambar logo yg akan muncul pada halaman 4
            "i5", //gambar logo yg akan muncul pada halaman 5
            "i6", //gambar logo yg akan muncul pada halaman 6
            "i7", //gambar logo yg akan muncul pada halaman 7
            "i8", //gambar logo yg akan muncul pada halaman 8
            "i9", //gambar logo yg akan muncul pada halaman 9
            "i10" //gambar logo yg akan muncul pada halaman 10
    };

    //array untuk menyimpan jawaban yang benar
    public String clueAnswer[] = {
            "",
            "kfc", //jawaban logo pertanyaan 1
            "nike", //jawaban logo pertanyaan 2
            "toyota", //jawaban logo pertanyaan 3
            "starbucks", //jawaban logo pertanyaan 4
            "superman", //jawaban logo pertanyaan 5
            "disney", //jawaban logo pertanyaan 6
            "sprite", //jawaban logo pertanyaan 7
            "finding nemo", //jawaban logo pertanyaan 8
            "windows", //jawaban logo pertanyaan 9
            "samsung" //jawaban logo pertanyaan 10
    };

    //method getter untuk mengambil nilai array clue
    public String getClue(int x){
        String soal = clue[x]; //deklarasi variable untuk menyimpan soal dengan nilai array clue
        return soal; //mengembalikan nilai
    }

    //method getter untuk mengambil nilai array image
    public String getImage(int x){
        String gambar = image[x]; //deklarasi variable untuk menyimpan gambar dengan nilai array image
        return gambar; //mengembalikan nilai
    }

    //method getter untuk mengambil nilai array clueanswer
    public String getClueAnswer(int x){
        String jawaban = clueAnswer[x]; //deklarasi variable untuk menyimpan jawaban dengan nilai array clueanwer
        return jawaban; //mengembalikan nilai
    }

}
