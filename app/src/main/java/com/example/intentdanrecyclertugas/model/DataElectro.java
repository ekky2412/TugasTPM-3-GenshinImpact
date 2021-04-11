package com.example.intentdanrecyclertugas.model;

import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class DataElectro {
    private static String[] namaKarakter = {
            "Beidou",
            "Fischl",
            "Keqing",
            "Lisa",
            "Razor"
    };

    private static int[] rarityKarakter = {
            R.drawable.icon_4_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_4_stars
    };

    private static int[] iconWeapon = {
            R.drawable.claymore_icon,
            R.drawable.bow_icon,
            R.drawable.sword_icon,
            R.drawable.catalyst_icon,
            R.drawable.claymore_icon
    };

    private static String[] tipeWeapon = {
            "Claymore",
            "Panah",
            "Pedang",
            "Katalis",
            "Claymore"
    };

    private static int[] fotoKarakter = {
            R.drawable.beidou,
            R.drawable.fischl,
            R.drawable.keqing,
            R.drawable.lisa,
            R.drawable.razor
    };

    private static String[] detailKarakter = {
            "Dia adalah kapten The Crux, kru terkenal di Liyue. Selain kemampuannya sebagai kapten armada dan kekuatannya yang luar biasa, banyak orang di Liyue mengenalnya karena kurangnya rasa takutnya terhadap Tianquan dari Liyue Qixing, Ningguang - suatu sifat yang dihargai oleh wanita lain, namun menjadi jengkel.",
            "Fischl adalah penyelidik untuk Persekutuan Petualang Mondstadt, ditemani oleh burung gagak malam Oz. Fischl mengaku berasal dari dunia di luar Teyvat. Dia adalah petualang pemberani dengan teori yang tampaknya aneh yang ternyata benar.",
            "Keqing adalah Yuheng dari Liyue Qixing. Dia adalah seseorang yang mencari jawabannya sendiri alih-alih membiarkan kekacauan mengamuk di Liyue. Keqing memilih jalannya sendiri dengan kekuatan dan kemampuannya sendiri, alih-alih membiarkan para dewa menentukan nasibnya.",
            "Setelah seorang grand mage diakui sebagai lulusan Sumeru Academia yang paling terkemuka dalam 200 tahun, Lisa telah kembali ke Mondstadt untuk menjadi Pustakawan Ksatria Favonius yang rendah hati.",
            "Ditinggalkan saat masih bayi, Razor dibawa oleh Serigala Utara, Andrius, dan dibesarkan oleh kawanan serigala di Wolvendom. Setelah kebetulan bertemu dengan Varka, Grand Master dari Ksatria Favonius dan Ksatria Boreas saat ini, dia perlahan mulai berintegrasi dengan manusia lagi."
    };

    public static ArrayList<ModelKarakter> getKarakter(){
        ModelKarakter modelKarakter = null;
        ArrayList<ModelKarakter> karakterList = new ArrayList<>();

        for(int i = 0; i < namaKarakter.length; i++ ){
            modelKarakter = new ModelKarakter(namaKarakter[i],detailKarakter[i],tipeWeapon[i],fotoKarakter[i],iconWeapon[i],rarityKarakter[i]);
            karakterList.add(modelKarakter);
        }
        return karakterList;
    }
}
