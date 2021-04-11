package com.example.intentdanrecyclertugas.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intentdanrecyclertugas.R;
import com.example.intentdanrecyclertugas.adapter.AdapterKarakter;
import com.example.intentdanrecyclertugas.model.DataAnemo;
import com.example.intentdanrecyclertugas.model.DataCryo;
import com.example.intentdanrecyclertugas.model.DataElectro;
import com.example.intentdanrecyclertugas.model.DataElemen;
import com.example.intentdanrecyclertugas.model.DataGeo;
import com.example.intentdanrecyclertugas.model.DataHydro;
import com.example.intentdanrecyclertugas.model.DataPyro;
import com.example.intentdanrecyclertugas.model.ModelKarakter;

import java.util.ArrayList;

public class KarakterActivity extends AppCompatActivity {

    public RecyclerView rvElemen;
    public TextView tv_title_activity,title_activity_elemen;
    public ArrayList<ModelKarakter> karakterList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karakter);

        String namaElemen = cekElemen();
        tv_title_activity = findViewById(R.id.title_activity_elemen);
        tv_title_activity.setText(namaElemen);
        title_activity_elemen = findViewById(R.id.title_activity_elemen);

        rvElemen = findViewById(R.id.karakter_rv);
        rvElemen.setHasFixedSize(true);

        if(namaElemen.equals("Anemo")){
            karakterList.addAll(DataAnemo.getKarakter());
            title_activity_elemen.setBackgroundColor(ContextCompat.getColor(this, R.color.anemo ));
        }
        else if(namaElemen.equals("Cryo")){
            karakterList.addAll(DataCryo.getKarakter());
            title_activity_elemen.setBackgroundColor(ContextCompat.getColor(this, R.color.cryo ));
        }
        else if(namaElemen.equals("Electro")){
            karakterList.addAll(DataElectro.getKarakter());
            title_activity_elemen.setBackgroundColor(ContextCompat.getColor(this, R.color.electro ));
        }
        else if(namaElemen.equals("Geo")){
            karakterList.addAll(DataGeo.getKarakter());
            title_activity_elemen.setBackgroundColor(ContextCompat.getColor(this, R.color.geo ));
        }
        else if(namaElemen.equals("Hydro")){
            karakterList.addAll(DataHydro.getKarakter());
            title_activity_elemen.setBackgroundColor(ContextCompat.getColor(this, R.color.hydro ));
        }
        else if(namaElemen.equals("Pyro")){
            karakterList.addAll(DataPyro.getKarakter());
            title_activity_elemen.setBackgroundColor(ContextCompat.getColor(this, R.color.pyro ));
        }

        showRV(namaElemen);

    }

    private String cekElemen(){
        String namaElemen = null;
        if(getIntent().hasExtra("namaElemen")){
            namaElemen = getIntent().getStringExtra("namaElemen");
        }
        return namaElemen;
    }

    private void showRV(String namaElemen){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvElemen.setLayoutManager(linearLayoutManager);
        AdapterKarakter adapterKarakter = new AdapterKarakter(this, karakterList, namaElemen);
        rvElemen.setAdapter(adapterKarakter);
    }
}