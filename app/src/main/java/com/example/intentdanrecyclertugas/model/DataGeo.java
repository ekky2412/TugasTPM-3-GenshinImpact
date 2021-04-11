package com.example.intentdanrecyclertugas.model;

import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class DataGeo {
    private static String[] namaKarakter = {
            "Albedo",
            "Ningguang",
            "Noelle",
            "Zhongli"
    };

    private static int[] rarityKarakter = {
            R.drawable.icon_5_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_5_stars
    };

    private static int[] iconWeapon = {
            R.drawable.sword_icon,
            R.drawable.catalyst_icon,
            R.drawable.claymore_icon,
            R.drawable.polearm_icon
    };

    private static String[] tipeWeapon = {
            "Pedang",
            "Katalis",
            "Claymore",
            "Tombak"
    };

    private static int[] fotoKarakter = {
            R.drawable.albedo,
            R.drawable.ningguang,
            R.drawable.noelle,
            R.drawable.zhongli
    };

    private static String[] detailKarakter = {
            "Albedo sang misterius adalah Kepala Alkemis dan Kapten Tim Investigasi Ksatria Favonius, dengan Sukrosa sebagai asistennya. Dia memiliki keinginan yang tak terbatas untuk mempelajari dunia Teyvat, mempelajari setiap objek di sekitarnya dengan cermat.",
            "Ningguang adalah Tianquan dari Liyue Qixing. Dia memegang posisi kekayaan melebihi banyak orang lain di Teyvat. Posisi dan kemampuan Ningguang telah memungkinkannya untuk membangun pencapaian terbesarnya, Ruang Giok mengambang yang mengawasi semua Liyue.",
            "Meskipun belum menjadi seorang ksatria, dia berusaha untuk suatu hari bergabung dengan Ksatria Favonius dengan terlebih dahulu melayani sebagai pelayan yang berbakti.",
            "Dia kemudian diturunkan menjadi jelmaan Geo Archon saat ini, Morax, yang telah memutuskan untuk mengalami dunia dari sudut pandang manusia. Setelah melepaskan Gnosisnya, dia pensiun dari posisinya sebagai Archon dan kembali ke identitas sebelumnya sebagai Adeptus. Dia saat ini bekerja sebagai konsultan di Rumah Duka Wangsheng."
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
