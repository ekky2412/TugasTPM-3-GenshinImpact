package com.example.intentdanrecyclertugas.model;

import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class DataAnemo {
    private static String[] namaKarakter = {
            "Jean",
            "Sucrose",
            "Venti",
            "Xiao"
    };

    private static int[] rarityKarakter = {
            R.drawable.icon_5_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_5_stars
    };

    private static int[] iconWeapon = {
            R.drawable.sword_icon,
            R.drawable.catalyst_icon,
            R.drawable.bow_icon,
            R.drawable.polearm_icon
    };

    private static String[] tipeWeapon = {
            "Pedang",
            "Katalis",
            "Panah",
            "Tombak"
    };

    private static int[] fotoKarakter = {
            R.drawable.jean,
            R.drawable.sucrose,
            R.drawable.venti,
            R.drawable.xiao
    };

    private static String[] detailKarakter = {
            "Jean Gunnhildr adalah karakter Anemo yang dapat dimainkan di Genshin Impact. Dia adalah putri dari Frederica Gunnhildr dan Seamus Pegg, dan kakak dari Barbara.",
            "Sucrose adalah seorang alkemis yang berspesialisasi dalam bio-alkimia, dia juga menjabat sebagai asisten Albedo, kepala alkemis dari Knights of Favonius.",
            "Venti adalah penyair berjiwa bebas, pecinta anggur di Mondstadt dan tempat menjelmanya Barbatos saat ini, Anemo Archon.",
            "Xiao, nama Yaksha Alatus, adalah seorang ahli dan satu-satunya anggota yang tersisa dari Lima Yaksha yang dikirim oleh Morax untuk menaklukkan roh-roh jahat yang mengganggu Liyue. Dia saat ini tinggal di Wangshu Inn, di mana dia mengasingkan diri dari keramaian dan interaksi manusia."
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
