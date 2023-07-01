package com.fauziy.biomastery_materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_sel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_sel);

        TextView textView = findViewById(R.id.teks);
        textView.setText("Sel adalah satuan unit struktural dan fungsional terkecil dari mahluk hidup yang merupakan dasar penyusun bagian-bagian tubuh. Sel merupakan komponen yang paling sederhana dalam sistem organisasi kehidupan.");

        ImageView imageView = findViewById(R.id.img);
//        imageView.setImageResource(R.drawable.img);

        TextView textView2 = findViewById(R.id.teks2);
        textView2.setText("Sel pertama kali diobservasi dan diidentifikasi oleh fisikawan Inggris bernama Robert Hook pada tahun 1665. Kemudian, dua ilmuwan Jerman – Schwann dan Schleiden mengemukakan prinsip dasar baru sel pada tahun 1893. Teori mengenai sel terdiri dari 3 prinsip berikut:");

        TextView textView3 = findViewById(R.id.teks3);
        textView3.setText("1. Semua makhluk hidup tersusun dari satu sel atau lebih.\n2. Sel adalah unit dasar dari struktur dan fungsi pada makhluk hidup.\n3. Sel-sel lainnya berasal dari proses penggandaan (replikasi) sel yang telah ada sebelumnya.");

        TextView textView4 = findViewById(R.id.teks4);
        textView4.setText("Menurut penjelasan di atas, sel merupakan satuan unit terkecil makhluk hidup, termasuk manusia. Nah, kira-kira ada berapa ya jumlah sel manusia?\n\nSebenarnya, belum diketahui secara pasti berapa jumlah sel manusia. Sampai saat ini, para ahli masih meneliti lebih lanjut terkait hal ini. Tapi, diperkirakan rata-rata tubuh manusia memiliki sekitar 30–40 triliun sel. Wow, banyak sekali ya!");


    }
}