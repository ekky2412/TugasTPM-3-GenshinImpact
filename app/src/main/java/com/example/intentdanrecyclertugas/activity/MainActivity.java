package com.example.intentdanrecyclertugas.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.intentdanrecyclertugas.adapter.AdapterElemen;
import com.example.intentdanrecyclertugas.model.ModelElemen;
import com.example.intentdanrecyclertugas.R;
import com.example.intentdanrecyclertugas.model.DataElemen;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView rvGroup;
    public ArrayList<ModelElemen> listElemen = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGroup = findViewById(R.id.activitymain_rv);
        rvGroup.setHasFixedSize(true);
        listElemen.addAll(DataElemen.getGroup());

        rvGroup.setLayoutManager(new LinearLayoutManager(this));
        AdapterElemen adapterElemen = new AdapterElemen(this, DataElemen.getGroup());
        rvGroup.setAdapter(adapterElemen);
    }
}