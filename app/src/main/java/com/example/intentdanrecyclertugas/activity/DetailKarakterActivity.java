package com.example.intentdanrecyclertugas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.intentdanrecyclertugas.R;

public class DetailKarakterActivity extends AppCompatActivity {
    Button btnShare;
    TextView tvNamaKarakter,tvNamaSenjata,tvDeskripsiKarakter;
    ImageView ivRarityKarakter,ivGambarKarakter,ivGambarSenjata;

    String namaKarakter,namaSenjata,deskripsiKarakter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_karakter);

        tvNamaKarakter = findViewById(R.id.tvNamaKarakter);
        tvNamaSenjata = findViewById(R.id.tvNamaSenjata);
        tvDeskripsiKarakter = findViewById(R.id.tvDeskripsiKarakter);
        ivRarityKarakter = findViewById(R.id.ivRarityKarakter);
        ivGambarKarakter = findViewById(R.id.ivGambarKarakter);
        ivGambarSenjata = findViewById(R.id.ivGambarSenjata);
        btnShare = findViewById(R.id.btnShare);

        namaKarakter = getIntent().getStringExtra("namaKarakter");
        namaSenjata = getIntent().getStringExtra("tipeWeapon");
        deskripsiKarakter = getIntent().getStringExtra("detailKarakter");
//
        Glide.with(this).load(getIntent().getIntExtra("fotoKarakter",0)).into(ivGambarKarakter);
        Glide.with(this).load(getIntent().getIntExtra("rarityKarakter",0)).into(ivRarityKarakter);
        Glide.with(this).load(getIntent().getIntExtra("iconWeapon",0)).into(ivGambarSenjata);

        tvNamaKarakter.setText(namaKarakter);
        tvNamaSenjata.setText(namaSenjata);
        tvDeskripsiKarakter.setText(deskripsiKarakter);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String shareSubject = namaKarakter;
                String shareBody = namaKarakter + " adalah karakter menggunakan senjata " + namaSenjata + ".\n" + deskripsiKarakter;
                share.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                share.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(share,"Share Using"));
            }
        });

    }

}