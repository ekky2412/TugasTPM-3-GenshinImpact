package com.example.intentdanrecyclertugas.model;

import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class DataPyro {
    private static String[] namaKarakter = {
            "Amber",
            "Bennet",
            "Diluc",
            "Hu Tao",
            "Klee",
            "Xiangling",
            "Xinyan"
    };

    private static int[] rarityKarakter = {
            R.drawable.icon_4_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_5_stars,
            R.drawable.icon_4_stars,
            R.drawable.icon_4_stars
    };

    private static int[] iconWeapon = {
            R.drawable.bow_icon,
            R.drawable.sword_icon,
            R.drawable.claymore_icon,
            R.drawable.polearm_icon,
            R.drawable.catalyst_icon,
            R.drawable.polearm_icon,
            R.drawable.claymore_icon,
    };

    private static String[] tipeWeapon = {
            "Panah",
            "Pedang",
            "Claymore",
            "Tombak",
            "Katalis",
            "Tombak",
            "Claymore"
    };

    private static int[] fotoKarakter = {
            R.drawable.amber,
            R.drawable.bennett,
            R.drawable.diluc,
            R.drawable.hu_tao,
            R.drawable.klee,
            R.drawable.xiangling,
            R.drawable.xinyan
    };

    private static String[] detailKarakter = {
            "Amber adalah satu-satunya Outrider dari Knights of Favonius yang tersisa. Dia selalu siap membantu warga Mondstadt — entah itu sesuatu yang sederhana atau mungkin tugas yang lebih menantang.",
            "Seorang yatim piatu yang ditemukan oleh seorang petualang tua saat masih bayi, Bennett dibesarkan di Guild Petualang Mondstadt. Dia adalah satu-satunya anggota \"Benny's Adventure Team,\" karena semua orang meninggalkan tim setelah mengalami kemalangan terus-menerus yang mengikutinya.",
            "Terlahir dalam Keluarga Ragnvindr yang makmur, Diluc adalah pemilik Dawn Winery saat ini dan seorang bangsawan yang sangat dihormati di masyarakat Mondstadt. Sementara insiden masa lalu menyebabkan dia berpisah dengan Ksatria Favonius, dia terus melindungi Mondstadt dengan caranya sendiri.",
            "Sekilas, Hu Tao tampak seperti gadis yang nyentrik dan ceria. Tidak ada yang akan berpikir bahwa dia sebenarnya adalah direktur terkenal dari Rumah Duka Wangsheng kecuali dia memberi tahu mereka atau mereka bekerja dengannya.",
            "Putri dari petualang pemberani - dan destruktif - Alice, Klee mengambil setelah ibunya dalam banyak hal, banyak yang membuat takut para Ksatria Favonius yang telah dipercayakan kepadanya.",
            "Dia adalah Kepala Koki di Restoran Wanmin dan menjalankannya bersama ayahnya, Chef Mao. Sebagai seorang chef, Xiangling tidak takut untuk mencoba berbagai resep atau bahan-bahan yang \"eksotis\". Membuat masakannya terkadang cukup unik.",
            "Rock 'n' roll adalah gaya musik yang relatif tidak populer di Liyue, yang baru-baru ini dibawa dari Fontaine. Xinyan, bagaimanapun, menyukai suaranya - dan dia perlahan tapi pasti mengumpulkan basis penggemarnya sendiri saat dia tampil di seluruh Pelabuhan Liyue."
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
