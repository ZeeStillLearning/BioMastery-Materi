package com.fauziy.biomastery_materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Komponen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen);

        TextView textView = findViewById(R.id.kom1);
        textView.setText("Seluruh bagian sel tersusun atas beberapa komponen senyawa kimia. Kegiatan dan kehidupan sel juga merupakan akibat dari reaksi-reaksi kimia yang berlangsung di dalam sel. Komponen kimiawi sel yang meliputi seluruh aktivitas sel tersebut dikenal dengan nama protoplasma. Protoplasma merupakan substansi kompleks yang tersusun atas unsur-unsur kimia. Sebagian besar protoplasma terdiri atas air, namun bahan yang memberi ciri pada strukturnya justru adalah protein dan beberapa senyawa kimia lain. Bentuk senyawa dari komponen kimiawi penyusun sel (protoplasma) tersebut dapat berupa senyawa organik dan senyawa anorganik. Senyawa organik dalamkomponen sel bisa berupa karbohidrat, lemak, protein, dan asam nukleat. Sedangkan komponen senyawa anorganiknya bisa berupa air, vitamin, ataupun mineral. Berikut ini kita akan bahas mengenai komponen kimiawi penyusun sel tersebut secara mendalam.");

        TextView textView2 = findViewById(R.id.kom2);
        textView2.setText("a) Karbohidrat \nKomponen kimiawi sel yang pertama adalah karbohidrat. Karbohidrat sangat vital untuk proses-proses fisiologi dalam sel makhluk hidup. Dengan rumus molekul (H2O)n. Karbohidrat terdiri atas unsur karbon (C), oksigen (O), dan hidrogen (H). Pada tumbuhan, karbohidrat dibentuk oleh sel-sel yang memiliki hijau daun (kloroplas mengandung klorofil) melalui proses fotosintesis. Berdasarkan fungsinya, karbohidrat dapat dikelompokkan menjadi karbohidrat sederhana (sebagai sumber energi di dalam sel), karbohidrat rantai pendek (sebagai cadangan energi), serta karbohidrat rantai panjang (sebagai komponen struktural organel dan bagian sel lainnya). Sedangkan berdasarkan struktur ikatan molekulnya, karbohidrat digolongkan menjadi monosakarida, disakarida, dan polisakarida. ");

        TextView textView3 = findViewById(R.id.kom3);
        textView3.setText("b) Lemak \nKomponen kimiawi sel selanjutnya ialah lemak. Lemak tersusun atas unsur karbon, hidrogen, dan oksigen. Lemak dibangun oleh gliserol dan asam lemak. Dalam sel hidup, lemak berfungsi sebagai komponen utama membran plasma, pembentukan hormon, dan pembentukan vitamin. ");

        TextView textView4 = findViewById(R.id.kom4);
        textView4.setText("c) Protein \nProtein tersusun atas karbon , hidrogen, oksigen dan nitrogen. Protein merupakan unsur organik terbesar yang menyusun sebuah sel. Protein merupakan polimer dari asam amino yang saling berikatan dengan ikatan peptida. Protein merupakan peyusun protoplasma terbesar setelah air, protein tersusun atas Protein struktural dan protein fungsional. Protein struktural adalah protein penyusun organel sel. Misal Membrane, Mitokondria, Ribosom, Retikulum endoplasma, sedangkan Protein fungsional adalah protein yang terlibat dalam metabolisme tubuh Meliputi enzim-enzim dan hormon yang berfungsi mengatur- reaksi-reaksi kimia yang menjaga sel tetap hidup. ");

        TextView textView5 = findViewById(R.id.kom5);
        textView5.setText("d) Asam Nukleat\nDalam komponen kimiawi sel, asam nukleat merupakan materi inti. Ada dua macam asam nukleat, yaitu asam deoksiribonukleat (DNA) dan asam ribonukleat (RNA). Fungsi asam nukleat adalah untuk mengontrol aktivitas sel dan membawa informasi genetik. Asam nukleat merupakan polimer nukleotida. ");

        TextView textView6 = findViewById(R.id.kom6);
        textView6.setText("e) Air \nAir adalah senyawa utama komponen kimiawi sel yang jumlahnya terbesar dalam menyusun sel (50 – 65% berat sel). Air adalah komponen esensial cairan tubuh yang terdiri dari plasma darah, cairan intrasel (sitoplasma), dan cairan ekstrasel. Air dalam sel berfungsi sebagai pelarut dan katalisator beberapa reaksi biologis. ");

        TextView textView7 = findViewById(R.id.kom7);
        textView7.setText("f) Vitamin\nKomponen kimiawi selanjutnya adalah vitamin. Vitamin memang dibutuhkan dalam jumlah kecil, akan tetapi ia harus ada untuk menunjang berbagai fungsi sel dalam proses metabolismenya. Peran vitamin adalah mempertahankan fungsi metabolisme, pertumbuhan, dan sebagai penghancur radikal bebas . Beberapa contoh vitamin yang saat ini telah ditemukan antara lain A, B1, B2, B3, B5, B6, B12, C, D, E, K dan H. ");

        TextView textView8 = findViewById(R.id.kom8);
        textView8.setText("g) Mineral \nMineral adalah komponen struktural sel yang berfungsi dalam pemeliharaan fungsi dan kerja metabolisme, pengaturan enzim, menjaga keseimbangan asam dan basa. Di dalam sel, mineral ada yang terkandung dengan jumlah yang besar (makroelemen) dan dalam jumlah sedikit (mikroelemen. Beberapa contoh mineral makroelemen misalnya kalsium, magnesium, fosfor, klor,natrium, dan belerang. Sedangkan contoh mineral mikroelemen antara lain zat besi, yodium, seng, kobalt, fluorin. ");

    }
}