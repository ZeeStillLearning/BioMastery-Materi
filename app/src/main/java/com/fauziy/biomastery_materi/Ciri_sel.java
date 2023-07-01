package com.fauziy.biomastery_materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ciri_sel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciri_sel);

        TextView textView = findViewById(R.id.teksciri);
        textView.setText("a. Berukuran 1 – 100 mikrometer.\n \nb. Dibedakan menjadi sel prokariotik dan sel eukariotik. Sel prokariotik adalah sel yang tidak memiliki membran inti sedangkan sel eukariotik adalah sel yang memiliki membran inti \n \nc. Tersusun atas komponen kimiawi seperti karbohidrat, protein, lemak, air, vitamin dan mineral\n \nd. Sel eukariotik tersusun atas membran sel, sitoplasma dan materi genetik (DNA dan RNA)\n \ne. Pada sel eukariotik materi genetik tersebar di sitoplasma sedangkan sel prokariotik materi genetik terdapat di dalam inti sel\n \nf. Memiliki ribosom\n \ng. Memiliki sitoskeleton (rangka sel) \n \nh. Sitoplasma sel eukariotik mengandung organel sel seperti mitokondria, retikulum endoplasma, badan golgi, lisosom, plastida, vakuola, sentriol, dan badan mikro \n \ni. Sel prokariotik memiliki mesosom sebagai pengganti mitokondria\n \nj. Dapat bereproduksi yakni dengan melakukan pembelahan sel, baik secara mitosis maupun meiosis\n \n k. Dapat mewariskan sifat ke sel baru hasil pembelahan (sebagai unit hereditas)");
    }
}