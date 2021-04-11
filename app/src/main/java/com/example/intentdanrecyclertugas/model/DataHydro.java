package com.example.intentdanrecyclertugas.model;

import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class DataHydro {
    private static String[] namaKarakter = {
            "Barbara",
            "Mona",
            "Tartaglia",
            "Xingqiu"
    };

    private static int[] rarityKarakter = {
            R.drawable.icon_4_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_4_stars
    };

    private static int[] iconWeapon = {
            R.drawable.catalyst_icon,
            R.drawable.catalyst_icon,
            R.drawable.bow_icon,
            R.drawable.sword_icon
    };

    private static String[] tipeWeapon = {
            "Katalis",
            "Katalis",
            "Panah",
            "Pedang"
    };

    private static int[] fotoKarakter = {
            R.drawable.barbara,
            R.drawable.mona,
            R.drawable.tartaglia,
            R.drawable.xingqiu
    };

    private static String[] detailKarakter = {
            "Barbara adalah putri dari Frederica Gunnhildr dan Seamus Pegg, dan adik perempuan Jean. Barbara adalah diakones dari Gereja Favonius dan memproklamirkan diri sebagai \"idola\" setelah mengetahui tentang mereka dari petualang pemberani Alice.",
            "Seorang ahli astrologi dengan keterampilan hebat dan kebanggaan yang sama besarnya, Mona telah tinggal di Mondstadt untuk menghindari kemarahan tuannya setelah tanpa disadari membaca buku harian yang terakhir.",
            "Tartaglia atau Childe adalah No 11 dari Sebelas Harbingers of the Fatui. Mengikuti bahaya kemanapun dia pergi, Childe selalu bersemangat menghadapi tantangan karena dia dianggap sebagai salah satu anggota Harbingers yang lebih berbahaya.",
            "Xingqiu adalah putra kedua dari Manajer Persekutuan Persekutuan Dagang Feiyun, sebuah kelompok berpengaruh di Liyue, dan juga memproklamirkan diri sebagai praktisi seni Klan Guhua."
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
