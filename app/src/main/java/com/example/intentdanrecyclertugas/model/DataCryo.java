package com.example.intentdanrecyclertugas.model;

import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class DataCryo {
    private static String[] namaKarakter = {
            "Diona",
            "Ganyu",
            "Kaeya",
            "Qiqi",
            "Rosaria"
    };

    private static int[] rarityKarakter = {
            R.drawable.icon_4_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_4_stars
    };

    private static int[] iconWeapon = {
            R.drawable.bow_icon,
            R.drawable.bow_icon,
            R.drawable.sword_icon,
            R.drawable.sword_icon,
            R.drawable.polearm_icon
    };

    private static String[] tipeWeapon = {
            "Panah",
            "Panah",
            "Pedang",
            "Pedang",
            "Tombak"
    };

    private static int[] fotoKarakter = {
            R.drawable.diona,
            R.drawable.ganyu,
            R.drawable.kaeya,
            R.drawable.qiqi,
            R.drawable.rosaria
    };

    private static String[] detailKarakter = {
            "Meskipun menjadi bartender di Cat's Tail, dia sebenarnya membenci alkohol dan tidak menginginkan apa pun selain menghancurkan industri anggur Mondstadt — suatu prestasi yang lebih mudah diucapkan daripada dilakukan ketika pelanggannya benar-benar menyukai minumannya.",
            "Ganyu adalah sebagai utusan dan sekretaris Liyue Qixing.",
            "Kaeya adalah Kapten Kavaleri di Knights of Favonius. Dia sangat dihormati oleh orang-orang Mondstadt — bahkan dengan semua keanehan dan rahasianya.",
            "Dibangkitkan sebagai zombie oleh adepti, dia dirawat oleh Baizhu dan sekarang bekerja di Bubu Pharmacy di Pelabuhan Liyue.",
            "Rosaria adalah anggota Gereja Favonius di Mondstadt."
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
