package com.fauziy.biomastery_materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Jenis_sel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_sel);

        TextView textView = findViewById(R.id.text);
        textView.setText("Jenis-jenis sel dibagi berdasarkan tiga hal, yaitu materi genetik, membran inti, dan sitoplasma. Materi genetik sendiri merupakan substansi yang mengatur sifat pada makhluk hidup. Materi genetik dapat berupa DNA dan RNA, serta bisa diwariskan dari induk ke keturunannya.\n\nMateri genetik dalam sebuah sel, ada yang dibungkus oleh membran inti, tapi ada juga yang nggak dibungkus membran inti. Kalau materi genetiknya dibungkus oleh membran inti, maka disebut sebagai sel eukariotik, sedangkan kalau materi genetiknya nggak dibungkus membran inti, maka disebut sel prokariotik.");

        TextView textView2 = findViewById(R.id.text2);
        textView2.setText("1. Sel Prokariotik\n\nSel prokariotik adalah organisme pertama yang hidup di bumi. Organisme yang termasuk dalam tipe sel ini, antara lain archaebacteria/eubacteria dan blue green algae. Karakteristik umum dari sel prokariotik adalah sebagai berikut:\n\n- Ukuran sel berkisar antara 1 – 10 mikron.\n- Uniselular yang membentuk koloni/filamen.\n- Bentuk sel terdiri dari bulat, batang, dan datar.\n- Ada yang bersifat autotrof dan heterotrof.\n- Reproduksi secara aseksual: pembelahan biner, transformasi, konjugasi, dan transduksi.");

        TextView textView3 = findViewById(R.id.text3);
        textView3.setText("2. Sel Eukariotik\n\nTipe sel yang satu ini merupakan sel yang paling kompleks jika dibandingkan dengan sel prokariotik. Contoh sel eukariotik, antara lain sel hewan dan sel tumbuhan. Sel eukariotik memiliki membran yang mengikat nukleus dan organel sel lainnya di dalam sel. Organel sel yang saling terikat satu sama lain ini membentuk suatu sistem selular yang fungsional.");

        TextView textView4 = findViewById(R.id.text4);
        textView4.setText("Berikut ini adalah beberapa karakteristik dari sel eukariotik:\n\n- Ukuran sel berkisar antara 10 – 100 mikron.\n- Struktur sel yang kompleks (organel sel) dan multiselular.\n- Reproduksi secara mitosis (sel tubuh) maupun meiosis (sel kelamin).\n- Dapat bersifat autotrof atau heterotrof.");

        ImageView imageView1 = findViewById(R.id.img1);
//        imageView1.setImageResource(R.drawable.img_1);

        ImageView imageView2 = findViewById(R.id.img2);
//        imageView2.setImageResource(R.drawable.img_2);

        ImageView imageView3 = findViewById(R.id.img3);
//        imageView3.setImageResource(R.drawable.img_3);
    }
}